function solution(left, right) {
  var answer = 0;

  for (let i = left; i <= right; i++) {
    divisorCount(i) === 0 ? (answer += i) : (answer -= i);
  }

  return answer;
}

const divisorCount = (num) => {
  let count = 0;

  for (let i = 1; i <= num; i++) {
    if (num % i === 0) count++;
  }

  count % 2 === 0 ? (count = 0) : (count = 1);

  return count;
};

console.log(solution(13, 17)); // 43
console.log(solution(24, 27)); // 52
