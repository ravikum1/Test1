import java.io.*;
import java.util.Arrays;
// not working -- need to check lombok settings import lombok.Data;
public class IntSequence {
	//class will develop methods to add to sequence of integers
	//want to make sure that number of ints added is known
	//have one array for all methods
	private int[] seq;
	private int numS;
	
	public IntSequence(int cap){
		seq = new int[cap];
		numS = 0;
	}
	
	public int len(){
		System.out.println(Arrays.toString(seq));
		return seq.length;
	}
	
	public int getNum(){
		return numS;
	}
	
	public void add(int curr){
		//adding integer to end of list
		if (numS < seq.length){
			seq[numS] = curr;
			numS += 1;
		} else {
			System.out.println("Cannot add to list. Adding to list will exceed list length.");
		}
	}
	
	public void remove(int rm){
		//removing last element of the list
		if (rm < seq.length){
			numS = numS - rm;
		}
	}
	
	public boolean isEmpty(){
		if (numS==0){
			return true;
		}else{
			return false;
		}
	}
	
	public void insert(int elem, int pos){
		int[] temp = seq.clone();
		seq[pos] = elem;
		int cnt = pos;
		int sec = cnt +1;
		while (sec < seq.length){
			insert(temp[cnt], sec);
			cnt++;
			sec++;
		}
		numS += 1;
	}
	
	public int delete(int pos){
		if (pos <= numS){
		int store = seq[pos];
		int currNum = numS;
		int cnt = pos;
		int sec = cnt + 1;
		while (sec < seq.length){
			insert(seq[sec],pos);
			pos ++;
			sec ++; 
		}
		numS = currNum -1; 
		return store;
		}else{
			return -1;
		}
	}
	
	public String toString(){
		String toRtn = "";
		for(int x = 0; x< numS; x++){
			toRtn = toRtn + seq[x] + " ";
			}
		return toRtn;
		}
}

