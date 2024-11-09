package md.tekwill.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Micul Print", "Antoine de Saint-Exupéry");
        Book book2 = new Book("De la idei la bani", "Napoleon Hill");
        Book book3 = new Book("Contele de Monte-Cristo", "Alexandre Dumas");

        Library library001 = new Library("Carturesti Mall");
        Library library002 = new Library("Fat Frumos");

        library001.addBook(book1);
        library001.addBook(book1);
        library001.addBook(book1);

        System.out.println(library001.getTotalNumberOfBooks());
        System.out.println(library002.getTotalNumberOfBooks());

        library002.addBook(book1);
        library002.addBook(book2);
        library002.addBook(book3);
        library002.addBooksFromAnotherList(library001.bookList);

        library002.removeBookFromTheStock((book2));

        System.out.println(library002.getTotalNumberOfBooks());

        library002.displayTheBooksTitles();

        Map<String, Library> reteauaDeLibrarii = new HashMap<>();
        reteauaDeLibrarii.put("Arborilor 22/2", library001);
        reteauaDeLibrarii.put("Stefan cel mare 143", library002);

        reteauaDeLibrarii.get("Arborilor 22/2").displayTheBooksTitles();
        reteauaDeLibrarii.get("Stefan cel mare 143").displayTheBooksTitles();


        int[] integers = new int[5];
        integers[0] = 7;
        integers[1] = 8;
        integers[2] = 7;
        integers[3] = 9;
        integers[4] = 7;
        System.out.println(integers.length);
        System.out.println(IntNumberArrayService.maxIntFromArr(integers));
        System.out.println(IntNumberArrayService.arithmeticOutcomeAverage(integers));


    }
}
