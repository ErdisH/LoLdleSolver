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
            System.out.println("Enter your guess (enter f to end or if found)");
            champGuess = scan.nextLine();

            if(champGuess.equals("f")){
                break;
            }

            cs.getValidChamps(champGuess,guessDialog());

        }

        System.out.println("Yay we got it!");


    }

    public static String guessDialog(){
        Scanner scan = new Scanner(System.in);
        String answer = "";
        String nextAnswer = "";

        System.out.println("Was champion correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;
        if(answer.equals("c"))
            return "cccccccco";

        System.out.println("Was gender correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        System.out.println("Was role correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        System.out.println("Was species correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        System.out.println("Was resource correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        System.out.println("Was range type correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        System.out.println("Was region correct? (c = correct, w = wrong, p = partial");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        System.out.println("Was year correct? (co = correct, wo = wrong-over, wu = wrong-under");
        nextAnswer = scan.nextLine();
        answer+=nextAnswer;

        return answer;
    }

}

