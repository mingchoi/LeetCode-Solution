function isValidSudoku(board: string[][]): boolean {
  // Scan by row
  for (let x = 0; x < 9; x++) {
    let contain: any = {};
    for (let y = 0; y < 9; y++) {
      let value: string = board[x][y];
      if (contain[value]) {
        return false;
      }
      if (value != ".") {
        contain[value] = true;
      }
    }
  }

  // Scan by row
  for (let y = 0; y < 9; y++) {
    let contain: any = {};
    for (let x = 0; x < 9; x++) {
      let value: string = board[x][y];
      if (contain[value]) {
        return false;
      }
      if (value != ".") {
        contain[value] = true;
      }
    }
  }

  // Scan by grid
  let grid = [
    [0, 0],
    [0, 3],
    [0, 6],
    [3, 0],
    [3, 3],
    [3, 6],
    [6, 0],
    [6, 3],
    [6, 6]
  ];

  for (let i = 0; i < grid.length; i++) {
    let xLen = grid[i][0] + 3;
    let yLen = grid[i][1] + 3;
    let contain: any = {};
    for (let x = grid[i][0]; x < xLen; x++) {
      for (let y = grid[i][1]; y < yLen; y++) {
        let value: string = board[x][y];
        let r = contain[value];

        if (contain[value]) {
          return false;
        }
        if (value != ".") {
          contain[value] = true;
        }
      }
    }
  }

  return true;
}

export default isValidSudoku;
