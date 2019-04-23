
public class Professor extends User {
	Professor()
	{
		super();
	}
	
	 Professor(int id, String mail, String name, String faclty, String password)
	 {
		 super(id, mail, name, faclty, 5, password);
	 }
	 
	 
	@Override
    public String toString(){

       return "-Name: " + getName() + "\n-ID: " + getId() + "\n-Faculty: " + getFaclty()
               + "\n-E_mail: " + getMail() + "\n";
    }

}
