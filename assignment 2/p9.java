/*

*/
import java.util.*; 
class p9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		
        // loop to iterate for the given number of rows
			
		for(char i ='A';i<='E';i++){
			for(char j ='E';j>i;j--){
				System.out.print(" ");
			}
			for(char l = 'A';l<=i;l++){
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	}
					
}

