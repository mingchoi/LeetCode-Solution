var findMedianSortedArrays = function(nums1: number[], nums2: number[]) {
  let arr: number[] = [];
  while (nums1.length > 0 && nums2.length > 0) {
    if (nums1[0] < nums2[0]) {
      let n = nums1.shift();
      if (n != undefined) {
        arr.push(n);
      }
    } else {
      let n = nums2.shift();
      if (n != undefined) {
        arr.push(n);
      }
    }
  }
  arr = arr.concat(nums1).concat(nums2);

  let p = arr.length / 2;
  if (arr.length % 2 == 0) {
    return (arr[p - 1] + arr[p]) / 2;
  } else {
    return arr[Math.floor(p)];
  }
};

export default findMedianSortedArrays;
