package ObserverWithMVC;

import java.awt.print.Book;

public class LibraryController {
    private LibModel model;
    public LibraryController(LibModel model) {
        this.model = model;
    }
    public void addBook(String book) {
        model.addBook(book);
    }
}
