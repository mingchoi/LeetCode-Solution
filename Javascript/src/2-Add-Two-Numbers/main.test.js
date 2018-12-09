const ListNode = require("./listnode");
const addTwoNumbers = require("./main");

describe("addTwoNumbers", () => {
  it("should add two numbers", () => {
    expect(
      addTwoNumbers(
        new ListNode(0).FromArray([2, 4, 3]),
        new ListNode(0).FromArray([5, 6, 4])
      )
    ).toEqual(new ListNode(0).FromArray([7, 0, 8]));
  });

  it("should add two numbers", () => {
    expect(
      addTwoNumbers(
        new ListNode(0).FromArray([5]),
        new ListNode(0).FromArray([5, 2])
      )
    ).toEqual(new ListNode(0).FromArray([0, 3]));
  });

  it("should add two numbers", () => {
    expect(
      addTwoNumbers(
        new ListNode(0).FromArray([5]),
        new ListNode(0).FromArray([5])
      )
    ).toEqual(new ListNode(0).FromArray([0, 1]));
  });

  it("should add two numbers", () => {
    expect(
      addTwoNumbers(
        new ListNode(0).FromArray([0]),
        new ListNode(0).FromArray([0])
      )
    ).toEqual(new ListNode(0).FromArray([0]));
  });
});
