import java.util.Scanner;
public class rockPaperSessor {
    public static void main(String[] args){
        Scanner lol = new Scanner(System.in);
        System.out.println("Enter your choice(White): ");
        String mal1= lol.nextLine();
        System.out.println("Enter your choice(Black): ");
        String mal2= lol.nextLine();
        if(mal1.equals("scissors")){
            if(mal2.equals("scissors")){
                Systen.out.println("Both scissors do nothing!!");
                System.out.println("Draw!");
                
                }
                else if(mal2.equals("rock")){
                    Systen.out.println("Rock breaks scissors!!");
                    System.out.println("Black wins");
                    
                    
                }
                else if(mal2.equals("paper")){
                    Systen.out.println("Scissor cuts paper!!");
                    System.out.println("WHite wins");
                }
                else{
                    System.out.println("What the fuck is " + mal2 + "?");
                }
        }
        else if(mal1.equals("rock")){
            if(mal2.equals("scissors")){
                
                System.out.println("Rock breaks Scissors!!");
                System.out.println("White wins");

            }
            else if(mal2.equals("rock")){
                System.out.println("Boths are rocks!!");
                System.out.println("Draw!");
            }
            else  if(mal2.equals("paper")){
                System.out.println("Paper defeats rock!!");
                System.out.println("Black  WIns");
            }
            else{
            System.out.println("What the fuck is " + mal2 + "?");

            }
        }
        else if(mal1.equals("paper")){
            if(mal2.equals("paper")){
                System.out.println("Both are papers");
                System.out.println("Draw!");
            }
            else  if(mal2.equals("rock")){
                System.out.println("Paper defeats rock!!");
                System.out.println("WHite wins");
            }
            else if(mal2.equals("scissors")){
                System.out.println("Scissors cut paper!!");
                System.out.println("Black wins");
            }
            else{
            System.out.println("What the fuck is " + mal2 + "?");

            }
        }
        else{
            System.out.println("What the fuck is " + mal1 + "?");

        }


    }
    
}
