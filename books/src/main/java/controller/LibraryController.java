package controller;

import model.Book;
import model.Library;
import view.LibraryView;

public class LibraryController {
    private Library library;
    private LibraryView libraryView;

    public LibraryController( Library library, LibraryView libraryView ) {
        this.library = library;
        this.libraryView = libraryView;
    }

    public void getLibraryInfo() {
        libraryView.printLibraryItems( library );
    }
    public void getBookInfo( Book book) {
        libraryView.printBook( book );
    }
    public void getBooksByAuthor (String author, Library library){
        libraryView.printBooksOfAuthor( author, library);
    }
    public void getBooksByPublisher (String publisher, Library library){
        libraryView.printBooksOfPublisher ( publisher, library);
    }
    public void getBooksPublishedYearlierThan (int Year, Library library){
        libraryView.printBooksPublishedYearlierThan ( Year, library);
    }
    public void getBooksSortedByPublisher(){
        libraryView.printBooksSortedByPublisher( library );
    }
}
