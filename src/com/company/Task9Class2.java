package com.company;



import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task9Class2 {
    private int numberOfElements = 0;
    private int[] arrayF;

    public Task9Class2() {
    }


    public Task9Class2(int numberOfElements) {
        this.numberOfElements = numberOfElements;
        this.arrayF = new int[numberOfElements];
    }

    public int[] randomizeArray() {
        Random random = new Random();
        for (int i = 0; i < this.arrayF.length; i++) {
            arrayF[i] = random.nextInt(100);
        }
        return arrayF;
    }

    public int[] changeOrderInArray() {
        Random random = new Random();
        for (int i = 0; i < this.arrayF.length; i++) {
            int rndIndex = random.nextInt(this.arrayF.length);
            int temp = this.arrayF[rndIndex];
            this.arrayF[rndIndex]=this.arrayF[i];
            this.arrayF[i] = temp;
        }
        return arrayF;
    }

    public void countUnicElements(){
        int [] unicElements;
        Set set = new HashSet();
        int count = 0;
        for(int i = 0; i<this.arrayF.length; i++) {
            if(set.add(this.arrayF[i])) {
                count++;
                System.out.println(this.arrayF[i]);
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < this.arrayF.length; i++) {
            System.out.print(this.arrayF[i]+" ");
        }
    }

}
