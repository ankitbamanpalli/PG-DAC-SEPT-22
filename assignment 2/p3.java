/*

*/
import java.util.*; 
class p3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
		for(char i =1;i<=rows;i++){
			for(char k=1;k<=i;k++){
				System.out.print(k+" ");
			}
		System.out.println();
		}
		
	}
					
}

 



