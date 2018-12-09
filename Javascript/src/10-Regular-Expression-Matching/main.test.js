import isMatch from "./main";

describe("isMatch", () => {
  it("should return", () => {
    expect(isMatch("aa", "a")).toBe(false);
  });

  it("should return", () => {
    expect(isMatch("aa", "a*")).toBe(true);
  });

  it("should return", () => {
    expect(isMatch("ab", ".*")).toBe(true);
  });

  it("should return", () => {
    expect(isMatch("aab", "c*a*b")).toBe(true);
  });

  it("should return", () => {
    expect(isMatch("mississippi", "mis*is*p*.")).toBe(false);
  });
});
