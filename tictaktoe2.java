import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class tictaktoe2 {
    public static void line(){
    System.out.println("|---|---|---|");

    }
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int input=0;
    boolean draw=true;
    int uplinex=0,unlinex=0,lelinex=0,rilinex=0,cross1x=0,cross2x=0,mid1x=0,mid2x=0;
    int uplineo=0,unlineo=0,lelineo=0,rilineo=0,cross1o=0,cross2o=0,mid1o=0,mid2o=0;
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
       int as2=(int)aa1;
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
      
        
    
     for(int i=x.size()-1;i<x.size();i++){
      if(x.contains(1) || x.contains(2)|| x.contains(3)){
        uplinex++;
      }
      else if(x.contains(4) || x.contains(5)|| x.contains(6)){
        mid1x++;
      }
      else if(x.contains(7) || x.contains(8)|| x.contains(9)){
        unlinex++;
      }
      else if(x.contains(1) || x.contains(4)|| x.contains(7)){
        lelinex++;
      }
      else if(x.contains(3) || x.contains(6)|| x.contains(9)){
        rilinex++;
      }
      else if(x.contains(2) || x.contains(5)|| x.contains(8)){
        mid2x++;
      }
      else if(x.contains(1) || x.contains(5)|| x.contains(9)){
        cross1x++;
      }
      else if(x.contains(3) || x.contains(5)|| x.contains(7)){
        cross2x++;
      }


     }
     for(int i=o.size()-1;i<o.size();i++){
      if(o.contains(1) || o.contains(2)|| o.contains(3)){
        uplineo++;
      }
      else if(o.contains(4) || o.contains(5)|| o.contains(6)){
        mid1o++;
      }
      else if(o.contains(7) || o.contains(8)|| o.contains(9)){
        unlineo++;
      }
      else if(o.contains(1) || o.contains(4)|| o.contains(7)){
        lelineo++;
      }
      else if(o.contains(3) || o.contains(6)|| o.contains(9)){
        rilineo++;
      }
      else if(o.contains(2) || o.contains(5)|| o.contains(8)){
        mid2o++;
      }
      else if(o.contains(1) || o.contains(5)|| o.contains(9)){
        cross1o++;
      }
      else if(o.contains(3) || o.contains(5)|| o.contains(7)){
        cross2o++;
      }


     }
     if(uplinex==3 || lelinex==3||rilinex==3||cross1x==3||cross2x==3||mid1x==3||mid2x==3 ){
      System.out.println("The X user wins!!");
      draw=false;
      break;
     }
     

    
    else if(uplineo==3||unlineo==3||lelineo==3||rilineo==3||cross1o==3||cross2o==3||mid1o==3||mid2o==3){
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



