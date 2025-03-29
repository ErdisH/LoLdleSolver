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

    public void addToWrongList(String itemToAdd, int index){
        switch (index) {
            case 0:
                if(!wrongNames.contains(itemToAdd)) {
                    wrongNames.add(itemToAdd);
                }
                break;
            case 1:
                if(!wrongGender.contains(itemToAdd)) {
                    wrongGender.add(itemToAdd);
                }
                break;
            case 2:
                if(!wrongPositions.contains(itemToAdd)) {
                    wrongPositions.add(itemToAdd);
                }
                break;
            case 3:
                if(!wrongSpecies.contains(itemToAdd)) {
                    wrongSpecies.add(itemToAdd);
                }
                break;
            case 4:
                if(!wrongRessource.contains(itemToAdd)) {
                    wrongRessource.add(itemToAdd);
                }
                break;
            case 5:
                if(!wrongRangeType.contains(itemToAdd)) {
                    wrongRangeType.add(itemToAdd);
                }
                break;
            case 6:
                if(!wrongRegion.contains(itemToAdd)) {
                    wrongRegion.add(itemToAdd);
                }
                break;
            case 7:
                if(!wrongYear.contains(itemToAdd)) {
                    System.out.println("trying to add bad year " + itemToAdd);
                    wrongYear.add(itemToAdd);
                }
                break;
        }
    }

    public void addToRightList(String itemToAdd, int index){
        switch (index) {
            case 1:
                if(!correctGender.contains(itemToAdd)) {
                    correctGender.add(itemToAdd);
                }
                break;
            case 2:
                if(!correctPosition.contains(itemToAdd)) {
                    correctPosition.add(itemToAdd);
                }
                break;
            case 3:
                if(!correctSpecies.contains(itemToAdd)) {
                    correctSpecies.add(itemToAdd);
                }
                break;
            case 4:
                if(!correctRessource.contains(itemToAdd)) {
                    correctRessource.add(itemToAdd);
                }
                break;
            case 5:
                if(!correctRangeType.contains(itemToAdd)) {
                    correctRangeType.add(itemToAdd);
                }
                break;
            case 6:
                if(!correctRegion.contains(itemToAdd)) {
                    correctRegion.add(itemToAdd);
                }
                break;
            case 7:
                if(!correctYear.contains(itemToAdd)) {
                    correctYear.add(itemToAdd);
                }
                break;
        }
    }

    public void suggestChamps(Champion[] validChamps){
        System.out.println("List of champs valid for next guess");

        for(Champion c : validChamps){
            System.out.println(c);
        }
    }

    public Champion[] getValidChamps(){
        Champion[] validChamps = new Champion[ChampDB.CHAMP_QT];
        int i = 0;

        for(Champion c : champList){
            if(isChampValid(c))
            {
                validChamps[i++] = c;
            }
        }

        suggestChamps(validChamps);

        return validChamps;
    }

    public boolean isChampValid(Champion champ){
        for(Champion c : champList) {
            if(!wrongNames.contains(c.getName())){
                if(!wrongGender.contains(c.getGender()))
                    if(!wrongPositions.contains(c.getPosition())){
                        if(!wrongSpecies.contains(c.getSpecies())){
                            if(!wrongRessource.contains(c.getResource())){
                                if(!wrongRangeType.contains(c.getRangeType())){
                                    if(!wrongYear.contains(String.valueOf(c.getReleaseYear()))){
                                        return true;
                                    }
                                }
                            }
                        }
                    }
            }
        }
        return false;
    }
}
