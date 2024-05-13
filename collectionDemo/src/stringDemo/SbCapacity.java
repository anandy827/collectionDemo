package stringDemo;

import java.util.Scanner;

public class SbCapacity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter city name");
		String s1 = sc.nextLine().toLowerCase().trim();
		if(s1.equals("hydrabad")) {
			System.out.println("welcome to hydrabad");
		}
		else if(s1.equals("lucknow")){
			System.out.println("welcome to up");

		}
		else {
			System.out.println("enter a valid city name");
		}

	}
}