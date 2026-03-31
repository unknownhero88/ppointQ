package Day05.MiniLibrarySystem;

public class Main {
    public static void main(String[] args) {
        // Create library, add books, test borrow/return/search
    	Library lib =new Library();
    	Book book1 = new Book("Dune","Frank Herbert", 1965);
    	Book book2 = new Book("The Alchemist","Paulo coelho", 1988);
    	Book book3 = new Book("1984","George Orwell", 1949 );
    	lib.addBook(book1);
    	lib.addBook(book2);
    	lib.addBook(book3);
    	
    	book1.borrow();
    	book1.borrow();
    	
    	System.out.print("Available:");
    	for(Book b:lib.availableBooks())
    	{
    		System.out.print(b.title+" , ");
    	}
    	System.out.println();
    	
    	System.out.println("Search 'orwell': "+lib.search("orwell"));
    }
}
