
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Project {
        
        static void helper()
        {
            JFrame f;
            JTable j;

            f = new JFrame();
            f.setTitle("Students Data");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Password");
            model.addColumn("Position");
            
            model.setRowCount(4);

            
                model.setValueAt("1", 0, 0);
                model.setValueAt("123", 0, 1);
                model.setValueAt("admin", 0, 2);
                
                model.setValueAt("2", 1, 0);
                model.setValueAt("321", 1, 1);
                model.setValueAt("Emp-NotAdmin", 1, 2);
                
                model.setValueAt("1", 2, 0);
                model.setValueAt("000", 2, 1);
                model.setValueAt("Student", 2, 2);
                
                model.setValueAt("1", 3, 0);
                model.setValueAt("312", 3, 1);
                model.setValueAt("Professor", 3, 2);
                
                
                
            j = new JTable(model);
            j.setBounds(30, 40, 200, 300);

            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
        }
    
    
	public static void main(String args[]) throws Exception
	{
		// For testing create a class of Library
		Library l = new Library();
                
               // Show the main Menu
		Menu mUI = new Menu();
                mUI.setVisible(true);
                
                // Show the helper
                helper();
		
		
	} // end of main
} // end of project
