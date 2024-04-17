package org.example.wishlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//Ovenstående er så man kan teste sit CSS og køre app uden at have lavet datasource
@SpringBootApplication()

public class WishListApplication {

    public static void main(String[] args) {
        SpringApplication.run(WishListApplication.class, args);
    }

}
