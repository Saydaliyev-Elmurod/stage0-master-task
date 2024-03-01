package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
//        first = first+second; // 1,2 3,2
//        second = first-second;// 3,1
//        first = first-second;// 2,1

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);
    }

}
