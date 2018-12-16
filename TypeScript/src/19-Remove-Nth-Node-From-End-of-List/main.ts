import ListNode from "../utils/listnode";

function removeNthFromEnd(head: ListNode, n: number): ListNode | undefined {
  let i = r(head, n);
  if (i == 1 && n == 1) {
    return undefined;
  } else if (i == n) {
    return head.next;
  }
  return head;
}

function r(node: ListNode, n: number): number {
  if (node.next == undefined) {
    return 1;
  }
  let i = r(node.next, n);
  if (i == n) {
    if (n != 1) {
      node.next = node.next.next;
    } else {
      node.next = undefined;
    }
  }
  return i + 1;
}

export default removeNthFromEnd;
