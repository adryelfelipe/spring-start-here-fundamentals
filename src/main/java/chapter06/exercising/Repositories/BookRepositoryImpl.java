package chapter06.exercising.Repositories;

import chapter06.exercising.Models.Book;

import java.util.logging.Logger;

public class BookRepositoryImpl implements BookRepository {
    // Attribures
    private Logger logger = Logger.getLogger(BookRepositoryImpl.class.getName());

    // Methods
    @Override
    public void saveBook(Book book) {
        logger.info("Saving the book data...");
    }
}
