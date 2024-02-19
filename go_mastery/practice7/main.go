package main

import (
	"fmt"
)

func main() {
	fmt.Println("Pointers")
	int1 := 16
	var p = &int1
	fmt.Println(" value of p is ", *p)

	float1 := 15.5
	p1 := &float1
	fmt.Println(" value of p1 is ", *p1)

	*p1 = *p1 / 2
	fmt.Println("value  of p1 is ", *p1)
	fmt.Println("value of float1 is ", float1)
}
