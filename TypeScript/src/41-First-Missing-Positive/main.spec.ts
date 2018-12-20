import firstMissingPositive from "./main";

describe("firstMissingPositive", () => {
  it("should return missing positive", () => {
    expect(firstMissingPositive([1, 2, 0])).toBe(3);
  });

  it("should return missing positive", () => {
    expect(firstMissingPositive([3, 4, -1, 1])).toBe(2);
  });

  it("should return missing positive", () => {
    expect(firstMissingPositive([7, 8, 9, 11, 12])).toBe(1);
  });
});
