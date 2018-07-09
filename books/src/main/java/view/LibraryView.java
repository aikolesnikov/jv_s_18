package view;

import model.Book;
import model.Library;

public class LibraryView {
    public void printLibraryItems( Library library ) {
        System.out.println(library.toString());
    }

    public void printBook ( Book book){
        System.out.println(book.toString());
    }
}
