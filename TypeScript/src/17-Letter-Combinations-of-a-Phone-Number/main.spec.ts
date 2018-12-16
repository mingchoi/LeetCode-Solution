import letterCombinations from "./main";

describe("letterCombinations", () => {
  it("should return", () => {
    expect(letterCombinations("23").sort()).toEqual([
      "ad",
      "ae",
      "af",
      "bd",
      "be",
      "bf",
      "cd",
      "ce",
      "cf"
    ]);
  });

  it("should return", () => {
    expect(letterCombinations("").sort()).toEqual([]);
  });

  it("should return", () => {
    expect(letterCombinations("2").sort()).toEqual(["a", "b", "c"]);
  });
});
