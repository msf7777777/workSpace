#!/bin/bash

# 2 记载 001.sh 文件，因为想用里面的数组
# source /export/001.sh
. /export/001.sh
# 3 操作 001.sh 里面的数组
for ele in ${myArr[*]}; do
	echo $ele
done


