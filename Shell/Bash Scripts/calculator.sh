#!/bin/bash

if [ $# -ne 3 ]; then
    echo "Usage: $0 num1 op num2"
    echo "num1 and num2 are integers; op is one of + - x / %"
    exit 1
fi

num1=$1
op=$2
num2=$3
word=""

if [ "$op" = "+" ]; then
    word="Addition"
elif [ "$op" = "-" ]; then
    word="Subtraction"
elif [ "$op" = "x" ]; then
    word="Multiplication"
    op="*"
elif [ "$op" = "/" ]; then
    word="Division"
elif [ "$op" = "%" ]; then
    word="Modulus"
else
    echo "Usage: $0 num1 op num2"
    echo "num1 and num2 are integers; op is one of + - x / %"
    exit 1
fi

echo "$word:"
echo $(( num1 $op num2 ))
