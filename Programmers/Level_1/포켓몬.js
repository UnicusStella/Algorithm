function solution(nums) {
  let totalPick = parseInt(nums.length / 2);

  const type = [...new Set(nums)];

  return type.length > totalPick ? totalPick : type.length;
}

console.log(solution([3, 1, 2, 3])); // 2
console.log(solution([3, 3, 3, 2, 2, 4])); // 3
console.log(solution([3, 3, 3, 2, 2, 2])); // 2
