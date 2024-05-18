package ObserverWithMVC;

public class LibView implements Observer{
    private LibModel model;
    public LibView(LibModel model){
        this.model = model;
        model.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Library currently has the following books: ");
        for (String book : model.getBooks()) {
            System.out.println(book);
        }

    }
}
