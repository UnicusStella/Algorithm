function solution1(s) {
  let pCount = 0;
  let yCount = 0;

  for (let el of s.toLowerCase()) {
    if (el === 'p') pCount++;
    else if (el === 'y') yCount++;
  }

  if (pCount !== yCount) return false;

  return true;
}

console.log(solution1('pPoooyY')); // "true"
console.log(solution1('Pyy')); // "false"

function solution2(s) {
  return (
    s.toLowerCase().split('p').length === s.toLowerCase().split('y').length
  );
}

console.log(solution2('pPoooyY')); // "true"
console.log(solution2('Pyy')); // "false"
