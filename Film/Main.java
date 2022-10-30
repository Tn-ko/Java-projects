package Film;
import java.util.ArrayList;
import java.util.Scanner;
// пользователь вводит любые 3 жанра и получает фильм, совпадающий с введенными жанрами
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listGenre = new ArrayList<>();
        listGenre.add("Drama");
        listGenre.add("Crime");
        listGenre.add("Fantasy");
        listGenre.add("Historical");
        listGenre.add("Biography");
        listGenre.add("Detective");
        listGenre.add("Comedy");

        Film Green_Mile = new Film();
        Green_Mile.name = "GreenMile";
        Green_Mile.genre.add("Fantasy");
        Green_Mile.genre.add("Crime");
        Green_Mile.genre.add("Drama");
        Green_Mile.rating = 0.0;

        Film The_Hangover = new Film();
        The_Hangover.name = "The Hangover";
        The_Hangover.genre.add("Comedy");
        The_Hangover.rating = 0.0;

        Film Fences = new Film();
        Fences.name = "Fences";
        Fences.genre.add("Drama");
        Fences.genre.add("Historical");
        Fences.rating = 0.0;

        Film Catch_Me_If_You_Can = new Film();
        Catch_Me_If_You_Can.name = "Catch Me If You Can";
        Catch_Me_If_You_Can.genre.add("Comedy");
        Catch_Me_If_You_Can.genre.add("Biography");
        Catch_Me_If_You_Can.genre.add("Detective");
        Catch_Me_If_You_Can.rating = 0.0;

        Film The_Pursuit_of_Happyness = new Film();
        The_Pursuit_of_Happyness.name = "The Pursuit of Happyness";
        The_Pursuit_of_Happyness.genre.add("Biography");
        The_Pursuit_of_Happyness.genre.add("Drama");
        The_Pursuit_of_Happyness.rating = 0.0;

        System.out.println("Оцените фильмы:");

        System.out.println(The_Pursuit_of_Happyness.name);
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            double str1 = Double.parseDouble(scanner.nextLine());
            The_Pursuit_of_Happyness.rating += str1;

            System.out.println(Green_Mile.name);
            double str2 = Double.parseDouble(scanner.nextLine());
            Green_Mile.rating += str2;

            System.out.println(Catch_Me_If_You_Can.name);
            double str3 = Double.parseDouble(scanner.nextLine());
            Catch_Me_If_You_Can.rating += str3;

            System.out.println(Fences.name);
            double str4 = Double.parseDouble(scanner.nextLine());
            Fences.rating += str4;

            System.out.println(The_Hangover.name);
            double str5 = Double.parseDouble(scanner.nextLine());
            The_Hangover.rating += str5;

            System.out.println("Выберите до трёх жанров из списка:" + listGenre);
            String genre = scanner.nextLine();
            String genre2 = scanner.nextLine();
            String genre3 = scanner.nextLine();

            if ((genre.equals(Fences.genre.get(0)) && genre2.equals(Fences.genre.get(1)) ||
                    genre.equals(Fences.genre.get(1)) && genre2.equals(Fences.genre.get(0))) && Fences.rating > 0 ) {
                System.out.print("Возможно, вам подойдёт фильм:\n");
                Fences.displayInfo();

            } else if ((genre.equals(The_Pursuit_of_Happyness.genre.get(0)) && genre2.equals(The_Pursuit_of_Happyness.genre.get(1))
                    || genre.equals(The_Pursuit_of_Happyness.genre.get(1)) && genre2.equals(The_Pursuit_of_Happyness.genre.get(0)))
                    && The_Pursuit_of_Happyness.rating > 0) {
                System.out.print("Возможно, вам подойдёт фильм:\n");
                The_Pursuit_of_Happyness.displayInfo();

            } else if ((genre.equals(Catch_Me_If_You_Can.genre.get(0)) && genre2.equals(Catch_Me_If_You_Can.genre.get(1)) && genre3.equals(Catch_Me_If_You_Can.genre.get(2))
                    || genre.equals(Catch_Me_If_You_Can.genre.get(0)) && genre2.equals(Catch_Me_If_You_Can.genre.get(2)) && genre3.equals(Catch_Me_If_You_Can.genre.get(1))
                    || genre.equals(Catch_Me_If_You_Can.genre.get(1)) && genre2.equals(Catch_Me_If_You_Can.genre.get(2)) && genre3.equals(Catch_Me_If_You_Can.genre.get(0))
                    || genre.equals(Catch_Me_If_You_Can.genre.get(1)) && genre2.equals(Catch_Me_If_You_Can.genre.get(0)) && genre3.equals(Catch_Me_If_You_Can.genre.get(1))
                    || genre.equals(Catch_Me_If_You_Can.genre.get(2)) && genre2.equals(Catch_Me_If_You_Can.genre.get(0)) && genre3.equals(Catch_Me_If_You_Can.genre.get(1))
                    || genre.equals(Catch_Me_If_You_Can.genre.get(2)) && genre2.equals(Catch_Me_If_You_Can.genre.get(1)) && genre3.equals(Catch_Me_If_You_Can.genre.get(0)))
                    && Catch_Me_If_You_Can.rating > 0) {
                System.out.print("Возможно, вам подойдёт фильм:\n");
                Catch_Me_If_You_Can.displayInfo();

            } else if ((genre.equals(Green_Mile.genre.get(0)) && genre2.equals(Green_Mile.genre.get(1))  && genre3.equals(Green_Mile.genre.get(2))
                    || genre.equals(Green_Mile.genre.get(0)) && genre2.equals(Green_Mile.genre.get(2)) && genre3.equals(Green_Mile.genre.get(1))
                    || genre.equals(Green_Mile.genre.get(1)) && genre2.equals(Green_Mile.genre.get(2)) && genre3.equals(Green_Mile.genre.get(0))
                    || genre.equals(Green_Mile.genre.get(1)) && genre2.equals(Green_Mile.genre.get(0)) && genre3.equals(Green_Mile.genre.get(2))
                    || genre.equals(Green_Mile.genre.get(2)) && genre2.equals(Green_Mile.genre.get(0))&& genre3.equals(Green_Mile.genre.get(1))
                    || genre.equals(Green_Mile.genre.get(2)) && genre2.equals(Green_Mile.genre.get(1)) && genre3.equals(Green_Mile.genre.get(0)))
                    && Green_Mile.rating > 0) {
                System.out.print("Возможно, вам подойдёт фильм:\n");
                Green_Mile.displayInfo();

            } else if (genre.equals(The_Hangover.genre.get(0)) || genre2.equals(The_Hangover.genre.get(0)) && The_Hangover.rating > 0) {
                System.out.print("Возможно, вам подойдёт фильм:\n");
                The_Hangover.displayInfo();
            } else {
                System.out.println("Ваши вкусы не совпадают с нашими алгоритмами");
            }
        }
    }
}


