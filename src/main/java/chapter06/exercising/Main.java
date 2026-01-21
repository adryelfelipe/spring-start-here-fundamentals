package chapter06.exercising;

import chapter06.exercising.Infrastructure.Configuration.ProjectConfig22;
import chapter06.exercising.Models.Book;
import chapter06.exercising.Services.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig22.class);
        BookService bookService = context.getBean(BookService.class);
        Book book = new Book("BookTop", "Adryel Sapelli");
        bookService.publishBook(book);
    }
}
