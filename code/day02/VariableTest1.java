/*
java�������������

һ���������������������֣�

	�����������ͣ�
		���ͣ�byte��short��int��long
		�����ͣ�float��double
		�ַ��ͣ�char
		�����ͣ�boolean


	�����������ͣ�
		��(class)
		�ӿ�(interface)
		����(array)

��������������������λ�ã�
		��Ա���� vs �ֲ�����

*/
class VariableTest1 {
	public static void main(String[] args) {
		/*1�����ͣ�byte(1�ֽ�=8bit)short(2�ֽ�)int(4�ֽ�)long(8�ֽ�)*/
		//��byte��Χ��-128 - 127
		byte b1 = 12;
		byte b2 = -128;
		//b2 = 128; ���벻ͨ��
		System.out.println(b1);
		System.out.println(b2);
		//�� ����long�ͱ�����������"l"��"L"��β
		//�� ͨ�����������ͱ���ʱ��ʹ��int��
		short s1 = 128;
		int i1 =1234;
		long l1 = 314213133L;
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);

		//2�������ͣ�float(4�ֽ�)double(8�ֽ�)
		//�ٸ����ͣ���ʾ��С�������ֵ
		//��floaat��ʾ��ֵ�ķ�Χ��long����

		double d1=123.3;
		System.out.println(d1 + 1);
		//�۶���float���ͱ�����Ҫ��"f"��"F"��β
		float f1=12.3F;
		System.out.println(f1);
		//��ͨ�������帡���ͱ���ʱ��ʹ��double��

		//3.�ַ��ͣ�char(1�ַ�=2�ֽ�)
		//�ٶ���char�ͱ�����ͨ��ʹ��һ��''���ڲ�ֻ��дһ���ַ�
		char c1='a';
		//���벻ͨ��
		//c1='AB';
		System.out.println(c1);

		//�ڱ�ʾ��ʽ��1.����һ���ַ� 2.ת���ַ� 3.ֱ��ʹ��Unicode ֵ��ʾ�ַ��ͳ���
		char c2='\n';
		c2='\t';  //tab�����Ʊ��
		System.out.print("Hello" + c2);
		System.out.println("world");

		char c3='\u0040';
		System.out.println(c3);

		//4.�����ͣ�boolean
		//��ֻ��ȡ����ֵ֮һ��true��false
		//�ڳ����������жϡ�ѭ���ṹ��ʹ��
		boolean bb1=true;
		System.out.println(bb1);

		boolean isMarried = false;
		if(isMarried){
			System.out.println("�����");
		}else{
			System.out.println("û���");
		}

	}
}
