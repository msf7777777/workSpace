package cn.itcast.task;
/*
5. 定义Demo07类 ,设计一个方法，用于比较两个数组的内容是否相同。在main方法中调用该方法测试功能
		数组内容相同，指的是元素个数相同，元素值相同，并且元素顺序相同，条件缺一不可。
*/
public class task05 {
    public static void main(String[] args) {
        getArraySameOrNot(new int[]{1, 2, 3, 4, 5},new int[]{1, 2, 3, 4, 5});
        getArraySameOrNot(new int[]{2, 2, 3, 4, 5},new int[]{1, 2, 3, 4, 5});
        getArraySameOrNot(new int[]{1, 2, 3, 4, 5, 6},new int[]{1, 2, 3, 4, 5});
        getArraySameOrNot(new int[]{1, 2, 3, 4, 5},new int[]{1, 2, 3, 4, 5, 6});
    }

    public static void getArraySameOrNot(int[] arr, int[] arr1) {
        //定义一个计数器,如果计数器在两个数组对比过程中能顺利走到最有后一步,就能证明该题目
        int count = 0;
        if(arr.length == arr1.length){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == arr1[i]){
                    count++;//这是之前定义的能确定俩数组是否相同的计数器,很关键
                }else{
                    System.out.println("这两个数组不同!");
                }

            }
        }else{
            System.out.println("这两个数组不同!");
        }
        if(count == arr.length || count == arr1.length){
            System.out.println("这是两个内容相同的数组");
        }
    }
}
