const solution = (a) => {
  let number = parseInt(Math.sqrt(a));

  if (Math.pow(number, 2) === a) {
    return Math.pow(number + 1, 2);
  }
  return -1;
};

const solution2 = (x) => {
  switch (x % Math.sqrt(x)) {
    case 0: {
      return Math.pow(Math.sqrt(x) + 1, 2);
    }
    default:
      return -1;
  }
};

console.log(solution(121));
console.log(solution2(121));
