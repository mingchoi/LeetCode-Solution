import lengthOfLongestSubstring from "./main";

describe("lengthOfLongestSubstring", () => {
  it("should show length", () => {
    expect(lengthOfLongestSubstring("abc")).toBe(3);
  });

  it("should show length", () => {
    expect(lengthOfLongestSubstring("abcabcdabca")).toBe(4);
  });

  it("should show length", () => {
    expect(lengthOfLongestSubstring("abcabcbb")).toBe(3);
  });

  it("should show length", () => {
    expect(lengthOfLongestSubstring("a")).toBe(1);
  });

  it("should show length", () => {
    expect(lengthOfLongestSubstring("abcabccc")).toBe(3);
  });
});
