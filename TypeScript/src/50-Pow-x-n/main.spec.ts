import myPow from "./main";

describe("myPow", () => {
  it("should myPow", () => {
    expect(myPow(2.00000, 10)).toBe(1024.00000);
  });

  it("should myPow", () => {
    expect(myPow(2.10000, 3)).toBe(9.26100);
  });

  it("should myPow", () => {
    expect(myPow(2.00000, -2)).toBe(0.25000);
  });
});
