package flowers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableJpaRepositories(basePackages = "flowers.repositories")
//@EntityScan(basePackages = "flowers.entities")
@SpringBootApplication
public class FlowersApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowersApplication.class, args);

//        try {
//            Class.forName("org.postgresql.Driver");
//            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//            System.out.println("Driver loaded successfully");
//            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("Driver not found");
//        }

    }


}
