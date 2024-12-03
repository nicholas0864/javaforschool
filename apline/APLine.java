public class APLine{
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public APLine(double aA, double aB, double aC){
        a = aA;
        b = aB;
        c = aC;
    }

    public double getSlope(){
        double slope = (-a)/(b);
        return slope;
    }

    public boolean isOnLine(double x, double y){
        if ((x * a) + (y * b) + (c) == 0 ){
            return true;
        } else {
            return false;
        }
    }
}