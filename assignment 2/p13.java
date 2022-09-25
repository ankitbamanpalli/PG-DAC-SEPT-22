/*

*/
import java.util.*; 
class p13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
        // loop to iterate for the given number of rows
			
		for(char i ='A';i<='E';i++){
			for(char k ='E';k>i;k--){
				System.out.print(" ");
			}
			for(char j ='A';j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
					
}

