package com.java.app;

import java.util.regex.Pattern;

import com.java.app.decorator.DecoratorPattern;
import com.java.app.factory.FactoryPattern;

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

        // DesignPattern pattern = new DecoratorPattern();
        DesignPattern pattern = new FactoryPattern();

        pattern.run();
        

    }
}
