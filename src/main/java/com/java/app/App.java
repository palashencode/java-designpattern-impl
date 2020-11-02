package com.java.app;

import java.util.regex.Pattern;

import com.java.app.decorator.DecoratorPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Java Design Pattern Implementations" );
        System.out.println( "===================================" );

        // Design Pattern to execute.
        // DESIGNPATTERN pattern = DESIGNPATTERN.DECORATOR;

        DesignPattern pattern = new DecoratorPattern();
        pattern.run();
        

    }
}
