def locking(k):
  digits = []
  while k>0:
    d = k%10
    digits.append(d)
    k = k//10
    
    
  digits.sort()
  for ele in digits:
    print(ele,end=' ')
  return

k = int(input())
locking(k)