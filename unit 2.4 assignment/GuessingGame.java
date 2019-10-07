import java.util.Scanner;
class GuessingGame{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random()*100) + 1;
        int n = 0;
        boolean answer = false;
        int guesses = 0;

        System.out.println("try to guess the number in my mind!");

        while(answer == false){
            
            n = sc.nextInt();

            if(n > number){
                System.out.println();
                System.out.println("Too High...");
                guesses++;
            }else if (n < number){
                System.out.println();
                System.out.println("Too Low...");
                guesses++;
            }else{
                System.out.println();
                System.out.println("you have guesses my number! Good job! It took you " + guesses + " tries!"); 
                answer = true;
            }

        }

    }
}