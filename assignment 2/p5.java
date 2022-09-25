/*

*/
import java.util.*; 
class p5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
		for(char i ='A';i<='E';i++){
			for(char k ='A';k<=i;k++){
				System.out.print(i+" ");
			}
		System.out.println();
		}
		
	}
					
}

 



