package solutions

import (
	"fmt"
	"strconv"
	"testing"
)

func TestReverseBits(t *testing.T) {
	t.Run("Test everseBits", func(t *testing.T) {
		var tests = []struct {
			input uint32
			want  uint32
		}{
			{
				0b01000000000000000000000000000101,
				0b10100000000000000000000000000010,
			},
			{
				0b00000010100101000001111010011100,
				0b00111001011110000010100101000000,
			},
		}
		for _, v := range tests {
			t.Run(fmt.Sprintf("input=%v, want=%v", v.input, v.want), func(t *testing.T) {
				result := reverseBits(v.input)
				if result != v.want {
					t.Errorf("got \n%v, want \n%v", strconv.FormatInt(int64(result), 2), strconv.FormatInt(int64(v.want), 2))
				}
			})
		}
	})
}
