package cn.itcast.code.array;
//反转数组
public class ArrayDome12 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {12, 25, 365, 452, 35};
        //2.定义两个针灸针left和right
        int left= 0;
        int right= arr.length - 1;
        //3.循环交换
        while(true){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            //交换完成之后,要将left++,right--
            left++;
            right--;
            //一旦left和right发生变化,就可能是最后一次,确定是否最后一次
            if(left >= right){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
