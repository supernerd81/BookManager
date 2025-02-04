package de.supernerd;

import java.util.Arrays;

public class Library {
    private Book[] books;

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
