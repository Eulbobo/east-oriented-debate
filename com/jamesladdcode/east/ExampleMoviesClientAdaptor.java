package com.jamesladdcode.east;

import java.io.PrintWriter;

abstract class ExampleMoviesClientAdaptor {

	private PrintWriter writer;

	public void add(Movie movie) {
		
		movie.printOn(writer);
	}
	
	protected void writer(PrintWriter writer) {
		
		this.writer = writer;
	}
}