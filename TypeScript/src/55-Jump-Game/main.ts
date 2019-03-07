function canJump(nums: number[]): boolean {
  if (nums.length == 1) {
    return true;
  }
  for (let i = nums.length - 2; i >= 0; i--) {
    let stepToGoal = nums.length - 1 - i;
    let available = nums[i];
    console.log(i, stepToGoal, available);
    if (available >= stepToGoal) {
      let next = canJump(nums.slice(0, i + 1));
      console.log(next);
      if (next) {
        return true;
      }
    }
  }
  return false;
}

export default canJump;
