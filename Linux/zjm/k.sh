#!/bin/bash

echo '输入 a 到 d 之间的数字:'

read aNum

case $aNum in
    a)  echo '你选择了 a'
    ;;

    b)  echo '你选择了 b'
    ;;

    c)  echo '你选择了 c'
    ;;

    d)  echo '你选择了 d'
    ;;

    *)  echo '你没有输入 a 到 d 之间的数字'
    ;;
esac
