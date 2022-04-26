dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

a = input().upper()
T = 0

for i in range(len(a)):
    for j in dial:
        if a[i] in j:
            T += dial.index(j) + 3


print(T)
