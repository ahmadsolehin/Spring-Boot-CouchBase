package com.couchbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.couchbase")
public class CouchbaseTutorialApplication
{
   public static void main(String[] args)
   {
      SpringApplication.run(CouchbaseTutorialApplication.class, args);
   }
}
