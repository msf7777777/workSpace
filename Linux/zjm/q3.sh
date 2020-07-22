#!/bin/bash

my_array=(A B "C" D)

# 我们也可以使用下标来定义数组:

array_name[0]=value0
array_name[1]=value1
array_name[2]=value2

echo ${my_array[0]}
echo ${my_array[1]}
echo ${my_array[2]}
echo ${my_array[3]}
