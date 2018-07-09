package controller;

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
}
