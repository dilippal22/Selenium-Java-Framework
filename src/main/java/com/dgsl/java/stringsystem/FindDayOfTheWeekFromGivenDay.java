/*Write a JAVA Program to find the day of the week from given Day.*/

package com.dgsl.java.stringsystem;

import java.util.Calendar;
import java.util.Scanner;

public class FindDayOfTheWeekFromGivenDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day!");
		String userDay = sc.nextLine();

		System.out.println("Enter the number you want to know day after");
		int dayAfter = sc.nextInt();

		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);

	}

}
