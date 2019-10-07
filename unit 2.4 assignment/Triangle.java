import java.util.Scanner;
class Triangle{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String n;
        int l = 0;
        int i = 0;
        int j = 0;
        System.out.println("What character do you want your triangle made of?");
        n = sc.next();
        System.out.println("How tall do you want your triangle?");
        l = sc.nextInt();
        
        for(i = 1; i <= l; i++){
            
            for(j = 1; j <= i; j++){
                System.out.print(n);
            }
            System.out.println();
        }

        
        
        
    }
}