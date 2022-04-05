H,M = map(int, input().split())

if M>=45:
    M = M-45
    print('{} {}'.format(H, M))
elif H==0:
    H = 23
    M = M+15
    print('{} {}'.format(H, M))
else:
    H = H-1
    M = M+15
    print('{} {}'.format(H, M))
