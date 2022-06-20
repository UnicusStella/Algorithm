const solution = (a) => {
  let len = a.length;
  if (a.length % 2 === 0) {
    return a.slice(len / 2 - 1, len / 2 + 1);
  }
  return a.slice(len / 2, len / 2 + 1);
};

console.log(solution('abcd'));
