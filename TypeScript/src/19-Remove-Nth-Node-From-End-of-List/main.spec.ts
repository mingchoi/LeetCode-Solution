import removeNthFromEnd from "./main";
import ListNode from "../utils/listnode";

describe("removeNthFromEnd", () => {
  it("should remove node", () => {
    let expected = new ListNode(1);
    expected.next = new ListNode(2);
    expected.next.next = new ListNode(3);
    expected.next.next.next = new ListNode(5);
    expect(
      removeNthFromEnd(new ListNode(0).FromArray([1, 2, 3, 4, 5]), 2)
    ).toEqual(expected);
  });

  it("should remove node", () => {
    expect(removeNthFromEnd(new ListNode(0).FromArray([1]), 1)).toEqual(
      undefined
    );
  });
});
