#!/bin/bash

# 需求1: 遍历 1~5
echo "****************************"
echo 【需求1】
echo a*******
for ele in 1 2 3 4 5; do
	echo $ele
done

echo b*******
for ele in {1..5}; do
	echo $ele
done


echo c*******
for(( i=1; i<=5; i++ )); do
	echo $i
done

# 需求2: 遍历 1~100
echo "****************************"
echo 【需求2】
for i in {1..10}; do
	echo $i
done





# 需求3: 遍历 1~100之间的奇数
echo "****************************"
echo 【需求3】
for i in {1..10..2}; do
	echo $i
done

# 需求4: 遍历 根目录 下的内容
echo "****************************"
echo 【需求4】
for f in `ls /`; do
	echo $f
done









