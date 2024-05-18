package ObserverWithMVC;

public class MVCLibraryDemo {
    public static void main(String[] args) {
        LibModel model = new LibModel();
        LibView view = new LibView(model);
        LibraryController controller = new LibraryController(model);

        controller.addBook("1984");
        controller.addBook("To Kill a Mockingbird");
        controller.addBook("The Great Gatsby");


    }
}
