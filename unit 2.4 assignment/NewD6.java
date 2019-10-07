
import java.util.Scanner;

class NewD6 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);



        int n = 0;
        int total = 0;
        boolean again = true;
        int i = 0;
        int j = 0;
        String a;

        while(again == true){
            
            System.out.println("How many D6's do you want to roll?");
            n = sc.nextInt();
            total = 0;
            
            for(i = 1; i <= n; i++){
                int dice = (int)(Math.random()*6) + 1;
                total = total + dice;
                System.out.print( dice + " " );
            }
            System.out.println();
            System.out.println(total);

            System.out.println("Again? (y/n)");
            a = sc.next();

            if(a.equals("y")){
                again = true;
            }else{
                again = false; 
            }
        }

        /*
        double dice1 = (Math.random()*((6 - 1) + 1 )) + 1;   
        double dice2 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice3 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice4 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice5 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice6 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice7 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice8 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice9 = (Math.random()*((6 - 1) + 1 )) + 1;
        double dice10 = (Math.random()*((6 - 1) + 1 )) + 1;

        int d1 = (int) dice1;
        int d2 = (int) dice2;
        int d3 = (int) dice3;
        int d4 = (int) dice4;
        int d5 = (int) dice5;
        int d6 = (int) dice6;
        int d7 = (int) dice7;
        int d8 = (int) dice8;
        int d9 = (int) dice9;
        int d10 = (int) dice10;

        System.out.println("Dice1  : " + d1);
        System.out.println("Dice2  : " + d2);
        System.out.println("Dice3  : " + d3);
        System.out.println("Dice4  : " + d4);
        System.out.println("Dice5  : " + d5);
        System.out.println("Dice6  : " + d6);
        System.out.println("Dice7  : " + d7);
        System.out.println("Dice8  : " + d8);
        System.out.println("Dice9  : " + d9);
        System.out.println("Dice10 : " + d10);
         */
    }

}
