package main

import "fmt"

func bubbleSort(unsortedArray []int) {

	for sortedIndex := len(unsortedArray) - 1; sortedIndex >= 0; sortedIndex-- {
		for elementIndex := 0; elementIndex < len(unsortedArray)-1; elementIndex++ {
			if unsortedArray[elementIndex] > unsortedArray[elementIndex+1] {
				unsortedArray[elementIndex], unsortedArray[elementIndex+1] = unsortedArray[elementIndex+1], unsortedArray[elementIndex]
			}
		}
	}
	fmt.Println(unsortedArray)
}
func main() {
	toBeSorted := []int{20, 35, -15, 7, 55, 1, -22, 243, -343, 999, -23}
	bubbleSort(toBeSorted)
}
