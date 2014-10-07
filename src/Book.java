public class Book{
    
    private String Title, Author;
	
public Book (String t, String a){
        Title=t;
	Author=a;
	}

public String getTitle(){
	return Title;
        
	}

public String toString(){
        String info = "Title: " + Title +"\n Author:"+ Author;
	return info;
	}
}
