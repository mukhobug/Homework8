public class Library {
    private final Book[] library;

    public Library(int size) {
        library = new Book[size];
    }

    public void addBook(Book name) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = name;
                return;
            }
        }
    }

    public void libraryFullBookName() {
        for (Book book : library) {
            if (book != null) {
                System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": " + book.getName() + ": " + book.getPublishYear());
            }
        }
    }

    public void findName(String name) {
        for (Book book : library) {
            if (name.equals(book.getName())) {
                System.out.printf("%s by %s %s was published in %d", book.getName(), book.getAuthor().getFirstName(), book.getAuthor().getLastName(), book.getPublishYear());
                return;
            }
        }
    }

    public void findNameAndChangeYear(String name, int year) {
        for (Book book : library) {
            if (name.equals(book.getName())) {
                book.setPublishYear(year);
                System.out.printf("\nBook year changed (don't try to rewrite history): %d", book.getPublishYear());
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder net = new StringBuilder("Library:");
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                net.append("\nBook ").append(i+1).append(library[i]);
            }
        }
        return net.toString();
    }
}
