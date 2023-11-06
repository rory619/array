package ie.atu;
import java.util.ArrayList;


public class ArrayListDemo {

    public class arrayDemo {
        public static void main(String[] args) {
            //declares an array of integers
            int[] anArray;

            //allocates memory for 10 integers
            anArray = new int[10];

            //initialise first element
            anArray[0] = 100;
            //initialise second element
            anArray[1] = 200;
            anArray[2] = 300;
            anArray[3] = 400;
            anArray[4] = 500;
            anArray[5] = 600;
            anArray[6] = 700;
            anArray[7] = 800;
            anArray[8] = 900;
            anArray[9] = 1000;

            int indexValue = 0;
            for (int value: anArray)
            {
                System.out.println("Element at index 0:" + indexValue + value);
                indexValue++;
            }
            ArrayList<String> Arrays = new ArrayList<>();
            Arrays.add("Enter a new number");
            String Array = Arrays.get(1);




        }
    }
}
