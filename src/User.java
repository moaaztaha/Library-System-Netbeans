import java.util.ArrayList;

abstract public class User extends Person {

    private String faculty;
    private int current;
    private int max;


    public User() {
        super();
        faculty = null;
        current = 0;
        max = 0;
    }

    public User(int id, String mail, String n, String f, int m, String password) {
        super(id, n.toLowerCase(), mail.toLowerCase(), password);
        this.faculty = f.toLowerCase();
        this.max = m;
    }

    public void setCurrent(int c) {
        this.current = c;
    }
    public void setMax(int m) {
        max = m;
    }

    public int getMax() {
        return max;
    }
    boolean isBorrowed(){
        return true;
    }
    public int getCurrent() {
        return current;
    }
    
    public String getFaclty()
    {
    	return faculty;
    }
    
    public void setFaculty(String faculty)
    {
    	this.faculty = faculty;
    }
    
    public void renewBook(int isbn)
    {
    	int index = Library.isAvailable(isbn, "BOOK");
    	String type = this.getClass().getName();
    	type = type.toUpperCase();
    	boolean flag = true;
    	
    	if (index != -1)// found the book
    	{
    		for (Borrow r: Library.records)
    		{
    			if (getId() == r.getId() && isbn == r.getIsbn() && r.checkStatus() == false && type.equals(r.getType())) // The user has the book
    			{
    				r.renew();
    				Library.print("The Book has been renewed.");
    				flag = true;
    				break;
    			}
    			else
    				{
    					flag = false;
    				}
    		}
    			
    	}
    	
    	if (flag == false)
    		Library.print("You don't have the book right now.!!");
    }

    public void borrowBook(int isbn ,String startDate)
    {
    	String type = this.getClass().getName();
    	type = type.toUpperCase();
    	
        if(getCurrent()< getMax()) {
            int index = Library.isAvailable(isbn, "BOOK"); // checks if a book is availble in library or not
            if(index != -1) {
                if (Library.books.get(index).loanable()) {   // Checks if the book can be loaned or not
                    boolean can = true;
                    for (Borrow r : Library.records) {        // loop around r of type object found in records list to check if user borrow el ketab aktr mn mara wla la2
                        if (getId() == r.getId() && isbn == r.getIsbn() && r.checkStatus() == false && type.equals(r.getType())) {     //false y3ny el ketab m3aah el user f bethom
                            can = false;
                            break;
                        }
                    }

                    if (can == true)
                    {
                        Library.books.get(index).bookBorrow();
                        Borrow record = new Borrow(isbn, Library.books.get(index).getName(), getId(), startDate, type);
                        Library.addObj(record);
                        current++;
                        System.out.println("Done.");
                    }
                    else {
                        System.out.println("You already has a copy of the book.");
                    }
                } else {
                    System.out.println("You Can\'t loan this book out of copies!!");
                }
            }
            else{
                System.out.println("Sorry, This Book is Not Availble");
            }
        }
        else {
            System.out.println("You've reached your maximum limit");
        }
    }

    public void returnBook(Integer isbn) {
        boolean flag = true;
    	for (Borrow r: Library.records) { // Added the flag by Moaz
            if (!(getId() == r.getId() && isbn == r.getIsbn() && r.checkStatus() == false)) {
            	flag = false;
            }
            else
        	{
	            r.returned();// the user returned the book
	            int index = Library.isAvailable(isbn, "BOOK");
                    setCurrent(getCurrent()-1);
	            Library.books.get(index).bookReturn();
	            System.out.println("The book have been returned");
	            break;
        	}
        }
    	
    	if(flag)
    		System.out.println("You don\'t have this Book");
    }
    
/*
This Function searches for the name of books store it in an array of integers
and then returns the list
 */
    public ArrayList <Integer> Search(String n){
        ArrayList <Integer> results = Library.searchByName(n, "BOOK");
        return results;
    }

    /*
    This function returns a list of integers about user's history.
    also prints out
     */
    public void userHistory() {
    	Integer index = Library.isAvailable(getId(), "BORROW"); 
    	String type = this.getClass().getName();
    	type = type.toUpperCase();
    	
    	if (index == -1)// check if the user has at least one record or not added by Moaz
    		System.out.println("The user has no Histroy yet."); 
    	else
    	{
	        System.out.println("ISBN\tStart Date\tEnd Data\tCondition\tName:");
	        for (Borrow r : Library.records) {        //history btaa3 el peson e
	            if (getId() == r.getId() && type.equals(r.getType())) {
	                if (r.checkStatus())
	                	System.out.println(r.getIsbn() + "\t" + r.getStartDate() + "\t" + r.getEndDate() + "\treturned\t" + r.getName());
	                else
	                	System.out.println(r.getIsbn() + "\t" + r.getStartDate() + "\t" + r.getEndDate() + "\ton hold\t\t" + r.getName());
	            }
	        }
    	}
    }
    
    public double calcFines(String currentDate) // Calculate the total fines of a User
    {
    	double totalFines = 0;
    	for (Borrow r: Library.records)
    	{
    		totalFines += r.getFines(currentDate); 
    	}
    	
    	/*if (totalFines == 0)
    		Library.print("You don't have any pending fines.");
    	else
    		Library.print("Your fines: " + totalFines + " LE.");*/
        
    	return totalFines;
    }
}
