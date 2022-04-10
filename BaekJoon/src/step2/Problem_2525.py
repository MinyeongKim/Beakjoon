A, B = map(int, input().split())
C = int(input())

B = B+C;

if B>=60:
    A = A+(B//60)
    A = A%24
    B = B%60
    print('{} {}'.format(A, B))
else:
    print('{} {}'.format(A, B))
