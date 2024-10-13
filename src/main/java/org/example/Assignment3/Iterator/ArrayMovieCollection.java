package org.example.Assignment3.Iterator;

// Коллекция фильмов, хранящихся в массиве (Array).
public class ArrayMovieCollection {
    private String[] movies;

    public ArrayMovieCollection(String[] movies) {
        this.movies = movies;
    }

    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}