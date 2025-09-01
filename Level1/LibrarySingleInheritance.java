// Problem 4: Library Management (Single Inheritance)
// NOTE: The prompt suggests 'Author' as a subclass of 'Book' which is not a perfect 'is-a' fit.
// Implemented to match the exercise; in real systems prefer composition (Book has-an Author).
class Book {
    protected String title;
    protected int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book { // per exercise spec
    private String name;
    private String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ") | Author: " + name + " | Bio: " + bio);
    }
}

public class LibrarySingleInheritance {
    public static void main(String[] args) {
        Author a = new Author("Java Essentials", 2024, "RK Singh", "Teaches programming and writes tech books.");
        a.displayInfo();
    }
}
