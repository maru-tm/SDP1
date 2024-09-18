package org.example.Ass0for5per;

import org.example.Ass0for5per.Book;
import org.example.Ass0for5per.Formatter;

public class JsonFormatter implements Formatter {
    @Override
    public String format(Book book) {
        return "{ \"title\": \"" + book.getTitle() + "\", \"author\": \"" + book.getAuthor() + "\", \"isbn\": \"" + book.getIsbn() + "\" }";
    }
}
