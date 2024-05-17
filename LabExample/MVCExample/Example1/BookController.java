package Example1;

public class BookController {
    private Bookm model;
    private BookView view;

    public BookController(Bookm model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public String getBookTitle(){
        return model.getTitle();
    }
    public void setBookTitle(String title){
        model.setTitle(title);
    }
    public String getBookAuthor(){
        return model.getAuthor();
    }
    public void setBookAuthor(String author){
        model.setAuthor(author);
    }

    public double getBookPrice(){
        return model.getPrice();
    }
    public void setBookPrice(double price){
        model.setPrice(price);
    }
    public void updateView(){
        view.printBookDetails(model.getTitle(), model.getAuthor(),model.getPrice());
    }
}
