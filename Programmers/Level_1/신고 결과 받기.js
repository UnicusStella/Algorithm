function solution(id_list, report, k) {
  var answer = [];
  let reportUser = [];

  report = [...new Set(report)];
  report = report.map((item) => item.split(' '));

  let user = new Map();

  // 유저 초기화
  id_list.forEach((item) => user.set(item, 0));

  // 리폿 받은 유저 카운트
  report.forEach((item) => user.set(item[1], user.get(item[1]) + 1));

  // K번 이상 리폿 받으면 리폿유저 목록에 추가
  user.forEach((value, key) => {
    if (value >= k) reportUser.push(key);
  });

  // 유저 초기화
  id_list.forEach((item) => user.set(item, 0));

  // 리폿 통지 메일 갯수 카운팅
  report.forEach((item) => {
    if (reportUser.includes(item[1])) {
      user.set(item[0], user.get(item[0]) + 1);
    }
  });

  // 카운팅 갯수 배열에 넣기
  user.forEach((value, key) => answer.push(value));

  return answer;
}

console.log(
  solution(
    ['muzi', 'frodo', 'apeach', 'neo'],
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    2
  )
); // [2,1,1,0]
console.log(
  solution(['con', 'ryan'], ['ryan con', 'ryan con', 'ryan con', 'ryan con'], 3)
); // [0,0]

// Refactoring
function solution2(id_list, report, k) {
  var answer = [];
  let reportList = [];

  let reports = [...new Set(report)].map((item) => item.split(' '));

  let users = new Map();

  // 리폿 받은 유저 카운트
  // K번 이상 리폿 받으면 리폿유저 목록에 추가
  for (let el of reports) {
    users.set(el[1], users.get(el[1]) + 1 || 1);

    if (users.get(el[1]) >= k) reportList.push(el[1]);
  }

  // 유저 초기화
  let receiveUser = new Map();

  // 리폿 통지 메일 갯수 카운팅
  reports.forEach((item) => {
    if (reportList.includes(item[1])) {
      receiveUser.set(item[0], receiveUser.get(item[0]) + 1 || 1);
    }
  });

  // 카운팅 갯수 배열에 넣기
  answer = id_list.map((item) => receiveUser.get(item) || 0);

  return answer;
}

console.log(
  solution2(
    ['muzi', 'frodo', 'apeach', 'neo'],
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    2
  )
); // [2,1,1,0]
console.log(
  solution2(
    ['con', 'ryan'],
    ['ryan con', 'ryan con', 'ryan con', 'ryan con'],
    3
  )
); // [0,0]
