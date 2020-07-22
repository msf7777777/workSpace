#!/bin/bash

# 需求: 执行死循环 每隔1秒打印当前时间, 执行10次停止 
# 1 计数器
i=1
while true; do
	# echo " 第${}次 "
	# date +'%Y-%m-%d %H:%M:%S'
	echo "$i `date +'%Y-%m-%d %H:%M:%S'`"
	sleep 1
	i=$[ i + 1 ]
	if [ $i -gt 10 ]; then
		break
	fi	
done

