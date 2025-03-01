package com.itheima.increase;
/**
*@Author：zz
*@Package：com.itheima.increase
*@Project：javase
*@name：Increase
*@Date：2025/1/24  13:41
*/public class Increase {
    public static void main(String[] args) {
        int c=10;
        int d=5;
        int rs3=c++ + ++c - --d - ++d +1 +c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);
    }
}
