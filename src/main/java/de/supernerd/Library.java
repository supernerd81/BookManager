package de.supernerd;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[0];
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {

        Book[] books = new Book[this.books.length+1];

        int counter = 0;
        for(Book obj : this.books) {
            books[counter] = obj;
            counter++;
        }

        books[counter] = book;
        this.books = books;
    }
}
