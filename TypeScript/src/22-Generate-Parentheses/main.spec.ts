import generateParenthesis from "./main";

describe("generateParenthesis", () => {
  it("should generate", () => {
    expect(generateParenthesis(3).sort()).toEqual(
      ["((()))", "(()())", "(())()", "()(())", "()()()"].sort()
    );
  });
});
