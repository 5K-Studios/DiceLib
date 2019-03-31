package com.fiveKstudios.dicelib;

import java.util.Random;

/*
 * Dice Lib v1.0
 * by Joshua Orvis
 * 		5k Studios
 * 
 * This Library was created to emulate
 * common dice rolls in various games.
 * 
 * Designed to work in simulators and other tools for Tabletop RPGs
 * or Computer RPGs
 * 
 * Questions? Contact me at: 5kstudiosar@gmail.com
 */

public class Dice {

	Random rand = new Random();
	
	//single die roll, this is a template for all other die
	public int roll(int side) {
		int result = rand.nextInt(side)+1;
		System.out.println("Total is: " + result);
		return result;
	}
	
	//use this as a template to roll multiple dice
	public int roll(int side, int amount) {
		int total = 0;
		int rolls = 0;
		while(rolls < amount) {
			int result = rand.nextInt(side)+1;
			System.out.println("Result is: " + result);
			total += result;
			rolls++;
		}		
		System.out.println("Total is: " + total);
		return total;
	}
	
	//single die roll, this is a template for all other die but doesn't create console messages
	public int rollQuiet(int side) {
		int result = rand.nextInt(side)+1;
		return result;
	}
	
	//use this as a template to roll multiple dice but it won't create console messages
	public int rollQuiet(int side, int amount) {
		int total = 0;
		int rolls = 0;
		while(rolls < amount) {
			int result = rand.nextInt(side)+1;
			total += result;
			rolls++;
		}		
		return total;
	}
	//Use this to turn integer rolls into Strings to output.
	public String rollToString(int roll) {
		return Integer.toString(roll);		
	}
	//Use this to turn your Coin flip into a String for output
	public String flipToString(int coinFlip) {
		String result = "Heads";
		if (coinFlip == 1)
			result = "Heads";
		if(coinFlip == 2)
			result = "Tails";
		return result;
	}
	
	//Flipping coins
	public int coinFlip() {
		System.out.println("Flipping coin...");
		int result = rollQuiet(2);
		if(result ==1)
			System.out.println("It's Heads");
		if(result ==2)
			System.out.println("It's Tails");
		return result;
	}
	public int quietCoinFlip() {
		int result = rollQuiet(2);
		return result;
	}
	
	//4-sided die family
	public int rollD4() {
		return roll(4);
	}
	public int rollD4(int amount) {
		return roll(4,amount);
	}
	public int rollQuietD4() {
		return rollQuiet(4);
	}
	public int rollQuietD4(int amount) {
		return rollQuiet(4,amount);
	}
	
	//6-sided die family
	public int rollD6() {
		return roll(6);
	}
	public int rollD6(int amount) {
		return roll(6,amount);
	}
	public int rollQuietD6() {
		return rollQuiet(6);
	}
	public int rollQuietD6(int amount) {
		return rollQuiet(6,amount);
	}
	
	//8-sided die family
	public int rollD8() {
		return roll(8);
	}
	public int rollD8(int amount) {
		return roll(8,amount);
	}
	public int rollQuietD8() {
		return rollQuiet(8);
	}
	public int rollQuietD8(int amount) {
		return rollQuiet(8,amount);
	}
		
	//10-sided die family
	public int rollD10() {
		return roll(10);
	}
	public int rollD10(int amount) {
		return roll(10,amount);
	}
	public int rollQuietD10() {
		return rollQuiet(10);
	}
	public int rollQuietD10(int amount) {
		return rollQuiet(10,amount);
	}
	
	//12-sided die family
	public int rollD12() {
		return roll(12);
	}
	public int rollD12(int amount) {
		return roll(12,amount);
	}
	public  int rollQuietD12() {
		return rollQuiet(12);
	}
	public  int rollQuietD12(int amount) {
		return rollQuiet(12,amount);
	}
	
	//20-sided die family
	public  int rollD20() {
		return roll(20);
	}
	public  int rollD20(int amount) {
		return roll(20,amount);
	}
	public  int rollQuietD20() {
		return rollQuiet(20);
	}
	public  int rollQuietD20(int amount) {
		return rollQuiet(20,amount);
	}
	
	//100-sided die family
	public int rollD100() {
		return roll(100);
	}
	public int rollD100(int amount) {
		return roll(100,amount);
	}
	public int rollQuietD100() {
		return rollQuiet(100);
	}
	public int rollQuietD100(int amount) {
		return rollQuiet(100,amount);
	}
	
}
