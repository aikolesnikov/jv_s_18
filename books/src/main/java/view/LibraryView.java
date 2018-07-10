package view;

import model.Book;
import model.Library;
import utils.LibraryUtils;

import java.util.Comparator;

public class LibraryView {
    public String getLibraryView( Library library ) {
        if ( library == null ) {
            return null;
        }

        return library.toString();
    }

    public String getBookView( Book book ) {
        if ( book != null ) {
            book.toString();
        }
        return "";
    }

    public String getBooksSortedByPublisherView( Library library ) {
        if ( library != null ) {
            Comparator<Book> bookComparator = Comparator.comparing( Book::getPublisher );
            return  LibraryUtils.sortBookList(
                    library.getBookList(),
                    bookComparator
            ).toString();
        }
        return "";
    }

    public String getBooksOfAuthorView( String author, Library library ) {
        StringBuilder sb = new StringBuilder( "" );
        if ( ( library != null ) && ( author != null ) && !( author.isEmpty() ) ) {
            for ( Book b :
                    library.getBookList() ) {
                if ( ( b.getAuthor() != null ) && ( author.equals( b.getAuthor() ) ) ) {
                    sb.append( b.toString() );
                }
            }
        }
        return sb.toString();
    }

    public String getBooksOfPublisherView( String publisher, Library library ) {
        StringBuilder sb = new StringBuilder( "" );

        if ( ( library != null ) && ( publisher != null ) && !( publisher.isEmpty() ) ) {
            for ( Book b :
                    library.getBookList() ) {
                if ( ( b.getPublisher() != null ) && ( publisher.equals( b.getPublisher() ) ) ) {
                    sb.append( b.toString() );
                }
            }
        }
        return sb.toString();
    }

    public String getBooksPublishedearlierThanYearView( int Year, Library library ) {
        StringBuilder sb = new StringBuilder( "" );
        if ( library != null ) {
            for ( Book b : library.getBookList() ) {
                if ( b.getYear() > Year ) {
                    sb.append( b.toString() );
                }
            }
        }
        return sb.toString();
    }
}
