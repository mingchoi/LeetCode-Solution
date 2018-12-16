import ListNode from "../utils/listnode";

function mergeKLists(lists: (ListNode | undefined)[]): ListNode | undefined {
  if (lists.length == 0) {
    return undefined;
  }
  let head = new ListNode(0);
  let curr: ListNode | undefined = head;
  while (true) {
    let remain = false;
    for (let i in lists) {
      if (lists[i] != undefined) {
        remain = true;
        break;
      }
    }
    if (!remain) {
      break;
    }

    let min: number = 99999999;
    let minIndex: number = -1;

    for (let i = 0; i < lists.length; i++) {
      let node = lists[i];
      if (node != undefined && curr) {
        if (node.val < min) {
          minIndex = i;
          min = node.val;
        }
      }
    }
    if (curr) {
      curr.next = lists[minIndex];
    }
    let node = lists[minIndex];
    if (node != undefined) {
      lists[minIndex] = node.next;
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
export default mergeKLists;
