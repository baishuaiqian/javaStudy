/*
运算符之二：赋值运算符
= += -= %= /= *=

*/
class SetValueTest {
	public static void main(String[] args) {
		//赋值符号 =
		int i1 = 10 , j1 = 10;
		System.out.println(i1);

		int num1 = 10;
		num1 += 2; //不会改变变量本身数据类型
		System.out.println(num1);

		//开发中希望变量实现+2的操作有几种方法？
		//旧变量 += 2;（推荐 且不会改变数据类型）
		//新变量 = 旧变量 + 2;（有时需要强转）
	}
}
