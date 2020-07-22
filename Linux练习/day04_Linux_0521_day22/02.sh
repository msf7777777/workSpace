#!/bin/bash

echo "**************接收参数**************"

echo "第一个参数: $1"
echo "第二个参数: $2"
echo "第三个参数: $3"
echo "第四个参数: $4"
echo "第五个参数: $5"
echo "第六个参数: $6"
echo "第七个参数: $7"

echo "文件名名称： $0"

echo "*******【\$*】 : $* *******"
for ele in $*; do
	echo "$ele"
done

echo "*******【\$@】 : $@ *******"
for ele in $@; do
	echo "$ele"
done
