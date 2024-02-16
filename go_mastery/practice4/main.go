package main

import (
	"fmt"
	"math"
)

func main() {
	aInt := 5
	var aFloat float64 = 42
	sum := float64(aInt) + aFloat
	fmt.Printf("Sum %v Type %T", sum, sum)

	i1, i2, i3 := 12, 13, 14
	intSum := i1 + i2 + i3
	fmt.Println("\nSum is ", intSum)

	f1, f2, f3 := 12.5, 13.5, 14.5
	floatSum := f1 + f2 + f3
	fmt.Println("\nSum is ", floatSum)

	floatSum = math.Round(floatSum*100) / 100
	fmt.Println("The new sum is ", floatSum)

	circleRadius := 15.5
	circumference := circleRadius * 2 * math.Pi

	fmt.Printf("The circumference %.2f\n", circumference)
}
