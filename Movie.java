
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String Title;
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        Title = "";
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int l) {
        rating = l;
    }
    public void setTitle(String T) {
        Title = T;
    }
    public String getTitle(){
        return Title;
    }
}
