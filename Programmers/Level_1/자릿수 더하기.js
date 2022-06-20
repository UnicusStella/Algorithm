function solution(n) {
  let answer = 0;
  while (n > 0) {
    answer += n % 10;
    n = Math.floor(n / 10);
  }

  return answer;
}

function solution2(n) {
  return (n + '').split('').reduce((acc, cur) => acc + Number(cur), 0);
}

console.log(solution(987));
console.log(solution2(987));
