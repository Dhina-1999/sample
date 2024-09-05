package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Dhina");
		arr.add("karan");
		arr.add("QA");
		arr.add("Tester");
		System.out.println(arr);
		for(int i = 0; i<arr.size();i++) {
			//System.out.println(arr.get(i));
		}
		System.out.println("******");
		for(String a : arr) {
			//System.out.println(a);
		}
		
		//Converting array to ArrayList
		String[] b = {"Dhina", "Karan", "QA" ,"Tester"};
		System.out.println(b);
		List<String> c = Arrays.asList(b);
		System.out.println(c);
		
		//Declaring string in a object way to assign multiple variable with same value 
		String a1 = new String("Statis");
		String a2 = new String("Static");
		//Declaring string literal 
		String b1 = "notUnique";
		String b2 = "notUnique";
		
		//Split the String
		String d = "Dhina karan is a QA tester";
		System.out.println("The lenth of the string is :"+d.length());
		for(int k = 0;k<d.length();k++) {
			
			if(d.charAt(k)==' ') {
				continue;
			}
			System.out.println(d.charAt(k));
			
		}
		String[] SplittedArray = d.split(" ");
		//System.out.println(SplittedArray[0]);
		for(String e : SplittedArray) {
			System.out.println(e);
		}
		
		
		
	}

}
