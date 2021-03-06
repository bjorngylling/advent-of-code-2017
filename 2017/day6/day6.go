package main

import (
	"fmt"
	"reflect"
	"strconv"
	"strings"
)

func createBanks(input string) []int {
	fields := strings.Fields(input)

	var banks []int
	for _, s := range fields {
		i, err := strconv.Atoi(s)

		if err == nil {
			banks = append(banks, i)
		}
	}

	return banks
}

func redistribute(banksHistory [][]int, count int) (cycles int, cyclesBetweenDuplicateState int) {
	previousBanks := banksHistory[len(banksHistory)-1]
	banks := make([]int, len(previousBanks))
	copy(banks, previousBanks)

	index := maxBank(banks)
	maxValue := banks[index]
	banks[index] = 0

	for ; maxValue > 0; maxValue-- {
		index++
		banks[index%len(banks)]++
	}

	count++
	i := find(banksHistory, banks)
	if i == -1 {
		return redistribute(append(banksHistory, banks), count)
	} else {
		return count, count - i
	}
}

func find(list [][]int, el []int) int {
	for i, b := range list {
		if reflect.DeepEqual(b, el) {
			return i
		}
	}
	return -1
}

func maxBank(previousBanks []int) int {
	maxIndex := 0
	for i := range previousBanks {
		if previousBanks[i] > previousBanks[maxIndex] {
			maxIndex = i
		}
	}

	return maxIndex
}

func main() {
	fmt.Println("-- Day 6 --")
	cycles, cyclesBetweenDuplicateState := redistribute(append(make([][]int, 0), createBanks(input)), 0)
	fmt.Printf("cycles=%d, cycles_between_duplicate_state=%d\n", cycles, cyclesBetweenDuplicateState)
}

const input = "2 8 8 5 4 2 3 1 5 5 1 2 15 13 5 14"
