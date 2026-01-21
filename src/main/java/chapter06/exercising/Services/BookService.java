package chapter06.exercising.Services;

import chapter06.exercising.Application.Annotations.ToServiceLog;
import chapter06.exercising.Models.Book;
import chapter06.exercising.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class BookService {
    // Attributes
    private BookRepository bookRepository;
    private Logger logger = Logger.getLogger(BookService.class.getName());

    // Constructor
    public BookService(@Qualifier("bookRepositoryImpl") BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Methods
    @ToServiceLog
    public void publishBook(Book book) {
        logger.info("Publishing the book: " + book.getName());
        bookRepository.saveBook(book);
    }
}
