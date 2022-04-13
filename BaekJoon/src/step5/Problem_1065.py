N = int(input())

def ari_seq(n):
    cnt = 0
    n1 = 0
    n2 = 0
    n3 = 0

    for i in range(1,n+1):
        if i <100:
            cnt += 1
        else:
            n1 = i//100
            n2 = (i - n1*100)//10
            n3 = i%10

                        
            if n2-n1 == n3-n2:
                cnt += 1

    return cnt


cnt = ari_seq(N)
print(cnt)
