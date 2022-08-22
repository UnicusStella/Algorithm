function solution(n) {
  var answer = n.toString(3);

  answer = answer.split('').reverse().join('');
  return Number.parseInt(answer, 3);
}

console.log(solution(45)); // 7
console.log(solution(125)); // 229
