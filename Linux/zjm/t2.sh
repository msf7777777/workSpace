#!/bin/bash

source /export/t1.sh  # 加载test1.sh 的文件内容

for var in ${my_arr[*]}; do
  echo $var
done
