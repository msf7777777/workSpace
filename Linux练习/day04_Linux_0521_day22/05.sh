#!/bin/bash

# 需求: 计算 1~100 的和(while)
# 1 计数器
i=1
# 3 求和
# 3.1 求和变量
sum=0
# 2 while
while [ $i -le 100 ]; do
	# 3.2 累加
	sum=$[ sum + i]	
	# 2.1 输出1~100
	# echo $i
	i=$[ i + 1 ]
done
# 3.3 输出和
echo " sum = $sum"
# 输出1~100
 




