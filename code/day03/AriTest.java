/*
�����֮һ�����������
+ - + - * / % (ǰ)++ (��)++ (ǰ)-- (��)-- +


*/
class AriTest{
	public static void main(String[] args){
		
		//���ţ�/
		int num1 = 12;
		int num2 = 5;
		int res1 = num1 / num2;
		System.out.println(res1); //2

		int res2 = num1 / num2 * num2;
		System.out.println(res2); //10

		double res3 = num1 / num2;
		System.out.println(res3); //2.0

		double res4 =(double) num1 / (double) num2; //2.4
		double res5 = num1 / (num2 + 0.0);//2.4

		//% ȡ������
		//����ķ��źͱ�����һ��
		//�����о���ʹ��%�ж��ܷ񱻳��������
		int m1 = 12;
		int n1 = 5 ;
		System.out.println("m1 % n1 = " + m1 % n1); 

		int m2 = -12;
		int n2 = 5 ;
		System.out.println("m2 % n2 = " + m2 % n2); 
		
		int m3 = 12;
		int n3 = -5 ;
		System.out.println("m3 % n3 = " + m3 % n3); 
		
		int m4 = -12;
		int n4 = -5 ;
		System.out.println("m4 % n4 = " + m4 % n4); 



		//(ǰ)++ :������1��������
		//(��)++ �������㣬������1
		int a1 = 10 ;
		int b1= ++ a1;
		System.out.println(a1+"---"+b1); 

		int a2=10;
		int b2 = a2++;
		System.out.println(a2+"---"+b2); 
		
		//(ǰ)-- :���Լ�1��������
		//(��)- �������㣬���Լ�1
		int a3 = 10 ;
		int b3= --a3;
		System.out.println(a3+"---"+b3); //9 9

		int a4=10;
		int b4 = a4--;
		System.out.println(a4+"---"+b4); //9 10  
		
	}
}