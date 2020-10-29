package com.company;

public class Main {

	public static void main(String[] args) {
		int numbers;
		final int dvoika = 2; // Задал константу двойку
		int two = 0;
		int three = 0;
		int five = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum5 = 0;
		boolean delka;
		for (numbers = 1; numbers < 1001; numbers++) { // начало кода (Задал числа от 1 до 1000)
			if(numbers % dvoika == 0) {  // если число делится на 2, то количество увеличивается на 1
				two++;
				sum2+= numbers; // К сумме прибавляется число, которое делится на 2
			} if(numbers % 3 == 0) {   // если число делится на 3, то количество увеличивается на 1
				three++;
				sum3+= numbers; // К сумме прибавляется число, которое делится на 3
			}
			if(numbers % 5 == 0) {   // если число делится на 5, то количество увеличивается на 1
				five++;
				sum5+= numbers; // К сумме прибавляется число, которое делится на 5
			}
		} // конец кода
		for (int kol2 = 0; kol2<two; kol2++){ // выводит количество чисел столько раз, сколько чисел делятся на 2
			System.out.println("Количество чисел делищехся на 2: " +  two);
		}
		for (int kol3 = 0; kol3<three; kol3++){ // выводит количество чисел столько раз, сколько чисел делятся на 3
			System.out.println("Количество чисел делищехся на 3: " +  three);
		}
		for (int kol5 = 0; kol5<five; kol5++){ // выводит количество чисел столько раз, сколько чисел делятся на 5
			System.out.println("Количество чисел делищехся на 5: " +  five);
		}
		if (sum2>150400) { // выводит сумму чисел только в том случае, если сумма больше 150400
			System.out.println("Cумма чисел делещихся на 2: " +  sum2);
		} else { // если меньше, проверяет равна ли сумма 50, 60, 70, 80, 90, 100, если равна то True, если нет, то False
			switch (sum5) {
				case 50: {
					System.out.println("True");
				}
				break;
				case 60: {
					System.out.println("True");
				}
				break;
				case 70: {
					System.out.println("True");
				}
				break;
				case 80: {
					System.out.println("True");
				}
				break;
				case 90: {
					System.out.println("True");
				}
				break;
				case 100: {
					System.out.println("True");
				}
				break;
				default: {
					System.out.println("False");
				}
			}
		}
		if (sum3>150400) { // выводит сумму чисел только в том случае, если сумма больше 150400
			System.out.println("Cумма чисел делещихся на 3: " +  sum3);
		} else { // если меньше, проверяет равна ли сумма 50, 60, 70, 80, 90, 100, если равна то True, если нет, то False
			switch (sum5) {
				case 50: {
					System.out.println("True");
				}
				break;
				case 60: {
					System.out.println("True");
				}
				break;
				case 70: {
					System.out.println("True");
				}
				break;
				case 80: {
					System.out.println("True");
				}
				break;
				case 90: {
					System.out.println("True");
				}
				break;
				case 100: {
					System.out.println("True");
				}
				break;
				default: {
					System.out.println("False");
				}
			}
		}
		if (sum5>150400) { // выводит сумму чисел только в том случае, если сумма больше 150400
			System.out.println("Cумма чисел делещихся на 5: " +  sum5);
		} else { // если меньше, проверяет равна ли сумма 50, 60, 70, 80, 90, 100, если равна то True, если нет, то False
			switch (sum5) {
				case 50: {
					System.out.println("True");
			    }break;
				case 60: {
					System.out.println("True");
				}break;
				case 70: {
					System.out.println("True");
				}break;
				case 80: {
					System.out.println("True");
				}break;
				case 90: {
					System.out.println("True");
				}break;
				case 100: {
					System.out.println("True");
				}break;
				default: {
					System.out.println("False");
				}
		}
		}
		String binarka = two > three ? "True":"False"; //  Просто Бинарный оператор :3
		System.out.println(binarka);
	}

}
