#!/bin/bash
# 1 定义一个数组
myArr=(1 22 333 4444 55555 666666 7777777 "msf")

myArr2[0]=msf
myArr2[1]=zjm
myArr2[2]=zjb

# 2 获取里面的元素
echo "第一个参数:${myArr[0]}"
echo "第二个参数:${myArr[1]}"
echo "第三个参数:${myArr[2]}"
echo "第四个参数:${myArr[3]}"
echo "第五个参数:${myArr[4]}"
echo "第六个参数:${myArr[5]}"
echo "第七个参数:${myArr[6]}"

# 3 其他的api
# 3.1 一次性获取所有元素
echo “【@】一次性获取所有元素:${myArr[@]}”
echo “【*】一次性获取所有元素:${myArr[*]}”
# 3.2 获取数组的大小
echo "数组的大小:${#myArr[*]}"


# 4 遍历
# 4.1 方式1
echo "**************方式一**************"
for ele in ${myArr[@]}; do
	echo $ele
done
# 4.2 方式2
echo "**************方式二**************"
for(( i=0; i<${#myArr[*]}; i++)); do
	echo ${myArr[i]}
done






