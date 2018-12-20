import removeDuplicates from "./main";

describe("removeDuplicates", () => {
  it("should removeDuplicates and return length", () => {
    let arr = [1, 1, 2];
    expect(removeDuplicates(arr)).toBe(2);
    expect(arr).toEqual([1, 2, 2]);
  });

  it("should removeDuplicates and return length", () => {
    let arr = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];
    expect(removeDuplicates(arr)).toBe(5);
    expect(arr).toEqual([0, 1, 2, 3, 4, 2, 2, 3, 3, 4]);
  });
});
