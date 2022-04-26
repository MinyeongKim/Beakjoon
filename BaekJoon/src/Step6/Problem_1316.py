n = int(input())
cnt = n

for i in range(n):
    a = input()

    for j in range(len(a)-1):
        if a[j] != a[j+1]:
            if a[j] in a[j+1:]:
                cnt -= 1
                break

print(cnt)
