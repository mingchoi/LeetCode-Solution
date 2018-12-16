import mergeKLists from "./main";
import ListNode from "../utils/listnode";

describe("mergeKLists", () => {
  it("should merge", () => {
    let list = mergeKLists([
      new ListNode(0).FromArray([1, 4, 5]),
      new ListNode(0).FromArray([1, 3, 4]),
      new ListNode(0).FromArray([2, 6])
    ]);
    let result: number[] = [];
    if (list != undefined) {
      result = list.ToArray();
    }
    expect(result).toEqual([1, 1, 2, 3, 4, 4, 5, 6]);
  });

  it("should merge", () => {
    expect(mergeKLists([])).toEqual(undefined);
  });
});
