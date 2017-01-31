
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String Title;
    public Book()
    {
        // initialise instance variables
        rating = 0;
        Title = ""; 
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String T) {
        Title = T;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
}
