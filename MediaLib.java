
/**
 * Write a description of class MediaLib here.
 * 
 * @author Cameron Kraklio
 * @version 1/18/2017
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song("Leroy Brown",.99,5);
        //Song.numSongs+=1;
        System.out.println(song1);
        
        Song song2 = new Song("song 2",.99,3);
        System.out.println(song2);
        
        Song song3 = new Song("song 3",1.29,4);
        System.out.println(song3);
        
        Song song4 = new Song("song 4",.99,5);
        System.out.println(song4);
        
        Song song5 = new Song("song 5",.99,1);
        System.out.println(song5);
        
        Song song6 = new Song("song 6",1.29,2);
        System.out.println(song6);
        
        Song song7 = new Song("song 7",.99,3);
        System.out.println(song7);
        
        Song song8 = new Song("song 8",1.29,5);
        System.out.println(song8);
        
        //Song.totalPrice= song1.getPrice() + song2.getPrice() + song3.getPrice() + song4.getPrice() + song5.getPrice() + song6.getPrice() + song7.price() + song8.price();
        
        //Song.avgPrice = totalPrice / numSongs;
        
        
        
        
        Book book1 = new Book();
        book1.setTitle("Hardy Boys");
        System.out.println(book1.getTitle());
        book1.setRating(5);
        System.out.println(book1.getRating());
        Movie movie1 = new Movie();
        movie1.setTitle("Cool Hand Luke");
        System.out.println(movie1.getTitle());
        movie1.setRating(5);
        System.out.println(movie1.getRating());
    }

}