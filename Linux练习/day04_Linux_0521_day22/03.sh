#!/bin/bash

a=$1
b=$2
# 需求1 判断 a 是否大于 100
if [ $a -gt 100 ];then
	echo " 【需求1】$a 大于 100 "
fi

# 需求2 判断 a 是否等于 b
if [ $a -eq $b ]; then
	echo " 【需求2】$a 等于 $b "
else
	echo " 【需求2】$a 不等于 $b "
fi

# 需求3 判断 a 与 b 比较
if [ $a -gt $b ]; then
	echo " 【需求3】$a 大于 $b "
elif [ $a -lt $b ]; then
	echo " 【需求3】$a 小于 $b "
else
	echo " 【需求3】$a 等于 $b "
fi

# 需求4 判断 (a + 10) 和 (b * b) 比较大小
A=$[ a + 10]
B=$[ b * b ]
echo " 【需求4】A = $A "
echo " 【需求4】B = $B "
if [ $A -gt $B ]; then
	echo " 【需求4】$A 大于 $B "
elif [ $A -lt $B ]; then
	echo " 【需求4】$A 小于 $B "
else
	echo " 【需求4】$A 等于 $B "
fi

echo "*********************"
if test $[ a + 10 ] -gt $[ b * b ]; then
	echo "【需求4_text】$A 大于 $B "
fi












