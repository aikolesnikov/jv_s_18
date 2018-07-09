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

    public void getBooksSortedByPublisher(){
        libraryView.printBooksSortedByPublisher( library );
    }

    public void getBookInfo( Book book) {
        libraryView.printBook( book );
    }
}
