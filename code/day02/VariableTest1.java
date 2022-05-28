/*
java定义的数据类型

一、变量按照数据类型来分：

	基本数据类型：
		整型：byte、short、int、long
		浮点型：float、double
		字符型：char
		布尔型：boolean


	引用数据类型：
		类(class)
		接口(interface)
		数组(array)

二：变量在类中声明的位置：
		成员变量 vs 局部变量

*/
class VariableTest1 {
	public static void main(String[] args) {
		/*1、整型：byte(1字节=8bit)short(2字节)int(4字节)long(8字节)*/
		//①byte范围：-128 - 127
		byte b1 = 12;
		byte b2 = -128;
		//b2 = 128; 编译不通过
		System.out.println(b1);
		System.out.println(b2);
		//② 声明long型变量，必须以"l"或"L"结尾
		//③ 通常，定义整型变量时，使用int型
		short s1 = 128;
		int i1 =1234;
		long l1 = 314213133L;
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);

		//2、浮点型：float(4字节)double(8字节)
		//①浮点型，表示带小数点的数值
		//②floaat表示数值的范围比long还大

		double d1=123.3;
		System.out.println(d1 + 1);
		//③定义float类型变量，要以"f"或"F"结尾
		float f1=12.3F;
		System.out.println(f1);
		//④通常，定义浮点型变量时，使用double型

		//3.字符型：char(1字符=2字节)
		//①定义char型变量，通常使用一堆''，内部只能写一个字符
		char c1='a';
		//编译不通过
		//c1='AB';
		System.out.println(c1);

		//②表示方式：1.声明一个字符 2.转义字符 3.直接使用Unicode 值表示字符型常量
		char c2='\n';
		c2='\t';  //tab键，制表符
		System.out.print("Hello" + c2);
		System.out.println("world");

		char c3='\u0040';
		System.out.println(c3);

		//4.布尔型：boolean
		//①只能取两个值之一：true、false
		//②常常在条件判断、循环结构中使用
		boolean bb1=true;
		System.out.println(bb1);

		boolean isMarried = false;
		if(isMarried){
			System.out.println("结婚啦");
		}else{
			System.out.println("没结婚");
		}

	}
}
