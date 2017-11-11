package com.trinnect.EatWhat;
import java.util.*;

public class EatWhat {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] food = {"川宗","川宗","川宗",
				"pokebowl","pokebowl","pokebowl","pokebowl",
				"Pho","Pho","Pho","Pho","Pho","Pho","Pho","Pho",
				"豆腐锅","豆腐锅","豆腐锅","豆腐锅","豆腐锅",
				"老谷","老谷","老谷","老谷","老谷","老谷","老谷","老谷","老谷","老谷",
				"Kitchen","Kitchen",
				"LP","LP","LP","LP","LP","LP","LP",
				"Indian Curry","Indian Curry","Indian Curry",
				"Thai Cusine","Thai Cusine","Thai Cusine",
				"美心","美心","美心","美心","美心","美心","美心"};
		int totalNumber = food.length;
		Scanner console = new Scanner(System.in);
		System.out.println("----------吃啥子----------");
		System.out.println("到底吃啥子呢?\n");
		System.out.println("现在对餐馆的评价是：");
		printRank(food);
		int times = 5;
		while(times >= 0) {
			System.out.println("按任意键继续");
			String s0 = console.next();
			System.out.print("那就去吃");
			System.out.println(food[(int)(Math.random()*food.length)] + "吧！");
			times--;
		}
		System.out.println("按任意键继续");
		String s1 = console.next();
		System.out.println("怎么要求那么多!!饿死算了！");
		System.out.println("");
		console.close();
	}

	public static void rank(String Restraurant, String[] food) {
		System.out.print(Restraurant + ": ");
		int count = 0;
		for(int i = 0; i < food.length; i++) {
			if(food[i].equalsIgnoreCase(Restraurant)) {
				count++;
			}
		}
		System.out.print(count + "分");
		System.out.println();
	}

	public static void printRank(String[] food) {
		rank("pokebowl",food);
		rank("Pho",food);
		rank("老谷",food);
		rank("豆腐锅",food);
		rank("Kitchen",food);
		rank("LP",food);
		rank("Indian Curry",food);
		rank("Thai Cusine",food);
		rank("美心",food);
		System.out.println();
	}

}
