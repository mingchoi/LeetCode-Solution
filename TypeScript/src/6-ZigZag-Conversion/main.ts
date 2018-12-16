// @flow
function convert(s: string, numRows: number): string {
  if (numRows == 1) {
    return s;
  }
  if (s.length < 2) {
    return s;
  }
  let chunk = numRows * 2 - 2;
  let array = [];
  let totalChunk = Math.floor(s.length / chunk);

  // init array
  for (let r = 0; r < numRows; r++) {
    array.push(Array((numRows - 1) * totalChunk).fill(" "));
  }

  // fill text in zigzag pattern
  for (let i = 0; i < s.length; i++) {
    let index = i % chunk;
    let c = Math.floor(i / chunk);
    let x, y;
    if (index < numRows) {
      x = c * (numRows - 1);
      y = index;
    } else {
      x = c * (numRows - 1) + index - numRows + 1;
      y = 2 * numRows - index - 2;
    }
    array[y][x] = s.charAt(i);
  }

  // array to string
  let result = "";
  array.map(row => {
    result += row.filter(x => x !== " ").join("");
  });

  return result.replace(" ", "");
}

export default convert;
