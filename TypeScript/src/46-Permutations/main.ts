function permute(nums: number[]): number[][] {
  let result: number[][] = [];
  p(nums, 0, result)
  return result;
}

function p(nums: number[], i: number, result: number[][]) {
  if (i == nums.length - 1) {
    result.push(nums.slice(0))
    return
  }
  for (let j = i; j < nums.length; j++) {
    [nums[i], nums[j]] = [nums[j], nums[i]]
    if (nums != undefined) {
      p(nums, i + 1, result)
    }
    [nums[i], nums[j]] = [nums[j], nums[i]]
  }
}

export default permute;