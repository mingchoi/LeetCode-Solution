function searchRange(nums: number[], target: number): number[] {
  let index = -1;
  let lastIndex = -1;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] == target) {
      if (index == -1) {
        index = i;
      }
      lastIndex = i;
    } else if (index != -1) {
      return [index, lastIndex];
    }
  }
  return [index, lastIndex];
}

export default searchRange;
