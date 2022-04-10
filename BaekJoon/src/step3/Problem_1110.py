N = int(input())
N_temp = N
cnt = 0

if N<0 or N>99:
    exit()

while True:
    if N<10:
        N = (N%10)*10 + N
    else:
        A = N//10
        B = N%10
        temp = A+B

        N = (B*10) + (temp%10)

    cnt = cnt+1

    if N == N_temp:
        print(cnt)
        break
