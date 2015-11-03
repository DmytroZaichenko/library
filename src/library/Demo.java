package library;

public class Demo {

    public static void main(String[] args) {

        Library library = new Library();
        String author = "J.K. Rowling";
        System.out.println("Author: "+author);

        int numBook = 0;
        for (Book book : library.findByAuthor(author)){
            if (book != null){
                System.out.println(++numBook+": Book: " + book.getName());
            }
        }

        numBook = 0;
        for (Book book : library.findByCategory(Category.FICTION)){
            if (book != null){
                System.out.println(++numBook+": Book: "+book.getName());
            }
        }

        numBook = 0;
        for (Book book : library.findByCategory(Category.FICTION)){
            if (book != null){
                System.out.println(++numBook+": Book: "+book.getName());
            }
        }

    }


}
