import java.util.ArrayList;
import java.io.*;

public class Library {
	// Attributes
	static ArrayList <Book> books = new ArrayList <Book>();
	static ArrayList <Student> students = new ArrayList <Student>();
	static ArrayList <Professor> professors = new ArrayList <Professor>();
	static ArrayList <Employee> employees = new ArrayList <Employee>();
	static ArrayList <Borrow> records = new ArrayList <Borrow>();
	static String[] options = {"BOOK", "STUDENT", "PROFESSOR", "EMPLOYEE", "BORROW"};
	static String[] errors = {"OBJECT NOT FOUND", "WRONG OPTION"};
	
	Library() throws IOException, FileNotFoundException, ClassNotFoundException
	{
            // Get all the data from the files
            getAllData();
            /*
		// Dummy values for testing
		// Dummy data for testing
		// create employee
		Employee emp1 = new Employee(1, "Ahmed Hagag", "ahmed@hagag.com", "admin", "123");
		Employee emp2 = new Employee(2, "Mohamed elgyar", "mohamed@elgyar.com", "Librarian", "321");
		Employee emp3 = new Employee(3, "Kareem Radwan", "mohamed@ali.com", "Worker", "231");
		Library.employees.add(emp1);
		
		// Adding employees using the admin account
		seperator();
		print("Adding Employees Using the admin account:");
		seperator();
		Library.employees.get(0).create(emp2);
		Library.employees.get(0).create(emp3);
		
		// Create Book, Student, Professor using Employee
		seperator();
		print("Creating book, student, professor using Employee");
		seperator();
		Library.employees.get(0).create(new Book("The Idiot Brain",  "Dean Burnett", "Neuroscience", 1, 10));
		Library.employees.get(0).create(new Book("The Power of habit",  "Charles Duhigg", "research", 2, 10));
		Library.employees.get(0).create(new Book("The Power of habit",  "Charles Duhigg", "test", 3, 10));
		Library.employees.get(0).create(new Student(1, "Moaz175888@bue.edu.eg", "Moaz taha", "ICS", "000"));
		Library.employees.get(0).create(new Professor(1, "Ghada.hasan@bue.edu.eg", "Ghada Hasan", "ICS", "312"));
		
		// Student/Professor borrows a book
		seperator();
		print("Student, Professor borrow a book:");
		seperator();
		print("The number of copies befor: " + Library.books.get(0).getNoCopy());
		Library.students.get(0).borrowBook(1, "04/02/2019");
                Library.professors.get(0).borrowBook(1, "04/02/2019");
		print("The number of copies after: " + Library.books.get(0).getNoCopy());
		print("\nThe history of the user after borrow:");
		Library.students.get(0).userHistory();
		Library.students.get(0).renewBook(1);
		Library.students.get(0).userHistory();
		Library.students.get(0).returnBook(1);
		Library.students.get(0).calcFines("20/02/2019");
		print("The number of copies after return: " + Library.books.get(0).getNoCopy());
		print("\nThe histroy of the user after return, focus on the condition!!:");
		
		// Testing History Functionality
		seperator();
		print("Testing Histroy");
		seperator();
		Library.seperator();
		print("Histroy of student with Id = 1 using the student:");
		Library.students.get(0).userHistory();
		print("Histroy of student with Id = 1 using the employee:");
		Library.employees.get(0).userHistory(1, "student");
		Library.seperator();
		print("Histroy of professor with Id = 1 using the employee:");
		Library.employees.get(0).userHistory(1, "professor");
		
		seperator();
		Library.listItems("borrow");
		Library.listItems("student");
		
		seperator();
		// check if the student can borrow research books?
		print("Check if students can borrow research books");
		seperator();
		Library.students.get(0).borrowBook(2, "01/02/2006");
		
		// Helping main
		Library.students.get(0).borrowBook(3, "21/09/2017");
		
		
		saveAllData();*/
		
		
		
}
	// Helper functions
	public static void print(String s)
	{
		System.out.println(s);
	}
	public static void print(int s)
	{
		System.out.println(s);
	}
	public static void print(boolean s)
	{
		System.out.println(s);
	}
	
