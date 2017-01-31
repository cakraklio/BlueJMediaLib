
/**
 * Write a description of class Song here.
 * 
 * @author (Cameron Kraklio) 
 * @version (1/20/2017)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int Rating;
    private String title;
    private double price;
    private boolean favorite;
    private double totalPrice;
    private int numSongs;
    private int totalRatings;
    private double avgPrice;
    
    public Song()
    {
        // initialise instance variables
        Rating = 0;
        title = "";
        price = 0.0;
        totalPrice = 0.0;
        numSongs = 0;
        totalRatings = 0;
    }
    public String getTitle () {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return Rating;
    }
    public void setRating(int R) {
        Rating = R;
    }
    public double getPrice () {
        return price;
    }
    public void setPrice(String p) {
        title = p;
    }
    public void addToFavorites() {
        favorite = true;
    }
    public Song(String title, double price, int Rating) {
        this.title = title;
        this.price = price;
        this.Rating = Rating;
    }
    public void setTotalPrice(double C) {
        totalPrice = C;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    
}
