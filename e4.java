import java.util.Random;
import java.util.Scanner;
public class e4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Who are you?");
        String name=sc.nextLine();
        System.out.println("Hello, "+name+"!");
        System.out.println("Tossing a coin...");
        Random rand=new Random();
        int count=0,coin;
        for(int i=0;i<3;i++){
            coin=rand.nextInt(2);
            if(coin==0){
                System.out.println("Round "+i+": Heads");
                count++;
            }
            else System.out.println("Round "+i+": Tails");
        }
        System.out.println("Heads: "+count+", Tails: "+(3-count));
        if(count>=2) System.out.println("You won");
        else System.out.println("You lost");
    }
}
