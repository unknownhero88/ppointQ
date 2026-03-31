package Day05.MiniLibrarySystem;

import java.util.*;

class Book {
    String title, author;
    int year;
    boolean isBorrowed;

    Book(String title, String author, int year) {
        // TODO: set fields, isBorrowed = false
    	this.title=title;
    	this.author=author;
    	this.year=year;
    	this.isBorrowed=false;
    }
    void borrow() { 
    	if(isBorrowed)
    	{
    		System.out.println("Already borrowed!");
    	}else {
    		this.isBorrowed=true;
    		System.out.println(toString());
    		System.out.println("Borrowed: "+this.title);
    	}
    }
    void returnBook() {
    	if(!isBorrowed)
    	{
    		System.out.println("Already returned!");
    	}else {
    		this.isBorrowed=false;
    		System.out.println("Retuened : "+this.title);
    	}
    }

    public String toString() {
        // return "Dune (Frank Herbert, 1965) [Available]"
        return title+" ("+author+", "+year+") ["+(isBorrowed?"Borrowed":"Available")+"]";
    }
}

