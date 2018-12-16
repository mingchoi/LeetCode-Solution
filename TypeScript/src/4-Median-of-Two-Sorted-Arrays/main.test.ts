import findMedianSortedArrays from "./main";

describe("add", () => {
  it("should add two numbers", () => {
    expect(findMedianSortedArrays([1, 3], [2])).toBe(2.0);
  });

  it("should add two numbers", () => {
    expect(findMedianSortedArrays([1, 2], [3, 4])).toBe(2.5);
  });

  it("should add two numbers", () => {
    expect(findMedianSortedArrays([3], [-2, -1])).toBe(-1.0);
  });
});
