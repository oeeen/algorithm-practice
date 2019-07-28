package main

import "fmt"

func main() {
	var hour int
	var min int
	fmt.Scan(&hour, &min)

	if min < 45 {
		hour = hour - 1
		min = min + 15
	} else {
		min = min - 45
	}

	if hour < 0 {
		hour = 23
	}
	fmt.Printf("%d %d\n", hour, min)
}