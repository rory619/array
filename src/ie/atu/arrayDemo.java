package ie.atu;
import java.util.ArrayList;

public class arrayDemo {
    public static void main(String[] args) {
        //declares an array of integers
        int[] anArray;

        //allocates memory for 10 integers
        anArray = new int[10];
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("300");
        numbers.add("400");
        numbers.add("500");
        numbers.add("600");
        numbers.add("700");
        numbers.add("800");
        numbers.add("900");
        numbers.add("1000");

        int indexValue = 0;
        for (int value: anArray)
        {
            System.out.println("Element at index 0:" + indexValue + value);
            indexValue++;
        }



        String value = numbers.get(1);
        for (String element : numbers) System.out.println("Please enter a new number:");




    }
}