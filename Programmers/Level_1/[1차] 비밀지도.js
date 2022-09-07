function solution(n, arr1, arr2) {
  var answer = [];
  let firstMap = [];
  let secoundMap = [];
  let temp = [];

  arr1.forEach((element) => {
    firstMap.push(element.toString(2).padStart(n, 0));
  });

  arr2.forEach((element) => {
    secoundMap.push(element.toString(2).padStart(n, 0));
  });

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      Number(firstMap[i][j]) || Number(secoundMap[i][j]) === 1
        ? temp.push('#')
        : temp.push(' ');
    }
    answer.push(temp.join(''));
    temp = [];
  }

  return answer;
}

console.log(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28])); // 	["#####","# # #", "### #", "# ##", "#####"]
console.log(solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10])); // ["######", "### #", "## ##", " #### ", " #####", "### # "]

function solution2(n, arr1, arr2) {
  var answer = [];

  return arr1
    .map((item, index) => (item | arr2[index]).toString(2).padStart(n, 0))
    .map((item) => item.replace(/0/g, ' ').replace(/1/g, '#'));
}

console.log(solution2(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28])); // 	["#####","# # #", "### #", "# ##", "#####"]
console.log(solution2(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10])); // ["######", "### #", "## ##", " #### ", " #####", "### # "]
