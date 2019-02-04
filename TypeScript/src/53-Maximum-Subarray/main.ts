function maxSubArray(nums: number[]): number {
  let max = Number.MIN_SAFE_INTEGER;
  for (let i = 0; i < nums.length; i++) {
    let num = 0;
    for (let j = i; j < nums.length; j++) {
      num += nums[j];
      if (num > max) {
        max = num;
      }
    }
  }
  return max;
}

export default maxSubArray;
