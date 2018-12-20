import strStr from "./main";

describe("strStr", () => {
  it("should return", () => {
    expect(strStr("hello", "ll")).toBe(2);
  });

  it("should return", () => {
    expect(strStr("aaaaa", "bba")).toBe(-1);
  });

  it("should return", () => {
    expect(strStr("", "")).toBe(0);
  });

  it("should return", () => {
    expect(strStr("aaa", "a")).toBe(0);
  });
});
