function solution(n, m) {
  let gcd = gcdMaker(n, m);

  return [gcd, (n * m) / gcd];
}
let gcdMaker = (a, b) => {
  if (b === 0) return a;
  else return gcdMaker(b, a % b);
};

console.log(solution(5, 17));
