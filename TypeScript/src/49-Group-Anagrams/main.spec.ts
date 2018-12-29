import groupAnagrams from "./main";

describe("groupAnagrams", () => {
  it("should groupAnagrams", () => {
    let result = groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]);
    for (let i = 0; i < result.length; i++) {
      result[i].sort();
    }
    expect(result).toEqual([
      ["ate", "eat", "tea"],
      ["nat", "tan"],
      ["bat"]
    ]);
  });
});
