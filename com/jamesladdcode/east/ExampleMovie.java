package com.jamesladdcode.east;

import java.io.PrintWriter;

class ExampleMovie implements Movie {

	private final String title;
	private final String director;

	public ExampleMovie(String title, String director) {
		
		this.title = title;
		this.director = director;
	}

	public void ifDirectedByDo(String director, MovieAction action) {
		
		if (this.director.equals(director))
			action.applyTo(this);
	}
	
	public void ifTitleDo(String title, MovieAction action) {
		
		if (this.title.equals(title))
			action.applyTo(this);
	}
	
	public void printOn(PrintWriter writer) {
		
		writer.print("Movie (");
		writer.print("title: '");
		writer.print(title);
		writer.print("', director: '");
		writer.print(director);
		writer.println("')");
		
		writer.flush();
	}
}
