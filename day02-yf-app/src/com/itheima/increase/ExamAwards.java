package com.itheima.increase;

import java.util.Scanner;

/**
 * @Author：zz
 * @Package：com.itheima.increase
 * @Project：javase
 * @name：ExamAwards
 * @Date：2025/1/24 15:06
 */
public class ExamAwards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int score=sc.nextInt();

        if (score<0||score>100){
            System.out.println("输入成绩有误");
        } else if (score>=90&&score<=94) {
            System.out.println("游乐场玩一次");
        } else if (score>=80&&score<=89) {
            System.out.println("变形金刚一个");
        } else if (score>=95&&score<=100) {
            System.out.println("山地车一个");
        }else {
            System.out.println("胖揍一顿");
        }
    }
}
