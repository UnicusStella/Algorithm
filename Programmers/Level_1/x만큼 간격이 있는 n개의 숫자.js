function solution(x, n) {
  var answer = [];
  let initNumber = x;

  for (let i = 0; i < n; i++) {
    answer.push(x);
    x += initNumber;
  }

  return answer;
}

console.log(solution(2, 5));
