import divide from "./main";

describe("divide", () => {
  it("should divide two numbers", () => {
    expect(divide(10, 3)).toBe(3);
  });

  it("should divide two numbers", () => {
    expect(divide(7, -3)).toBe(-2);
  });
});
