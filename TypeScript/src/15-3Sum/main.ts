function threeSum_bruceforce(nums: number[]): Array<number[]> {
  let result: Array<number[]> = [];
  let len = nums.length;
  for (let i = 0; i < len - 2; i++) {
    for (let j = i + 1; j < len - 1; j++) {
      for (let k = j + 1; k < len; k++) {
        if (nums[i] + nums[j] + nums[k] == 0) {
          let set = [nums[i], nums[j], nums[k]].sort((a, b) => a - b);
          let add = true;
          for (let s of result) {
            if (s[0] == set[0] && s[1] == set[1] && s[2] == set[2]) {
              add = false;
            }
          }
          if (add == true) {
            result.push(set);
          }
        }
      }
    }
  }
  return result;
}

function threeSum_minmax(nums: number[]): Array<number[]> {
  let result: Array<number[]> = [];
  nums.sort((a, b) => a - b);
  let len = nums.length;
  let lastValue = undefined;
  for (let i = 0; i < len; i++) {
    if (nums[i] == lastValue) {
      continue;
    } else {
      lastValue = nums[i];
    }
    let min = i + 1;
    let max = len - 1;
    while (min < max) {
      let sum = nums[i] + nums[min] + nums[max];
      if (sum == 0) {
        result.push([nums[i], nums[min], nums[max]]);
        let maxValue = nums[max];
        while (nums[max] == maxValue) {
          max -= 1;
        }
        let minValue = nums[min];
        while (nums[min] == minValue) {
          min += 1;
        }
      } else if (sum > 0) {
        let maxValue = nums[max];
        while (nums[max] == maxValue) {
          max -= 1;
        }
      } else {
        let minValue = nums[min];
        while (nums[min] == minValue) {
          min += 1;
        }
      }
    }
  }

  return result;
}
export default threeSum_minmax;
