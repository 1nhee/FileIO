package edu.handong.csee.java.example.binarydemo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NumbersDoubledReader {
	//String fileName = "numbersDoubled.dat";
	
	public static void main(String[] args) {
		NumbersDoubledReader demonstrator = new NumbersDoubledReader();
		demonstrator.run();
	}
	
	private void run() {
		String fileName = "numbersDoubled.dat";
		
	try {
		ObjectInputStream inputStream = new ObjectInputStream(
							new FileInputStream(fileName));
		System.out.println("in the file " + fileName);
		while(true) {
			int anInteger = inputStream.readInt();
			System.out.print(anInteger+ " ");
		}
	} catch(FileNotFoundException e) {
		System.out.println("Problem opening the file " + fileName);
	} catch (EOFException e) {
		System.out.println("\nReached end of the file.");
	} catch (IOException e) {
		System.out.println("Problem reading the file " + fileName);
	}
}
}
