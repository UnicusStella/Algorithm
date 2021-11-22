// 1번
function solution(lottos, win_nums) {
  let answer = [];
  let matchCount = 0;
  let zeroCount = 0;
  let best = 0;

  // 로또 번호와 당첨 번호가 몇개 맞는지 체크
  lottos.map((item) => {
    for (let el of win_nums) {
      if (item === el) matchCount++;
    }
    if (item === 0) zeroCount++;
    // 로또 번호에 0번이 몇개 있는지 체크
    return matchCount;
  });

  best = zeroCount + matchCount;

  answer.push(rankExchange(best), rankExchange(matchCount));
  return answer;
}

// 최고 점수가 하나도 안맞을때 위환 로직 매소드로 뺴기
const rankExchange = (num) => (num > 1 ? 7 - num : 6);

console.log(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])); // [3,5]
// console.log(answer);
