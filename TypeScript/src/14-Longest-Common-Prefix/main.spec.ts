import longestCommonPrefix from "./main";

describe("longestCommonPrefix", () => {
  it("should return string", () => {
    expect(longestCommonPrefix(["flower", "flow", "flight"])).toBe("fl");
  });

  it("should return string", () => {
    expect(longestCommonPrefix(["dog", "racecar", "car"])).toBe("");
  });

  it("should return string", () => {
    expect(longestCommonPrefix([])).toBe("");
  });
});
