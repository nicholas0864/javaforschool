public class Library {
    private String name = null;
    private int capacity = -1;
    private int books = 0;

    public Library(String aName, int aCapacity){
        name = aName;
        capacity = aCapacity;
    }
    public Library(String aName){
        name = aName;
        capacity = 500;
    }

    public String getLibraryName(){
        return name;
    }

    private int getTotalBooks(){
        return books;
    }

    public void addBook(String aTitle, String anAuthor, int aIsbn, int aIsbn2, boolean check){
        Book book = new Book(aTitle, anAuthor, aIsbn, aIsbn2, check);
    }

    public void addBook(String aTitle, String anAuthor){
        Book book = new Book(aTitle, anAuthor);
        books ++;
    }

   


}
