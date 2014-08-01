package com.jamesladdcode.east;

import java.io.PrintStream;
import java.io.PrintWriter;

class      ExampleMoviesClientConsoleAdaptor 
extends    ExampleMoviesClientAdaptor 
implements MoviesClient {

	public ExampleMoviesClientConsoleAdaptor(PrintStream out) {
		
		writer(new PrintWriter(out));
	}
}
