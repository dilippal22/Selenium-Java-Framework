/*Write a JAVA Program to find the day of the week from current Day.*/

package com.dgsl.java.stringsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class FindDayOfTheWeekFromCurrentDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Get today's Day");
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		System.out.println(dayOfWeek);

		System.out.println("Enter the number you want to know the day from");
		int dayAfter = sc.nextInt();

		System.out.println("Day after " + dayAfter + " days is : "
				+ LocalDate.now().getDayOfWeek().plus(dayAfter));

		sc.close();

	}

}
