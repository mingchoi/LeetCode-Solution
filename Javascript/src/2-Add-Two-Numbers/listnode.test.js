import ListNode from "./listnode";

describe("ListNode.FromArry", () => {
  it("should generate array", () => {
    let node = new ListNode(0);
    let expected = new ListNode(1);
    expected.next = new ListNode(2);
    expected.next.next = new ListNode(3);
    expected.next.next.next = new ListNode(4);
    expected.next.next.next.next = new ListNode(5);
    expect(node.FromArray([1, 2, 3, 4, 5])).toEqual(expected);
  });
});
