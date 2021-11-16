import java.util.Scanner;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//qst1)diamond pattern

	//Scanner sc=new Scanner(System.in);
	//System.out.print("Enter number of rows to print diamond: ");
	//int n=5;
	/*int i,j,k;
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
				System.out.println(" ");}*/
		
		
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
		
//qst3) reversed Pyramid with number pattern 2
	 
		/*int n=5;
		        for ( int i=0;i<=n-1;i++){     

		            for (int j=0;j<=i;j++){ 
		                System.out.print(" ");
		            }

		            for (int k=0;j<=n-1-i;k++){
		                System.out.print((i+1)+" ");//(i+1 for printing )
		            }
		            System.out.println();
		        }*/
	
/* o/p
 1 1 1 1 1 
  2 2 2 2 
   3 3 3 
    4 4 
     5  */
		
		//qst4) reversed Pyramid with number pattern 1
			/*int n=5;
			        for ( int i=1;i<=n;i++ ){     

			            for (int j=1;j<=i;j++){ 
			                System.out.print(" ");
			            }

			            for (int k=i;k<=n;k++){
			                System.out.print(k+" ");
			            }
			            System.out.println();
			        }*/
			                /*  o/p 
1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5  */ 
			        
//qst5) java prg to print int,double and char on screen
			     /*   Scanner sc=new Scanner(System.in);
			        System.out.print("Enter integer value: ");
			        int i=sc.nextInt();
			        System.out.print("Enter double value: ");
			        double d=sc.nextDouble();
			        System.out.print("Enter integer value: ");
			        char c=sc.next().charAt(0);
			        System.out.println("Integer is: "+i);
			        System.out.println("Double is: "+d);
			        System.out.println("Char is: "+c)*/


//qst6) java prg to print product of int & double number
			      /*  Scanner sc=new Scanner(System.in);
			        System.out.print("Enter integer value: ");
			        int i=sc.nextInt();
			        System.out.print("Enter double value: ");
			        double d=sc.nextDouble();
			        double pro=i*d;
			        System.out.println("product of "+i+" and "+d+" is "+pro);*/
			        
			        
			        
//qst6) java prg to print Ascii value of char by user input
			        
			        
				    /*Scanner sc=new Scanner(System.in);		
				    System.out.print("Enter integer value: ");
			        char c=sc.next().charAt(0);
			        int value=c;
			        System.out.println("Ascii value of "+c+" is "+value);*/
			      
//qst7) java prg to print  adding 3 to Ascii value of char by user input 
			        
			        
				    /*Scanner sc=new Scanner(System.in);		
				    System.out.print("Enter integer value: ");
			        char c=sc.next().charAt(0);
			        int value=c+3;
			        System.out.println("Ascii value of "+c+" is "+value);*/        

			        
//qst8) java prg to covert temp  from  fahren to celsius by user input
			        
			        
				  /*  Scanner sc=new Scanner(System.in);		
				    System.out.print("Enter temperature in fahrenheits: ");
			        float fah=sc.nextFloat();
			       float cels=(fah-32)*5/9;
			        System.out.println("temperature in "+fah+" is converted to "+cels);*/
			        
			        
//qst9) java prg to covert inch into meter by user input			        
			        
			       /* Scanner sc=new Scanner(System.in);		
				    System.out.print("Enter inches: ");
				    float inch=sc.nextFloat();
				    float meter=inch/39.37f;
				    System.out.println(inch+"  converted into is  "+meter);*/
			        
	}
}
