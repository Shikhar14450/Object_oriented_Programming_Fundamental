
// Access Modifiers - EBook
class EBook extends BookLibrary {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void display() {
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title + ", Format: " + format);
    }
}
