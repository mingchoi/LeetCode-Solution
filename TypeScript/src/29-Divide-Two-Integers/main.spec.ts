import divide from "./main";

describe("divide", () => {
  it("should divide two numbers", () => {
    expect(divide(10, 3)).toBe(3);
  });

  it("should divide two numbers", () => {
    expect(divide(9, 3)).toBe(3);
  });

  it("should divide two numbers", () => {
    expect(divide(7, -3)).toBe(-2);
  });

  it("should divide two numbers", () => {
    expect(divide(1, 1)).toBe(1);
  });

  it("should divide two numbers", () => {
    expect(divide(2147483647, 1)).toBe(2147483647);
  });

  it("should divide two numbers", () => {
    expect(divide(-2147483648, -1)).toBe(2147483647);
  });
});
