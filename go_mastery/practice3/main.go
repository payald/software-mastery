package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

//Enter a value

func main() {
	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter number :")
	input, _ := reader.ReadString('\n')
	fmt.Println("You entered ", input)
	aFloat, err := strconv.ParseFloat(strings.TrimSpace(input), 64)
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println("You enter a number ", aFloat)
	}

}
