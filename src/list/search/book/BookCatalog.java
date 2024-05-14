package list.search.book;

import java.util.ArrayList;

public class BookCatalog {
    
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author, int yearReleased) {
        books.add(new Book(author, title, yearReleased));
    }

    public ArrayList<Book> findByAuthor(String author) {
        System.out.println("Busca por: " + author);
        ArrayList<Book> search = new ArrayList<>();
        for(Book b : books) 
            if(b.getAuthor() == author)
                search.add(b);

        return search;
    }

    public ArrayList<Book> searchByYearInterval(int start, int end) {
        
        ArrayList<Book> search = new ArrayList<>();
        for(Book b : books)
            if(b.getYearReleased() >= start && b.getYearReleased() <= end )
                search.add(b);
        
        return search;
    }

    public Book findByTitle(String title) {
        try {
            for(Book b : books) 
                if(b.getTitle() == title)
                    return b;
            throw new BookNotFoundException();

        } catch(BookNotFoundException e) {
            System.out.println("Nenhum livro com o título: " + title + " foi encontrado!");
            return null; 
        }
    }

}
