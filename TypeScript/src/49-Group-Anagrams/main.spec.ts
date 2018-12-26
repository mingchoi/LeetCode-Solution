import groupAnagrams from "./main";

describe("groupAnagrams", () => {
  it("should groupAnagrams", () => {
    expect(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])).toEqual([
      ["ate", "eat", "tea"],
      ["nat", "tan"],
      ["bat"]
    ]);
  });
});
