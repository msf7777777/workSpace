#!/bin/bash

# 需求1: 遍历 1~5
echo "需求1："
echo " "
for i in 1 2 3 4 5 6 7; do
	echo $i;
done
echo " "
for i in {1..7}; do
	echo $i;
done
echo " "
for(( i=1; i<=7; i++ )); do
	echo $i;
done
echo " "

# 需求2: 遍历 1~100
echo "需求2："
echo " "
for i in {1..21}; do
	echo $i;
done
echo " "

# 需求3: 遍历 1~100之间的奇数
echo "需求3："
echo " "
for i in {1..21..2}; do
	echo $[i+1];
done

# 需求4: 遍历 根目录 下的内容
echo "需求4："
echo " "
for i in `ls /`; do
	echo $i
done
