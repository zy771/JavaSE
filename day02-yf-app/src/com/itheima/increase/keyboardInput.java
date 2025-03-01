package com.itheima.increase;

import java.util.Scanner;

/**
 * @Author：zz
 * @Package：com.itheima.increase
 * @Project：javase
 * @name：keyboardInput
 * @Date：2025/1/24 14:48
 */
public class keyboardInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age =sc.nextInt();
        System.out.println("年龄是" + age);

        System.out.println("请输入您的名称：");
        String name=sc.next();
        System.out.println("欢迎" + name);
    }
}
