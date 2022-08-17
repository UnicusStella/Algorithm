function solution(s) {
  let lower = '';
  let upper = '';

  for (let el of s) {
    el == el.toLowerCase() ? (lower += el) : (upper += el);
  }

  lower = lower.split('').sort().reverse().join('');
  upper = upper.split('').sort().reverse().join('');

  return lower + upper;
}
console.log(solution('Zbcdefg')); //"gfedcbZ"
