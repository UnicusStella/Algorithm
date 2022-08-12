function solution(seoul) {
  var answer = '';

  for (let i = 0; i < seoul.length; i++) {
    if (seoul[i] === 'Kim') return '김서방은 ' + i + '에 있다';
  }
  return answer;
}

console.log(solution(['Jane', 'Kim'])); // "김서방은 1에 있다"

function solution2(seoul) {
  return '김서방은 ' + seoul.indexOf('Kim') + '에 있다.';
}

console.log(solution2(['Jane', 'Kim'])); // "김서방은 1에 있다"
