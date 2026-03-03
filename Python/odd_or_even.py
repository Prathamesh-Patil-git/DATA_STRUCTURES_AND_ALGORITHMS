# common method for even or odd
num = int(input("Enter number to check if it is even or odd : "))

# if num%2 == 0:
#     print(num," : is even")
# else:
#     print(num," : is odd")

# 2 . bit manipulation method

if (num & 1) == 0:
    print(num," : is even")
else:
    print(num," : is odd")

