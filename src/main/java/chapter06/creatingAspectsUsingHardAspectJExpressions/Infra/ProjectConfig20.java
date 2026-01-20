package chapter06.creatingAspectsUsingHardAspectJExpressions.Infra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"chapter06.creatingAspectsUsingAspectJ.Services", "chapter06.creatingAspectsUsingAspectJ.Infra"})
@EnableAspectJAutoProxy
public class ProjectConfig20 {
}
