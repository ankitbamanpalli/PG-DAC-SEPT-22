/*

*/
import java.util.*; 
class p2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
		int end = rows;
        // loop to iterate for the given number of rows
			
		for(char i ='A';i<='E';i++){
			for(char k='A';k<=i;k++){
				System.out.print(k+" ");
			}
		System.out.println();
		}
		
	}
					
}

 



