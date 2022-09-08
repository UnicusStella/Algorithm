function solution(sizes) {
  var answer = 0;
  let row = 0;
  let column = 0;

  sizes.forEach((element) => {
    element.sort((a, b) => a - b);
    if (row < element[0]) row = element[0];
  });
  sizes.forEach((element) => {
    element.sort((a, b) => a - b);
    if (column < element[1]) column = element[1];
  });

  answer = row * column;

  return answer;
}

console.log(
  solution([
    [60, 50],
    [30, 70],
    [60, 30],
    [80, 40],
  ])
); // 4000
console.log(
  solution([
    [10, 7],
    [12, 3],
    [8, 15],
    [14, 7],
    [5, 15],
  ])
); // 120
console.log(
  solution([
    [14, 4],
    [19, 6],
    [6, 16],
    [18, 7],
    [7, 11],
  ])
); // 133
