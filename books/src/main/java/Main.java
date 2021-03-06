import controller.LibraryController;
import model.Book;
import model.Library;
import utils.Splitter;
import utils.SystemUtils;
import view.LibraryView;

import java.util.ArrayList;
import java.util.List;

/**
 *  Created by kaim on 6/30/18.
 */
public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("BookName1", "Author1", "Publisher2", 1970, 20, 300);
        Book b2 = new Book("BookName2", "Author1", "Publisher1", 1960, 100, 560);
        Book b3 = new Book("BookName3", "Author2", "Publisher2", 1995, 50, 60);
        Book b4 = new Book("BookName4", "Author3", "Publisher3", 2017, 1000, 1560);

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add(b1);
        bookList1.add(b2);
        bookList1.add(b3);
        bookList1.add(b4);

        Library library = new Library("Library1_Name", bookList1);
        LibraryView libraryView = new LibraryView();
        LibraryController libraryController = new LibraryController(library, libraryView);

        // 1. Получить список книг указанного автора;
        // System.out.println("Books by author:");
        // libraryController.printBooksByAuthor( "Author1", library);

        // 2. Получить список книг, которые изданы указанным издательством;
        // System.out.println("Books by Publisher:");
        // libraryController.printBooksByPublisher( "Publisher2", library);

        // 3. Получить список книг, изданных позже указанного года.
        // System.out.println("Books published earlier than:");
        // libraryController.getBooksPublishedEarlierThan (1995, library);

        // 4. Упорядочить книги по издательствам
        // System.out.println("Books sorted by Publisher:");
        // libraryController.getBooksSortedByPublisher();

        library.getBookList().get(0).setRawText("It should be some text here.");
        try {
            library.getBookList().get(1).setRawText(SystemUtils.readFile(
                    "/home/kaim/prog/jv/jv_s_18/books/src/main/resources/text.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // System.out.println(b2.getRawText());
        // System.out.println( Arrays.toString( Splitter.splitTextIntoStringWords( b2.getRawText() ) ));
        String[] sAr = Splitter.splitTextIntoStringTokens(b2.getRawText());
        for (String s : sAr) {
            System.out.print(s);
        }
    }
}
