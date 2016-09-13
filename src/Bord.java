/**
 * Created by Ivan on 12-9-2016.
 */
public class Bord {
    static public int SizeX = 4;
    static public int SizeY = 4;
    static public Part[] parts;

    public Bord(){
        parts = new Part[4];

        parts[0] = new Part(new int[][] {{0,0},{0,1}});
        parts[1] = new Part(new int[][] {{0,0},{1,0}});
        parts[2] = new Part(new int[][] {{0,0},{0,1},{1,0}});
        parts[3] = new Part(new int[][] {{0,0},{0,1},{1,0}});

    }
}
