public class LuckyNumbers
{
    public int randomIntegerBetween(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public String getLuckyNumbers()
    {
        int num1 = randomIntegerBetween(1,65);
        int num2 = randomIntegerBetween(1,65);
        int num3 = randomIntegerBetween(1,65);
        int num4 = randomIntegerBetween(1,65);
        int num5 = randomIntegerBetween(1,65);
        int superBall = randomIntegerBetween(1,65);

        String str = "Your lucky numbers are: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5;
        str += "\nThe super ball is : " + superBall;
        return str;
    }
}
