package utils;

import model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryUtils {

    public static List<Book> sortBookList( List<Book> bookList,
                                               Comparator<Book> bookComparator) {

        List<Book> tmpBookList = new ArrayList<>( bookList);

        if ((bookList != null) && (bookComparator != null)) {
            tmpBookList.sort(bookComparator);
        }

        return tmpBookList;
    }

}
