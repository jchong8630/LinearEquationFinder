import java.util.Scanner;
public class LinearEquation {
    Scanner s = new Scanner(System.in);

    //Variables
    private String xy1;
    private String xy2;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private double slope;
    private double yIntercept;

    private double xCoord;
    private String form;
    private double distance;

    //Constructor that accepts ((x1,y1),(x2,y2)
    public LinearEquation(String xy1, String xy2) {
        this.xy1 = xy1;
        this.xy2 = xy2;
    }

    //Parses through the coordinates to extract the x and y values
    public void getXY(){
        x1 = Integer.parseInt(xy1.substring(1,xy1.indexOf(",")));
        x2 = Integer.parseInt(xy2.substring(1,xy2.indexOf(",")));
        y1 = Integer.parseInt(xy1.substring(xy1.indexOf(",") + 1, xy1.indexOf(")")));
        y2 = Integer.parseInt(xy2.substring(xy2.indexOf(",") + 1, xy2.indexOf(")")));
    }

    //Finds Slope
    public double slope(){
        slope = (double)(y2-y1)/(x2-x1);
        return slope;
    }

    //Find Y -Intercept
    public double yIntercept(){
        yIntercept = y2 - slope * x2;
        return yIntercept;
    }

    //Finds Slope Intercept Form
    public String slopeInterceptForm(){
        form = "y = " + String.format("%.2f",slope) + "x +" + String.format("%.2f",yIntercept);
        if (slope == 0) {
            form = "y = " + String.format("%.2f",yIntercept);
        }
        return form;
    }

    //Finds the distance between the two points
    public double distance(){
        distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return distance;
    }

    //Finds the Y-Value for the inputed X-Value
    public double findY(double x){
        double y = slope * x + yIntercept;
        return y;
    }

    //Runs methods to store the data in each given variable
    public void equationRunner(){
        getXY();
        slope();
        yIntercept();
        slopeInterceptForm();
        distance();
    }

    //Takes the inputed X-Value and calls the findY method
    public void getCoord(double x){
        xCoord = x;
        System.out.println("Solved coordinate point is: (" + xCoord + "," + String.format("%.2f",findY(xCoord)) + ")");
    }

    //Displays the information about the linear equation
    public String toString() {
        equationRunner();
        String statement = "Slope of the line: " + String.format("%.2f",slope) + "\nY-Intercept: " + String.format("%.2f",yIntercept) + "\nSlope Intercept Form: " + form +"\nDistance Between Points: " + String.format("%.2f",distance);
        return statement;
    }
}
