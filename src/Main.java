import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int userriddlenumb = 0;
        int userriddlecount = rand.nextInt(0,4);
        System.out.println("Welcome to auraspin!");
        System.out.println("Spin Chances:");
        System.out.println("    Default - 50%");
        System.out.println("    Green - 10%");
        System.out.println("    Red - 10%");
        System.out.println("    Yellow - 10%");
        System.out.println("    Blue - 10%");
        System.out.println("    Black - 4%");
        System.out.println("    White - 4%");
        System.out.println("    Rainbow - 0.5%");
        System.out.println("    Hazardous - 0.4%");
        System.out.println("    Holy - 0.05%");
        System.out.println("    Archangel - 0.04%");
        System.out.println("    All-Seeing Eyes - 0.01%");
        System.out.println("You need to solve 1 riddle per roll!");

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Do you want to roll or do a riddle(riddle or roll)?");
            String user_roll = input.nextLine();
            if (user_roll.equals("roll")) {
                if (userriddlenumb <= 0) {
                    System.out.println("You have to solve a riddle first");

                } else {
                    System.out.println("i forgor");
                }
            }
            if (user_roll.contains("riddle") || userriddlenumb<=0 ){
                switch (userriddlecount) {
                    case 0 -> {
                        System.out.println("What gets wet while drying?");
                        String answer = input.nextLine();
                        if (answer.contains("towel")) {
                            userriddlenumb = userriddlenumb + 1;
                            System.out.println("Correct! You have " + userriddlenumb + " roll(s)!");
                            userriddlecount = rand.nextInt(0, 4);
                        } else {
                            userriddlenumb = userriddlenumb - 1;
                            System.out.println("Your answer is WRONG! You just lost a point lil bro");
                        }
                    }
                    case 1 -> {
                        System.out.println("What begins with an 'e' and only contains one letter?");
                        String answer = input.nextLine();
                        if (answer.contains("envelope")) {
                            userriddlenumb = userriddlenumb + 1;
                            System.out.println("Correct! You have " + userriddlenumb + " roll(s)!");
                            userriddlecount = rand.nextInt(0, 4);
                        } else {
                            userriddlenumb = userriddlenumb - 1;
                            System.out.println("Your answer is WRONG! You just lost a point lil bro");
                        }
                    }
                    case 2 -> {
                        System.out.println("What belongs to you but is used by everyone you meet?");
                        String answer = input.nextLine();
                        if (answer.contains("name")) {
                            userriddlenumb = userriddlenumb + 1;
                            System.out.println("Correct! You have " + userriddlenumb + " roll(s)!");
                            userriddlecount = rand.nextInt(0, 4);
                        } else {
                            userriddlenumb = userriddlenumb - 1;
                            System.out.println("Your answer is WRONG! You just lost a point lil bro");
                        }
                    }
                    case 3 -> {
                        System.out.println("What has a head, a tail, is brown, and has no legs?");
                        String answer = input.nextLine();
                        if (answer.contains("penny")) {
                            userriddlenumb = userriddlenumb + 1;
                            System.out.println("Correct! You have " + userriddlenumb + " roll(s)!");
                            userriddlecount = rand.nextInt(0, 4);
                        } else {
                            userriddlenumb = userriddlenumb - 1;
                            System.out.println("Your answer is WRONG! You just lost a point lil bro");
                        }
                    }
                }
            }


            System.out.println();

        }


    }
}