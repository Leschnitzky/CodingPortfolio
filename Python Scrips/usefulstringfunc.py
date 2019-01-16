
# Checks if 2 strings have the same substring
def twoStrings(s1, s2):
    for s2_char in s2:
        if s2_char in s1:
            return True
    return False




#Get all possible substrings in a string
def get_all_substring(s):
        return list(s[i:j+1] for i in range (len(s)) for j in range(i,len(s)))


        