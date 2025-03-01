/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：JudgeArrayDemo
 * @Date：2025/3/1 10:08
 */
public class JudgeArrayDemo {
    public static void main(String[] args) {

        int[] arr1={};
        int[] arr2={};
        System.out.println(equalArray(arr1, arr2));

        int[] arr3={1,2,3,4};
        int[] arr4={1,2,3,4};
        System.out.println(equalArray(arr3, arr4));

    }

    public static boolean equalArray(int[] arr1, int[] arr2){
        if(arr1==null&&arr2==null){
            return true;
        }
        if(arr1==null||arr2==null){
            return false;
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
