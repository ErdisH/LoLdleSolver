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
        Champion champ = new Champion("Talon", "Male", "Middle", "Human", "Mana",
                "Melee", "Noxus", 2011);


        while(!found) {
            System.out.println("Enter your guess");
            champGuess = scan.nextLine();

            System.out.println("Enter result (cwp) = correct, wrong, partial, write all 7 fields. Enter f if found");
            answer = scan.nextLine();

            if(answer.equals("f")){
                break;
            }

            for(int i = 0; i < ChampDB.CHAMP_QT; i++){
                if(champList[i].getName().equals(champGuess)){
                    System.out.println("new champ is " + champList[i].getName());
                    champ = champList[i];
                    break;
                }
            }

            for(int i = 0; i < STAT_NUMBER; i++){
                if(answer.charAt(i) == 'c'){
                   if(i == 1){
                       cs.addToRightList(champ.getGender(), i);
                   }
                   else if(i == 2){
                       cs.addToRightList(champ.getPosition(), i);
                   }
                   else if(i == 3){
                       cs.addToRightList(champ.getSpecies(), i);
                   }
                   else if(i == 4){
                       cs.addToRightList(champ.getResource(), i);
                   }
                   else if(i == 5){
                       cs.addToRightList(champ.getRangeType(), i);
                   }
                   else if(i == 6){
                       cs.addToRightList(champ.getRegion(), i);
                   }
                   else if(i == 7){
                       cs.addToRightList(String.valueOf(champ.getReleaseYear()), i);
                   }
                }
                else if(answer.charAt(i) == 'p'){

                }
                else if(answer.charAt(i) == 'w'){
                    if(i == 0){
                        cs.addToWrongList(champ.getName(), i);
                    }
                    if(i == 1){
                        cs.addToWrongList(champ.getGender(), i);
                    }
                    else if(i == 2){
                        cs.addToWrongList(champ.getPosition(), i);
                    }
                    else if(i == 3){
                        cs.addToWrongList(champ.getSpecies(), i);
                    }
                    else if(i == 4){
                        cs.addToWrongList(champ.getResource(), i);
                    }
                    else if(i == 5){
                        cs.addToWrongList(champ.getRangeType(), i);
                    }
                    else if(i == 6){
                        cs.addToWrongList(champ.getRegion(), i);
                    }
                    else if(i == 7){
                        cs.addToWrongList(String.valueOf(champ.getReleaseYear()), i);
                    }
                }
            }

            cs.getValidChamps();


        }

        System.out.println("Yay we got it!");


    }

}