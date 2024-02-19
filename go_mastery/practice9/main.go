package main

import (
	"fmt"
	"sort"
)

func main() {
	fmt.Println("slices")
	var colors = []string{"red", "green", "blue"}
	fmt.Println(colors)

	colors = append(colors, "purple")
	fmt.Println(colors)

	//remove first element
	colors = append(colors[1:len(colors)])
	fmt.Println(colors)

	//remove last element
	colors = append(colors[:len(colors)-1])
	fmt.Println(colors)

	numbers := make([]int, 5)
	numbers[0] = 1
	numbers[1] = 111
	numbers[2] = 11
	numbers[3] = 1111
	numbers[4] = 11111
	fmt.Println(numbers)
	numbers = append(numbers, 23)
	fmt.Println(numbers)

	sort.Ints(numbers)
	fmt.Println(numbers)
}
