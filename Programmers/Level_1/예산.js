function solution(d, budget) {
  let pass = 0;

  d.sort((a, b) => a - b).forEach((item) => {
    budget -= item;
    if (budget < 0) return pass;
    pass++;
  });

  return pass;
}

console.log(solution([1, 3, 2, 5, 4], 9)); // 3
console.log(solution([2, 2, 3, 3], 10)); // 4
