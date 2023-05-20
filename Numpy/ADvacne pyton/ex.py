# Create a list
my_list = [1, 2, 3, 4, 5]

# Get the length of the list
length = len(my_list)

# Loop through the first half of the list
for i in range(length // 2):
    
    # Swap the values at the i-th position and (length - i - 1)-th position
    t=my_list[i]
    my_list[i]=my_list[length - i - 1]
    my_list[length - i - 1]=t
    # my_list[i], my_list[length - i - 1] = my_list[length - i - 1], my_list[i]

# Print the reversed list
print(my_list)
