package days.presentation_1;

import java.util.Random;

public class RandomClass_ {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Random randomChar = new Random();

        int newRandomInt = randomNumber.nextInt();
        System.out.println("newRandomInt = " + newRandomInt);

        double newRandomDouble = randomNumber.nextDouble();
        System.out.println("newRandomDouble = " + newRandomDouble);

        float newRandomFloat = randomNumber.nextFloat();//nextFloat(float bound);nextFloat(float origin, float bound)
        System.out.println("newRandomFloat = " + newRandomFloat);


        long newRandomLong = randomNumber.nextLong();
        System.out.println("newRandomLong = " + newRandomLong);

        boolean newRandomBoolean = randomNumber.nextBoolean();
        System.out.println("newRandomBoolean = " + newRandomBoolean);

        // short newRandomShort= randomNumber.nextShort();

        int min = 64;
        int max = 90;


        int myNewRandomChar = randomChar.nextInt(max - min) + min;
        System.out.println("Random capital letters: " + (char) myNewRandomChar);

        char newChar = (char) myNewRandomChar;
        System.out.println("New Char: " + newChar);


        char myRandomChar = (char) (randomChar.nextInt(29) + 'a');
        System.out.println("Random small letters: " + myRandomChar);

        //for Loop icinde sabit bir random sayi yazdirmak !!
        for (int i = 0; i < 5; i++) {
            System.out.println("Random small letter is: " + myRandomChar);

        }

        //for loop icinde sürekli yenilenen Random harf yazdirmak
        for (int i = 0; i < 5; i++) {
            char myNewestRandomChar = (char) (randomChar.nextInt(27) + 'a');
            System.out.println("The newest Random small letter is: " + myNewestRandomChar);

        }

    }
}
