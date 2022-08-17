function solution(strings, n) {
  strings.sort();
  return bubble(strings, n);
}

const bubble = (arr, n) => {
  for (let i = 0; i < arr.length; i++) {
    let swap;
    for (let j = 0; j < arr.length - 1; j++) {
      if (arr[j][n] > arr[j + 1][n]) {
        swap = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = swap;
      }
    }
    if (!swap) break;
  }
  return arr;
};

console.log(solution(['abce', 'abcd', 'cdx'], 2)); // ["abcd", "abce", "cdx"]
console.log(solution(['sun', 'bed', 'car'], 1)); // ["car", "bed", "sun"]

function solution2(strings, n) {
  return strings.sort((s1, s2) =>
    s1[n] === s2[n] ? s1.localeCompare(s2) : s1[n].localeCompare(s2[n])
  );
}

console.log(solution2(['abce', 'abcd', 'cdx'], 2)); // ["abcd", "abce", "cdx"]
console.log(solution2(['sun', 'bed', 'car'], 1)); // ["car", "bed", "sun"]
