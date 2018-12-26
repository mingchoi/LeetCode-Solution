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

});
