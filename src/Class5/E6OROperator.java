package Class5;

public class E6OROperator {
    public static void main(String[] args) {

        String genre="thriller";
        if(genre.equals("thriller")||genre.equals("HORROR")||genre.equals("Sci-Fi")){
            System.out.println("I am going to watch this movie!");
        } else {
            System.out.println("I don't like this genre");
        }
    }
}
