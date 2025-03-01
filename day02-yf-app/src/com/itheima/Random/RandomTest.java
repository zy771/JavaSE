package com.itheima.Random;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author：zz
 * @Package：com.itheima.Random
 * @Project：javase
 * @name：RandomTest
 * @Date：2025/1/28 22:08
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r=new Random();
        int luckNumber=r.nextInt(100)+1;

        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请输入您要猜的数字：");
            int guessNumber=sc.nextInt();

            if (guessNumber>luckNumber){
                System.out.println("太大了");
            } else if (guessNumber<luckNumber) {
                System.out.println("太小了");
            }else {
                System.out.println("对了");
                break;
            }
        }
    }
}
