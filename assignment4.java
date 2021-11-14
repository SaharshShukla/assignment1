import java.util.Scanner;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst1)diamond pattern

	//Scanner sc=new Scanner(System.in);
	//System.out.print("Enter number of rows to print diamond: ");
	//int n=5;
	int i,j,k;
	//upper part
	for( i=1;i<=5;i++) {//to print row of diamond 
		for( j=5;j>i;j--) {// to print column
			System.out.print(" ");}
		for( k=1;k<=2*(i-1);k++) {//to generate space and star
			System.out.print("*");}
			System.out.println(" ");}
	
	//lower part
		for(i=(5-1);i>=1;i--) {//to print row of diamond 
			for(j=5;j>i;j--) {
				System.out.print(" ");}// to print column
				for( k=1;k<=2*(i-1);k++) {//to generate space
					System.out.print("*");
				}
				System.out.println(" ");}
		
		
//qst2) reversed pyramid pattern
		
/*int n=5;
        for ( int i=n;i>=1;i-- ){     

            for (int j=1;j<=(n-i);j++){ 
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/
		
//qst3) reversed Pyramid with number	
	
		/*int n=5;
		        for ( int i=n;i>=1;i-- ){     

		            for (int j=1;j<=(n-i);j++){ 
		                System.out.print(" ");
		            }

		            for (int j=1;j<=i;j++){
		                System.out.print(j+" ");//just add j in place of *
		            }
		            System.out.println();
		        }*/

}
}