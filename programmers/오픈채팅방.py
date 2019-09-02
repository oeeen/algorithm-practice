def solution(record):
    answer = []
    name = {}
    for r in record:
        a = r.split()
        if ("Leave" not in r):
            name[a[1]] = a[2]
    
    for r in record:
        a = r.split()
        temp = ""
        if ("Enter" in r):
            temp = "님이 들어왔습니다."
        elif ("Leave" in r):
            temp = "님이 나갔습니다."
        else:
            continue
        answer.append(name[a[1]] + temp)
    return answer

solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"])