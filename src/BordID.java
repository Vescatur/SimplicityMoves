/**
 * Created by Ivan on 12-9-2016.
 */
public class BordID {
    int parts[][];
    public  String id = "|";
    public boolean remove = false;

    public BordID(int[][] partsT){
        parts = partsT;
        for(int i = parts.length-1;i>=0;i--) {
            id += parts[i][0];
            id += parts[i][1];
            id += "|";
        }
    }

    public boolean IsCollide() {
        int[][] field = new int[Bord.SizeX][Bord.SizeY];
        for(int x = Bord.SizeX-1;x>=0;x--) {
            field[x] = new int[Bord.SizeY];
            for(int y = Bord.SizeY-1;y>=0;y--) {
                field[x][y] = 0;

            }
        }
        for(int i = parts.length-1;i>=0;i--) {

            for(int s = Bord.parts[i].shape.length-1;s>=0;s--) {

                int x = Bord.parts[i].shape[s][0]+parts[i][0];
                int y = Bord.parts[i].shape[s][1]+parts[i][1];
                if(x >= Bord.SizeX) {
                    //System.out.println("x");
                    return true;
                }
                if(y >= Bord.SizeY){
                    //System.out.println("y");
                    return true;
                }
                if(field[x][y] == 1) {
                    //System.out.println("field");
                    return true;
                }else {
                    field[x][y] = 1;
                }
            }
        }
        return false;
    }
}
