package topic_strings

/**
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
*/

/*
Runtime
32 ms
Beats
88.62%
Memory
6.6 MB
Beats
86.24%
*/
func reverseString(s []byte) {
	for i := 0; i < len(s)/2; i++ {
		temp := s[len(s)-1-i]
		s[len(s)-1-i] = s[i]
		s[i] = temp
	}
}

func reverseString2(s []byte) {
	i := 0
	j := len(s) - 1
	for i < j {
		s[i], s[j] = s[j], s[i]
		i++
		j--
	}
}
