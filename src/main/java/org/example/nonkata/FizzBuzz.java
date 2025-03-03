package org.example.nonkata;

import java.util.stream.IntStream;

public class FizzBuzz {

    //Write a Java program that prints numbers from 1 to 100, but with the following conditions:
    //
    //If a number is divisible by 3, print "Fizz" instead of the number.
    //If a number is divisible by 5, print "Buzz" instead of the number.
    //If a number is divisible by both 3 and 5, print "FizzBuzz" instead of the number.
    //Otherwise, print the number itself.

    public static void main(String[] args) {

    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean isDivisBy3 = i % 3 == 0;
            boolean isDivisBy5 = i % 5 == 0;

            if (isDivisBy3) {
                if (isDivisBy5) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (isDivisBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzz2() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> {
                    boolean isDivisBy3 = i % 3 == 0;
                    boolean isDivisBy5 = i % 5 == 0;

                    if (isDivisBy3 && isDivisBy5) return "FizzBuzz";
                    if (isDivisBy3) return "Fizz";
                    if (isDivisBy5) return "Buzz";
                    else return i;
                }).forEach(System.out::println);
    }

    public static void fizzBuzz3(){
        IntStream.rangeClosed(1,100)
                .mapToObj(i -> checkFizz(i))
                .forEach(i -> System.out.println(i));
    }

    public static void fizzBuzz4(){
        IntStream.rangeClosed(1,100)
                .mapToObj(FizzBuzz::checkFizz)
                .forEach(System.out::println);
    }

    public static void fizzBuzz5(int startNumber, int endNumber){
        IntStream.rangeClosed(startNumber,endNumber)
                .mapToObj(FizzBuzz::checkFizz)
                .forEach(System.out::println);
    }

    public static void fizzBuzz6(int startNumber, int endNumber){
        if (endNumber < startNumber) {
            throw new IllegalArgumentException("End must be greater than or equal to start");
        }
        IntStream.rangeClosed(startNumber,endNumber)
                .mapToObj(FizzBuzz::checkFizz)
                .forEach(System.out::println);
    }

    public static void fizzBuzz7(int startNumber, int endNumber){
        if (endNumber < startNumber) {
            throw new IllegalArgumentException("End must be greater than or equal to start");
        }
        IntStream.rangeClosed(startNumber,endNumber)
                .mapToObj(FizzBuzz::checkFizz2)
                .forEach(System.out::println);
    }

    public static String checkFizz(int i){
        boolean isDivisBy3 = i % 3 == 0;
        boolean isDivisBy5 = i % 5 == 0;

        //most specific first!
        if (isDivisBy3 && isDivisBy5) return "FizzBuzz";
        if (isDivisBy3) return "Fizz";
        if (isDivisBy5) return "Buzz";
        else return String.valueOf(i);
    }

    public static String checkFizz2(int i){
        boolean isDivisBy3 = i % 3 == 0;
        boolean isDivisBy5 = i % 5 == 0;
        boolean isDivisBy15 = i%15 == 0;

        if (isDivisBy15) return "FizzBuzz";
        //deze moet eerst want anders komt die al de 3 of 5 tegen!
        if (isDivisBy3) return "Fizz";
        if (isDivisBy5) return "Buzz";
        else return String.valueOf(i);
    }

}
