function solution(a, b) {
  var answer = 1234567890;

  return (answer = a.reduce((acc, cur, idx) => acc + cur * b[idx], 0));
}
console.log(solution([1, 2, 3, 4], [-3, -1, 0, 2])); // 3
console.log(solution([-1, 0, 1], [1, 0, -1])); // -2
