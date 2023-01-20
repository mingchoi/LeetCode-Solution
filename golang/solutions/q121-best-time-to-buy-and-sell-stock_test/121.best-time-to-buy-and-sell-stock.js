var maxProfit = function (prices) {
  let length = prices.length - 1;
  for (let i = 0; i < length; i++) {
    prices[i] = prices[i + 1] - prices[i];
  }
  prices[length] = 0;
  let max = prices[0];
  let sum = prices[0];
  for (let i = 1; i <= length; i++) {
    sum = Math.max(sum + prices[i], prices[i]);
    max = Math.max(max, sum);
  }
  return max;
};
