const solution = (a, b) => {
  let month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
  let day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
  let count = 0;
  for (let i = 1; i < a; i++) {
    count += month[i];
  }
  count += b;

  return day[(count + 4) % 7];
};

console.log(solution(5, 24)); //TUE
