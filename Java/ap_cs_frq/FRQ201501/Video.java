package com.Trinnect.FRQ201501;

import java.util.Arrays;

public class Video {

		public static void main(String[] args){
			int[] a1 = {1,2,3,4};
			int[][] a2 = {{1,2,3},{4,5,6},{7,8,9}};
			
			int sum = DiverseArray.arraySum(a1);
			int s[] = DiverseArray.rowSums(a2);
			boolean isDiverse = DiverseArray.isDiverse(a2);
			
			System.out.println("a1: " + Arrays.toString(a1));
			System.out.println("a1 sum: " + sum);
			
			System.out.println("a2: " + Arrays.deepToString(a2));
			System.out.println("a2 rowSum: " + Arrays.toString(s));
			System.out.println("a2 diverse? " + isDiverse);
		}
}
