var findMedianSortedArrays = function(nums1: number[], nums2: number[]) {
  let arr = [];
  while (nums1.length > 0 && nums2.length > 0) {
    if (nums1[0] < nums2[0]) {
      arr.push(nums1.shift());
    } else {
      arr.push(nums2.shift());
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
