import java.io.Serializable;

public abstract class Person implements Serializable{
    private int id;
    private String name;
    private String mail;
    private String password;

    public Person() {
        id = 0;
        name = null;
    }

    public Person(int id, String n, String m, String password) {
        this.id = id;
        this.name = n.toLowerCase();
        this.mail = m.toLowerCase();
        this.password = password.toLowerCase();
    }

    public void setPassword(String password)
    {
    	this.password = password;
    }
    
    public String getPassword()
    {
    	return password;
    }
    
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void setMail(String mail)
    {
    	this.mail = mail;
    }
    
    public String getMail()
    {
    	return mail;
    }
    

    public void Search(int isbn){
        int index = Library.isAvailable(isbn, "BOOK");

        if (index == -1)             //-1 false does not match the argument.
        {
            System.out.println("The Book is not found in The library Catalog");
        }
        else
        {
            System.out.println(Library.books.get(index).toString());       //it goes to Book class and will be implemented their tostring().
        }
    }
    
	public void browse()
	{
		System.out.println("Books List:");
		Library.listItems(Library.options[0]); // Book
	}
	
    



}
