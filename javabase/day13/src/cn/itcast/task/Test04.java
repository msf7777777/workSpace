package cn.itcast.task;

import java.util.HashMap;
import java.util.Random;

/*
4.双色球规则，双色球每注投注号码由6个1—33的号码和1个1—16的号码组成。
  其中6个1-33的数字要求不能重复。请随机生成一注双色球号码
 */
public class Test04 {
    public static void main(String[] args) {
        //1.创建集合,键:位置,值:号码,第一个键是1-16的号码
        HashMap<Integer, Integer> ball = new HashMap<>();
        Random random = new Random();
        //2.第一个放1个1—16的随机号码
        int firstNmuber = random.nextInt(16) + 1;
        ball.put(1, firstNmuber);
        //3.放6个1—33的号码
        int[] arr = new int[6];
        int count = 0;
        int key = 2;
        while (true){
            int number = random.nextInt(33) + 1;
            int result = 0;
            for (int i = 0; i < 6; i++) {
                if(arr[i] == number){
                    result++;
                    break;
                }
            }
            if(result == 0){
                arr[count] = number;
                ball.put(key, arr[count]);
                count++;
                key++;
                if(count == 6){
                    break;
                }
            }
        }
        System.out.println(ball);
    }
}
