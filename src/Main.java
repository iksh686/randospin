import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userriddlenumb = 0;
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
        System.out.println("Do you want to roll(say yes or no)?");
        String user_roll = input.nextLine();
        if (user_roll.equals("yes")){
//            if(userriddlenumb <= 0){
//                System.out.println("You have to solve a riddle first");
//            }
            switch (userriddlenumb) {
                case 0 -> {
                    System.out.println("What gets wet while drying?");
                }
                case 1 -> {
                    System.out.println("What begins with an 'e' and only contains one letter?");
                }
                case 2 -> {
                    System.out.println("What belongs to you but is used by everyone you meet?");
                }
                case 3 -> {

                }
            }
        }
        System.out.println();
    }
}