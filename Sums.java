//Write a java program that accepts two integers and then print  sum, difference, product and average of those numbers.

class Sums
{
	public static void main(String args[])
	{
		int num1,num2,sum,diff,avg,product;
		num1=10;
		num2=20;
		sum=num1+num2; //to find sum
		diff=num1-num2; //to find difference
		avg=sum/2; //to find average
		product=num1*num2; //to find product
		
		System.out.println("sum of ="+sum);
		System.out.println("difference of ="+diff);
		System.out.println("average of ="+avg);
		System.out.println("product of ="+product);
	}
}