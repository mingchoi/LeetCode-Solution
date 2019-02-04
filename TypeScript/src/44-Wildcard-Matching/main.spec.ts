import isMatch from "./main";

describe("isMatch", () => {
  it("should isMatch two string", () => {
    expect(isMatch("aa", "a")).toBe(false);
  });

  it("should isMatch two string", () => {
    expect(isMatch("aa", "*")).toBe(true);
  });

  it("should isMatch two string", () => {
    expect(isMatch("cb", "?a")).toBe(false);
  });

  it("should isMatch two string", () => {
    expect(isMatch("adceb", "*a*b")).toBe(true);
  });

  it("should isMatch two string", () => {
    expect(isMatch("acdcb", "a*c?b")).toBe(false);
  });

  it("should isMatch two string", () => {
    expect(isMatch("", "?")).toBe(false);
  });

  it("should isMatch two string", () => {
    expect(isMatch("ho", "ho**")).toBe(true);
  });

  it("should isMatch two string", () => {
    expect(
      isMatch(
        "abbabbbaabaaabbbbbabbabbabbbabbaaabbbababbabaaabbab",
        "*aabb***aa**a******aa*"
      )
    ).toBe(true);
  });

  it("should isMatch two string", () => {
    expect(
      isMatch(
        "aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba",
        "*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*"
      )
    ).toBe(true);
  });
});
