//10nov2021
package assignments;

import java.util.Scanner;

public class assignments2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing a prime number from 2 to n=11
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  first number: ");
		int f=sc.nextInt();
		System.out.print("Enter  second number: ");
		int s=sc.nextInt();
		for(int i=f;i<s;i++) {
			if(isPrime(i)) {
				System.out.println(i+" is prime");
			}
		}
	}

	static boolean isPrime(int n) {
		if(n<=1) {
			return(false);
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return(false);
			}
			
		}
		return(true);
	}
}
