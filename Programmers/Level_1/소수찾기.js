function solution(n) {
  let arr = [];
  for (let i = 1; i <= n; i += 2) arr.push(i);

  function prime(a) {
    for (let i = 2; i <= Math.sqrt(a); i++) {
      if (a % i == 0) return false;
    }
    return true;
  }

  let answer = arr.filter(prime).length;
  return answer;
}

console.log(solution(5)); //3 (2,3,5)
