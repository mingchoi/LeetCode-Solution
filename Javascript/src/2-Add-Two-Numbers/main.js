const ListNode = require("./listnode");

var addTwoNumbers = function(l1, l2) {
  let head = new ListNode(0);
  let current = head;
  let carry = 0;
  let p = new ListNode(0);
  p.next = l1;
  let q = new ListNode(0);
  q.next = l2;
  while (p.next !== null || q.next !== null || carry === 1) {
    let sum = 0;
    if (p.next !== null) {
      sum += p.next.val;
    }
    if (q.next !== null) {
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
    if (p.next !== null) {
      p = p.next;
    }
    if (q.next !== null) {
      q = q.next;
    }
  }

  return head.next;
};

module.exports = addTwoNumbers;
