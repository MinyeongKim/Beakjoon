S = input().upper()
ar = [0]*26

for i in S:
    ar[ord(i)-ord('A')] += 1
    
        
if ar.count(max(ar)) > 1:
    print('?')
else:
    print(chr(ar.index(max(ar))+ord('A')))
