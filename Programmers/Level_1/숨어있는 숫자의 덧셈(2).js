function solution(my_string) {
  var answer = 0;

  return my_string
    .replace(/[a-z]/gi, '&')
    .split('&')
    .reduce((acc, cur) => Number(acc) + Number(cur));
}

console.log(solution('1c1asd43e10a0')); // 55
console.log(solution('1a2b3c4d123Z')); // 133
