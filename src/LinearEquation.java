import java.util.Scanner;
public class LinearEquation {
    Scanner s = new Scanner(System.in);
    private String xy1;
    private String xy2;
    private int xy1Int;
    private int xy2Int;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private double slope;
    private double yIntercept;

    private int xCoord;
    private String form;
    public double distance;
    public LinearEquation(String xy1, String xy2) {
        this.xy1 = xy1;
        this.xy2 = xy2;
    }

    public void getXY(){
        x1 = Integer.parseInt(xy1.substring(1,xy1.indexOf(",")));
        x2 = Integer.parseInt(xy2.substring(1,xy2.indexOf(",")));
        y1 = Integer.parseInt(xy1.substring(xy1.indexOf(",") + 1, xy1.indexOf(")")));
        y2 = Integer.parseInt(xy2.substring(xy2.indexOf(",") + 1, xy2.indexOf(")")));
    }

    public double slope(){
        slope = (y2-y1)/(x2-x1);
        return slope;
    }

    public double yIntercept(){
        yIntercept = y2 - slope * x2;
        return yIntercept;
    }

    public String slopeInterceptForm(){
        form = "y = " + slope + "x +" + yIntercept;
        return form;
    }

    public double distance(){
        distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return distance;
    }

    public double findY(int x){
        double y = slope * x + yIntercept;
        return y;
    }

    public void equationRunner(){
        getXY();
        slope();
        yIntercept();
        slopeInterceptForm();
        distance();
    }
    public void getX(int x){
        xCoord = x;
        System.out.println("Solved coordinate point is: (" + xCoord + "," + findY(xCoord) + ")");
    }
    public String toString() {
        equationRunner();
        String statement = "Slope of the line: " + slope + "\nY-Intercept: " + yIntercept + "\nSlope Intercept Form: " + form +"\nDistance Between Points: " + distance;
        return statement;
    }
}
