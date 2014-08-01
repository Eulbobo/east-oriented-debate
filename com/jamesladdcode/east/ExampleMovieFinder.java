package com.jamesladdcode.east;

class ExampleMovieFinder implements MovieFinder {

	private static final Movie[] movies = {
		
		new ExampleMovie("StarWars", "George Lucus"),
		new ExampleMovie("Lost Highway", "David Lynch"),
		new ExampleMovie("Naked Lunch", "David Cronenberg"),
		new ExampleMovie("Mulholland Dr", "David Lynch"),
		new ExampleMovie("The Adventures of Buckaroo Banzai Across the 8th Dimension", "W.D.Richter"),
		new ExampleMovie("Wild At Heart", "David Lynch")
	};
	
	public void findAllAndApply(MovieAction selector) {

		for (int i = 0; i < movies.length; i++) {
			
			selector.applyTo(movies[i]);
		}
	}
}
