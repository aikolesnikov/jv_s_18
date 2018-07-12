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
        System.out.println(libraryView.getLibraryView( library ));
    }
    public void printBookInfo( Book book) {
        System.out.println(libraryView.getBookView( book ));
    }
    public void printBooksByAuthor( String author, Library library){
        System.out.println(libraryView.getBooksOfAuthorView( author, library));
    }
    public void printBooksByPublisher( String publisher, Library library){
        System.out.println(libraryView.getBooksOfPublisherView( publisher, library));
    }
    public void getBooksPublishedEarlierThan( int Year, Library library){
        System.out.println(libraryView.getBooksPublishedearlierThanYearView( Year, library));
    }
    public void getBooksSortedByPublisher(){
        System.out.println(libraryView.getBooksSortedByPublisherView( library ));
    }
}
