import java.util.Random;
public class summation {
    public static void main(String[] args) {
        Random randGen = new Random();
        int [] myNumbers= new int [10];
      
        for (int i = 0; i < myNumbers.length; i++)
        {
            myNumbers[i]= randGen.nextInt(20) +1;
        }

        System.out.println("The sum of the array using a for loop is " + loopSum(myNumbers));
        System.out.println("The sum of the array using recursion is " + recursiveSum(myNumbers, myNumbers.length-1));



    }

    public static int loopSum(int [] myArray)
    {
        int sum = 0; 
        for (int e: myArray)
        {
            sum += e;
        }
        return sum;
    }

        public static int recursiveSum(int [] myArray, int index)
    {
        if (index == -1)
            return 0;
        else 
        {
            return myArray[index] + recursiveSum(myArray, index-1);
        }
    }

}

