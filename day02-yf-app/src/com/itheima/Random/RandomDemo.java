package com.itheima.Random;

import java.util.Random;

/**
 * @Author：zz
 * @Package：com.itheima.Random
 * @Project：javase
 * @name：RandomDemo
 * @Date：2025/1/28 21:50
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r= new Random();

        for (int i=0;i<=20;i++){
            int number=r.nextInt(10);
            System.out.println(number);
        }
    }
}
