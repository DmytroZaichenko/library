package library;

public class Library {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private Book[][] booksByName;
    private Book[][] booksByAuthor;
    private Book[][] booksByCategory;

    public Library() {

        booksByName = new Book[26][];
        fillDictionary(booksByName);

        booksByAuthor = new Book[26][];
        fillDictionary(booksByAuthor);

        booksByCategory = new Book[26][];
        fillDictionary(booksByCategory);

        createBooks():

    }

    private void fillDictionary(Book[][] dictionary){
        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = new Book[10];
        }
    }

    public Book[] findByAuthor(String name){
        return new Book[0];
    }

    public Book[] findByCategory(Category category){
        return booksByCategory[category.getId()];
    }

    private void addToLibrary(Book book){

        int position = alphabet.indexOf(book.getName().charAt(0));
        addToStorage(booksByName[position], book);

        position = alphabet.indexOf(book.getAuthor().charAt(0));
        addToStorage(booksByAuthor[position], book);

        addToStorage(booksByCategory[book.getCategory().getId()], book);
    }


    private void addToStorage(Book[] storage, Book book){
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null){
                storage[i] = book;
                return;
            }
        }
    }

    private void createBooks(){
        Book book = new Book();

    }



}
