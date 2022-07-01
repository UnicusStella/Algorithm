function solution(s, n) {
  var answer = '';
  let str = s.split('');
  let charNum = 0;
  let temp = 0;
  for (let el of str) {
    if (el === ' ') answer += ' ';
    else if (el === el.toLowerCase()) {
      charNum = (el.charCodeAt() + n) % 122;
      if (el.charCodeAt() + n > 122) {
        temp = charNum % 122;
        answer += String.fromCodePoint(96 + temp);
      } else {
        answer += String.fromCodePoint(el.charCodeAt() + n);
      }
    } else {
      charNum = (el.charCodeAt() + n) % 90;
      if (el.charCodeAt() + n > 90) {
        temp = charNum % 90;
        answer += String.fromCodePoint(64 + temp);
      } else {
        answer += String.fromCodePoint(el.charCodeAt() + n);
      }
    }
  }
  return answer;
}

function solution2(s, n) {
  var answer = '';
  let str = s.split('');
  let asciiNum = 0;
  for (let el of str) {
    asciiNum = el.charCodeAt() + n;
    if (el === ' ') answer += ' ';
    else if (el === el.toLowerCase()) {
      asciiNum > 122
        ? (answer += String.fromCodePoint(96 + (asciiNum % 122)))
        : (answer += String.fromCodePoint(el.charCodeAt() + n));
    } else {
      asciiNum > 90
        ? (answer += String.fromCodePoint(64 + (asciiNum % 90)))
        : (answer += String.fromCodePoint(el.charCodeAt() + n));
    }
  }
  return answer;
}

console.log(solution('z', 1)); //"a"
console.log(solution('AB', 1)); //"BC"

console.log(solution2('z', 1)); //"a"
console.log(solution2('AB', 1)); //"BC"
