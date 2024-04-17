import java.util.Scanner;

/*
* Who knows the nursery rhyme Ten Green Bottles?

Lyrics:

Ten green bottles hanging on the wall,
Ten green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be nine green bottles hanging on the wall.

Nine green bottles hanging on the wall,
Nine green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be eight green bottles hanging on the wall.

Eight green bottles hanging on the wall...
Seven green bottles hanging on the wall...
...

One green bottle hanging on the wall,
One green bottle hanging on the wall,
If that one green bottle should accidentally fall,
There'll be no green bottles hanging on the wall.
Task
Write some amazing code to reproduce the above lyrics starting from n green bottles!

parameter n is 1 to 10
newline terminates every line (including the last)
don't forget the blank lines between the verses
* */
public class Main {

    public static void singBottles(int bottlesNumber){

        String[] bottleNumber = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        for (int i = 0; i < 2; i++) {
            System.out.println(bottleNumber[bottlesNumber] + " green bottles hanging on the wall,");
        }

        if (bottlesNumber == 0) {
            System.out.println("If that one green bottle should accidentally fall,");
            System.out.println("There'll be no green bottles hanging on the wall.");
        } else {
            System.out.println("And if that one green bottle should accidentally fall,");
            System.out.println("There'll be " + bottleNumber[bottlesNumber].toLowerCase() + " green bottles hanging on the wall.");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of bottles (1-10): ");
        int bottlesNumber = scanner.nextInt();

        while(bottlesNumber < 1 || bottlesNumber > 10){
            System.out.println("Error, the number isn´t in the range 1-10.");
            System.out.println("Please, try again: ");
            bottlesNumber = scanner.nextInt();
        }

        for (int i = bottlesNumber; i > 0; i--) {
            singBottles(i - 1);
        }

    }
}