/*
基本数据之间的运算规则：

前提：这里只讨论7种基本数据类型变量间的运算，不包含boolean

1.自动类型提升：
	结论：当容量小的数据类型变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的类型
	byte --> char、short --> int --> long --> float --> double

	特别的：当byte、char、short 三种类型变量运算时，结果为int类型

2.强制类型转换：见VariableTest3.java


说明：此时的容量大小指的时，表示数的范围的大和小。比如float容量要大于long的容量
*/
class VariableTest2 {
	public static void main(String[] args) {

		byte b1 = 2;
		int i1 = 129;
		//编译不通过
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		//long l1 = b1 + i1;
		//System.out.println(b2);

		float f=b1+i1;
		System.out.println(f);

		short s1=123;
		double d1=s1;
		System.out.println(d1);


		//**********************
		char c1='a';
		int i3=10;
		int i4=c1+i3;
		System.out.println(i4);

		short s=10;
		//int s3=c1+s1;

		byte b2 = 10;
		int s2 = c1 + b2;
		System.out.println(s2);
	}
}
