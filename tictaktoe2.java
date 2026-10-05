import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class tictactoe3 {
    public static void line(){
    System.out.println("|---|---|---|");

    }
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int input=0;
    boolean draw=true;
    boolean owin=false,xwin=false;
    
    String[] posi={"1","2","3","4","5","6","7","8","9"};
    ArrayList<Integer> x=new ArrayList<>();
    ArrayList<Integer> o=new ArrayList<>();
    while(input<5){
       System.out.println("its X's turn");
       String p1=sc.nextLine();
       char aa1=p1.charAt(0);
       int as1=(int)aa1;
       int num1=as1-'0';
       for(int ij=0;ij<posi.length;ij++){
        if(posi[ij].equals(p1)){
          posi[ij]="X";
        }

       }
       System.out.println("its O's turn");
       String p2=sc.nextLine();
       char aa2=p2.charAt(0);
       int as2=(int)aa2;
       int num2=as2-'0';
       for(int ij2=0;ij2<posi.length;ij2++){
        if(posi[ij2].equals(p2)){
          posi[ij2]="O";
        }

       }
       
        x.add(num1);
        
        o.add(num2);
     
      
        line();
      
     
       System.out.println("| "+posi[0]+" | "+posi[1]+" | "+posi[2]+" |");

        line();
       
      System.out.println("| "+posi[3]+" | "+posi[4]+" | "+posi[5]+" |");
        line();
       
      System.out.println("| "+posi[6]+" | "+posi[7]+" | "+posi[8]+" |");    
        line();
      
        
    
     
      if(x.contains(1) && x.contains(2)&& x.contains(3)){
        xwin=true;
      }
      else if(x.contains(4) && x.contains(5)&& x.contains(6)){
        xwin=true;
      }
      else if(x.contains(7) && x.contains(8)&& x.contains(9)){
        xwin=true;
      }
      else if(x.contains(1) && x.contains(4)&& x.contains(7)){
        xwin=true;
      }
      else if(x.contains(3) && x.contains(6)&& x.contains(9)){
        xwin=true;
      }
      else if(x.contains(2) && x.contains(5)&& x.contains(8)){
       xwin=true;
      }
      else if(x.contains(1) && x.contains(5)&& x.contains(9)){
        xwin=true;
      }
      else if(x.contains(3) && x.contains(5)&& x.contains(7)){
        xwin=true;
      }


     
     
      if(o.contains(1) && o.contains(2)&& o.contains(3)){
        owin=true;
      }
      else if(o.contains(4) && o.contains(5)&& o.contains(6)){
        owin=true;
      }
      else if(o.contains(7) && o.contains(8)&& o.contains(9)){
        owin=true;
      }
      else if(o.contains(1) && o.contains(4)&& o.contains(7)){
        owin=true;
      }
      else if(o.contains(3) && o.contains(6)&& o.contains(9)){
        owin=true;
      }
      else if(o.contains(2) && o.contains(5)&& o.contains(8)){
        owin=true;
      }
      else if(o.contains(1) && o.contains(5)&& o.contains(9)){
        owin=true;
      }
      else if(o.contains(3) && o.contains(5)&& o.contains(7)){
        owin=true;
      }


     
     if(xwin){
      System.out.println("The X user wins!!");
      draw=false;
      break;
     }
     

    
    else if(owin){
    System.out.println("The O user wins!!");
    draw=false;
     break;
    }
    
    input++;
    }
    
    if(draw){
      System.out.println("Draw");
    }
    
    }
  }



