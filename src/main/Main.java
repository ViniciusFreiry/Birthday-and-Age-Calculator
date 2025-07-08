package main;

import classes.AgeCalculator;
import classes.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate birthDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        while(birthDate == null) {
            try {
                System.out.println("\nEnter your birth date (YYYY/MM/DD): ");
                birthDate = LocalDate.parse(scanner.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use (YYYY/MM/DD).");
            }
        }

        Person person = new Person(birthDate);
        AgeCalculator ageCalculator = new AgeCalculator(person);

        if (ageCalculator.isBirthdayToday()) {
            System.out.println("\n🎉 Happy Birthday!");
        } else {
            System.out.println("\nIt's not your birthday today.");
        }

        boolean stop = false;

        while(!stop) {
            System.out.println("\nSelect a option:");
            System.out.println("1. Show age in years.        4. Show days lived.");
            System.out.println("2. Show full age.            5. Show days until next birthday.");
            System.out.println("3. Show birth day of week.   6. Close program.");
            String option = scanner.nextLine();

            switch(option) {
                case "1":
                    System.out.println("\nYou are " + ageCalculator.getAgeInYears() + " years old.");
                    break;

                case "2":
                    Period age = ageCalculator.getFullAge();
                    System.out.printf("You are %d years, %d months, and %d days old.%n",
                            age.getYears(), age.getMonths(), age.getDays());
                    break;

                case "3":
                    System.out.println("You were born on a " + ageCalculator.getBirthDayOfWeek().toLowerCase() + ".");
                    break;

                case "4":
                    System.out.println("You have lived " + ageCalculator.getDaysLived() + " days.");
                    break;

                case "5":
                    System.out.println("Days until your next birthday: " + ageCalculator.getDaysUntilNextBirthday());
                    break;

                case "6":
                    stop = true;
                    break;
            }
        }
    }
}