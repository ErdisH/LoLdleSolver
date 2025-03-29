import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChampDB {
    public static final int CHAMP_QT = 170;
    private Champion[] champList = new Champion[CHAMP_QT];

    public ChampDB(){

    }
    public Champion[] resolveChamps()
    {
        try{
            File champFile = new File("ChampList.txt");
            Scanner fileReader = new Scanner(champFile);
            int i = 0;
            while(fileReader.hasNextLine()) {

                String data = fileReader.nextLine();
                String[] champInfo = data.split(",");
                champList[i] = new Champion(
                        champInfo[0],
                        champInfo[1],
                        champInfo[2],
                        champInfo[3],
                        champInfo[4],
                        champInfo[5],
                        champInfo[6],
                        Integer.parseInt(champInfo[7])
                );

                //System.out.println(i+1+") "+champList[i].toString());
                i++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Didn't find file.");
        }

        return champList;
    }

    public Champion[] getChampList(){
        return this.champList;
    }

}
