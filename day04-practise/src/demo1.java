import java.util.Random;

/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：demo1
 * @Date：2025/3/2 11:53
 */
//视频63
public class demo1 {
    public static void main(String[] args) {

        System.out.println(createCode(4));
    }

    public static String createCode(int n){
        Random r=new Random();
        String code="";
        for (int i=0;i<n;i++){
            int type=r.nextInt(3);
            switch (type){
                case 0:
                    code +=r.nextInt(10);
                    break;
                case 1:
                    code +=(char)(r.nextInt(26)+65);//A的ASCII码是65
                    break;
                case 2:
                    code +=(char)(r.nextInt(26)+97);//a的ASCII码是97
                    break;
            }

        }
        return code;
    }
}
