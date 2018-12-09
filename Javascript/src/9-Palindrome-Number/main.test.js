import isPalindrome from "./main";

describe("isPalindrome", () => {
  it("should check", () => {
    expect(isPalindrome(123)).toBe(false);
  });

  it("should check", () => {
    expect(isPalindrome(-123)).toBe(false);
  });

  it("should check", () => {
    expect(isPalindrome(121)).toBe(true);
  });
});
