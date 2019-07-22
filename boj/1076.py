def func():
    first = input()
    second = input()
    third = input()
    reg = {'black': 0, 'brown': 1, 'red': 2, 'orange': 3, 'yellow': 4, 'green': 5, 'blue': 6, 'violet': 7, 'grey': 8, 'white': 9}
    print(pow(10, reg[third]) * (reg[first] * 10 + reg[second]))
func()