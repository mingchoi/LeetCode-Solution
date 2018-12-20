function trap(height: number[]): number {
  let count = 0;
  for (let i = 0; i < height.length; i++) {
    let blockLvl = height[i];
    if (blockLvl == 0) {
      continue;
    }

    let endLvl = 0;
    let endIndex = 0;
    for (let j = i + 1; j < height.length; j++) {
      if (height[j] >= blockLvl) {
        endIndex = j;
        endLvl = height[j];
        break;
      } else if (height[j] >= endLvl) {
        endIndex = j;
        endLvl = height[j];
      }
    }

    let waterLvl = 0;
    if (blockLvl < endLvl) {
      waterLvl = blockLvl;
    } else {
      waterLvl = endLvl;
    }
    for (let k = i + 1; k < endIndex; k++) {
      count += waterLvl - height[k];
    }
    if (endIndex != 0) {
      i = endIndex - 1;
    }
  }
  return count;
}

export default trap;
