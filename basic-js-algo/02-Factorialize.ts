function factorialize01(num: number) {
  let res = 1;
  for (let i = 2; i <= num; i++) {
    res *= i;
  }
  console.log(res);
  return res;
}
//思考递归实现
function factorialize02(num: number) {}

factorialize01(5);
