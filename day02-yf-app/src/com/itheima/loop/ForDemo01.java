package com.itheima.loop;

/**
 * @Author：zz
 * @Package：com.itheima.loop
 * @Project：javase
 * @name：ForDemo01
 * @Date：2025/1/28 13:37
 */
public class ForDemo01 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println("输入5次");
        }
        int sum=0;
        for (int j=1;j<=100;j+=2){
            sum+=j;
        }
        System.out.println(sum);
    }
}
