import java.util.ArrayList;

public class ClassicSolver {
    ChampDB db = new ChampDB();
    Champion[] champList = db.resolveChamps();
    ArrayList<String> wrongNames = new ArrayList<String>();
    ArrayList<String> wrongGender = new ArrayList<String>();
    ArrayList<String> wrongPositions = new ArrayList<String>();
    ArrayList<String> wrongSpecies = new ArrayList<String>();
    ArrayList<String> wrongRessource = new ArrayList<String>();
    ArrayList<String> wrongRangeType = new ArrayList<String>();
    ArrayList<String> wrongRegion = new ArrayList<String>();
    ArrayList<String> wrongYear = new ArrayList<String>();
    ArrayList<String> correctGender = new ArrayList<String>();
    ArrayList<String> correctPosition = new ArrayList<String>();
    ArrayList<String> correctSpecies = new ArrayList<String>();
    ArrayList<String> correctRessource = new ArrayList<String>();
    ArrayList<String> correctRangeType = new ArrayList<String>();
    ArrayList<String> correctRegion = new ArrayList<String>();
    ArrayList<String> correctYear = new ArrayList<String>();

    ArrayList<String> remainingChamps = new ArrayList<String>();

    public ClassicSolver(){
        for(Champion c : champList){
            remainingChamps.add(c.getName());
        }
    }

    public void suggestChamps(){
        System.out.println("List of champs valid for next guess");

        for(String c : remainingChamps){
            System.out.println(c);
        }
    }

    public void getValidChamps(String champGuessed, String answer){
        removeInvalidChampions(champGuessed,answer);

        suggestChamps();
    }

    private void removeInvalidChampions(String champGuessed,String answer) {
        Champion champ = getChampion(champGuessed);

        if(remainingChamps.contains(champGuessed)){
            remainingChamps.remove(champGuessed);
        }

        for(Champion c : champList){
            if(!isChampGenderValid(c.getName(),champ.getGender(),answer.charAt(1))){
                remainingChamps.remove(c.getName());
            }
            if(!isChampPositionValid(c.getName(),champ.getPosition(),answer.charAt(2))){
                remainingChamps.remove(c.getName());
            }
            if(!isChampSpeciesValid(c.getName(),champ.getSpecies(),answer.charAt(3))){
                remainingChamps.remove(c.getName());
            }
            if(!isChampResourceValid(c.getName(),champ.getResource(),answer.charAt(4))){
                remainingChamps.remove(c.getName());
            }
            if(!isChampRangeTypeValid(c.getName(),champ.getRangeType(),answer.charAt(5))){
                remainingChamps.remove(c.getName());
            }
            if(!isChampRegionValid(c.getName(),champ.getRegion(),answer.charAt(6))){
                remainingChamps.remove(c.getName());
            }
            if(!isChampYearValid(c.getName(),String.valueOf(champ.getReleaseYear()),answer.charAt(7), answer.charAt(8))){
                remainingChamps.remove(c.getName());
            }
        }
    }

    public boolean isChampGenderValid(String champ, String guess, char output){

        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                if(output == 'c'){
                    if(c.getGender().equals(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'p'){
                    if(c.getGender().contains(guess) || c.getGender().contains(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(c.getGender().contains(guess)){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isChampPositionValid(String champ, String guess, char output){
        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                if(output == 'c'){
                    if(c.getPosition().equals(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'p'){
                    if(c.getPosition().contains(guess) || guess.contains(c.getPosition())){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(c.getPosition().contains(guess)){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isChampSpeciesValid(String champ, String guess, char output){

        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                if(output == 'c'){
                    if(c.getSpecies().equals(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'p'){
                    if(c.getSpecies().contains(guess) || guess.contains(c.getSpecies())){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(c.getSpecies().contains(guess)){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isChampResourceValid(String champ, String guess, char output){

        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                if(output == 'c'){
                    if(c.getResource().equals(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'p'){
                    if(c.getResource().contains(guess) || guess.contains(c.getResource())){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(c.getResource().contains(guess)){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isChampRangeTypeValid(String champ, String guess, char output){

        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                if(output == 'c'){
                    if(c.getRangeType().equals(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'p'){
                    if(c.getRangeType().contains(guess) || guess.contains(c.getRangeType())){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(c.getRangeType().contains(guess)){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isChampRegionValid(String champ, String guess, char output){

        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                if(output == 'c'){
                    if(c.getRegion().equals(guess) || guess.contains(c.getRegion())){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'p'){
                    if(c.getRegion().contains(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(c.getRegion().contains(guess)){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isChampYearValid(String champ, String guess, char output, char overUnder){
        for(Champion  c : champList){
            if(c.getName().equals(champ)){
                int champYear = c.getReleaseYear();
                int guessInteger = Integer.parseInt(guess);
                if(output == 'c'){
                    if(c.getRegion().equals(guess)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else if(output == 'w'){
                    if(overUnder == 'o'){
                        if(champYear < guessInteger){
                            return false;
                        }
                        else {
                            return true;
                        }
                    }
                    else if((overUnder == 'u')){
                        if(champYear > guessInteger){
                            return false;
                        }
                        else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public Champion getChampion(String champ){
        for(int i = 0; i <champList.length; i++ ){
            if(champList[i].getName().equals(champ)){
                return champList[i];
            }
        }
        return null;
    }
}
