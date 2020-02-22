package com.nt.cj;

import java.util.Scanner;

public class YourShopkeeper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float riceQty=0;
		float dalQty=0;
		float muttonQty=0;
		String opt=null;
		float totalBillAmt=0;
		
	do {
		System.out.println("Enter one below respective number");
		System.out.println("1.Rice");
		System.out.println("2.Dal");
		System.out.println("3.Mutton");
		int num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Enter the quantity");
		    riceQty=sc.nextFloat();
			break;
	  case 2:
		   System.out.println("Enter the quantity");
			 dalQty=sc.nextFloat();
			break;
	  case 3:
		   System.out.println("Enter the quantity");
			muttonQty=sc.nextFloat();
			break;
		default:
			System.out.println("select a valid number between 1 to 3");
			break;
		}
		System.out.println("Do you want to continue");
		System.out.println("Enter Y to yes and N to no");
		opt=sc.next();
		
	} while (opt.equalsIgnoreCase("y"));
	
	totalBillAmt=( riceQty*60.0f)+(dalQty*100.0f)+(muttonQty*400.0f);
	System.out.println("Your Total beal is Rs."+totalBillAmt);
	System.out.println(":::::Visit Again:::");
	
	}

}
