/*
三位数输出 个位数、十位数、百位数
*/
class AriExer {
	public static void main(String[] args) {
		int i = 623 ;
		int i1 = i % 10 ;
		int i2 = i % 100 /10;
		int i3 = i /100 ;
		System.out.println("个位数:" + i1);
		System.out.println("十位数:" + i2);
		System.out.println("百位数:" + i3);
	}
}
