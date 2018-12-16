import reverse from "./main";

describe("reverse", () => {
  it("should reverse", () => {
    expect(reverse(123)).toBe(321);
  });

  it("should reverse", () => {
    expect(reverse(-543)).toBe(-345);
  });
});
