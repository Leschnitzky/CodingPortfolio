def twoStrings(s1, s2):
    for s2_char in s2:
        if s2_char in s1:
            return "YES"
    return "NO"