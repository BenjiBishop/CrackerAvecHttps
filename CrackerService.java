import java.util.Scanner;
public class CrackerService {
    public static void main(String args[]) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("choisir 1 pour brute force ou choisir  2 pour l'attaque par dictionaire");
          int val=sc.nextInt();

          if(val==1){
          
            Cracker attack1=new ForceBrute();
            ((ForceBrute) attack1).hack();
          }else{
        Cracker attack2 = new Dictionnaire();
        ((Dictionnaire) attack2).hack();
          }
        }
    }
}