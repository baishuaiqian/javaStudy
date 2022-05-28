/*
变量的使用
1.java定义变量的格式：数据类型 变量名 = 变量值;

2.说明：
	①变量必须先声明，后使用
	②变量都定义在其作用域内。在作用域内，他是有效的。出了作用域，就失效了
	③同一个作用域内，不可以声明两个同名的变量
*/
class VariableTest {
	public static void main(String[] args) {
		//变量的定义
		int myAge = 18;
		//变量的使用
		System.out.println(myAge);
		
		//变量的声明
		int myNumber;
		//变量的赋值
		myNumber = 1000;

		System.out.println(myNumber);
	}
}
