/*
String类型变量的使用
1.String属于引用数据类型,翻译为：字符串
2.声明String类型变量时，使用一对""
3.String可以和8种基本数据类型变量做运算，且运算只能连接运算：+
4.运算的结果仍然时String类型

*/
class  StringTest{
	public static void main(String[] args) {

		String s1="Hello World!";
		
		System.out.println(s1);

		String s2="a";
		String s3="";

		//char c='';编译不通过

		int number = 1001;
		String numberStr = "学号：";
		String info= numberStr + number;
		
		System.out.println(info); //学号：1001

		//练习1
		char c = 'a';//97  A:65
		int num = 10;
		String str = "Hello";
		System.out.println(c + num + str);//107Hello
		System.out.println(c + str + num);//aHello10
		System.out.println(c + (num + str));//a10Hello
		System.out.println((c + num) + str);//107Hello
		System.out.println(str + num + c);//Hello10a

		//练习2
		//*	*
		String s4="*\t*";
		System.out.println(s4);
	}
}
