package view;

import model.Book;
import model.Library;
import utils.LibraryUtils;

import java.util.Comparator;

public class LibraryView {
    public void printLibraryItems( Library library ) {
        System.out.println( library.toString() );
    }

    public void printBook( Book book ) {
        System.out.println( book.toString() );
    }

    public void printBooksSortedByPublisher( Library library ) {
        Comparator<Book> bookComparator =
                Comparator.comparing( Book::getPublisher );

        System.out.println( LibraryUtils.sortBookList(
                library.getBookList(),
                bookComparator
        ) );
    }

}
