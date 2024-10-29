import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finals=1 ;
        boolean playagain = true;
        System.out.println("welcome Buddy!");
        System.out.println("Hey Buddy you have "+chances+" to win the game:");
        while(playagain){
            int rand = getrand(1,100);
            boolean guess = false;
            for(int i = 0; i<chances;i++){
                System.out.println("chances"+(i+1)+" Enter your guess:");
                int user = sc.nextInt();
                if(user==rand){
                    guess = true;
                    finals+=1;
                    System.out.println("you won it.");
                    break;
                }
                else if (user>rand){
                    System.out.println("too high");
                }
                else{
                    System.out.println("too low");
                }

            }
            if(guess==false){
                System.out.println("sorry buddy.You lost the chances.The number is "+rand);

            }
            System.out.println("Do you want play again(yes/no)");
            String pA = sc.next();
            playagain=pA.equalsIgnoreCase("y");


        }
        System.out.println("That's it buddy , hope you enjoyed it");
        System.out.println("Here is your score"+finals);
    }
    public static int getrand(int min , int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}  
