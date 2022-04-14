S = list(input())
ar = [-1]*26

for i in range(len(S)):
    for j in range(ord('a'), ord('z')+1):
        if S[i] == chr(j):
            if ar[ord(S[i])-ord('a')] == -1:
                ar[ord(S[i])-ord('a')] = i
                continue
            
for i in ar:
    print(i, end=' ')
