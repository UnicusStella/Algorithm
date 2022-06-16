const hashad = (x) => {
  let sum = 0;
  let divide = '';

  divide = String(x).split('');
  for (let i = 0; i < divide.length; i++) {
    sum += Number(divide[i]);
  }

  if (x % sum === 0) {
    return true;
  }

  return false;
};

console.log(hashad(11));
