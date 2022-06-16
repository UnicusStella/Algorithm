const solution = (arr) => {
  let init = arr[0];
  let save = 0;
  let answer = [];

  for (let i = 1; i <= arr.length; i++) {
    if (arr.length <= 1) return [-1];

    if (init > arr[i]) {
      save = arr[i];
      init = save;
    }
  }

  for (let el of arr) {
    if (el !== save) answer.push(el);
  }

  return answer;
};

console.log(solution([4, 3, 2, 1, 5]));
console.log(solution([1]));

// 풀이 2번
function solution2(arr) {
  arr.splice(arr.indexOf(Math.min(...arr)), 1);
  if (arr.length < 1) return [-1];
  return arr;
}

console.log(solution2([4, 3, 2, 1, 5]));
console.log(solution2([1]));
