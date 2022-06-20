const solution = (a) => {
  return Number(String(a).split('').sort().join(''));
};

console.log(solution(13245));
