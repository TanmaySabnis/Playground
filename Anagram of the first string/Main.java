def anagram(s1,s2):
  if len(s1) == len(s2):
    s2 = list(s2)
    for letter in s1:
      for sec_let in s2:
        if letter == sec_let:
          s2.remove(sec_let)
    if len(s2) == 0:
      return 'Anagram'
    else:
      return 'Not anagrams'
      
  else:
    return 'Not anagrams'




s1 = input()
s2 = input()
ans = anagram(s1,s2)
print(ans)