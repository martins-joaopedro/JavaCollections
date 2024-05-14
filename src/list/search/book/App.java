package list.search.book;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        BookCatalog catalog = new BookCatalog();
        
        catalog.addBook("A Bússola de Ouro", "Philip Pullman", 1995);
        catalog.addBook("A Faca Sutil", "Philip Pullman", 1997);
        catalog.addBook("A Luneta de Âmbar", "Philip Pullman", 2000);
        catalog.addBook("Arquitetura Limpa", "Robert C. Martin", 2019);
        catalog.addBook("Código Limpo", "Robert C. Martin", 2009);

        System.out.println("BUSCA POR AUTOR: ");
        ArrayList<Book> books = catalog.findByAuthor("Philip Pullman");
        for(Book b : books)
            System.out.println(b.toString());
        books.clear();

        books = catalog.findByAuthor("Robert C. Martin");
        for(Book b : books)
            System.out.println(b.toString());
        books.clear();
        
        System.out.println("BUSCA POR TÍTULOS: ");
        Book b1 = catalog.findByTitle("A Bússola de Ouro");
        if(b1 != null)
            System.out.println(b1.toString());

        Book b2 = catalog.findByTitle("A Bússola de Prata");
        if(b2 != null)
            System.out.println(b2.toString());
            
        System.out.println("BUSCA POR ANO: ");
        books = catalog.searchByYearInterval(1997, 2000);
        for(Book b : books)
            System.out.println(b.toString());
        books.clear();

        books = catalog.searchByYearInterval(2009, 2024);
        for(Book b : books)
            System.out.println(b.toString());
        books.clear();

    }
}
