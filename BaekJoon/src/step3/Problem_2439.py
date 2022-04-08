N = int(input())

for i in range(N):
    for k in range(N-i-1):
        print(" ", end='')
    for j in range(i+1):
        print("*", end='')
    print()
