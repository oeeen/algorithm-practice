def func():
    a, b, v = map(int, input().split())
    day = (v - b) / (a - b)
    if (day != round(day)):
        day += 1
    print(int(day))
func()