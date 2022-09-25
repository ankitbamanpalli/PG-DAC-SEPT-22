/*

*/
import java.util.*; 
class p18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		int count=1;
        // loop to iterate for the given number of rows
			
		for(char i ='E';i>='A';i--){
			for(char k ='A';k<=i;k++){
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
	}
					
}

