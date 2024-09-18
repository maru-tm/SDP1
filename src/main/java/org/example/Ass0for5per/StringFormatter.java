package org.example.Ass0for5per;

import org.example.Ass0for5per.Book;
import org.example.Ass0for5per.Formatter;

public class StringFormatter implements Formatter {
    @Override
    public String format(Book book) {
        return "Book Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn();
    }
}
