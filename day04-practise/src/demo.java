/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：demo
 * @Date：2025/3/1 22:22
 */

//视频62-66-67
public class demo {
    public static void main(String[] args) {

        System.out.println(calculation(100000, 6, "头等舱"));

        System.out.println(calculation(999, 7, "头等舱"));

    }

    public static double calculation(double price,int month,String type){
        if(month >=5 && month<=10){
            switch(type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            switch(type){
                case "头等舱":
                    price *=0.7;
                    break;
                case "经济舱":
                    price *=0.65;
                    break;
            }
        }
        return price;
    }
}
