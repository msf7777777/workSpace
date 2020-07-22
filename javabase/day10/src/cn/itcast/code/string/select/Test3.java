package cn.itcast.string.select;
/*
    #### 3.9 案例五: 字符串拼接

**需求**

1. 定义方法arrayToString(), 把int数组的元素按照指定的格式拼接成一个字符串, 并返回.
2. 在main方法中, 调用上述的方法.
3. 例如: 数组为int[] arr = {1, 2, 3}, 则拼接后, 结果为: [1, 2, 3]


总结:
    字符串+= 可以追加拼接
    例如:
        String s1 = "abc";
        s1 += "bcd";  ----> s1 = "abcbcd"
**参考代码*
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4321,4321,4,3214,321,4,21,4321,432,4,3214};
        // "[ 1, 2, 3]"
        String result = array2String(arr);
        System.out.println(result);
    }

    public static String array2String(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                s += arr[i] +"]";
            }else{
                s += arr[i] +",";
            }
        }
        return s;
    }
}
