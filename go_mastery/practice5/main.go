package main

import (
	"fmt"
	"time"
)

func main() {
	n := time.Now()
	fmt.Println(" time is ", n)
	t := time.Date(2009, time.December, 10, 23, 0, 0, 0, time.UTC)
	fmt.Println(" date is ", t)
	fmt.Println(t.Format(time.ANSIC))
	parsedTime, _ := time.Parse(time.ANSIC, "Thu Dec 10 23:00:00 2009")
	fmt.Printf("Time parsed %T", parsedTime)
}
