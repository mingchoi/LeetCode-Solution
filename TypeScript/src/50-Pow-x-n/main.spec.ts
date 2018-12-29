import myPow from "./main";

describe("myPow", () => {
  it("should myPow", () => {
    expect(myPow(2.00000, 10)).toBe(1024.00000);
  });

  it("should myPow", () => {
    expect(myPow(2.10000, 3).toFixed(5)).toBe(9.26100.toFixed(5));
  });

  it("should myPow", () => {
    expect(myPow(2.00000, -2)).toBe(0.25000);
  });

  it("should myPow", () => {
    expect(myPow(9.00000, 0)).toBe(1.00000);
  });

  it("should myPow", () => {
    expect(myPow(2.00000, -2147483648)).toBe(0);
  });

  it("should myPow", () => {
    expect(myPow(1.00000, -2147483648)).toBe(1);
  });

  it("should myPow", () => {
    expect(myPow(-1.00000, -2147483648)).toBe(1);
  });

  it("should myPow", () => {
    expect(myPow(-1.00000, 2147483648)).toBe(-1);
  });
});
