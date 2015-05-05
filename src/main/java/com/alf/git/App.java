package com.alf.git;

import org.kohsuke.github.*;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repo = gitHub.getRepository("");
        GHRepository ghRepository = new GHRepository();
        System.out.println( "Hello World!" + gitHub.toString() );
    }
}
