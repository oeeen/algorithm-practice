import copy
import sys, enum

MAX_MOVE_COUNT = 5

class Direction(enum.Enum):
    EAST = 1
    SOUTH = 2
    WEST = 3
    NORTH = 4

def gameInit():
    n = int(sys.stdin.readline())
    board = []
    for _ in range(n):
        a = [int(i) for i in sys.stdin.readline().split()]
        board.append(a)
    return board

def findMax(board):
    return max(map(max, board))

def makeDirectionList(directions, count):
    if (count == MAX_MOVE_COUNT):
        play(directions)
    else:
        for direction in Direction:
            makeDirectionList(directions + [direction], count + 1)

def play(directions):
    global board, maxValue
    board = copy.deepcopy(original_board)
    for d in directions:
        move(d)
    currentValue = findMax(board)
    if (maxValue < currentValue):
        maxValue = currentValue

def move(direction):
    if (direction == Direction.EAST):
        east()
    elif (direction == Direction.WEST):
        west()
    elif (direction == Direction.NORTH):
        north()
    elif (direction == Direction.SOUTH):
        south()

def east():
    for i, line in enumerate(board):
        tmp = []
        while(0 in line):
            line.remove(0)
        while (len(line) > 1):
            if (line[-1] == line[-2]):
                tmp.insert(0, line.pop() + line.pop())
            else :
                tmp.insert(0, line.pop())
        tmp = line + tmp
        for _ in range(len(board) - len(tmp)):
            tmp.insert(0, 0)
        board[i] = tmp

def west():
    for i, line in enumerate(board):
        tmp = []
        while(0 in line):
            line.remove(0)
        while (len(line) > 1):
            if (line[0] == line[1]):
                tmp.append(line.pop(0) + line.pop(0))
            else :
                tmp.append(line.pop(0))
        tmp = tmp + line
        for _ in range(len(board) - len(tmp)):
            tmp.append(0)
        board[i] = tmp

def north():
    for i, line in enumerate(zip(*board)):
        tmp = []
        line = list(line)
        while(0 in line):
            line.remove(0)
        while (len(line) > 1):
            if (line[0] == line[1]):
                tmp.append(line.pop(0) + line.pop(0))
            else :
                tmp.append(line.pop(0))
        tmp = tmp + line
        for _ in range(len(board) - len(tmp)):
            tmp.append(0)
        for j, v in enumerate(tmp):
            board[j][i] = v

def south():
    for i, line in enumerate(zip(*board)):
        tmp = []
        line = list(line)
        while(0 in line):
            line.remove(0)
        while (len(line) > 1):
            if (line[-1] == line[-2]):
                tmp.insert(0, line.pop() + line.pop())
            else :
                tmp.insert(0, line.pop())
        tmp = line + tmp
        for _ in range(len(board) - len(tmp)):
            tmp.insert(0, 0)
        for j, v in enumerate(tmp):
            board[j][i] = v

original_board = gameInit()
board = []
maxValue = 0
totalCount = 0
makeDirectionList([], 0)
print(maxValue)