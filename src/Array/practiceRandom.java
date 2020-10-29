package Array;

import java.util.Random;
import java.util.Scanner;

public class practiceRandom {
    public static void main(String[] args) {
     /*  int random1 = new Random().nextInt();          //在全体int中生成随机数
       int randon2 = new Random().nextInt(10);//在[0,9)中随机生成一个整数
        for (int i = 0; i < 90; i++) {
            int num = new Random().nextInt(10)+1;
            System.out.print(num+" ");
            if((i+1)% 10 == 0)
                System.out.println();*/
        int random = new Random().nextInt(100) + 1;
        for (int i = 0; i < 6; i++) {
            System.out.print("please input what you guess:");
            int guess = new Scanner(System.in).nextInt();
            if(guess == random)
            {
                System.out.println("Congratulations,succeed");
                break;
            }
            if(guess > random)
                System.out.println("what you guess is bigger ");
            if(guess < random)
                System.out.println("what you guess is smaller");


        }

        System.out.println("game over,random="+random);

        }
    }

