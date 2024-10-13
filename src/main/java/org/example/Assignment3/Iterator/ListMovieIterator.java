package org.example.Assignment3.Iterator;

import java.util.List;

// Итератор для обхода фильмов, хранящихся в списке (List).
public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position = 0;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.size();
    }

    @Override
    public String next() {
        return hasNext() ? movies.get(position++) : null;
    }
}