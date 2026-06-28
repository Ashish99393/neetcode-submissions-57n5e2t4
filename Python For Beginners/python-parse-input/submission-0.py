from typing import List

def read_integers() -> List[int]:
    user=input()
    num_list= user.split(",")
    int_list=[]

    for i in num_list:
        int_list.append(int(i))
    return int_list

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
