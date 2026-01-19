package chapter04.infrastructure;

import chapter04.proxies.CommentNotificationProxy;
import chapter04.proxies.EmailCommentNotificationProxy;
import chapter04.repositories.CommentRepository;
import chapter04.repositories.DBCommentRepository;
import chapter04.services.CommentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chapter04.proxies", "chapter04.repositories", "chapter04.services"})
public class ProjectConfiguration {
    /*
    Using this approach for creating and managing beans(even tough/even if they're implementing an interfance) would also function

    @Bean
    DBCommentRepository dbCommentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    EmailCommentNotificationProxy emailCommentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    CommentService commentService(@CommentRepository repository,
                                  @Qualifier("EMAIL") CommentNotificationProxy proxy) {
        return new CommentService(proxy, repository);
    }

    */
}
