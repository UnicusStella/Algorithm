const starMaker = (x, y) => {
  let star = '';

  for (let i = 0; i < x; i++) {
    star += '*';
  }
  for (let j = 0; j < y; j++) {
    console.log(star);
  }
};

console.log(starMaker(5, 3));
