import countAndSay from "./main";

describe("countAndSay", () => {
  it("should countAndSay", () => {
    expect(countAndSay(1)).toBe("1");
  });

  it("should countAndSay", () => {
    expect(countAndSay(2)).toBe("11");
  });

  it("should countAndSay", () => {
    expect(countAndSay(3)).toBe("21");
  });

  it("should countAndSay", () => {
    expect(countAndSay(4)).toBe("1211");
  });

  it("should countAndSay", () => {
    expect(countAndSay(5)).toBe("111221");
  });

  it("should countAndSay", () => {
    expect(countAndSay(11)).toBe("11131221133112132113212221");
  });
});
