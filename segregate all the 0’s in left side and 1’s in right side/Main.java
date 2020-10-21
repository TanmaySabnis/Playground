def seperate(arr):
  start = 0
  end = len(arr) - 1
  while start<end:
    if arr[start] == 1:
      arr[start],arr[end] = arr[end],arr[start]
      end -= 1
    else:
      start += 1
  return arr
      
    

n = int(input())
arr = [int(x) for x in input().split()]
ans = seperate(arr)
for ele in ans:
  print(ele,end='')