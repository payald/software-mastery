package main

import (
	"fmt"
)

const aConst = 23

func main() {
	fmt.Println("Hello from Go")

	var aString string = "Hi Go"

	fmt.Println(aString)

	fmt.Printf("The type is %T\n", aString)

	var anotherString = "This is another string"

	fmt.Println(anotherString)

	fmt.Printf("The type is %T\n", anotherString)

	myString := "This is also a string"

	fmt.Println(myString)

	fmt.Printf("The type is %T", myString)

	fmt.Println(aConst)

	fmt.Printf("The type is %T", aConst)
}
