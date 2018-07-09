package view;

import model.Library;

public class LibraryView {
    public void printLibraryItems( Library library ) {
        System.out.println(library.toString());
    }
}
