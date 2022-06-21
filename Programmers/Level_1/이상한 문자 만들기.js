function solution(s) {
  let answer = '';
  let arr = s.toLowerCase().split('');
  let count = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === ' ') {
      count = 0;
      answer += ' ';
      continue;
    }

    if (count === 0 || count % 2 === 0) {
      answer += arr[i].toUpperCase();
      count++;
    } else {
      answer += arr[i];
      count++;
    }
  }

  return answer;
}

console.log(solution('try hello world'));
