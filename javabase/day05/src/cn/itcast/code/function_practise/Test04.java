package cn.itcast.code.function_practise;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {11,54,978,12,1,952,62,36};
        int result = getMax(arr);
        System.out.println(result);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
