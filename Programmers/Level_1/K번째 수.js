// 1번
/* function solution(array, commands) {
  var answer = [];

  for (let el of commands) {
    let result = array.slice(el[0] - 1, el[1]);
    answer.push(result.sort((a, b) => a - b)[el[2] - 1]);
  }
  return answer;
} */

//2번
function solution(array, commands) {
  var answer = [];

  for (let el of commands) {
    let result = array.slice(el[0] - 1, el[1]);

    answer.push(customSort(result)[el[2] - 1]);
  }
  return answer;
}

// Sort 매소드 생성해서 풀기
const customSort = (array) => {
  if (array.length < 2) return array;

  const head = array[0];
  const tail = array.slice(1);
  const left = [];
  const right = [];

  for (let el of tail) {
    if (el < head) {
      left.push(el);
    } else if (el > head) {
      right.push(el);
    } else {
      head.push(el);
    }
  }

  return customSort(left).concat(head, customSort(right));
};

console.log(
  solution(
    [1, 5, 2, 6, 3, 7, 4],
    [
      [2, 5, 3],
      [4, 4, 1],
      [1, 7, 3],
    ]
  )
);
