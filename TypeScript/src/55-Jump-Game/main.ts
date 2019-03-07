function canJump(nums: number[]): boolean {
  if (nums.length == 1) return true;
  for (let i = nums.length - 2; i >= 0; i--) {
    let stepToGoal = nums.length - 1 - i;
    let available = nums[i];
    if (available >= stepToGoal) {
      nums = nums.slice(0, i + 1);
      i = nums.length - 1;
      if (nums.length == 1) {
        return true;
      }
      continue;
    }
  }
  return false;
}

export default canJump;
