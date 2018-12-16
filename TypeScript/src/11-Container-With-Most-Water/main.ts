// @flow
function maxArea(height: number[]): number {
  let max = 0;
  for (let i = 0; i < height.length; i++) {
    for (let j = i; j < height.length; j++) {
      let lowerEdge = height[i] < height[j] ? height[i] : height[j];
      let area = (j - i) * lowerEdge;
      if (area > max) {
        max = area;
      }
    }
  }
  return max;
}

export default maxArea;
