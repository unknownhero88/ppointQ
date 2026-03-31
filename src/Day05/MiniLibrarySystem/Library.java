package Day05.MiniLibrarySystem;

import java.util.ArrayList;


class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) { 
    	books.add(b);
    }

    ArrayList<Book> search(String keyword) {
    	ArrayList<Book> searchedBook=new ArrayList<>();
        // return books where keyword is in title OR author (case-insensitive)
    	for(Book b:books)
    	{
    		if(b.title.toLowerCase().contains(keyword.toLowerCase()))
    		{
    			searchedBook.add(b);
    		}
    		if(b.author.toLowerCase().contains(keyword.toLowerCase()))
    		{
    			searchedBook.add(b);
    		}
    	}
        return searchedBook;
    }

    ArrayList<Book> availableBooks() {
        // return books where isBorrowed == false
    	ArrayList<Book> availableBooks = new ArrayList<>();
    	for(Book b:books)
    	{
    		if(!b.isBorrowed)
    		{
    			availableBooks.add(b);
    		}
    	}
    	return availableBooks;
    }
}

