function solution(numbers) {
  let arr = numbers.sort((a, b) => a - b);
  var answer = [];

  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      answer.push(arr[i] + arr[j]);
    }
  }

  const set = [...new Set(answer)];

  return set.sort((a, b) => a - b);
}

console.log(solution([2, 1, 3, 4, 1])); // [2,3,4,5,6,7]
console.log(solution([5, 0, 2, 7])); // [2,5,7,9,12]
