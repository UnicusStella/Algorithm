function solution(n) {
  var answer = 0;
  let count = 2;

  while (count < n) {
    if (n % count === 1) return count;
    count++;
  }
  return answer;
}
console.log(solution(10)); // 3
console.log(solution(12)); // 11
