import ListNode from "../utils/listnode";

function mergeTwoLists(
  l1: ListNode | undefined,
  l2: ListNode | undefined
): ListNode | undefined {
  let head = new ListNode(0);
  let curr: ListNode | undefined = head;
  while (l1 != undefined || l2 != undefined) {
    if (l1 == undefined && l2 && curr) {
      curr.next = l2;
      l2 = l2.next;
    } else if (l2 == undefined && l1 && curr) {
      curr.next = l1;
      l1 = l1.next;
    } else if (l1 && l2 && curr) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
    }
    if (curr) {
      curr = curr.next;
    }
  }
  if (head.next == undefined) {
    return undefined;
  }
  return head.next;
}
export default mergeTwoLists;
