public class LibraryInterface{

	public static void main (String args[]){
	
	Book book1, book2, book3, book4, book5;
	book1 = new Book("1984", "George Orwell"); 
	 book2 = new Book("The Tale of Genji", "Murasaki Shikibu");
	  book3 = new Book("Anna Karenina", "Leo Tolstoy");	
	   book4 = new Book("Carrie", "Stephen King");	
	    book5 = new Book("The Memoirs of a Geisha", "Arthur Golden");

	System.out.println("Here are the books available: ");
	 System.out.println(book1);
	  System.out.println(book2);
	   System.out.println(book3);
	    System.out.println(book4);
	     System.out.println(book5);
	
	Patron p = new Patron("Alan Stern");

	System.out.println("Lending 4 books to " +p.getName());
	 if(p.Borrow(book1)) 
	System.out.println(book1.getTitle()+ " Successfully borrowed.");
	 else System.out.println(book1.getTitle() + " Could not be borrowed.");
	 
	 if(p.Borrow(book2)) 
	System.out.println(book2.getTitle()+ " Successfully borrowed.");
	 else System.out.println(book2.getTitle() + " Could not be borrowed.");
	
	 if(p.Borrow(book3)) 
	System.out.println(book3.getTitle()+ " Successfully borrowed.");
	 else System.out.println(book3.getTitle() + " Could not be borrowed.");

	 if(p.Borrow(book4)) 
	System.out.println(book4.getTitle()+ " Successfully borrowed.");
	 else System.out.println(book4.getTitle() + " Could not be borrowed.");

	 if(p.returnBook(book1))
	System.out.println(book1.getTitle()+ " Successfully returned.");
	 else System.out.println("------------\n Checking if Alan Stern has " + book3.getTitle());
	  
	 if(p.hasBook(book3))
        System.out.println("Alan Stern has " + book3.getTitle());
	 else
	System.out.println("Alan Stern does not have book 3");
	}

}