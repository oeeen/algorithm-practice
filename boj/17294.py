def main():
    k = [char for char in input()]
    diff = 0
    if (len(k) > 10 and len(k) == k.count(k[0])):
        print ("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
        return 0
    if (len(k)>=2):
        diff = int(k[0]) - int(k[1])
    for i in range(len(k)-1):
        if (int(k[i]) - int(k[i+1]) != diff):
            print ("흥칫뿡!! <(￣ ﹌ ￣)>")
            return
    print ("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")    
main()