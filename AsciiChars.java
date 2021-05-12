
import java.util.Random;
import java.util.Scanner;

public class AsciiChars {

    public static void main(String[] args) {
        // Print the ASCII characters to the console.
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        // Program to generate random lottery numbers

        // Create a scanner to gather responses from the user.
        Scanner userInput = new Scanner(System.in);
        // Create boolean rule to determine if the user wants to run the program
        boolean runProgram = true;
        // Create a variable that will allow me to generate random numbers, which
        // will be used to randomly select an index from a string
        Random random = new Random();

        while (runProgram) {
            System.out.println("\nWhat is your name? ");

            String userName = userInput.next();

            System.out.println("Hello, " + userName);

            System.out.println("Would you like to to continue to the interactive portion of the program? (Y/N)");

            String runProgramAnswer = userInput.next().toLowerCase();

            // Set variables for user inputs
            String petName = "";
            int petAge = 0;
            int luckyNum = 0;
            int carYear = 0;
            String favActor = "";
            int randomNum = 0;

            if (runProgramAnswer.equals("y")) {

                // Ask the user 6 questions and store their response in a variable.
                // The user's response will be used to randomly generate a lottery number.


                System.out.println("What is the name of your favorite pet? ");
                petName = userInput.next();


                // Ask user for their favorite pet's age and validate the input. 
                do {
                    System.out.print("How old is your favorite pet? (enter age between 0-100) ");
                    while (!userInput.hasNextInt()) {
                        System.out.print("That's not a number! Try again: ");
                        userInput.next();
                    }
                    petAge = userInput.nextInt();
                    if (petAge > 100 || petAge < 0) {
                        System.out.print("Enter a number between 0-100! ");
                    } 
                } while (petAge < 0 || petAge > 100);

                // Ask user for favorte/lucky number and validate the input.

                System.out.println("What is your lucky/favorite number? ");
                while (!userInput.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    userInput.next();
                }
                luckyNum = userInput.nextInt();


                System.out.println("What year is your car? (use the last two digits of the year i.e. if it's a 2013, enter 13) ");
                while (!userInput.hasNextInt()) {
                    System.out.print("That's not a number! Try again: ");
                    userInput.next();
                }
                carYear = userInput.nextInt();

                System.out.println("What is the first name of your favorite actor/actress? ");
                favActor = userInput.next();

                // 
                do {
                    System.out.println("Enter a random integer between 1-25: ");
                    while (!userInput.hasNextInt()) {
                        System.out.print("That's not a number! Try again: ");
                        userInput.next();
                    }
                    randomNum = userInput.nextInt();
                    if (randomNum > 25 || randomNum < 1) {
                        System.out.print("Enter a number between 0-100! ");
                    } 
                } while (randomNum < 1 || randomNum > 25);

                // Create variables for randomly generated lottery numbers
                int lotto1;
                int lotto2;
                int lotto3;
                int lotto4;
                int lotto5;
                int magicBall;

                /* 
                Generate random lottery numbers by the following:

                If the input is a string:
                    Randomly choose a letter from the string and 
                    return the ASCII number that represents the letter.

                If the input is an integer:
                    Do some random math to come up with a random integer
                */

                // Create the lottery number for pet name:

                int petNameIndex = random.nextInt(petName.length());
                lotto1 = (int) petName.charAt(petNameIndex);

                // Check to see if lottery number 1 is over 65. 
                // If so, subtract 65.

                if (lotto1 > 65) {
                    lotto1 -= 65;
                }

                // test to ensure code is working as intended by logging to the console.
                // System.out.printf("\nLotto 1 char: %s. Lotto 1 ascii value: %s", petName.charAt(petNameIndex), lotto1);

                // Create the lottery number 2 from pet age:

                lotto2 = petAge + carYear;

                // Check to see if lottery number 1 is over 65. 
                // If so, subtract 65.

                if (lotto2 > 65) {
                    lotto2 -= 65;
                }

                // test to ensure code is working as intended by logging to the console.
                // System.out.printf("\nLotto 2 ascii value: %s", lotto2);

                // Create the lottery number 3 from the lucky number:
                String luckyNumString = String.valueOf(luckyNum);
                int luckyNumIndex = random.nextInt(luckyNumString.length());
                lotto3 = ((int) luckyNumString.charAt(luckyNumIndex)) - 20;
                // test to ensure code is working as intended by logging to the console.
                // System.out.printf("\nLotto 3 ascii value: %s", lotto3);
                

                // Create the lottery number 4 from the last two digits of car
                String carYearString = String.valueOf(carYear);
                int carYearIndex = random.nextInt(carYearString.length());
                lotto4 = ((int) carYearString.charAt(carYearIndex)) + 20 / 2;
                // test to ensure code is working as intended by logging to the console.
                // System.out.printf("\nLotto 4 ascii value: %s", lotto4);

                // Create lottery number 5 from the favorite actor/actress
                int favActorIndex = random.nextInt(favActor.length());
                lotto5 = (int) favActor.charAt(favActorIndex);
                // Check to see if lottery number 1 is over 65. 
                // If so, subtract 65.
                if (lotto5 > 65) {
                    lotto5 -= 65;
                }
                // test to ensure code is working as intended by logging to the console.
                // System.out.printf("\nLotto 5 char: %s. Lotto 5 ascii value: %s", favActor.charAt(favActorIndex), lotto5);

                // Create magic ball number from random number.
                magicBall = randomNum * 3 - petAge;
                // Check to see if magicBall is less or eual to 0. 
                // If so, add 75.
                if (magicBall <= 0) {
                    magicBall += 75;
                }

                if (magicBall > 75) {
                    magicBall -= 75;
                }

                // Console log the lottery numbers and magic number:
                System.out.printf("\nLottery numbers: %s, %s, %s, %s, %s  Magic ball: %s\n", lotto1, lotto2, lotto3, lotto4, lotto5, magicBall);

                // Ask User if they would like to play again. 
                // If not, end the program and thank them for playing.
                System.out.println("Would you like to play again? (Y/N) ");
                String playAgain = userInput.next().toLowerCase();

                if (playAgain.equals("y")) {
                    continue;
                } else {
                    System.out.println("Thank you for playing!");
                    runProgram = false;
                }

            // Else statement for if the user declines to complete the survey.
            } else {
                System.out.println("Please run the program later to complete the survey.");
                runProgram = false;
            }

        }


    }

    public static void printNumbers() {
        for (char ch=48; ch < 58; ch++) {
            System.out.print(ch);
        }
    }

    public static void printLowerCase() {
        for (char ch=97; ch < 123; ch++) {
            System.out.print(ch);
        }
    }

    public static void printUpperCase() {
        for (char ch=65; ch < 91; ch++) {
            System.out.print(ch);
        }
    }

}
