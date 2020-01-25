package com.skilldistillery.homework;

public class mkchngTEST2 {

	public static void main(String[] args) {
//		double i = 20.329;
//		System.out.printf("Total Change: 0%.2f", i);
//		

		double x = 0.32999;

		if (x % 0.5 != 0)
			; // nickels
		double centsNickel = x / 0.05;
		int displayNickel = (int) centsNickel;
		if (displayNickel != 0) {
			System.out.println("Nickels: " + displayNickel);
		}

		double remainderNickel = (double) (x - (displayNickel * 0.05));
		System.out.println("remainderNickel: " + remainderNickel);

		if (remainderNickel % 0.01 != 0)
			; // pennies
		double centsPenny = remainderNickel / 0.01;
		//int displayPenny = (int) centsPenny;
		//System.out.println("cents penny: " + centsPenny);
		//System.out.println("display penny: " + displayPenny);
		
		int displayPenny = (int)(centsPenny + 0.005);
		System.out.println("centsPenny: " + centsPenny);
		System.out.println("displayPenny: " + displayPenny);
		
		if (displayPenny > 0) {
			System.out.println("Pennys1: " + displayPenny);
		}

		
		
//		if (centsPenny % displayPenny >= 0.05) {
//			centsPenny += 0.005;
//			displayPenny = (int) centsPenny;
//			System.out.println("Pennysplus: " + displayPenny);
//		}
//		else if (centsPenny % displayPenny < 0.05) {
//			System.out.println("Pennysminus: " + displayPenny);
		}
	}
