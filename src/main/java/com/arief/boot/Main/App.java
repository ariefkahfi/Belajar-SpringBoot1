package com.arief.boot.Main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Arief on 8/16/2017.
 */
@SpringBootApplication
@ComponentScan("com.arief.boot.Controllers")
public class App implements CommandLineRunner{



    public static void main(String[]x){
        SpringApplication.run(App.class,x);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

