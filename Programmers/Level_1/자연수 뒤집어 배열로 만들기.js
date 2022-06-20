function solution(n) {
  let len = String(n).split('').reverse();
  let answer = [];

  for (let el of len) {
    answer.push(Number(el));
  }

  return answer;
}

console.log(solution(12345));
