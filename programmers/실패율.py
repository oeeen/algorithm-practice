def solution(N, stages):
    currSize = len(stages)
    
    failure = {}
    for i in range(1, N + 1):
        if (currSize > 0):
            count = stages.count(i)
            failure[i] = count / currSize
            currSize -= count
        else:
            failure[i] = 0

    return sorted(failure, key=lambda k : failure[k], reverse=True)

solution(5, [2, 1, 2, 6, 2, 4, 3, 3])