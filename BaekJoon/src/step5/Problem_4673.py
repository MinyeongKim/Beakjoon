temp = [0] * 10001
a = 1

def self_num(a):
    sum = a
    while a != 0:
        sum += a%10
        a //= 10

    return sum

while True:
    
    s = self_num(a)
    
    if a>10001:
        break

    a += 1
    
    if s <= 10000:
        temp[s] = 1


for i in range(1,10001):
    if temp[i] != 1:
        print(i)
