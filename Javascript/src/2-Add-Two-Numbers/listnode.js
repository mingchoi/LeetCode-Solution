// @flow
class ListNode {
  val: number;
  next: ListNode;

  constructor(x: number) {
    this.val = x;
  }

  FromArray(arr: number[]) {
    if (arr.length < 1) {
      throw "Array must not be empty";
    }
    let current = this;
    this.val = arr[0];
    for (let i = 1; i < arr.length; i++) {
      current.next = new ListNode(arr[i]);
      current = current.next;
    }
    return this;
  }
}

export default ListNode;
