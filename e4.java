import java.util.Random;
public class e4 {
    public static void main(String[] args) {
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
    }
}
