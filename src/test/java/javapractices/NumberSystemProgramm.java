package javapractices;

public class NumberSystemProgramm {

	public static void main(String[] args) {
		
//2*1,2*2,2*3......2*10
		
		for(int i=1; i<=10;i++) {
			for(int j=1; j<=10;j++) {
				System.out.print(i*j +" ");
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	int a=2;
	while(a<=10) {
		int b=1;
		while(b<=10) {
			System.out.print(a * b +" \t ");
			b++;
		}
		a++;
		System.out.println();
	}
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	
}
}
