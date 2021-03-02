package javafundamentals;

public class Application{

    public static void main(String[] args) {

        Book book = new Book("Chemistry","123",20,"Sumita");

        System.out.println("\n State of Books is :" + book.Name+book.Author+book.ISBN+book.pages);

        int count= book.getCountBooks();

        System.out.println("\n Count of books is : " + count);

    }
}
