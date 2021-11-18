/* // 1번
function solution(s) {
  var answer = s;
  let numbers = [
    'zero',
    'one',
    'two',
    'three',
    'four',
    'five',
    'six',
    'seven',
    'eight',
    'nine',
  ];
  // 해당 단어를 Split 하여 나눈뒤에
  // Join 으로 합쳐서 다시 하나의 배열로 만들기를 반복
  for (let i = 0; i <= numbers.length; i++) {
    let result = answer.split(numbers[i]);
    answer = result.join(i);
  }
  return Number(answer);
} */

// 2번 내장 매소드인 replace 를 사용해서 풀기
function solution(s) {
  var answer = s
    .replace(/zero/gi, 0)
    .replace(/one/gi, 1)
    .replace(/two/gi, 2)
    .replace(/three/gi, 3)
    .replace(/four/gi, 4)
    .replace(/five/gi, 5)
    .replace(/six/gi, 6)
    .replace(/seven/gi, 7)
    .replace(/eight/gi, 8)
    .replace(/nine/gi, 9);

  return Number(answer);
}

console.log(solution('one4seveneight'));
