def add_two_numbers() -> int:
    user=input()
    string_int= user.split(",")
    sum=0
    for i in string_int:
        sum+=int(i)
    return sum



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
