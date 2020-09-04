package com.example.web2.Test;

public class Test1 {
    public static void main(String[] args) {
        double count1 = 0.9;
        double count2 = 0.8;
        Double count3 = count1 - count2;
        double v = 1e-6;
        System.out.println(v);
        if (Math.abs(count1 - count2) < 0.00001) {
            System.out.println("nn");
        } else {
            System.out.println("ss");
        }
        System.out.println(count1 - count2);

    }
}
