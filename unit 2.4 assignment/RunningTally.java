import java.util.Scanner;
class RunningTally{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        int total = 0;
        
        for(n = sc.nextInt(); n>=0; n = sc.nextInt()){
            total = total + n;
        }
        
        System.out.println(total);
        
        
        
        
        
        
    }
}
