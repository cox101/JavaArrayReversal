import java.util.Scanner;

public class Main {
    static int array[];
    static int reverseArray[];
    static int arrayPositionValue;
    static int reverserArrayPositionValue;

    public static void createArray() {
        // Create an array to hold the integers
        array = new int[15];

        // Create a Scanner object to read input from the user
        Scanner userInputscanner = new Scanner(System.in);

        // Prompt the user to enter 15 integers
        System.out.println("Enter 15 integers:");

        // Read each integer and store it in the array
        for (int arrayPositionValue = 0; arrayPositionValue <=14; arrayPositionValue++) {
            array[arrayPositionValue] = userInputscanner.nextInt();
        }
    }

    public static void printArray() {
        // Print the array to verify the input
        System.out.println("The values you entered are:");
        for (arrayPositionValue = 0; arrayPositionValue < 15; arrayPositionValue++) {
            System.out.print(array[arrayPositionValue] + " \n");
        }
    }


    public static void searchArray() {
        // Prompt the user to enter a number to search for
        System.out.println("Enter a number to search for:");

        //create scanner object to read search input
        Scanner searchArrayScanner = new Scanner(System.in);

        // Read the number to search for
        int searchNumber = searchArrayScanner.nextInt();

        // Search for the number in the array
        int index = -1;
        for (int arrayPositionValue = 0; arrayPositionValue <15; arrayPositionValue++) {
            if (array[arrayPositionValue] == searchNumber) {
                index = arrayPositionValue;
                break;
            }
        }

        // Print the result
        if (index != -1) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }
    }

    public static void reverseArray() {
        // Create a new array to hold the integers in reverse order

        reverseArray = new int[15];

        // Copy the elements from the existing array to the new array in reverse order
        for (arrayPositionValue=14;arrayPositionValue >=0; arrayPositionValue--)
         {

            reverseArray[reverserArrayPositionValue] = array[arrayPositionValue];
             reverserArrayPositionValue++;
        }

        // Print the elements of the new array on the screen
        System.out.println("The elements of the new array in reverse order are:");
        for (int reverserArrayPositionValue = 0; reverserArrayPositionValue <=14; reverserArrayPositionValue++) {
            System.out.print(reverseArray[reverserArrayPositionValue] + " ");
        }
    }

        public static void main (String[]args){
            createArray();
            printArray();
            searchArray();
            reverseArray();

        }

}