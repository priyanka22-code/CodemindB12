package javapractices;

public class Arrayassignment_1 {
	// Multi dimension array

	public static void main(String[] args) {

	int a[][]= {{10,20,30},{11,22,33},{11,12,13},{1,2,3}};
	
	System.out.println(a[0][0] +"\t");
	System.out.println(a[0][1] +"\t");
	System.out.println(a[1][2] +"\t");
	
	System.out.println("####################");
	
	System.out.println("Lenght of array row=" + a.length);
	System.out.println("Lenght of array coloum=" +a[0].length);
	
	System.out.println("######################################");
	
	//for loop
	
	for(int i=0; i<a.length;i++){
		
		for(int j = 0; j<a[i].length; j++) {
			System.out.print(a[i][j] + "\t");
	
	}
		System.out.println();
	}
	
	
	}
}