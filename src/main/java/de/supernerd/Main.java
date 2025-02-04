package de.supernerd;

public class Main {
    public static void main(String[] args) {


        Book ostfriesennebel = new Book();
        ostfriesennebel.setTitle("Ostfriesennebel");
        ostfriesennebel.setAuthor("Ann Kathrin Klaasen");
        ostfriesennebel.setIsbn("9783596720217");

        Book schlussMitStress = new Book();
        schlussMitStress.setTitle("Schluss mit Stress");
        schlussMitStress.setAuthor("Rainer Kapellen");
        schlussMitStress.setIsbn("3987551070");

        Book erfolgreichUnternehmerDummies = new Book();
        erfolgreichUnternehmerDummies.setTitle("Erfolgreich als Unternehmer für Dummies");
        erfolgreichUnternehmerDummies.setAuthor("Jan Evers");
        erfolgreichUnternehmerDummies.setIsbn("3527719229");

        Book[] books = { ostfriesennebel, schlussMitStress, erfolgreichUnternehmerDummies };

        Library library = new Library();
        //library.setBooks(books);
        library.addBook(erfolgreichUnternehmerDummies);
        library.addBook(schlussMitStress);

        System.out.println(library);
    }
}
