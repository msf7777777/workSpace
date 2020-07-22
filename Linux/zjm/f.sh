#!/bin/bash

a=10

if [ $a -gt 10 ]; then
	echo "a 大于 10"
elif [ $a -lt 10 ]; then
	echo "a 小于 10"
else
	echo "a 等于 10"
fi
