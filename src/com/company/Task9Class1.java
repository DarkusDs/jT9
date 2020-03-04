package com.company;

public class Task9Class1 {
    private int first = 0;
    private int second = 0;

    public Task9Class1() {
    }

    public Task9Class1(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void printBothVariables(){
        System.out.println(" "+this.first+" ; "+this.second+" ");
    }
    public int countSum(){
        return this.first+this.second;
    }
    public void getMax(){
        if (this.first>this.second){
            System.out.println("Max value is "+this.first);
        }
        if (this.first<this.second){
            System.out.println("Max value is "+this.second);
        }
        if (this.first == this.second){
            System.out.println("First value = second value");
        }
    }


}
