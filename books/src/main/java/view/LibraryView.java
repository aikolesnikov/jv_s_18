package view;

import model.Book;
import model.Library;
import utils.LibraryUtils;

import java.util.Comparator;

public class LibraryView {
    public void printLibraryItems( Library library ) {
        if ( library != null ) {
            System.out.println( library.toString() );
        }
    }

    public void printBook( Book book ) {
        if ( book != null ) {
            System.out.println( book.toString() );
        }
    }

    public void printBooksSortedByPublisher( Library library ) {
        if ( library != null ) {
            Comparator<Book> bookComparator = Comparator.comparing( Book::getPublisher );
            System.out.println( LibraryUtils.sortBookList(
                    library.getBookList(),
                    bookComparator
            ) );
        }
    }

    public void printBooksOfAuthor( String author, Library library ) {
        if ( ( library != null ) && ( author != null ) && !( author.isEmpty() ) ) {
            for ( Book b :
                    library.getBookList() ) {
                if ( ( b.getAuthor() != null ) && ( author.equals( b.getAuthor() ) ) ) {
                    System.out.println( b );
                }
            }
        }
    }

    public void printBooksOfPublisher( String publisher, Library library ) {
        if ( ( library != null ) && ( publisher != null ) && !( publisher.isEmpty() ) ) {
            for ( Book b :
                    library.getBookList() ) {
                if ( ( b.getPublisher() != null ) && ( publisher.equals( b.getPublisher() ) ) ) {
                    System.out.println( b );
                }
            }
        }
    }

    public void printBooksPublishedYearlierThan( int Year, Library library ) {
        if ( library != null ) {
            for ( Book b : library.getBookList() ) {
                if ( b.getYear() > Year ) {
                    System.out.println( b );
                }
            }
        }
    }
}
