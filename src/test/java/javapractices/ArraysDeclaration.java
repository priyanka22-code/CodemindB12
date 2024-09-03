package javapractices;

public class ArraysDeclaration {

	public static void main(String[] args) {
		
int a[]= {20,10,30,50};
a[1]=200;


System.out.print(a[0] +  "\t");
System.out.print(a[1] +  "\t");
System.out.print(a[2] +  "\t");
System.out.print(a[3] +  "\t");

System.out.println();

System.out.println("Lenght of array = "+ a.length);
System.out.println("######################################");

int b[][]= {{1,2,3,},{4,5,6},{7,8,9}};
b[0][2]=20;

System.out.println(b[1][1]);
System.out.println(b[0][2]);
 
System.out.println("###########################################");
for(int i=0; i<b.length;i++){
	
	for(int j = 0; j<b[i].length; j++) {
		System.out.print(b[i][j] + "\t");
}
	System.out.println();
}
}
}
