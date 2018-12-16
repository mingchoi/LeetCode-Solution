import mergeTwoLists from "./main";
import ListNode from "../utils/listnode";

describe("mergeTwoLists", () => {
  it("should merge", () => {
    let list = mergeTwoLists(
      new ListNode(0).FromArray([1, 2, 4]),
      new ListNode(0).FromArray([1, 3, 4])
    );
    let result: number[] = [];
    if (list != undefined) {
      result = list.ToArray();
    }
    expect(result).toEqual([1, 1, 2, 3, 4, 4]);
  });

  it("should merge", () => {
    expect(mergeTwoLists(undefined, undefined)).toEqual(undefined);
  });
});
