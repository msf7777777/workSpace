/*
1.API
	API: 就是一些类和方法的堆积
	API文档: 就是一个说明书, 专门对这些类和方法进行描述
2.查询API文档的步骤
		1.打开
		2.点击"显示"
		3.搜索我们想要学习的类
3.如何学习一个类
	1.看包 ---> 主要看这个类是否属于java.lang包下的东西, 如果不属于在使用的时候要导包
	2.看构造 ---> 为了创建该类的对象
	3.看成员方法 ----> 看这个类提供的功能
4.Object
	他是类层次的跟, 是万类的祖宗, 一个类直接或者间接继承Object
	当我们编写一个类的时候, 我们如果没有显示继承任何一个类, 我们默认继承Object
	成员方法
		String toString(); // 默认将对象的类型+ @ + 地址
		boolean equals(Object obj); // 默认是用 == 来比较
	如果我们不希望打印对象显示地址, 而是显示内容的话, 我们需要重写toString
		快捷键: alt + insert + toString
	== 如果是基本数据类型比较, 我们比的是数值, 如果是引用数据类型比的是地址值
	如果对象要比较内容的话, 不能使用== 需要重写equals方法来去进行比较
		快捷键: alt + insert + equals & hashcode
5.String
	String(); // 创建一个空的字符串  ----> String s = "";
	String(String src); //创建一个字符串含有内容 ---> String s = src;
	String(char[] arr); ---> 将字符数组变成字符串
	String(char[] arr,int start, int count); ---> 将字符数组的一部分变成字符串
	String(byte[] arr); ---> 将字节数组的一部分变成字符串
	String(byte[] arr,int start, int count); ---> 将字节数组的一部分变成字符串
	String 变量名 = "字符串常量";(推荐的!!!!!!!!!!!)
	直接赋值和通过构造创建字符串对象的区别
		new: 在堆内存中
		直接赋值: 在堆内存的常量池中
	字符串不能使用==比较, 因为同样内容的字符串有可能地址值不一样不建议字符串使用 == 比较

	成员方法:
		boolean equals(Object obj); ---> 比较两个字符串的内容是否相同
		boolean equalsIgnoreCase(String s) --->忽略大小写比较
	查找
		public char charAt(int index) ----> 查找指定位置上的字符
		int indexOf(String str)  ----> 查找一个字符串在另外一个字符串中的第一次出现的位置,从0开始查
		int indexOf(String str, int fromIndex)
					----> 查找一个字符串在另外一个字符串中的第一次出现的位置,从某个开始查
		int lastIndexOf(String str) ---> 查询一个字符串在另外一个字符串中最后出现的位置
		public int length(); ---> 获取字符串的字符个数
	截取
		String[] split(String regex) ---> 将字符串按照某种规则进行切割成若干份, 将若干份的字符串装到字符串数组返回
		String substring(int beginIndex)----> 从某个位置开始截取到最后
		String substring(int beginIndex, int endIndex) --->从某个位置开始截取到指定位置,含头不含尾[beginIndex,endIndex)
	判断
		public boolean equals(Object obj) ---> 判断一个字符串和另外一个字符串是否相同
		boolean contains(CharSequence s) ---> 判断一个字符串手否包含另外一个字符串
		boolean endsWith(String suffix)  ---> 判断字符串是否以某个字符串结尾
		boolean startsWith(String prefix) ----> 判断字符串是否以某个字符串开头
	转换
		String toLowerCase()  ---> 将字符串变成小写
		String toUpperCase()  ---> 将字符串变成大写

	注意事项: 字符串是一个不可改变的序列, 一旦发生改变了, 一定是返回了一个新的字符串

6.StringBuilder
	构造:
		StringBuilder()  ---->  ""
		StringBuilder(String str)  ----> str
	成员方法:
		StringBuilder append(各种数据类型) : 类似于 += 符号,但是效率会非常高
		int length()  ;得到字符个数
		StringBuilder reverse()  ; 将里面所有的字符反转
		String toString()  	;将	StringBuilder中的内容变成一个字符串
	总结:
		以后字符串拼接的话,不建议使用+=来去拼, 建议使用StringBuilder的append方法去拼接!!!!!

	StringBuilder 和  String之间的互转
	String ---> StringBuilder  :   为了提高拼接效率,或者反转
		方式:
			通过StringBuilder的有参构造

	StringBuilder ---> String  :   String里面定义了更多的更通用的方法可以使用
		方式:
			可以通过StringBuilder的toString方法









 */
public class 常用Api方法 {

}
