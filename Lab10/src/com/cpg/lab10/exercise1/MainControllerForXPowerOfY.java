package com.cpg.lab10.exercise1;

import java.util.Scanner;

public class MainControllerForXPowerOfY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XPowerOfY obj=new XPowerOfY();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter X Value:");
		int x=scan.nextInt();
		System.out.println("Enter Y Value:");
		int y=scan.nextInt();
		System.out.println("Power of :"+obj.getPowerOfXAndY(x, y));
		scan.close();
	}

}
