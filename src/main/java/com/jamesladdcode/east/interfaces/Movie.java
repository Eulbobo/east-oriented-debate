package com.jamesladdcode.east.interfaces;

import java.io.PrintWriter;

public interface Movie {

	void doActionWithDirector(String director, MovieAction action);

	void doActionWithTitle(String title, MovieAction action);

	void printOn(PrintWriter stream);
}
