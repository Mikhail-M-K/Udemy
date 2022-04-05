package com.javalesson.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {

    public static void main(String[] args) {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }
    }
    private static void doEverything(){
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt")) ) {
            System.out.println("Please enter numerator");
            int numerator = scanner.nextInt();
            System.out.println("Please enter denominator");
            int denominator = scanner.nextInt();
            //System.out.println(divide(numerator,denominator));
            //saveToFile(divide(numerator,denominator));
                /*if (continueLoop) {
                    throw new RuntimeException("Runtime exception");
                }*/
                //int[] inArray = new int[1];
                //int i = inArray[2];

                writer.println("Result = "+ divide(numerator,denominator));

                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("unable to open file");
                e.printStackTrace();
            }catch (IndexOutOfBoundsException e){
                System.out.println("All Exception here");
                throw new InvalidInputParamException("Index out of bound. Thrown in doEverything" + e);
            }finally {
                System.out.println("Finally block called");
            }
        } while (continueLoop);
        System.out.println("Try catch block finished");
    }


    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException{
        return numerator / denominator;
    }

    private static void saveToFile(int res) throws IOException {

    }
}
