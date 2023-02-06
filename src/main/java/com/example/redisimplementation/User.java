package com.example.redisimplementation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /*
        Agenda of the class
        there is 2 method to connect redis to Spring boot application
        1> lettuce method
        2> Jedis method

        approach ----
         configuration class
         lettuce factory
         redis template

     */

    private int id;
    private String name;
    private String country;
    private String age;
}
