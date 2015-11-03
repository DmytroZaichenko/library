package library;

public class Library {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private Book[][] booksByName;
    private Book[][] booksByAuthor;
    private Book[][] booksByCategory;

    public int getLastPositionCategory() {
        return lastPositionCategory;
    }

    public void setLastPositionCategory(int lastPositionCategory) {
        this.lastPositionCategory = lastPositionCategory;
    }

    private int lastPositionCategory = 0;

    public Library() {

        booksByName = new Book[26][];
        fillDictionary(booksByName);

        booksByAuthor = new Book[26][];
        fillDictionary(booksByAuthor);

        booksByCategory = new Book[26][];
        fillDictionary(booksByCategory);

        createBooks();
}

    private void fillDictionary(Book[][] dictionary){
        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = new Book[10];
        }
    }

    private Book[] findByString(String objectOfFind, Book[][] arrayOfSearch){

        Book[] tmpBook = new Book[10];
        int idx = 0;

        int position = alphabet.indexOf(objectOfFind.charAt(0));

        for (int j = 0; j < arrayOfSearch[position].length; j++) {
            tmpBook[idx++] = arrayOfSearch[position][j];
        }

        return tmpBook;
    }

    public Book[] findByName(String name){

        Book[] tmpBook = findByString(name,booksByName);
        return tmpBook;
    }

    public Book[] findByAuthor(String name){

        Book[] tmpBook = findByString(name, booksByAuthor);
        return tmpBook;
    }

    public Book[] findByCategory(Category category){

        Book[] tmpBook = new Book[10];

        int idx = 0;
        int lastPosition = getLastPositionCategory();

        int position = category.getId();
        if (lastPosition > booksByCategory[position].length){
            return tmpBook;
        }

        for (int j = lastPosition; j < booksByCategory[position].length; j++) {
            tmpBook[idx++] = booksByCategory[position][j];

            if (idx == 4){
                lastPosition = ++j;
                break;
            }
        }

        setLastPositionCategory(lastPosition);
        return tmpBook;

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
        Book book = new Book("If you love","Courney Cole",Category.FICTION);
        addToLibrary(book);

        book = new Book("To Kill a Mockingbird","Harper Lee",Category.FICTION);
        addToLibrary(book);

        book = new Book("The Great Gatsby","F. Scott Fitzgerald",Category.FICTION);
        addToLibrary(book);

        book = new Book("The Hunger Games","Suzanne Collins",Category.FICTION);
        addToLibrary(book);

        book = new Book("Animal Farm","George Orwell",Category.FICTION);
        addToLibrary(book);

        book = new Book("The Call of the Wild","F. Scott Fitzgerald",Category.FICTION);
        addToLibrary(book);

        book = new Book("The Joy of Cooking","Jack London",Category.FOOD);
        addToLibrary(book);

        book = new Book("The Fannie Farmer Cookbook: Anniversary","Fannie Merritt Farmer,",Category.FOOD);
        addToLibrary(book);

        book = new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling",Category.FANTASY);
        addToLibrary(book);
        book = new Book("Harry Potter and the Prisoner of Azkaban","J.K. Rowling",Category.FANTASY);
        addToLibrary(book);

        book = new Book("The Sword of Summer","Rick Riordan",Category.FANTASY);
        addToLibrary(book);

        book = new Book("Ready for Brand New Beat","Mark Kurlansky",Category.HISTIRY);
        addToLibrary(book);

    }



}
