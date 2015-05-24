package com.company;
import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        try    {
            CalculateClass calc = new CalculateClass();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg = ");
                String first = reader.next();
                System.out.println("Enter second arg = ");
                String second = reader.next();

                System.out.println("Type necessary action = add, minus, mult, divide ");
                String action = reader.next();

                if (action.equals("add")) {
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Result : " + calc.getResult());
                    calc.cleanResult();
                }
                else if (action.equals("minus")) {
                    calc.minus(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Result : " + calc.getResult());
                    calc.cleanResult();
                }
                else if (action.equals("mult")) {
                    calc.mult(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Result : " + calc.getResult());
                    calc.cleanResult();
                }
                else if (action.equals("divide")) {
                    calc.divide(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Result : " + calc.getResult());
                    calc.cleanResult();
                }
                else { System.out.println("Not chosen action"); }


                    System.out.println("Exit : yes/no");
                    exit = reader.next();

            }
        } finally {
            reader.close();
        }

    }
}

