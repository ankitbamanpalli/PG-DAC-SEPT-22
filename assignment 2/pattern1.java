import java.util.*; 
class pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
		int start=0;
		int end = rows;
        // loop to iterate for the given number of rows
	
			for(int i =1;i<=rows;i++){
				int count=0;
				for(int j = 1;j<=i;j++){
					System.out.print(j);
					count= count+j;
				}
			System.out.print(" "+count);
			System.out.println();	
			}
		}
}   


