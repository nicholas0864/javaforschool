public class Netflix{
    private String title = null;
    private double rating = 0;

    public Netflix(String aTitle){
        title = aTitle;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(){
        rating = 4.0;
    }
    public void setRating(double newRating){
        rating = newRating;
    }

    public boolean isPopular(){
        if (rating >= 4){
            return true;
        } else { 
            return false;}
    }

    public boolean isPopular(boolean promoted){
        if (promoted == true && rating > 2){
            return true; 
        } else {
            return false;
        }
    }

    public String toString(){
        return "Movie: " + title + "; Rating: " + rating +" Stars";
    }

}

