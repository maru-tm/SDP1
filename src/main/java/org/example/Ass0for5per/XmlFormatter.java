package org.example.Ass0for5per;

import org.example.Ass0for5per.Book;
import org.example.Ass0for5per.Formatter;

public class XmlFormatter implements Formatter {
    @Override
    public String format(Book book) {
        return "<book><title>" + book.getTitle() + "</title><author>" + book.getAuthor() + "</author><isbn>" + book.getIsbn() + "</isbn></book>";
    }
}
