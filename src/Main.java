import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int auraroll;
        String aurakept = "Default";
        String lastrolledaura = "Default";
        int userriddlenumb = 0;
        int userriddlecount = rand.nextInt(0,4);
        System.out.println("Welcome to auraspin!");
        System.out.println("Spin Chances:");
        System.out.println("    Default - 50%");
        System.out.println("    Green - 10%");
        System.out.println("    Red - 10%");
        System.out.println("    Yellow - 10%");
        System.out.println("    Blue - 10%");
        System.out.println("    Pitch Black - 4%");
        System.out.println("    Pure White - 4%");
        System.out.println("    Rainbow - 1.5%");
        System.out.println("    Hazardous - 0.4%");
        System.out.println("    Holy - 0.05%");
        System.out.println("    Archangel - 0.04%");
        System.out.println("    All-Seeing Eyes - 00.1%");
        System.out.println("You need to solve 1 riddle per roll! If you roll with only 1 roll left, there will automatically be a riddle you must solve(still gives you 1 more point)");
        System.out.println("You can get negative points, so be careful!");

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Do you want to roll, do a riddle, or check what aura you have(riddle, roll or aura)?");
            String user_roll = input.nextLine();
            if (user_roll.contains("aura")){
                System.out.println(aurakept);
            }
            if (user_roll.contains("roll")) {


                if (userriddlenumb <= 0) {
                    System.out.println("You dont have the required amount of points to roll.");
                    System.out.println("Remember, you need to solve a riddle in order to get 1 point!");

                } else {
                    auraroll = rand.nextInt(0, 100);
                    System.out.println(auraroll);
                    if (auraroll == 1){
                        System.out.println("You got the rarest aura, The ALl-Seeing Eyes!");
                        lastrolledaura = "All-Seeing Eyes";
                        System.out.println("Chances - 1/10000");
                        //System.out.println("Do you want to keep this aura?");
                        //String aurakeep = input.nextLine();
                    }
                    if ( 5 << auraroll <= 10){
                        System.out.println("You got one of the rarest auras, Holy!");
                        lastrolledaura = "Holy";
                        System.out.println("Chances - 5/10000");
                        //System.out.println("Do you want to keep this aura?");
                        //String aurakeep = input.nextLine();
                    }
                    if (auraroll > 1 && auraroll <=5){
                        System.out.println("You got one of the rarest auras, The Archangel!");
                        lastrolledaura = "Archangel";
                        System.out.println("Chances - 4/10000");
                        //System.out.println("Do you want to keep this aura?");
                        //String aurakeep = input.nextLine();
                    }
                    if (auraroll > 10 && auraroll <=40){
                        System.out.println("You got a pretty rare aura, Hazardous!");
                        lastrolledaura = "Hazardous";
                        System.out.println("Chances - 40/10000");
                        //System.out.println("Do you want to keep this aura?");
                        //String aurakeep = input.nextLine();
                    }
                    if (auraroll > 40 && auraroll <=150){
                        System.out.println("You got a pretty rare aura, Rainbow!");
                        lastrolledaura = "Rainbow";
                        System.out.println("Chances - 150/10000");
                        //System.out.println("Do you want to keep this aura?");
                        //String aurakeep = input.nextLine();
                    }  //String aurakeep = input.nextLine();
                    if (auraroll > 150 && auraroll <=1000){
                        int BorW = rand.nextInt(0, 2);
                            if (BorW == 1){
                                System.out.println("You got a pretty rare aura, Pure White!");
                                lastrolledaura = "Pure White";
                            }
                            else{
                                System.out.println("You got a pretty rare aura, Pitch Black!");
                                lastrolledaura = "Pitch Black";
                            }
                        System.out.println("Chances - 40/10000");
                        if (auraroll > 1000 && auraroll <=5000) {
                            int randoint = rand.nextInt(0, 4);
                            if (randoint == 0) {
                                System.out.println("You got a decent aura, Red!");
                                lastrolledaura = "Blue";
                            }
                            if (randoint == 1) {
                                System.out.println("You got a decent aura, Blue!");
                                lastrolledaura = "Blue";
                            }
                            if (randoint == 2) {
                                System.out.println("You got a decent aura, Green!");
                                lastrolledaura = "Green";
                            }
                            if (randoint == 3) {
                                System.out.println("You got a decent aura, Yellow!");
                                lastrolledaura = "Yellow";
                            }
                            System.out.println("Chances - 1000/10000");
                        }
                        if (auraroll > 5000 && auraroll <=10000){
                            System.out.println("You got a common aura, Default!");
                            System.out.println("Chances - 5000/10000");
                            lastrolledaura = "Default";
                            //System.out.println("Do you want to keep this aura?");
                            //String aurakeep = input.nextLine();
                        }  //String aurakeep = input.nextLine();
                        //System.out.println("Do you want to keep this aura?");
                        //String aurakeep = input.nextLine();
                    }

                    System.out.println("Do you want to keep this aura?");
                    String aurakeep = input.nextLine();
                    if (aurakeep.contains("y")){
                        aurakept = lastrolledaura;
                    }
                    userriddlenumb = userriddlenumb -1;
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