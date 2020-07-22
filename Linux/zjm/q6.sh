#!/bin/bash

my_arr=(AA BB CC)

for var in ${my_arr[*]}
do
  echo $var
done
