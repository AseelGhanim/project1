package Book;

public class Book {
private String Name;
private double Price;
private int Count;
public Book(String s,double p,int c){
	Name=s;
	Price=p;
	Count=c;
}

	public void setBookPrice(int j) {
		Price=j;
	}
	
	public double getBookPrice() {
		return Price;
	}
	
	public  void setBookCount(int j) {
		Count=j;
	}
	
	public int getBookCount() {
		return Count;
	}

}
