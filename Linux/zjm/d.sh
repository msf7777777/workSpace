#!/bin/bash

a=20
b=4

# 加法运算
echo a + b = `expr $a + $b`

# 减法运算
echo a - b = `expr $a - $b`

# 乘法运算
echo a x b = `expr $a \* $b`

# 除法运算
echo a ÷ b = `expr $a / $b`

# 还可以通过(())、$(())、$[]进行算术运算
echo "a = $a"

c=$((a + b))

d=$[a + b]

echo "c = $c"

echo "d = $d"
