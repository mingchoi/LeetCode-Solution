import maxSubArray from "./main";

describe("maxSubArray", () => {
  it("should maxSubArray", () => {
    expect(maxSubArray([1])).toBe(1);
  });

  it("should maxSubArray", () => {
    expect(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])).toBe(6);
  });
});
