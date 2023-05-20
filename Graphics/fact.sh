echo "Enter a no you want factorial of: "
read n
ans=1

while [ $n -gt 0 ]
do
    ans=`expr $ans \* $n`
    n=`expr $n - 1`
done
    
echo $ans
