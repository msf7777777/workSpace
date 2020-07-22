package cn.itcast.code.下午.param.test01;

public class Test02 {

    public static void main(String[] args) {

    }
    // 基本数据类型不能返回两个东西
    public static Value getMaxOrMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        Value value = new Value(max, min);
        return value;

    }

}
