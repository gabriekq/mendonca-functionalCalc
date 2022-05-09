package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

		Map<String, BiFunction<Double, Double, Double>> funcoesMap = new HashMap<String, BiFunction<Double, Double, Double>>();

		// input format when you run ex sum 1.4 2.2

		funcoesMap.put("divide", (a, b) -> a / b);
		funcoesMap.put("sum", (a, b) -> a + b);
		funcoesMap.put("subtraction", (a, b) -> a - b);
		funcoesMap.put("mutiply", (a, b) -> a * b);

		Scanner console = new Scanner(System.in);

		while (true) {

			String input = console.nextLine();

			String inputs[] = input.split(" ");

			if (funcoesMap.containsKey(inputs[0])) {
				double value1 = Double.parseDouble(inputs[1]);
				double value2 = Double.parseDouble(inputs[2]);

				System.out.println(funcoesMap.get(inputs[0]).apply(value1, value2));
			} else {
				break;
			}

		}

	}

}
