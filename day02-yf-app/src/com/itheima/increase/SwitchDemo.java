package com.itheima.increase;

/**
 * @Author：zz
 * @Package：com.itheima.increase
 * @Project：javase
 * @name：SwitchDemo
 * @Date：2025/1/24 15:31
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String  week ="周三";
        switch (week){
            case "周一":
                System.out.println("埋头苦干");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("您输入的星期不存在~~~");
        }
    }
}
