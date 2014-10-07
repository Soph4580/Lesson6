public class Patron{

	private String name;
	private Book book1, book2, book3;

	public Patron(String s){
	name=s;
	book1=null;
	book2=null;
	book3=null;
	}

public boolean Borrow(Book b){
	boolean atthemax= (book1!= null && book2!= null && book3!= null);
		
		if(atthemax) return false;
		if(book1 == null) book1= b;
		else if(book2 == null)book2=b;
		else book3=b;
		return true;
		}


public boolean hasBook(Book b){
	
	if(book1==b)return true;
	else if(book2==b)return true;
	else if (book3==b)return true;
	else return false;
	}
	
public boolean returnBook (Book b){

	if(hasBook(b)==false) return false;
	if(book1 == book2) book1=null;
	else if (book2 == b) book2=null;
	else book3=null;
	return true;
	}

public String getName(){

	return name;
	}
}
