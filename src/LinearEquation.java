public class LinearEquation {
    private String xy1;
    private String xy2;
    private int xy1Int;
    private int xy2Int;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int xCoord;
    public LinearEquation(String xy1, String xy2) {
        this.xy1 = xy1;
        this.xy2 = xy2;
    }

    public void getXYDigit(){
        xy1Int = Integer.parseInt(xy1);
        xy2Int = Integer.parseInt(xy2);
    }

    public void getXY(){
        x1 = xy1Int / 10;
        x2 = xy2Int / 10;
        y1 = xy1Int % 10;
        y2 = xy2Int % 10;
    }
}
