/*
String���ͱ�����ʹ��
1.String����������������,����Ϊ���ַ���
2.����String���ͱ���ʱ��ʹ��һ��""
3.String���Ժ�8�ֻ����������ͱ��������㣬������ֻ���������㣺+
4.����Ľ����ȻʱString����

*/
class  StringTest{
	public static void main(String[] args) {

		String s1="Hello World!";
		
		System.out.println(s1);

		String s2="a";
		String s3="";

		//char c='';���벻ͨ��

		int number = 1001;
		String numberStr = "ѧ�ţ�";
		String info= numberStr + number;
		
		System.out.println(info); //ѧ�ţ�1001

		//��ϰ1
		char c = 'a';//97  A:65
		int num = 10;
		String str = "Hello";
		System.out.println(c + num + str);//107Hello
		System.out.println(c + str + num);//aHello10
		System.out.println(c + (num + str));//a10Hello
		System.out.println((c + num) + str);//107Hello
		System.out.println(str + num + c);//Hello10a

		//��ϰ2
		//*	*
		String s4="*\t*";
		System.out.println(s4);
	}
}
