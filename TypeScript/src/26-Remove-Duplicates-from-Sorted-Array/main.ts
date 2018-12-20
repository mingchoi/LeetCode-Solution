function removeDuplicates(nums: number[]): number {
  let l = null;
  let count = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] != l) {
      nums[count] = nums[i];
      count++;
    }
    l = nums[i];
  }
  return count;
}

export default removeDuplicates;
