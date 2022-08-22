function solution(a, b) {
  let samll = Math.min(a, b);
  let big = Math.max(a, b);
  var answer = 0;

  if (samll === big) return samll;
  for (let i = samll; i <= big; i++) {
    answer += i;
  }
  return answer;
}

console.log(solution(3, 5)); // 12
console.log(solution(3, 3)); // 3
