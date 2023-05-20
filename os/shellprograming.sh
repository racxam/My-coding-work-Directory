#!/bin/bash
# shebang
echo "hello $USER "
echo $SHELL
echo "Enter the first no"
read a
echo "Enter the second no"
read b
sum=`expr $a + $b` # it will convert it to expression
sumd= $a + $b # it will convert it to expression
echo "The sum is $sum"
echo "The sum is $sumd"
ps # it will show us all program list

