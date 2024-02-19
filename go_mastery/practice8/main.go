package main

import (
	"fmt"
)

func main() {
	fmt.Println("Arrays")
	//not sortable not resizable
	var colors [3]string
	colors[0] = "red"
	colors[1] = "green"
	colors[2] = "blue"
	fmt.Println(colors)

	var numbers = [5]int{1, 2, 3, 4, 5}
	fmt.Println(numbers)

	fmt.Println("number of colors ", len(colors))
	fmt.Println("number of numbers ", len(numbers))
}
