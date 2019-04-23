import java.util.ArrayList;

public class Employee extends Person {
	
	private String position;
	
	Employee()
	{
		super();
		position = "";
	}
	
	Employee(int id, String name, String mail ,String position, String password)
	{
		super(id, name.toLowerCase(), mail.toLowerCase(), password.toLowerCase());
		this.position = position.toUpperCase();
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public void setPosition(String position)
	{
		this.position = position.toUpperCase();
	}
	/**
	 * To check if the user(Student or Professor)/Book is already in the list and added if not
	 * <p> * Gets the name of the corresponding list </p>
	 * <p> * checks if the object is already in it </p>
	 * <p> * add it or return false </p>
	 * @param obj of ["STUDENT", "PROFESSOR", "BOOK"]
	 * @return true if it's add correctly false otherwise
	 */
	public int create(Object obj)
	{
		String className = obj.getClass().getName();
		className = className.toUpperCase();
		
		if (className.equals(Library.options[0])) // Book
		{
			Book currentBook = (Book)obj;
			int index = Library.isAvailable(currentBook); // Checks if it's already in the list
			
			if (index != -1) // found in the list
                        {
                            System.out.println("this book is already in the list.");
                            return -1;
                        }
			else // not found then add t
			{
				Library.addObj(currentBook);
				System.out.println("The Book is added:\n" + currentBook.toString());
                                return 999;
			}
		}
		else if (className.equals(Library.options[1])) // Student
		{
			Student currentStudent = (Student)obj;
			int index = Library.isAvailable(currentStudent); // Checks if it's already in the list

			if (index != -1) // found in the list
                        {
                            System.out.println("this student is already in the list.");
                            return -1;
                        }
			else
			{
				Library.addObj(currentStudent);
				System.out.println("The student is added:\n" + currentStudent.toString());
                                return 999;
			}
		}
		else if (className.equals(Library.options[2])) // Professor
		{
			Professor currentProfessor = (Professor)obj;
			int index = Library.isAvailable(currentProfessor); // Checks if it's already in the list
			
			if (index != -1) // found in the list
                        {
                            System.out.println("this professor is already in the list.");
                            return -1;
                        }
			else
			{
				Library.addObj(currentProfessor);
				System.out.println("The professor is added:\n" + currentProfessor.toString());
                                return 999;
			}
		}
		else if (className.equals(Library.options[3]) && position.equals("ADMIN")) // Employee
		{
			Employee currentEmployee = (Employee)obj;
			int index = Library.isAvailable(currentEmployee); // checks if it's already in the list using id
			
			if (index != -1) // found in the list
                        {
                            System.out.println("this employee is already in the list.!!");
                            return -1;
                        }
			else
			{
				Library.addObj(currentEmployee);
				System.out.println("The employee is added correctly.");
				System.out.println(currentEmployee.toString());
                                return 999;
			}
		}
		else
                {
                    System.out.println("You can't add " + obj.getClass().getName());
                    return -1;
                }
	}// end of create
	
	/**
	 * Deletes User or Book from the corresponding list
	 * <p> gets the class name </p>
	 * <p> gets the corresponding list </p>
	 * <p> checks if the object is available </p>
	 * <p> deletes it </p>
	 * @param obj the object to be deleted ["BOOK", "STUDENT","PROFESSOR"]
	 * @return true if the deletion is successful and false otherwise
	 */
	public int delete(Integer num, String option)
	{
		option = option.toUpperCase();
		
		if (option.equals(Library.options[0])) // Book
		{
			Integer index = Library.isAvailable(num, "BOOK");

			if (index == -1) // not found
                        {
                            System.out.println("this book is not found!");
                            return -1;
                        }
			else
			{
				Library.deleteObj(Library.books.get(index)); // delete obj from the corresponding list
				System.out.println("The book is deleted.");
                                return 999;
			}
		}
		else if (option.equals(Library.options[1])) // Student
		{
			Integer index = Library.isAvailable(num, "STUDENT");
			
			if (index == -1) // not found
                        {
                            System.out.println("this student is not found!!");
                            return -1;
                        }
			else
			{       // Check if the student have any books     
                            if (Library.students.get(index).getCurrent() > 0)
                            {
                                System.out.println("You can't delete this Student because he doesn't return the books!!");
                                return -2;
                            }
                            else
                            {
                             Library.deleteObj(Library.students.get(index)); // delete obj from the corresponding list
                             System.out.println("The student is deleted.");
                             return 999;
                            }
			}
		}
		else if (option.equals(Library.options[2])) // Professor
		{
			Integer index = Library.isAvailable(num, "PROFESSOR");
			
			if (index == -1) // not found
                        {
                            System.out.println("this professor is not found");
                            return -1;
                        }
			else
			{
                            if (Library.professors.get(index).getCurrent() > 0)
                            {
                                System.out.println("You can't delete this Professor because he doens't return the book!!");
                                return -2;
                            }
                            else
                            {
                                // delete obj from the corresponding list
                                Library.deleteObj(Library.professors.get(index));
                                System.out.println("The professor is deleted.");
                                return 999;
                            }
			}
		}
		else if (option.equals(Library.options[3]) && position.equals("ADMIN")) // Employee
		{
			Integer index = Library.isAvailable(num, "EMPLOYEE");
			
			if (index == -1) // not found
                        {
                            System.out.println("this employee is not found");
                            return -1;
                        }
			else
			{
				Library.deleteObj(Library.employees.get(index)); // delete obj from the corresponding list
				System.out.println("The employee is deleted.");
                                return 999;
			}
		}
		else
                {
                    System.out.println("You can't delete " + option);
                    return -1;
                }

	} // end of delete
	
	
	/**
	 * Browses a list employees
	 * <p> * Check if admin </p>
	 * <p> * get the corresponding list </p>
	 * <p> * calls ListItems() from Library to print the list </p>
	 * @param option the list to browse ["BOOK", "STUDENT", "PROFESSORS", "BORROW"]
	 */
	public void browseEmployees()
	{
		if (position.equals("ADMIN"))
		{
			Library.print("Employees list:");
			Library.listItems("EMPLOYEE");
		}
		else
			Library.print("You must be an admin to view this list!!");
	}
	
	/**
	 * Browses a list of objects based on the options and print the index+1
	 * <p> * Get the option </p>
	 * <p> * get the corresponding list </p>
	 * <p> * calls ListItems() from Library to print the list </p>
	 * @param option the list to browse ["BOOK", "STUDENT", "PROFESSORS", "BORROW"]
	 */
	public void browse(String option)
	{
		option = option.toUpperCase();
		
		if (option.equals(Library.options[0])) // Book
		{
			System.out.println("Books List:");
			Library.listItems(option);
		}
		
		else if (option.equals(Library.options[1])) // Student
		{
			System.out.println("Students List:");
			Library.listItems(option);
		}
		else if (option.equals(Library.options[2])) // Professor
		{
			System.out.println("Professors List:");
			Library.listItems(option);
		}
		else if (option.equals(Library.options[4])) // Professor
		{
			System.out.println("Records List:");
			Library.listItems(option);
		}
	}// end of browse(String option)
	
	
	/**
	 * Updates the given attribute in the given object to the value
	 * <p> gets the corresponding list </p>
	 * <p> checks if the object is available </p>
	 * <p> call updateObj() function </p>
	 * <p> based on the returned value print a specific message </p>
	 * @param num id or ISBN
	 * @param option the attribute we want to change
	 * @param type ["BOOK", "STUDENT", "PROFESSOR"]
	 * @param value
	 */
	public int update(Integer num, String option, String type, String value)
	{
		option = option.toUpperCase();
		value = value.toLowerCase();
		type = type.toUpperCase();
		
		Integer index = Library.isAvailable(num, type);
		if (index != -1)
		{
			if (type.equals(Library.options[0])) // Book
			{
				int update = Library.updateObj(Library.books.get(index), option, value);
				if (update == 999) // If update is successful
				{
					System.out.println("Updated Successfuly.");
				}
				else if (update == 0)
					System.out.println("Book not Found!!, Please make sure you have  passed the right ISBN");
				else if (update == 1)
					System.out.print("Wrong option!!, Please make sure you have passed the right attribute");
			return update;
                        }
			else if (type.equals(Library.options[1])) // Student
			{
				int update = Library.updateObj(Library.students.get(index), option, value);
				if (update == 999) // If update is successful
				{
					System.out.println("Updated Successfuly.");
				}
				else if (update == 0)
					System.out.println("Student not Found!!, Please make sure you have  passed the right ID");
				else if (update == 1)
					System.out.print("Wrong option!!, Please make sure you have passed the right attribute");
			return update;
                        }
			else if (type.equals(Library.options[2])) // Professor
			{
				int update = Library.updateObj(Library.professors.get(index), option, value);
				if (update == 999) // If update is successful
				{
					System.out.println("Updated Successfuly.");
				}
				else if (update == 0)
					System.out.println("Professor not Found!!, Please make sure you have  passed the right ID");
				else if (update == 1)
					System.out.print("Wrong option!!, Please make sure you have passed the right attribute");
			return update;
                        }
			else if (type.equals(Library.options[2])) // Employee
			{
				int update = Library.updateObj(Library.employees.get(index), option, value);
				if (update == 999) // If update is successful
				{
					System.out.println("Updated Successfuly.");
				}
				else if (update == 0)
					System.out.println("Employee not Found!!, Please make sure you have  passed the right ID");
				else if (update == 1)
					System.out.print("Wrong option!!, Please make sure you have passed the right attribute");
			return update;
                        }
		}
		else // not found
                {
                    System.out.println("Element not found!!, Please make sure you have  passed the right ISBN/ID");
                    return -1;
                }	
            return -1;
	}// end of update(Integer num, String option, String type, String value)
	
	/**
	 * Search a specific list for specific name given a specific option
	 * <p> gets the specific list </p>
	 * <p> make sure that the option is valid </p>
	 * <p> return the results if > 0 </p>
	 * @param name the name we are looking for
	 * @param option the name of the list  ["BOOK", "CATEGORY", "STUDENT", "PROFESSOR"]
	 */
	public ArrayList <Integer> searchByName(String name, String option)
	{
		option = option.toUpperCase();
		name = name.toLowerCase();
		ArrayList <Integer> results = new ArrayList <Integer>();
		String[] AvaialableOptions = {Library.options[0], Library.options[1],Library.options[2], Library.options[3], "CATEGORY"};
		boolean flag = false;
		
		for (String s:AvaialableOptions)
		{
			if (option.equals(s))
			{
				flag = true;
				break;
			}
		}
		
		if (flag)
		{
			results = Library.searchByName(name, option);
			
			if (results.size() > 0)
			{ 
				if (option.equals(Library.options[0])) // Book name
				{
					System.out.println("Books results by name:");
					Library.printList(results, "BOOK");
				}
				else if(option.equals("CATEGROY")) // Book category
				{
					System.out.println("Books results by category:");
					Library.printList(results, "BOOK");
				}
				else if(option.equals(Library.options[1])) // student
				{
					System.out.println("Students results by name:");
					Library.printList(results, option);
				}
				else if(option.equals(Library.options[2])) // professor
				{
					System.out.println("Professors results by name:");
					Library.printList(results, option);
				}
				else if(option.equals(Library.options[3])) // employee
				{
					if (position.equals("ADMIN"))
					{
						System.out.println("Employees results by name:");
						Library.printList(results, option);
					}
					else
						Library.print("You can't view employees list unless you are an admin!!");
						
				}
			}
			else // no matching
                        {
                            System.out.println("Theres no matching!!");
                        }
                    return results;
		} // Wrong optoin
		else
                {
                    System.out.println("Wrong option");
                    return null;
                }
		
	}// end searchByName(String name, String option)
	
	
	/**
	 * Search a specific option for a specific object by number(id, ISBN)
	 * @param num the ID or ISB
	 * @param option ["BOOK", "STUDENT", "PROFESSOR"];
	 */
	public void search(Integer num, String option)
	{
		option = option.toUpperCase();
		Integer index = Library.isAvailable(num, option);
		String[] AvaialableOptions = {Library.options[0], Library.options[1],Library.options[2]};
		boolean flag = false;
		
		for (String s:AvaialableOptions)
		{
			if (option.equals(s))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			if (index != -1)
			{
				if (option.equals(Library.options[0])) // Book
				{
					System.out.println("Found the book:");
					System.out.println(Library.books.get(index).toString());
				}
				else if (option.equals(Library.options[1])) // Student
				{
					System.out.println("Found the student:");
					System.out.println(Library.students.get(index).toString());
				}
				else if (option.equals(Library.options[2])) // Professor
				{
					System.out.println("Found the professor:");
					System.out.println(Library.professors.get(index).toString());
				}
			}
			else
				System.out.println("There is no matching!!");
		}
		else
			System.out.print("Wrong option!!");
	}//search(Integer num, String option)
	
	/**
	 * Prints the User history 
	 * <p> checks if the option is valid or not </p>
	 * <p> checks if there's at least one record in the records belongs to this user </p>
	 * <p> check the class of the user </p>
	 * <p> prints the corresponding list </p>
	 * @param num the id of the user
	 * @param option ["STUDENT", "PROFESSOR"]
	 */
    public void userHistory(Integer num, String option) 
    {
    	option = option.toUpperCase();
		String[] AvaialableOptions = {Library.options[1], Library.options[2]};
		boolean flag = false;
		
		for (String s:AvaialableOptions)
		{
			if (option.equals(s))
			{
				flag = true;
				break;
			}
		}
		
    	Integer i = Library.isAvailable(num, "BORROW");  // check if there's at least one record in records that belongs
		// to this person
		if (i != -1) // there's a record or more
		{
			if (flag)
			{
		    	Integer index = Library.isAvailable(num, option);
		    	
		    	// If index = -1 then the record is added incorrectly while testing 
		    	if (index == -1)
		    		System.out.println("Error, the users accound has been deleted!!");
		    	else
		    	{
				        System.out.println("ISBN\tStart Date\tEnd Data\tCondition\tName:");
				        for (Borrow r : Library.records) 
				        { 
				            if (Library.students.get(index).getId() == r.getId() && option.equals(r.getType())) // Student
				            {
				                String condition;
				                if (r.checkStatus())
				                    condition = "Returned";
				                else
				                    condition = "On Hold";
				                System.out.println(r.getIsbn() +
				                		"\t" + r.getStartDate() + "\t" + r.getEndDate() + "\t" + condition + "\t\t" + r.getName());
				            }
				            else if (Library.professors.get(index).getId() == r.getId() && option.equals(r.getType())) // Professor
				            {
				            	 String condition;
					                if (r.checkStatus())
					                    condition = "Returned";
					                else
					                    condition = "On Hold";
					                System.out.println(r.getName() + "\t" + r.getIsbn() +
					                		"\t" + r.getStartDate() + "\t" + r.getEndDate() + "\t" + condition);
				            }
				        }
		        }
			}else
				System.out.println("Wrong Option!!");
		}
		else // no records
			System.out.println("The user doesn't have a history yet");
    }// end of userHistory(Integer num, String option) 
    
    
	@Override
    public String toString(){

       return "-Name: " + getName() + "\n-ID: " + getId() + "\n-Position: " + getPosition()
               + "\n-E_mail: " + getMail() + "\n";
    }
    
    
    
	
} //end of Employee
