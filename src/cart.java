import java.awt.List;
import java.util.ArrayList;

import Book.Book;

public class cart {
	private ArrayList<Book>  book;     
	private double Price; 
	private int Count; 
	
	public cart() {
		book=new ArrayList<Book>();
		Price=0.0;
		Count=0;
	}


public void addBook(String string,double i, int j) {
	Book b=new Book(string,i,j);
	book.add(b);
}


public int getcount() {
	for (int i=0;i<book.size();i++){
		Count+= book.get(i).getBookCount();
	}
	return Count;
}


public double getPrice() {
	
	for (int i=0;i<book.size();i++){
		Price+= book.get(i).getBookPrice();
	}
	return Price ;
}

}
