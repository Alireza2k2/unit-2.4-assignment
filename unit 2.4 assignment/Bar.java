import java.util.Scanner;
class Bar{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String n;
        int l = 0;
        int i = 0;
        int j = 0;
        System.out.println("What character do you want your bar made of?");
        n = sc.next();
        System.out.println("How long do you want your bar?");
        l = sc.nextInt();
        
        for(i = 1; i == 1; i++){
            
            for(j = 0; j < l; j++){
                System.out.print(n);
            }
            
        }

        
        
        
    }
}