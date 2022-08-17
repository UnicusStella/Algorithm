function solution(s) {
  var answer = true;

  for (let el of s) {
    if (isNaN(el)) return false;
  }

  if (s.length === 4 || s.length === 6) return answer;

  return false;
}

console.log(solution('a234')); // "false"
console.log(solution('1234')); // "true"
