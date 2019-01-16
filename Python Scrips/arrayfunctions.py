

# Via HackerRank - ArrayManipulation

# Given an array of size n, and a list of queries in the following format:
# first,last, value
# Each query adds the amount of value to the indices between the first/last
# Function returns the max value in the array, in O(len(queries))
def arrayManipulation(n, queries):
    zeroes = [0] * (n+2)
    for query in queries:
        zeroes[query[0]] += query[2];
        zeroes[query[1] + 1] -= query[2];

    sum_value = 0
    max_value = 0