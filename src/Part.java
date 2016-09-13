/**
 * Created by Ivan on 12-9-2016.
 */
public class Part {
    //x,y
    int[][] shape;
    int Ypositions;
    int Xpositions;

    public Part(int[][] shapeT){
        shape = shapeT;

        Ypositions = Bord.SizeY - GetLength(1);
        Xpositions = Bord.SizeX - GetLength(0);
    }

    public int GetLength(int Selector) {
        int max = 0;
        for(int i = shape.length -1;i>=0;i--) {
            max = Math.max(max, shape[i][Selector]);
        }
        return max;
    }

}
