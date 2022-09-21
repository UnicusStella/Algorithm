function solution(numbers) {
  let numbering = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
  let answer = 0;

  for (let i = 0; i <= 9; i++) {
    numbers.indexOf(numbering[i]) === -1 ? (answer += i) : '';
  }

  return answer;
}
console.log(solution([1, 2, 3, 4, 6, 7, 8, 0])); // 14
console.log(solution([5, 8, 4, 0, 6, 7, 9])); // 6

function solution2(numbers) {
  return 45 - numbers.reduce((acc, cur) => acc + cur, 0);
}
console.log(solution2([1, 2, 3, 4, 6, 7, 8, 0])); // 14
console.log(solution2([5, 8, 4, 0, 6, 7, 9])); // 6
