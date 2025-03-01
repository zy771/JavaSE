/**
 * @Author：zz
 * @Package：PACKAGE_NAME
 * @Project：javase
 * @name：PrintArray
 * @Date：2025/3/1 9:51
 */
public class PrintArray {
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        printArray(arr);

        int[] arr2=null;
        printArray(arr2);

        int[] arr3={};
        printArray(arr3);

    }

    public static void printArray(int[] arr){
        //健壮性检测
        if(arr==null){
            System.out.println("数组为空");
            return;
        }

        System.out.print("[");
        for (int i=0;i<arr.length;i++){
//            if (i==arr.length-1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i==arr.length-1?arr[i]:arr[i]+", ");//三元运算符一行搞定，为真返回中间的值，为假返回后面的值
        }
        System.out.println("]");
    }
}
