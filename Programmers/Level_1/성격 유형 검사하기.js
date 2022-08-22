function solution(survey, choices) {
  let answer = '';
  let map = new Map();

  // 각각 성격 유형에 해당하는 Obj 배열 만들기
  ['R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'].forEach((item) => map.set(item, 0));

  // 성격에 점수 더하기
  choices.forEach((item, index) => {
    let [A, B] = survey[index].split('');

    if (item > 4) map.set(B, map.get(B) + item - 4);
    else if (item < 4) map.set(A, map.get(A) + 4 - item);
  });

  answer += map.get('R') >= map.get('T') ? 'R' : 'T';
  answer += map.get('C') >= map.get('F') ? 'C' : 'F';
  answer += map.get('J') >= map.get('M') ? 'J' : 'M';
  answer += map.get('A') >= map.get('N') ? 'A' : 'N';

  return answer;
}

console.log(solution(['AN', 'CF', 'MJ', 'RT', 'NA'], [5, 3, 2, 7, 5])); // "TCMA"
console.log(solution(['TR', 'RT', 'TR'], [7, 1, 3])); //"RCJA"

function solution2(survey, choices) {
  // 매우 동의 ~ 매우 비동의
  let score = [0, 3, 2, 1, 0, 1, 2, 3];
  let obj = { R: 0, T: 0, C: 0, F: 0, J: 0, M: 0, A: 0, N: 0 };
  let arr = [];
  let index = 0;
  let answer = '';

  // ['AN', 'CF', 'MJ', 'RT', 'NA']
  // 배열의 첫번째 'A' 에 오브젝트로 Key Value 값으로 지정
  for (let el of survey) {
    if (choices[index] < 4) {
      obj[el[0]] += score[choices[index]];
    }
    if (choices[index] > 4) {
      obj[el[1]] += score[choices[index]];
    }
    index++;
  }

  for (let i in obj) {
    arr.push([i, obj[i]]);
  }

  for (let i = 0; i < 7; i += 2) {
    arr[i][1] >= arr[i + 1][1]
      ? (answer += arr[i][0])
      : (answer += arr[i + 1][0]);
  }

  return answer;
}

console.log(solution2(['AN', 'CF', 'MJ', 'RT', 'NA'], [5, 3, 2, 7, 5])); // "TCMA"
console.log(solution2(['TR', 'RT', 'TR'], [7, 1, 3])); // "RCJA"
