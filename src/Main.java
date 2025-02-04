import controllers.LibraryController;
import repositories.ArrayBookRepositoryImpl;
import repositories.ArrayUserRepositoryImpl;
import repositories.BookRepository;
import repositories.UserRepository;
import services.LibraryService;
import services.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new ArrayBookRepositoryImpl();
        UserRepository userRepository = new ArrayUserRepositoryImpl(10);
        LibraryService libraryService = new LibraryServiceImpl(bookRepository, userRepository);
        LibraryController libraryController = new LibraryController(libraryService);
        libraryController.run();
    }
}