public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
//        Author oneAuthor = new Author("A Pimp", "Named Slickback");
//        Author twoAuthor = new Author("Pepe", "Clown");
//        Book oneBook = new Book("First Book Ever", oneAuthor, 1999);
//        Book twoBook = new Book("Second Book Ever", twoAuthor, 9999);
//        twoBook.setPublishYear(1704);
//        Book[] arr = new Book[6];
//        addBook(arr, oneBook);
//        addBook(arr, twoBook);
////        fullBookName(arr);
//        Library da = new Library(9);
//        da.addBookToLibrary(oneBook);
//        da.addBookToLibrary(twoBook);
//////        da.libraryFullBookName();
//////        da.findName("First Book Ever");
//////        da.findNameAndChangeYear("Second Book Ever", 1234);
////        System.out.println(oneBook);
////        System.out.println(twoBook);
////        System.out.println(oneBook.equals(twoBook));
////        System.out.println(oneBook.hashCode());
////        System.out.println(twoBook.hashCode());
//        System.out.println(da);
        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);
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