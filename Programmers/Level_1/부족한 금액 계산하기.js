function solution(price, money, count) {
  var answer = -1;
  let totalMoney = 0;
  let incrase = price;

  for (let i = 1; i <= count; i++) {
    totalMoney += incrase * i;
  }

  return totalMoney > money ? totalMoney - money : 0;
}

console.log(solution(3, 20, 4)); // 10

function solution2(price, money, count) {
  const gaus = (price * count * (count + 1)) / 2 - money;

  return gaus > 0 ? gaus : 0;
}

console.log(solution2(3, 20, 4)); // 10
