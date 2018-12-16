// @flow
import ListNode from "../utils/listnode";

var addTwoNumbers = function(l1: ListNode, l2: ListNode) {
  let head = new ListNode(0);
  let current = head;
  let carry = 0;
  let p = new ListNode(0);
  p.next = l1;
  let q = new ListNode(0);
  q.next = l2;
  while (p.next !== undefined || q.next !== undefined || carry === 1) {
    let sum = 0;
    if (p.next !== undefined) {
      sum += p.next.val;
    }
    if (q.next !== undefined) {
      sum += q.next.val;
    }
    sum += carry;
    carry = 0;
    if (sum > 9) {
      sum -= 10;
      carry = 1;
    }
    current.next = new ListNode(sum);
    current = current.next;
    if (p.next !== undefined) {
      p = p.next;
    }
    if (q.next !== undefined) {
      q = q.next;
    }
  }

  return head.next;
};

export default addTwoNumbers;
