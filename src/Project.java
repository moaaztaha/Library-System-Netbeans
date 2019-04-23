

public class Project {
	
	public static void main(String args[]) throws Exception
	{
		// For testing create a class of Library
		Library l = new Library();
                /*
		EmployeeUI empUI = new EmployeeUI(l.employees.get(0));
                empUI.setVisible(true); */
                
                //StudentUI sUI = new StudentUI();
                //sUI.setVisible(true);
                //StudentUI sUI = new StudentUI(l.students.get(0));
                //sUI.setVisible(true);
                ProfessorUI pUI = new ProfessorUI(l.professors.get(0));
                pUI.setVisible(true);
                
		
		
		
	} // end of main
} // end of project
