import controller.LibraryController;
import model.Book;
import model.Library;
import view.LibraryView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaim on 6/30/18.
 */
public class Main {

    public static void main( String[] args ) {
        Book b1 = new Book( "BookName1", "Author1", "Publisher2", 1970, 20, 300 );
        Book b2 = new Book( "BookName2", "Author1", "Publisher1", 1975, 100, 560 );

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add( b1 );
        bookList1.add( b2 );

        Library library = new Library( "Library1_Name", bookList1 );
        LibraryView libraryView = new LibraryView();
        LibraryController libraryController = new LibraryController( library, libraryView );

        libraryController.getLibraryInfo();
        System.out.println("-----------------------------------");
        libraryController.getBooksSortedByPublisher();
    }
}
