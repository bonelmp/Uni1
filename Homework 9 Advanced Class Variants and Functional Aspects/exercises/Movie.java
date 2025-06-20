package exercises;

import java.util.ArrayList;
import java.util.Comparator;

public class Movie {
	String title;
	double rating;
	int year;

	public Movie(String title, double rating, int year) {
		this.title = title;
		this.rating = rating;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("Force Awakens", 8.3, 2015));
		movieList.add(new Movie("Star Wars", 8.7, 1977));
		movieList.add(new Movie("Empire Strikes Back", 8.8, 1980));
		movieList.add(new Movie("Avengers Infinity War", 9.0, 2018));
		movieList.add(new Movie("Avengers Endgame", 9.0, 2019));
		movieList.add(new Movie("Guardians of the Galaxy", 10.0, 2014));

		movieList.stream().filter(m -> m.getRating() >= 8.5).sorted(
				Comparator.comparing(Movie::getTitle).thenComparing(Comparator.comparing(Movie::getRating).reversed()))
				.forEach(System.out::println);

	}
}
