package edu.neu.coe.info6205.symbolTable;

import java.util.HashMap;
import java.util.Random;

public class Initial {
	public void test(Integer scale, Integer manipulation) {
		// firstly build a Map KV, put scale element in it
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Random random = new Random();

		// 1. Seed a binary tree 100 element
		while (map.size() < scale) {
			int rd = random.nextInt(scale * 2);
			map.put(rd, 1);
		}
		BSTSimple<Integer, Integer> bsts = new BSTSimple<Integer, Integer>();
		bsts.putAll(map);
		// System.out.println(bsts.toString());
		// then for 1000 times try to insert or delete
		for (int c = 0; c < manipulation; c++) {
			boolean dri = random.nextBoolean();
			if (dri) {
				bsts.delete(random.nextInt(scale * 2));
			} else {
				bsts.put(random.nextInt(200), 1);
			}
		}
		System.out.println("Actual Height:" + bsts.height());
	}
}
