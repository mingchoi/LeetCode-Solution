function rotate(matrix: number[][]): number[][] {
  var r: number[][] = new Array(matrix.length);
  for (let i = 0; i < r.length; i++) {
    r[i] = matrix[i].slice(0);
  }
  for (let x = 0; x < matrix.length; x++) {
    for (let y = 0; y < matrix[x].length; y++) {
      matrix[x][y] = r[matrix.length - 1 - y][x];
    }
  }
  return matrix;
}

export default rotate;
