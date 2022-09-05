public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Author oneAuthor = new Author("A Pimp", "Named Slickback");
        Author twoAuthor = new Author("Pepe", "Clown");
        Book oneBook = new Book("First Book Ever", oneAuthor, 1999);
        Book twoBook = new Book("Second Book Ever", twoAuthor, 9999);
        twoBook.setPublishYear(1704);
        Book[] arr = new Book[6];
        addBook(arr, oneBook);
        addBook(arr, twoBook);
        fullBookName(arr);
        Library da = new Library(9);
        da.addBookToLibrary(oneBook);
        da.addBookToLibrary(twoBook);
        da.libraryFullBookName();
        da.findName("First Book Ever");
        da.findNameAndChangeYear("Second Book Ever", 1234);
    }

    public static void addBook(Book[] array, Book name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = name;
                return;
            }
        }
    }

    public static void fullBookName(Book[] array) {
        for (Book book : array) {
            if (book != null) {
                System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": " + book.getName() + ": " + book.getPublishYear());
            }
        }
    }
}