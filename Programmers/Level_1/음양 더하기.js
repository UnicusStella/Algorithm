function solution(absolutes, signs) {
  var answer = 12345;

  answer = absolutes.reduce(
    (acc, cur, index) => (signs[index] ? acc + cur : acc + cur * -1),
    0
  );
  return answer;
}

console.log(solution([4, 7, 12], [true, false, true])); // 9
console.log(solution([1, 2, 3], [false, false, true])); // 0
