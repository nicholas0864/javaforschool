import java.util.Scanner;


public class ExtraLife {

    Scanner userInput = new Scanner(System.in);

    private double donationAmt = 0.0;
    private String donorName = null ;
    private String donorMessage = null;
    private boolean willPayExtra = false;

    public ExtraLife(double aDonationAmt, String aDonorName, String aDonorMessage){
        donationAmt = aDonationAmt;
        donorName = aDonorName;
        donorMessage = aDonorMessage;
    }
    public ExtraLife(double aDonationAmt, String aDonorName){
        donationAmt = aDonationAmt;
        donorName = aDonorName;
    }
    public ExtraLife(double aDonationAmt){
        donationAmt = aDonationAmt;
        donorName = "Anonymous";
    }
    public void coverServiceFee(boolean willCover){
        if (willCover == true){
            donationAmt += 3.50;
            willPayExtra = true;
        } else {
            willPayExtra = false;
        }
    }
    public void coverServiceFee(){
        System.out.println("How much extra would you like to donate?");
        double amtExtra = userInput.nextDouble();
        willPayExtra = true;
        donationAmt += amtExtra;
    }
    public double getDonation(){
        return donationAmt;
    }
    public String getName(){
        return donorName;
    }
    public String getMessage(){
        return donorMessage;
    }
    public String toString(){
        String output = "Thank you, " + donorName + ", for your donation of " + donationAmt;
        if (willPayExtra == true) {
            output += " and for covering the service fee.";
        }
        return output;
    }
}
