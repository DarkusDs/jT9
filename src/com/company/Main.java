package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Task9Class1 task9Class1 = new Task9Class1(letsScan(), letsScan());
        System.out.println("Sum is "+task9Class1.countSum() );
	    task9Class1.getMax();
	    task9Class1.printBothVariables();
        System.out.println();
        System.out.println();
        Task9Class1 [] array = new Task9Class1[9];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = new Task9Class1(random.nextInt(20),random.nextInt(30));
        }
        for (int i = 0; i < array.length; i++) {
            array[i].printBothVariables();
        }
        System.out.println("=====================================================");
        Task9Class2 task9Class2 = new Task9Class2(letsScan());
        task9Class2.randomizeArray();
        task9Class2.printArray();
        System.out.println();
        task9Class2.changeOrderInArray();
        task9Class2.printArray();
        System.out.println();
        task9Class2.countUnicElements();
        System.out.println("======================================================");
        String[] myStringArray = {"a", "ar", "arr", "arra", "array", "array1", "array2"};
        Task9Class3IfTheTaskAboutArrayWithElementsEqualsLenght task9Class3 = new Task9Class3IfTheTaskAboutArrayWithElementsEqualsLenght(myStringArray, 6);
        task9Class3.sortPrimaryArray();
        task9Class3.printPrimaryArray();
        task9Class3.printSecondaryArray();
        task9Class3.getStringByInputIndex(letsScan()-1);
        String[] myStringArray2 = {"b", "ba", "bar", "barr", "barra", "barrak", "barrat", "berret"};
        Task9Class3IfTheTaskAboutArrayWithElementsEqualsLenght task9Clas3 = new Task9Class3IfTheTaskAboutArrayWithElementsEqualsLenght(myStringArray2, 6);
        task9Clas3.sortPrimaryArray();
        task9Clas3.summ(task9Class3);
    }


    private static int letsScan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число:");
        return scanner.nextInt();
    }


}