	public static void seperator()
	{
		System.out.println("******************************************");
	}
        
        // Save ArrayList to "Data/ArrayList.txt"
       public static void saveArray(String option) throws FileNotFoundException, IOException
       {
           option = option.toUpperCase();
           int c = 0;
           
           for (String s:options)
               if (option.equals(s))
                   c++;
           
           // Wrong option
           if (c == 0)
               System.out.println("Wrong Option!!");
           else
           {
            FileOutputStream fos = new FileOutputStream("Data/" + option + "S.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            switch (option) {
                case "BOOK":
                    oos.writeObject(books);
                    break;
                case "STUDENT":
                    oos.writeObject(students);
                    break;
                case "PROFESSOR":
                    oos.writeObject(professors);
                    break;
                case "EMPLOYEE":
                    oos.writeObject(employees);
                    break;
                case "BORROW":
                    oos.writeObject(records);
                    break;
            }
            
            oos.close();
            fos.close();
           }
       }
       
       
       public static void getAllData() throws FileNotFoundException, IOException, ClassNotFoundException
       {
           for (String s:options)
           {
            FileInputStream fis = new FileInputStream("Data/" + s + "S.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            switch (s)
            {
                case "BOOK":
                    books = (ArrayList<Book>) ois.readObject();
                    break;
                case "STUDENT":
                    students = (ArrayList<Student>) ois.readObject();
                    break;
                case "EMPLOYEE":
                    employees = (ArrayList<Employee>) ois.readObject();
                    break;
                case "PROFESSOR":
                    professors = (ArrayList<Professor>) ois.readObject();
                    break;
                case "BORROW":
                    records = (ArrayList<Borrow>) ois.readObject();
            }
            
            ois.close();
            fis.close();
           }
       }
       
       // Saves all the data to files
       public static void saveAllData() throws IOException
       {
           for (String s:options)
           {
               saveArray(s);
           }
       }
        
	
	/**
	 * Make sure that the user inputs a correct email, password
	 * <p> Checks if the email is correct </p>
	 * <p> gets the correct list </p>
	 * <p> checks if the password is correct </p>
	 * @param mail the user email
	 * @param password the password for the account
	 * @param option ["STUDENT", "PROFESSOR", "EMPLOYEE"]
	 * @return [-1:id isn't matching, 999: successful, 3: wrong password, 7 wrong option:
	 */
	public static int login(int id, String password, String option)
	{
		option = option.toUpperCase();
		password = password.toLowerCase();
		
		Integer index = isAvailable(id, option);
		
		if (index != -1) // There's a user with the same id
		{
			if (option.equals("STUDENT"))// Student
			{
					if (students.get(index).getPassword().equals(password))
						{
							return 999; // Login successful
						}
					else
						return 3; // Wrong password
			}
			else if (option.equals("PROFESSOR"))// Professor
			{
				if  (professors.get(index).getPassword().equals(password))
					return 999; // Login successful
				else
					return 3; // Wrong password
			}
			else if (option.equals("EMPLOYEE"))// Employee
			{	
				if  (employees.get(index).getPassword().equals(password))
					return 999; // Login successful
				else
					return 3; // Wrong password
			}
			else
				return 7; // Wrong option
		} 
		else
			return -1; // id isn't matching
	}
	
	/**
	 * Checks if a name is available in any of the ArrayLists we have based on the option given
	 * <p> * gets the name of the corresponding class </p>
	 * <p> * checks if the corresponding list is empty </p>
	 * <p> * gets the index of the object or -1 otherwise </p>
	 * @param name The name to search for
	 * @param option The name of the ArrayList to search in
	 * @return index of the object if it's available or -1 otherwise
	 */
	static int isAvailable(String name, String option)
	{	
		option = option.toUpperCase();
		
		if (option.equals(options[0])) // Book
		{
			if (books.isEmpty()) // if the list is empty stop
				return -1;
			
			for(int i = 0; i < books.size(); ++i)
			{
				if (books.get(i).getName() == name)
				{
					return i;
				}
			}
		}
		else if (option.equals(options[1])) // Student
		{
			if (students.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Student s: students)
			{
				if (s.getName() == name)
				{
					return students.indexOf(s);
				}
			}
		}
		else if (option.equals(options[2])) // Professor
		{
			if (professors.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Professor p: professors)
			{
				if (p.getName() == name)
				{
					return professors.indexOf(p);
				}
			}
		}
		else if (option.equals(options[3])) // Employee
		{
			if (employees.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Employee e: employees)
			{
				if (e.getName() == name)
				{
					return employees.indexOf(e);
				}
			}
		}
		
		return -1;
	} // end of isAvailable(String name, String option)
	
	/**
	 * Checks if a number/id is available in any of the ArrayLists we have based on the option given
	 * <p> * gets the name of the corresponding class </p>
	 * <p> * checks if the corresponding list is empty </p>
	 * <p> * gets the index of the object or -1 otherwise </p>
	 * @param num a number to search for in the corresponding list [id, isbn]
	 * @param option The name of the ArrayList to search in ["BOOK", "STUDENT", "BORROW"]
	 * @return index of the object if it's available or -1 otherwise
	 */
	static int isAvailable(int num, String option)
	{
		option = option.toUpperCase();
		
		if (option.equals(options[1])) // Student
		{
			if (students.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Student s: students)
			{
				if (s.getId() == num)
				{
					return students.indexOf(s);
				}
			}
		}
		else if (option.equals(options[2])) // Professor
		{
			if (professors.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Professor p: professors)
			{
				if (p.getId() == num)
				{
					return professors.indexOf(p);
				}
			}
		}
		else if (option.equals(options[0])) // Books
		{
			if (books.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Book b: books)
			{
				if (b.getIsbn() == num)
				{
					return books.indexOf(b);
				}
			}
		}
		else if (option.equals(Library.options[4])) // Borrow
		{
			if (records.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Borrow r: records)
			{
				if (r.getId() == num)
				{
					return records.indexOf(r);
				}
			}
		}
		else if (option.equals(Library.options[3])) // Employee
		{
			if (employees.isEmpty()) // if the list is empty stop
				return -1;
			
			for(Employee e: employees)
			{
				if (e.getId() == num)
				{
					return employees.indexOf(e);
				}
			}
		}
		return -1;
	}// end of isAvailable(int num, String option)
	
	/**
	 * Checks if a number/id is available in any of the ArrayLists we have based on the option given
	 * <p> * gets the name of the corresponding class </p>
	 * <p> * checks if the corresponding list is empty </p>
	 * <p> * gets the index of the object or -1 otherwise </p>
	 * @param obj object to search for in the corresponding list 
	 * @return index of the object if it's available or -1 otherwise
	 */
	static int isAvailable(Object obj)
	{	
		String className = obj.getClass().getName();
		className = className.toUpperCase();
		
		if (className.equals(options[0])) // Book 
		{
			Book currentBook = (Book)obj;
			return isAvailable(currentBook.getIsbn(), "BOOK");
		}
		else if (className.equals(options[1])) // Student
		{
			Student currentStudent = (Student)obj;
			return isAvailable(currentStudent.getId(), "STUDENT");
		}
		else if (className.equals(options[2])) // Professor
		{
			Professor currentProfessor = (Professor)obj;
			return isAvailable(currentProfessor.getId(), "PROFESSOR");
		}
		else if (className.equals(options[3])) // Employee
		{
			Employee currentEmployee = (Employee)obj;
			return isAvailable(currentEmployee.getId(), "EMPLOYEE");
		}

		return -1;
	}// end of isAvailable(Object obj)
	
	
	/**
	 * Adds object to the corresponding list
	 * <p> * Gets the class name </p>
	 * <p> * added to the corresponding list </p>
	 * @param obj to be added
	 */
	static void addObj(Object obj)
	{
		String className = obj.getClass().getName();
		className = className.toUpperCase();
		
		if (className.equals(options[0])) // Book
			books.add((Book)obj);
		
		else if (className.equals(options[1])) // Student
			students.add((Student)obj);
		
		else if (className.equals(options[2])) // Professor
			professors.add((Professor)obj);
		
		else if (className.equals(options[3])) // Employee
			employees.add((Employee)obj);
		
		else if (className.equals(options[4])) // Borrow
			records.add((Borrow)obj);
		else
			System.out.println("Class not found");
	}// end of addObj(Object obj)
	
	/**
	 * Takes an object and based on it's type it deletes it from the corresponding List 
	 * <p> * gets the name of the corresponding class </p>
	 * <p> * checks if the corresponding list is empty or not </p>
	 * <p> * checks if the object is in the list </p>
	 * <p> * finally deletes the object </p>
	 * @param obj the object to delete
	 * @return true if the deletion is done and false otherwise
	 */
	static boolean deleteObj(Object obj)
	{
		String className = obj.getClass().getName();
		className = className.toUpperCase();
		
		if (className.equals(options[0]))
		{
			if (books.isEmpty())
				return false;
			else
				{
					// check if the obj is available
					int index = isAvailable((Book)obj);
					if (index != -1)
					{
						books.remove(index);
						return true;
					}
					else
						return false;
				}
			
		}
		else if (className.equals(options[1]))
		{
			if (students.isEmpty())
				return false;
			else
				{
					// check if the obj is available
					int index = isAvailable((Student)obj);
					if (index != -1)
					{
						students.remove(index);
						return true;
					}
					else
						return false;
				}	
		}
		else if (className.equals(options[2]))
		{
			if (professors.isEmpty())
				return false;
			else
			{
				// check if the obj is available
				int index = isAvailable((Professor)obj);
				if (index != -1)
				{
					professors.remove(index);
					return true;
				}
				else
					return false;
			}
		}
		else if (className.equals(options[3]))
		{
			if (employees.isEmpty())
				return false;
			else
			{
				// check if the obj is available
				int index = isAvailable((Employee)obj);
				if (index != -1)
				{
					employees.remove(index);
					return true;
				}
				else
					return false;
			}
		}
		else
			return false;
	}// end of deleteObj(Object obj)
	
	/**
	 * Makes updates to the object
	 * <p> * gets the class name of the object </p>
	 * <p> * checks if the list is empty or not </p>
	 * <p> * checks if the object is in this list or not </p>
	 * <p> * Update the given attribute with the given value </p>
	 * @param obj which the function will update
	 * @param option the attribute the function will update in this object
	 * @param value the new value
	 * @return true if the update is done else otherwise
	 */
	static int updateObj(Object obj, String option, String value)
	{
		String className = obj.getClass().getName();
		className = className.toUpperCase();
		option = option.toUpperCase();
		value = value.toLowerCase();
		
		
		if (className.equals(options[0])) // Book { Name, Author, category, isbn, noCopy}
		{
			if (books.isEmpty()) // if empty stop
				return 0;
			else
			{
				int index = isAvailable((Book)obj); // check if available
				if (index != -1) // Found
				{
					if (option.equals("NAME"))
					{
						books.get(index).setName(value);
						return 999;
					}
					else if (option.equals("CATEGORY"))
					{
						books.get(index).setCategory(value);
						return 999;
					}
					else if (option.equals("AUTHOR"))
					{
						books.get(index).setAuthor(value);
						return 999;
					}
					else if (option.equals("ISBN"))
					{
						books.get(index).setIsbn(Integer.parseInt(value));
						return 999;
					}
					else if (option.equals("NOCOPY"))
					{
						books.get(index).setNoCopy(Integer.parseInt(value));
						return 999;
					}
					else // not in the options
						return 1;
				}
				else // not found
					return 0;
			}
			
		}
		else if (className.equals(options[1])) // Student { id, mail, name, faculty, max}
		{
			if (students.isEmpty()) // if empty stop
				return 0;
			else
			{
				int index = isAvailable((Student)obj); // check if available
				if (index != -1) // found
				{
					if (option.equals("ID"))
					{
						students.get(index).setId(Integer.parseInt(value));
						return 999;
					}
					else if (option.equals("MAIL"))
					{
						students.get(index).setMail(value);;
						return 999;
					}
					else if (option.equals("NAME"))
					{
						students.get(index).setName(value);
						return 999;
					}
					else if (option.equals("FACLTY"))
					{
						students.get(index).setFaculty(value);
						return 999;
					}
					else if (option.equals("MAX"))
					{
						students.get(index).setMax(Integer.parseInt(value));
						return 999;
					}
					else // not in the options
						return 1;
				}
				else // not found
					return 0;
			}
		}
		else if (className.equals(options[2])) // Professor { id, mail, name, faculty, max}
		{
			if (professors.isEmpty()) // if empty stop
				return 0;
			else
			{
				int index = isAvailable((Professor)obj); // check if available
				if (index != -1) // found
				{
					if (option.equals("ID"))
					{
						professors.get(index).setId(Integer.parseInt(value));
						return 999;
					}
					else if (option.equals("MAIL"))
					{
						professors.get(index).setMail(value);;
						return 999;
					}
					else if (option.equals("NAME"))
					{
						professors.get(index).setName(value);
						return 999;
					}
					else if (option.equals("FACLTY"))
					{
						students.get(index).setFaculty(value);
						return 999;
					}
					else if (option.equals("MAX"))
					{
						students.get(index).setMax(Integer.parseInt(value));
						return 999;
					}
					else // not in the options
						return 1;
				}
				else // not found
					return 0;
			}
		}
		else if (className.equals(options[3])) // Employee { id, mail, name, position}
		{
			if (employees.isEmpty()) // if empty stop
				return 0;
			else
			{
				int index = isAvailable((Employee)obj); // check if available
				if (index != -1) // found
				{
					if (option.equals("ID"))
					{
						employees.get(index).setId(Integer.parseInt(value));
						return 999;
					}
					else if (option.equals("MAIL"))
					{
						employees.get(index).setMail(value);;
						return 999;
					}
					else if (option.equals("NAME"))
					{
						employees.get(index).setName(value);
						return 999;
					}
					else if (option.equals("Position"))
					{
						employees.get(index).setPosition(value);
						return 999;
					}
					else // not in the options
						return 1;
				}
				else // not found
					return 0;
			}
		}
		else
			return 0;
	} // end of update obj
	
	/**
	 * Lists the items of any ArrayList
	 * <p> * checks if the list is empty </p>
	 * <p> * Prints the objects of the list with the corresponding index+1 </p>
	 * @param option the name of the list ["BOOK", "STUDENT", "PROFESSOR", "RECORD"]
	 */
	static void listItems(String option)
	{
		option = option.toUpperCase();
		
		if (option.equals(options[0])) // Book
		{
			if (books.isEmpty())
				System.out.println("Nothing is Found!!");
			else
				{
					int i = 1;
					for (Book b: books)
					{
						System.out.println(i + ". " + b.toString()); // User toString to print obj info
						i++;
					}
				}
		}
		else if (option.equals(options[1])) // Student
		{
			if (students.isEmpty())
				System.out.println("Nothing is Found!!");
			else
			{
				int i = 1;
				for (Student s: students)
				{
					System.out.println(i + ". " + s.toString()); // User toString to print obj info
					i++;
				}
			}
		}
		else if (option.equals(options[2])) // Professor
		{
			if (professors.isEmpty())
				System.out.println("Nothing is Found!!");
			else
			{
				int i = 1;
				for (Professor p: professors)
				{
					System.out.println(i + ". " + p.toString()); // User toString to print obj info
					i++;
				}
			}
		}
		else if (option.equals(options[3])) // Employee
		{
			if (employees.isEmpty())
				System.out.println("Nothing is Found!!");
			else
			{
				int i = 1;
				for (Employee e: employees)
				{
					System.out.println(i + ". " + e.toString()); // User toString to print obj info
					i++;
				}
			}
		}
		else if (option.equals(options[4])) // Borrow
		{
			int i = 1;
			if (employees.isEmpty())
				System.out.println("Nothing is Found!!");
			else
			{
				for (Borrow b: records)
				{
					System.out.println(i + ". " + b.toString());
					i++;
				}
			}
		}
			
	}// end of ListItems(String option)
	
	
	/**
	 * Gets all matchings that contain the name in the option list or the category of a book
	 * <p> Makes an ArrayList </p>
	 * <p> checks if the correct list is empty </p>
	 * <p> gets the indices of all text that contain the name we are looking for </p>
	 * @param name the text we are looking for
	 * @param option the name of the list to search for ["BOOK", "STUDENT" , "PROFESSOR", "CATEGORY"]
	 * @return ArrayList of indices of all matchings
	 */
	static ArrayList <Integer> searchByName(String name, String option)
	{
		name = name.toLowerCase();
		option = option.toUpperCase();
		ArrayList <Integer> results = new ArrayList<Integer>();
		
		if (option.equals(options[0]) || option.equals("CATEGORY")) // Book
		{
			if (books.isEmpty())
			{
				return results; // will be empty
			}
			else
			{
				for (Book b:books)
				{
					if (option.equals(options[0]))
					{
						if (b.getName().contains(name))	// By Book Name
							results.add(books.indexOf(b));						
					}
					else
					{
						if (b.getCategory().contains(name))	// By Book Category
							results.add(books.indexOf(b));
					}
				}
			}
		}
		else if (option.equals(options[1])) // Student
		{
			if (students.isEmpty())
				return results; // will be empty
			else
			{
				for (Student s:students)
				{
					if (s.getName().contains(name))
						results.add(students.indexOf(s));
				}
			}
		}
		else if (option.equals(options[2])) // Professor
		{
			if (professors.isEmpty())
				return results; // will be empty
			else
			{
				for (Professor p:professors)
				{
					if (p.getName().contains(name))
						results.add(professors.indexOf(p));
				}
			}
		}
		else if (option.equals(options[3])) // Employee
		{
			if (employees.isEmpty())
				return results; // will be empty
			else
			{
				for (Employee e:employees)
				{
					if (e.getName().contains(name))
						results.add(employees.indexOf(e));
				}
			}
		}
		
		return results;
	}// end of searchByName(String name, String option)
	
	
	/**
	 * Prints the objects information based on the indices given
	 * <p> gets the correct list </p>
	 * <p> prints the information using toString(override based on each class) </p>
	 * @param list a list of indices of objects
	 * @param option the name of the corresponding list ["STUDENT", "BOOK", "PROFESSOR", "BORROW"]
	 */
	static void printList(ArrayList <Integer> list, String option)
	{
		option = option.toUpperCase();
		
		if (option.equals(options[0])) // Book
		{
			for (Integer index:list)
			{
				System.out.println((index+1) + ". " + books.get(index).toString());
			}
			
		}
		else if(option.equals(options[1])) // Student
		{
			for (Integer index:list)
			{
				System.out.println((index+1)+ ". " + students.get(index).toString());
			}
		}
		else if(option.equals(options[2])) // Professor
		{
			for (Integer index:list)
			{
				System.out.println((index+1)+ ". " + professors.get(index).toString());
			}
		}
		else if(option.equals(options[4])) // Borrow
		{
			for (Integer index:list)
			{
				System.out.println((index+1)+ ". " + records.get(index).toString());
			}
		}
	}// end of printList(ArrayList <Integer> list, String option)
	
}// End of class Library
