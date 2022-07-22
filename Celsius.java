//Write a java program to convert fahrenheit to celsius.

class Celsius
{
	public static void main(String args[])
	{
		float Fahrenheit, Celsius;
		Fahrenheit=3.4f;
		Celsius=((Fahrenheit-32)*5/9); //to convert Celsius
		System.out.println("Temperature in Celsius is:"+Celsius);
	}
}