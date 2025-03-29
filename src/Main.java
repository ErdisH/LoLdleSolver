import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChampDB chDB = new ChampDB();
        boolean found = false;
        final int STAT_NUMBER = 8;
        String champGuess = "";
        String answer = "";
        Champion[] champList = chDB.resolveChamps();
        ClassicSolver cs = new ClassicSolver();


        while(!found) {
            System.out.println("Enter your guess");
            champGuess = scan.nextLine();

            System.out.println("Enter result (cwp) = correct, wrong, partial, write all 7 fields. Enter f if found");
            answer = scan.nextLine();

            if(answer.equals("f")){
                break;
            }

            cs.getValidChamps(champGuess,answer);

        }

        System.out.println("Yay we got it!");


    }

}

