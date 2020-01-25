package com.skilldistillery.homework;

import java.util.Scanner;

public class mkchngTEST {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Price   : $ ");
		double itemPrice = kb.nextDouble();

		System.out.print("Enter Payment : $ ");
		double customerPayment = kb.nextDouble();

		double totalChange = customerPayment - itemPrice;
		
		if (totalChange < 0) {
			System.out.println("Insufficient payment");

		}

		if (totalChange == 0) {
			System.out.println("Exact change.");
		}

		if (totalChange > 0) {
			System.out.printf("Total Change  : $ %.2f\n", totalChange);
			if (totalChange % 20 != 0)
				; // twenty
			double billsTwenty = totalChange / 20;
			int displayTwenty = (int) billsTwenty;
			if (displayTwenty != 0) {
				System.out.println("$20 bills: " + displayTwenty);
			}

			double remainderTwenty = (double) (totalChange - (displayTwenty * 20));
			// System.out.println("remainderTwenty: " + remainderTwenty);

			if (remainderTwenty % 10 != 0)
				; // tens
			double billsTen = remainderTwenty / 10;
			int displayTen = (int) billsTen;
			if (displayTen != 0) {
				System.out.println("$10 bills: " + displayTen);
			}

			double remainderTen = (double) (remainderTwenty - (displayTen * 10));
			// System.out.println("remainderTen: " + remainderTen);

			if (remainderTen % 5 != 0)
				; // fives
			double billsFive = remainderTen / 5;
			int displayFive = (int) billsFive;
			if (displayFive != 0) {
				System.out.println("$5 bills: " + displayFive);
			}

			double remainderFive = (double) (remainderTen - (displayFive * 5));
			// System.out.println("remainderFive: " + remainderFive);

			if (remainderFive % 1 != 0)
				; // ones
			double billsOne = remainderFive / 1;
			int displayOne = (int) billsOne;
			if (displayOne != 0) {
				System.out.println("$1 bills: " + displayOne);
			}

			double remainderOne = (double) (remainderFive - (displayOne * 1));
			// System.out.println("remainderOne: " + remainderOne);

			if (remainderOne % 0.25 != 0)
				; // quarters
			double centsQuarter = remainderOne / 0.25;
			int displayQuarter = (int) centsQuarter;
			if (displayQuarter != 0) {
				System.out.println("Quarters: " + displayQuarter);
			}

			double remainderQuarter = (double) (remainderOne - (displayQuarter * 0.25));
			// System.out.println("remainderQuarters: " + remainderQuarter);

			if (remainderQuarter % 0.10 != 0)
				; // dimes
			double centsDime = remainderQuarter / 0.1;
			int displayDime = (int) centsDime;
			if (displayDime != 0) {
				System.out.println("Dimes: " + displayDime);
			}

			double remainderDime = (double) (remainderQuarter - (displayDime * 0.1));
			// System.out.println("remainderDime: " + remainderDime);

			if (remainderDime % 0.05 != 0)
				; // nickels
			double centsNickel = remainderDime / 0.05;
			int displayNickel = (int) centsNickel;
			if (displayNickel != 0) {
				System.out.println("Nickels: " + displayNickel);
			}

			double remainderNickel = (double) (remainderDime - (displayNickel * 0.05));
			// System.out.println("remainderNickel: " + remainderNickel);

			if (remainderNickel % 0.01 == 0) { 
				System.out.println("");
			}
			
			if (remainderNickel % 0.01 != 0)
				; // pennies
			double centsPenny = remainderNickel / 0.01;
			int displayPenny = (int)(centsPenny + 0.005);
	//		System.out.println("centsPenny: " + centsPenny);
	//		System.out.println("displayPenny: " + displayPenny);
			
			if (displayPenny > 0) {
				System.out.println("Pennys1: " + displayPenny);
			}

			
			kb.close();

		}
		}
	}
