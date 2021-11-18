// 1번
/* function solution(participant, completion) {
  var answer = '';
  participant.sort();
  completion.sort();

  for (let i = 0; i <= participant.length; i++) {
    if (participant[i] !== completion[i]) {
      return participant[i];
    }
  }
  return answer;
} */

// 2번
function solution(participant, completion) {
  let obj = {};
  let answer = [];
  for (let parti of participant) {
    if (!obj[parti]) obj[parti] = 1;
    else obj[parti] += 1;
  }

  for (let c of completion) {
    if (obj[c]) obj[c] -= 1;
  }

  for (let p of participant) {
    if (obj[p] > 0) answer.push(p);
  }

  return answer.join(',');
}

console.log(
  solution(['mislav', 'stanko', 'mislav', 'ana'], ['stanko', 'mislav'])
);
