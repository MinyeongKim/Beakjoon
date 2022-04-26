a, b = map(int, input().split())
temp = []

def reverse_num(n):
    s = list(str(n))
    s.reverse()
    n = "".join(s)
    
    return int(n)


a = reverse_num(a)
b = reverse_num(b)

if a>b:
    print(a)
else:
    print(b)
