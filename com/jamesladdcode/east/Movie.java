package com.jamesladdcode.east;

import java.io.PrintWriter;

interface Movie {
	
	void ifDirectedByDo(String director, MovieAction action);
	
	void ifTitleDo(String title, MovieAction action);
	
	void printOn(PrintWriter stream);
}
