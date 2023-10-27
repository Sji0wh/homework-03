import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Task 1
        int Length = 3;
        int Width = 4;
        int Area = Length * Width;
        System.out.println(Area);

        // Task 2
        double Weight = 90.2;
        double Height = 185.5;
        double bodyMassIndex = Weight / (Height * Height);
        System.out.println(bodyMassIndex);

        //Task 3
        double tempCelsius = 36.6;
        double tempFahrenheit = (9.0/5.0) * tempCelsius + 32;
        System.out.println(tempFahrenheit);

        //Task 4
        int Largest = 2147483647;
        int largestPlus = Largest + 1;
        System.out.println(largestPlus);

        //Task 5
        double fValue = 45.9;
        int rValue= (int) fValue;
        System.out.println(rValue);

        //Task 6
        int Age = 30;
        boolean ageCheck = Age >= 18;
        System.out.println(ageCheck);

        //Task 7
        char oChar = 'B';
        int mPos = 3;
        char Encrypted = (char) (oChar + mPos);
        System.out.println(Encrypted);

        //Task 8
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int Number1 = scanner.nextInt();
        System.out.println("Second number: ");
        int Number2 = scanner.nextInt();
        scanner.close();
        int Sum = Number1 + Number2;
        System.out.println("Result: " + Sum);
        }
    }