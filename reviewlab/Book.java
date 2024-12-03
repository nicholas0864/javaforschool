public class Book{
    private String title = null;
    private String author = null;
    private int isbn1 = -1;
    private int isbn2 = -1;
    private boolean isCheckedOut = false;
    private int def = 111111;

    public Book(String aTitle, String anAuthor, int aIsbn, int aIsbn2, boolean check){
        title = aTitle;
        author = anAuthor;
        isbn1 = aIsbn;
        isbn2 = aIsbn2;
        isCheckedOut = check;
    }

    public Book(){
        title = null;
        author = null;
        isbn1 = 0;
        isbn2 = 0;
        isCheckedOut = false;
    }

    public Book(String aTitle, String anAuthor){
        title = aTitle;
        author = anAuthor;
        isbn1 = def;
        isbn2 = def;
        isCheckedOut = false;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getIsbn1(){
        return isbn1;
    }

    public int getIsbn2(){
        return isbn2;
    }

    public boolean isCheckedOut(){
        return isCheckedOut;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setIsbn1(int isbn1) {
        this.isbn1 = isbn1;
    }
    
    public void setIsbn2(int isbn2) {
        this.isbn2 = isbn2;
    }
    
    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public void checkOutBook() {
        if (!isCheckedOut) {
            this.setCheckedOut(true);  // Mark the book as checked out
            System.out.println("The book '" + title + "' has been checked out.");
        } else {
            System.out.println("The book '" + title + "' is already checked out.");
        }
    }

    public void reset(Book aBook) {
        aBook.setTitle(null);
        aBook.setAuthor(null);
        aBook.setIsbn1(0);
        aBook.setIsbn2(0);
        aBook.setCheckedOut(false);
    }
    public void reset(boolean check, Book aBook){
        aBook.setCheckedOut(check);
    }




}