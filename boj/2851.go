package main

import "fmt"

func abs(a int) int {
	if (a < 0) {
		return -1 * a
	}
	return a
}

func main() {
	pre:= 0
	curr:= 0
	check:= true
	for i:=0; i < 10; i++{
		var tmp int
		fmt.Scan(&tmp)
		curr += tmp
		if curr >= 100 && check {
			if abs(100 - curr) > abs(100 - pre) {
				fmt.Println(pre)
			} else {
				fmt.Println(curr)
			}
			check = false
		} else {
			pre = curr
		}
	}
	if check {
		fmt.Print(curr)
	}
}