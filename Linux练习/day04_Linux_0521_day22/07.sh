#!/bin/bash

echo "输入 1 到 4 之间的数字"
read aNum
case $aNum in
	1) echo "你选择了1"
	;;
	
	2) echo "你选择了2"
	;;

	3) echo "你选择了3"
	;;

	4) echo "你选择了4"
	;;

	*) echo "你选择了其他，fuck！"
	;;
esac
