// @flow
class ListNode {
  val: number;
  next?: ListNode;

  constructor(x: number) {
    this.val = x;
  }

  FromArray(arr: number[]) {
    if (arr.length < 1) {
      throw "Array must not be empty";
    }
    let current: ListNode = this;
    this.val = arr[0];
    for (let i = 1; i < arr.length; i++) {
      current.next = new ListNode(arr[i]);
      current = current.next;
    }
    return this;
  }

  ToArray(): number[] {
    let arr: number[] = [];
    arr.push(this.val);
    let curr: ListNode = this;
    while (curr.next != undefined) {
      curr = curr.next;
      arr.push(curr.val);
    }
    return arr;
  }
}

export default ListNode;
