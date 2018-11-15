package edu.neu.coe.info6205.symbolTable;

import java.util.HashMap;
import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		Initial ini = new Initial();
		for (int i = 10; i < 100000; i = i * 2) {
			System.out.println("insert / delete "+ i +"times supposed heigth:"+ 10);
			ini.test(100, i);
		}
	}
}
