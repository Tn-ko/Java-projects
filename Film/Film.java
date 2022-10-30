package Film;
import java.util.ArrayList;
public class Film {
    public String name;
    public ArrayList<String> genre = new ArrayList<>();
    public Double rating;
    public void displayInfo() {
        System.out.printf( name + "\n");
        System.out.printf("Жанр: " + genre + "\n");
        System.out.printf("Рейтинг: " + rating + "\n");
    }
}
