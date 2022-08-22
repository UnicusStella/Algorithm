function solution(arr, divisor) {
  var answer = [];
  let divideCount = 0;

  arr = arr.sort((a, b) => a - b);

  for (let el of arr) {
    if (el % divisor === 0) {
      answer.push(el);
      divideCount++;
    }
  }

  if (divideCount === 0) return [-1];

  return answer;
}

console.log(solution([5, 9, 7, 10], 5)); // [5, 10]
console.log(solution([2, 36, 1, 3], 1)); // [1, 2, 3, 36]
console.log(solution([3, 2, 6], 10)); // [-1]

function solution2(arr, divisor) {
  var answer = [];

  answer = arr.filter((x) => x % divisor === 0);

  return answer.length === 0 ? [-1] : answer.sort((a, b) => a - b);
}

console.log(solution2([5, 9, 7, 10], 5)); // [5, 10]
console.log(solution2([2, 36, 1, 3], 1)); // [1, 2, 3, 36]
console.log(solution2([3, 2, 6], 10)); // [-1]
