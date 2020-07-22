#!/bin/bash

msf() {
	echo "【Fuck】这是我的第一个shit【Fuck】"
	echo "[M]第一个fucker:$1"
	echo "[M]第二个fucker:$2"
	echo "[M]第三个fucker:$3"
	echo "[M]第四个fucker:$4"
	echo "[M]第五个fucker:$5"
	echo "[M]第六个fucker:$6"
	echo "[M]第七个fucker:$7"
	echo "[M]第十个fucker:${10}"

	echo "[M]参数总个数是:$#个"

	echo "[M]输出所有参数:$*"
}

msf $1 $2 $3 $4 $5 $6 $7 $8 $9 $10 $11
# msf 1 2 3 4 5 6 7 10
