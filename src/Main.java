import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 12-9-2016.
 */
public class Main {
    static public Bord bord;
    List<BordID> bordIds;

    public Main() {
        bord = new Bord();
        bordIds = new ArrayList<BordID>();
        LoopBordId(new int[Bord.parts.length][2], Bord.parts.length, 0);
        RemoveCollidedBords();
        PrintBordIds();
    }

    public void LoopBordId(int[][] parts,int NumberOfParts,int counter){
        for(int y = Bord.SizeY-1;y>=0;y--) {
            for (int x = Bord.SizeX-1; x >= 0; x--) {
                int[][] newParts = parts.clone();
                newParts[counter] = new int[] {x,y};
                if(counter+1==NumberOfParts) {
                    bordIds.add(new BordID(newParts));
                }else {
                    LoopBordId(newParts,NumberOfParts,counter+1);
                }
            }
        }
    }

    public void RemoveCollidedBords() {
        for(int i = bordIds.size()-1;i>=0;i--) {
            BordID bord = bordIds.get(i);
            bord.remove = bord.IsCollide();
        }
    }

    public void PrintBordIds() {
        System.out.println("----------------");
        int counter = 0;
        for(int i = bordIds.size()-1;i>=0;i--) {
            BordID bord = bordIds.get(i);
            if(!bord.remove) {
                counter++;
                //System.out.println(bord.id);
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

}
