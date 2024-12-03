public class LibraryTester {
    public static void main(String[] args) {
        // Create a library with a name and capacity of 3 books
        Library myLibrary = new Library("Central Library", 3);

        // Display the name of the library
        System.out.println("Library Name: " + myLibrary.getLibraryName());

        // Add books to the library
        myLibrary.addBook("The Great Gatsby", "F. Scott Fitzgerald", 123456789, 987654321, false);
        myLibrary.addBook("1984", "George Orwell", 111222333, 444555666, false);
        myLibrary.addBook("To Kill a Mockingbird", "Harper Lee", 777888999, 555666777, false);

        // Attempt to add another book to a full library
        System.out.println("\nAttempting to add more books to a full library:");
        myLibrary.addBook("Moby Dick", "Herman Melville", 123987456, 987654123, false);

        // Create some book objects and demonstrate checking out a book
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 456123789, 987654321, false);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen");

        // Check out a book
        System.out.println("\nChecking out 'The Catcher in the Rye':");
        book1.checkOutBook();  // Should check out successfully
        book1.checkOutBook();  // Should show that it's already checked out

        // Reset book information
        System.out.println("\nResetting book 'Pride and Prejudice':");
        book2.reset(book2);  // Reset book details to default

        // Display book details after reset
        System.out.println("Book Title: " + book2.getTitle());
        System.out.println("Book Author: " + book2.getAuthor());
        System.out.println("Book ISBN1: " + book2.getIsbn1());
        System.out.println("Book ISBN2: " + book2.getIsbn2());
        System.out.println("Book Checked Out: " + book2.isCheckedOut());
    }
}
