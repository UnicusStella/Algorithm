const phone = (phone_number) => {
  let answer = '';

  for (let i = 0; i < phone_number.length; i++) {
    if (i < phone_number.length - 4) {
      answer += '*';
    } else {
      answer += phone_number[i];
    }
  }

  return answer;
};

console.log(phone('01033334444'));
