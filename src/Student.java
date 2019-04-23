
public class Student extends User {
	 
	 Student(int id, String mail, String name, String faclty, String password)
	 {
		 super(id, mail, name, faclty, 3, password);
	 }
	 
	@Override
    public void borrowBook(int isbn ,String startDate)
    {
		int index = Library.isAvailable(isbn, "BOOK");
		
		if (index != -1) // found
		{
			if (Library.books.get(index).getCategory().equals("RESEARCH"))
			{
				Library.print("You can't borrow this kind of books");
			}
			else
			{
				super.borrowBook(isbn, startDate);
			}
		}
		else
			Library.print("The book isn't found!!");
    }
    
	@Override
    public String toString(){

       return "-Name: " + getName() + "\n-ID: " + getId() + "\n-Faculty: " + getFaclty()
               + "\n-E_mail: " + getMail() + "\n-Current books: " + getCurrent() + "\n";
	}
}