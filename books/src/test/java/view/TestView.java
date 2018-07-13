package view;

import model.Book;
import model.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestView {

    private Logger log = Logger.getLogger( this.getClass().getName());
    private Library library;

    @Before
    public void prepareData(){
        log.info( "Preparing list of books." );
        Book b1 = new Book( "BookName1", "Author1", "Publisher2", 1970, 20, 300 );
        Book b2 = new Book( "BookName2", "Author1", "Publisher1", 1960, 100, 560 );
        Book b3 = new Book( "BookName3", "Author2", "Publisher2", 1995, 50, 60 );
        Book b4 = new Book( "BookName4", "Author3", "Publisher3", 2017, 1000, 1560 );

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add( b1 );
        bookList1.add( b2 );
        bookList1.add( b3 );
        bookList1.add( b4 );

        this.library = new Library( "Library1_Name", bookList1 );
    }

    @Test
    public void testLibraryView() {
        LibraryView libraryView = new LibraryView();
        Assert.assertEquals(libraryView.getLibraryView( library ),"Library{name='Library1_Name'" +
                ", bookList=[Book{name='BookName1', author='Author1', publisher='Publisher2', year=1970, pages=20, price=300}, " +
                "Book{name='BookName2', author='Author1', publisher='Publisher1', year=1960, pages=100, price=560}, Book{name='BookName3', " +
                "author='Author2', publisher='Publisher2', year=1995, pages=50, price=60}, Book{name='BookName4', author='Author3', " +
                "publisher='Publisher3', year=2017, pages=1000, price=1560}]}");
    }

}
