package com.jamesladdcode.east;

import java.io.FileWriter;
import java.io.PrintWriter;

class      ExampleMoviesClientFileAdaptor 
extends    ExampleMoviesClientAdaptor 
implements MoviesClient {

	public ExampleMoviesClientFileAdaptor(String filename) {

		try {
			
			writer(new PrintWriter(new FileWriter(filename)));
			
		} catch (Exception e) { /* ignore for this example */ } 
	}
}
