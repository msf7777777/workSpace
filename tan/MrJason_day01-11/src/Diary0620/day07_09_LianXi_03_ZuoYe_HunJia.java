package Diary0620;

import java.util.Scanner;

public class day07_09_LianXi_03_ZuoYe_HunJia {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入_身高（CM）");
		int high = s.nextInt();
		System.out.println("请输入_金钱（RMB）");
		int money = s.nextInt();//这里应该是：  long money = s.nextlong();  //
		System.out.println("请输入_脸蛋（0-100分）");
		int face = s.nextInt();
		
		if(high >= 180 && high <= 200){
		//高	
			if(money >= 100000000 && money <= 999999999){
			//高&有钱	
				if(face >= 80){
				//高&有钱&有颜值	
					System.out.println("我一定要嫁给它");
				}else if(face < 80 && face >= 60){
				//高&有钱&不难看	
					System.out.println("出家吧，比上不足，比下有余，耳根清净、不颜控");
				}else if(face < 60 && face > 0){
				//高&有钱&很难看	
					System.out.println("嫁吧，比上不足，比下有余，没法嫁姚明，就嫁给金钱吧！");
				}	
			}else if(money > 999999999){
			//高&假有钱（有没有钱不知道）	
				if(face >= 80 && face <= 100){
				//高&假有钱&有颜值
					System.out.println("长得人模人样的，怎么满嘴跑火车？");
				}else if(face < 80 && face >= 0){
				//高&假有钱&没颜值	
					System.out.println("别你妈吹牛逼！草！不瞅瞅自己长啥逼样，傻大个儿");	
				}
			}else if(money < 100000000 && money >= 100){
				//高&钱不多&颜值忘看了
				if(face <= 100 && face >= 0)
				System.out.println("出家吧，比上不足，比下有余，六根清净、不贪财，诶？长什么样来着？");
			}else if(money < 100){
			//高&穷逼	
				if(face >=80 && face <= 100){
				//高&穷逼&有颜值
				System.out.println("小红帽：100块都不给我！我就当找鸭子了，倒霉");
				}else if(face < 80 && face >= 0){
				//高&穷逼&没颜值
					System.out.println("小红帽：100块都不给我！早知道昨晚就关灯做了");
				}
			}	
		}else if(high < 180 && high > 0){
		//不高	
			if(money >= 100000000){
			//不高&有钱
				if(face >=80 && face <= 100){
				//不高&有钱&有颜值
					System.out.println("你好！郭敬明，我想给你生猴子！");
				}else if(face < 80 && face > 0){
				//不高&有钱&没颜值
					System.out.println("Hey！潘长江，跟你媳妇儿离婚吧！娶我哦");
				}
			}else if(money < 100000000){
			//不高&没钱
				if(face >=80 && face < 100){
				//不高&没钱&有颜值
					System.out.println("兄弟，先打篮球赚钱吧！看你那鞋拔子脸，哈哈~");
				}else if(face < 80){
				//不高&没钱&没颜值
					System.out.println("不嫁");
				}
			}	
		}else if(high <= 0){
			if(money <= 0 && face <= 0){
				System.out.println("");
				System.out.println("......");
				System.out.println("你他妈的还没受精吧？傻逼！");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("傻逼才设计这种程序！");
		System.out.println("");
		System.out.println("琴痴是你大爷！！！");
		
		s.close();
		
		
	}
}
