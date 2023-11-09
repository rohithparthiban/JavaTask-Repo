import java.util.Scanner;
class FibonacciSeries
{
	Scanner scan = new Scanner(System.in);
	void febSeries()
	{
		System.out.println("Enter a number :");
		int userInt = scan.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0; i<=userInt; i++)
		{
			int n3 = n1+n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
	public static void main(String args[])
	{
		FibonacciSeries fs = new FibonacciSeries();
		fs.febSeries();
	}
}	