#!/bin/bash

a=20
b=10

# 需求1 判断 a 是否大于 100
echo "\n需求1："
if [ $a -gt 100 ]; then
	echo "a = $a , a 大于 100"
else
	echo "a = $a , a 不大于 100"
fi

# 需求2 判断 a 是否等于 b
echo "需求2："
if [ $a -eq $b ]; then
	echo "a 等于 b(a=$a , b=$b)"
else
	echo "a 不等于 b(a=$a , b=$b)"
fi

# 需求3 判断 a 与 b 比较
echo "需求3："
if [ $a -eq $b ]; then
	echo "a 等于 b"
	echo "$a 等于 $b"
elif [ $a -gt $b ]; then
	echo "a 大于 b"
	echo "$a 大于 $b"
else
	echo "a 小于 b"
	echo "$a 小于 $b"
fi

# 需求4 判断 (a + 10) 和 (b * b) 比较大小
echo "需求4："
if test $[ a + 10 ] -gt $[ b * b ]; then
	echo "(a+10) 大于 (b*b)"
	echo "$[a+10] 大于 $[b*b]"
else
	echo "(a+10) 小于或等于 (b*b)"
	echo "$[a+10] 小于或等于 $[b*b]"
fi

echo "需求4：（课件）"
if test $[ a + 10 ] -gt $[ b * b ]; then
        echo "(a+10) 大于 (b * b)"
else 
        echo "(a+10) 小于或等于 (b*b)"
fi
