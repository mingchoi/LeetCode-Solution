function firstMissingPositive(nums: number[]): number {
  let map: any = {};
  nums.map(x => {
    map[x] = true;
  });
  let num = 1;
  while (true) {
    if (!map[num]) {
      return num;
    }
    num++;
  }
  return -1;
}

export default firstMissingPositive;
