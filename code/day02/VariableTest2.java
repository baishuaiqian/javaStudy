/*
��������֮����������

ǰ�᣺����ֻ����7�ֻ����������ͱ���������㣬������boolean

1.�Զ�����������
	���ۣ�������С���������ͱ�������������������͵ı���������ʱ������Զ�����Ϊ�����������
	byte --> char��short --> int --> long --> float --> double

	�ر�ģ���byte��char��short �������ͱ�������ʱ�����Ϊint����

2.ǿ������ת������VariableTest3.java


˵������ʱ��������Сָ��ʱ����ʾ���ķ�Χ�Ĵ��С������float����Ҫ����long������
*/
class VariableTest2 {
	public static void main(String[] args) {

		byte b1 = 2;
		int i1 = 129;
		//���벻ͨ��
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
