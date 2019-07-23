package com.aimer.viewpager;

import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    int[] numbers = {7,5,4,0,0};
    int temp = 0;

    @Test
    public void initTest() {

        for (int i = 0; i < numbers.length -1; i++) {
            System.out.print("i====="+i);
            for (int j = 0; j < numbers.length-1-i; j++) {
                System.out.print("j====="+j);
                if(numbers[j] > numbers[j+1]){  //交换两数位置
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

        }
        System.out.print(Arrays.toString(numbers));

        int a=2,b=8;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.print("a==="+a+"b==="+b);

        int num = 20;
        num*=2;
        System.out.print("num==="+num);
    }
}
