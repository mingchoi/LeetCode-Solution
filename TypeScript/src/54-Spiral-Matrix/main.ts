const Right = 0;
const Down = 1;
const Left = 2;
const Up = 3;

function nextValid(
  matrix: number[][],
  x: number,
  y: number,
  direction: number
): { valid: boolean; nx: number; ny: number } {
  let width = matrix[0].length;
  let height = matrix.length;
  let nx = x;
  let ny = y;

  switch (direction) {
    case Left:
      nx = x - 1;
      if (nx < 0) {
        return { valid: false, nx: x, ny: y };
      }
      break;
    case Right:
      nx = x + 1;
      if (nx >= width) {
        return { valid: false, nx: x, ny: y };
      }
      break;
    case Up:
      ny = y - 1;
      if (ny < 0) {
        return { valid: false, nx: x, ny: y };
      }
      break;
    case Down:
      ny = y + 1;
      if (ny >= height) {
        return { valid: false, nx: x, ny: y };
      }
      break;
  }

  if (matrix[ny][nx] == Number.MIN_SAFE_INTEGER) {
    return { valid: false, nx: x, ny: y };
  }

  return { valid: true, nx: nx, ny: ny };
}

function spiralOrder(matrix: number[][]): number[] {
  if (matrix.length == 0) {
    return [];
  }
  const total = matrix[0].length * matrix.length;
  let [x, y, direction] = [-1, 0, Right];
  let result = [];

  while (result.length < total) {
    let r = nextValid(matrix, x, y, direction);
    if (r.valid) {
      x = r.nx;
      y = r.ny;
      result.push(matrix[y][x]);
      matrix[y][x] = Number.MIN_SAFE_INTEGER;
    } else {
      direction = (direction + 1) % 4;
    }
  }

  return result;
}

export default spiralOrder;
