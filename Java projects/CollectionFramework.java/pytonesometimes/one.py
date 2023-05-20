list1=eval(input("Enter the list elements"))
sum=0
for i in list1:
    sum=sum+i
print(f"Sum of the above list is {sum} and average is {sum/len(list1)}")

list2=eval(input("Enter the elememts to find min and max element"))
print(f"Minimum elements is: {min(list2)} and the Maximum element is {max(list2)}")

