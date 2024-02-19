package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	value1 := "15.0"
	value2 := "2.0"
	val1, err := strconv.ParseFloat(strings.TrimSpace(value1), 64)
	if err != nil {
		fmt.Println(err)
		panic("value 1 is not float")
	}
	val2, err := strconv.ParseFloat(strings.TrimSpace(value2), 64)
	if err != nil {
		fmt.Println(err)
		panic("value 2 is not float")
	}
	sum := val1 + val2
	fmt.Println("sum is ", sum)
}
