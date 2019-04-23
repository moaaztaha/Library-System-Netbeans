
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelwa
 */
public class EmployeeUI extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeUI
     */
    Employee emp;
    
    public EmployeeUI() {
        initComponents();
    }
    
    public EmployeeUI(Employee emp)
    {
        initComponents();
        lWelcome.setText("Welcome, " + emp.getName());
        this.emp = emp;
        //emp.setPosition("NOT-ADMIN");
        this.setTitle("Employee UI");
    }
    
    // Browse Methods 
    public static void browse(String op)
    {   
        if (op.equals("STUDENT"))
        {
            JFrame f;
            JTable j;

            f = new JFrame();
            f.setTitle("Students Data");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Mail");
            model.addColumn("Faculty");
            model.addColumn("Current");
            model.addColumn("Max");
            
            model.setRowCount(Library.students.size());
            int row = 0;
            int col;
            
            for (Student s:Library.students)
            {
                col = 0;
                model.setValueAt(s.getId(), row, col++);
                model.setValueAt(s.getName(), row, col++);
                model.setValueAt(s.getMail(), row, col++);
                model.setValueAt(s.getFaclty(), row, col++);
                model.setValueAt(s.getCurrent(), row, col++);
                model.setValueAt(s.getMax(), row, col++);
                row++;
            }
                                
            j = new JTable(model);
            j.setBounds(30, 40, 200, 300);

            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
        }
        else if (op.equals("PROFESSOR"))
        {
            // dd/mm/yy
            JFrame f;
            JTable j;

            f = new JFrame();
            f.setTitle("Professors Data");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Mail");
            model.addColumn("Faculty");
            model.addColumn("Current");
            model.addColumn("Max");
            model.setRowCount(Library.professors.size());
            int row = 0;
            int col;
            
            for (Professor p:Library.professors)
            {
                col = 0;
                model.setValueAt(p.getId(), row, col++);
                model.setValueAt(p.getName(), row, col++);
                model.setValueAt(p.getMail(), row, col++);
                model.setValueAt(p.getFaclty(), row, col++);
                model.setValueAt(p.getCurrent(), row, col++);
                model.setValueAt(p.getMax(), row, col++);
                row++;
            } 
                                
            j = new JTable(model);
            j.setBounds(30, 40, 200, 300);

            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
        }
        else if (op.equals("BOOK"))
        {
            JFrame f;
            JTable j;

            f = new JFrame();
            f.setTitle("Books Data");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ISBN");
            model.addColumn("Name");
            model.addColumn("Author");
            model.addColumn("Category");
            model.addColumn("Loanable");
            model.addColumn("Amount");
            
            model.setRowCount(Library.books.size());
            int row = 0;
            int col;
            
            for (Book b:Library.books)
            {
                col = 0;
                model.setValueAt(b.getIsbn(), row, col++);
                model.setValueAt(b.getName(), row, col++);
                model.setValueAt(b.getAuthor(), row, col++);
                model.setValueAt(b.getCategory(), row, col++);
                model.setValueAt(b.loanable(), row, col++);
                model.setValueAt(b.getNoCopy(), row, col++);
                row++;
            }   
                                
            j = new JTable(model);
            j.setBounds(30, 40, 200, 300);

            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
        }
        else if (op.equals("EMPLOYEE"))
        {
            JFrame f;
            JTable j;

            f = new JFrame();
            f.setTitle("Employees Data");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Mail");
            model.addColumn("Position");
            
            model.setRowCount(Library.employees.size());
            int row = 0;
            int col;
            
            for (Employee e:Library.employees)
            {
                col = 0;
                model.setValueAt(e.getId(), row, col++);
                model.setValueAt(e.getName(), row, col++);
                model.setValueAt(e.getMail(), row, col++);
                model.setValueAt(e.getPosition(), row, col++);
                row++;
            }   
                                
            j = new JTable(model);
            j.setBounds(30, 40, 200, 300);

            JScrollPane sp = new JScrollPane(j);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listOptions = new javax.swing.ButtonGroup();
        pMenu = new javax.swing.JPanel();
        bBrowse = new javax.swing.JButton();
        bCreate = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bSearch = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bHistroy = new javax.swing.JButton();
        empLogout = new javax.swing.JButton();
        pOtions = new javax.swing.JPanel();
        jOptionHelp = new javax.swing.JLabel();
        rStudent = new javax.swing.JRadioButton();
        rProfessor = new javax.swing.JRadioButton();
        rBook = new javax.swing.JRadioButton();
        rEmployee = new javax.swing.JRadioButton();
        bOption = new javax.swing.JButton();
        lWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        pMenu.setBackground(new java.awt.Color(204, 204, 204));

        bBrowse.setText("Browse");
        bBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBrowseActionPerformed(evt);
            }
        });

        bCreate.setText("Create");
        bCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bHistroy.setText("History");
        bHistroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHistroyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bHistroy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addComponent(bBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bHistroy, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        empLogout.setText("Log out");
        empLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLogoutActionPerformed(evt);
            }
        });

        pOtions.setBackground(new java.awt.Color(240, 240, 250));

        jOptionHelp.setText("Choose which List to browse:");

        listOptions.add(rStudent);
        rStudent.setText("Students");
        rStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rStudentActionPerformed(evt);
            }
        });

        listOptions.add(rProfessor);
        rProfessor.setText("Professors");
        rProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rProfessorActionPerformed(evt);
            }
        });

        listOptions.add(rBook);
        rBook.setText("Books");
        rBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBookActionPerformed(evt);
            }
        });

        listOptions.add(rEmployee);
        rEmployee.setText("Employees");
        rEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmployeeActionPerformed(evt);
            }
        });

        bOption.setText("Browse");
        bOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOtionsLayout = new javax.swing.GroupLayout(pOtions);
        pOtions.setLayout(pOtionsLayout);
        pOtionsLayout.setHorizontalGroup(
            pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOtionsLayout.createSequentialGroup()
                .addGroup(pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOtionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bOption))
                    .addGroup(pOtionsLayout.createSequentialGroup()
                        .addGroup(pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pOtionsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jOptionHelp))
                            .addGroup(pOtionsLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pOtionsLayout.createSequentialGroup()
                                        .addComponent(rBook)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rEmployee))
                                    .addGroup(pOtionsLayout.createSequentialGroup()
                                        .addComponent(rStudent)
                                        .addGap(157, 157, 157)
                                        .addComponent(rProfessor)))))
                        .addGap(0, 278, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pOtionsLayout.setVerticalGroup(
            pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOtionsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jOptionHelp)
                .addGap(18, 18, 18)
                .addGroup(pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rStudent)
                    .addComponent(rProfessor))
                .addGap(51, 51, 51)
                .addGroup(pOtionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBook)
                    .addComponent(rEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bOption)
                .addContainerGap())
        );

        lWelcome.setText("Welcoming message");

        jLabel1.setText("* If you aren't an Admin, your permissions will be limited");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(lWelcome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pOtions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                                .addComponent(empLogout)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lWelcome)
                .addGap(15, 15, 15)
                .addComponent(pOtions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empLogout)
                    .addComponent(jLabel1))
                .addContainerGap())
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBrowseActionPerformed
        // TODO add your handling code here:
       jOptionHelp.setText("Choose which List to browse:");
       bOption.setText("Browse");
       rEmployee.setVisible(true);
       rBook.setVisible(true);
       rEmployee.setEnabled(true);
    }//GEN-LAST:event_bBrowseActionPerformed

    private void rStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rStudentActionPerformed

    private void rProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rProfessorActionPerformed

    private void rBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBookActionPerformed

    private void rEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmployeeActionPerformed

    private void bOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOptionActionPerformed
        // TODO add your handling code here:
        if (rBook.isSelected())
        {
           switch (bOption.getText())
           {
               case "Browse":
                   browse("BOOK");
                   break;
               case "Delete":
                   DeleteUI dUI = new DeleteUI(emp, "BOOK");   
                   dUI.setVisible(true);
                   break;
               case "Update":
                   PreUpdateUI uUI = new PreUpdateUI(emp, "BOOK");
                   uUI.setVisible(true);
                   break;
               case "Create":
                   CreateUI cUI = new CreateUI(emp, "BOOK");
                   cUI.setVisible(true);
                   break;
               case "Search":
                   SearchUI sUI = new SearchUI(emp, "BOOK");
                   sUI.setVisible(true);
                   break;
               case "History":
                   HistoryUI hUI = new HistoryUI("BOOK");
                   hUI.setVisible(true);
                   break;
           }
        }
        else if (rStudent.isSelected())
        {
           switch (bOption.getText())
           {
               case "Browse":
                   browse("STUDENT");
                   break;
               case "Delete":
                   DeleteUI dUI = new DeleteUI(emp, "STUDENT");   
                   dUI.setVisible(true);
                   break;
               case "Update":
                   PreUpdateUI uUI = new PreUpdateUI(emp, "STUDENT");
                   uUI.setVisible(true);
                   break;
               case "Create":
                   CreateUI cUI = new CreateUI(emp, "STUDENT");
                   cUI.setVisible(true);
                   break;
               case "Search":
                   SearchUI sUI = new SearchUI(emp, "STUDENT");
                   sUI.setVisible(true);
                   break;
               case "History":
                   HistoryUI hUI = new HistoryUI("STUDENT");
                   hUI.setVisible(true);
                   break;
           } 
        }
        else if (rEmployee.isSelected())
        {
          switch (bOption.getText())
           {
               case "Browse":
                   browse("EMPLOYEE");
                   break;
               case "Delete":
                   DeleteUI dUI = new DeleteUI(emp, "EMPLOYEE");   
                   dUI.setVisible(true);
                   break;
               case "Update":
                   PreUpdateUI uUI = new PreUpdateUI(emp, "EMPLOYEE");
                   uUI.setVisible(true);
                   break;
               case "Create":
                   CreateUI cUI = new CreateUI(emp, "EMPLOYEE");
                   cUI.setVisible(true);
                   break;
               case "Search":
                   SearchUI sUI = new SearchUI(emp, "EMPLOYEE");
                   sUI.setVisible(true);
                   break;
           }   
        }
        else if (rProfessor.isSelected())
        {
        switch (bOption.getText())
           {
               case "Browse":
                   browse("PROFESSOR");
                   break;
               case "Delete":
                   DeleteUI dUI = new DeleteUI(emp, "PROFESSOR");   
                   dUI.setVisible(true);
                   break;
               case "Update":
                   PreUpdateUI uUI = new PreUpdateUI(emp, "PROFESSOR");
                   uUI.setVisible(true);
                   break;
               case "Create":
                   CreateUI cUI = new CreateUI(emp, "PROFESSOR");
                   cUI.setVisible(true);
                   break;
               case "Search":
                   SearchUI sUI = new SearchUI(emp, "PROFESSOR");
                   sUI.setVisible(true);
                   break;
               case "History":
                   HistoryUI hUI = new HistoryUI("PROFESSOR");
                   hUI.setVisible(true);
                   break;
           } 
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You have to choose one of the options!!", "Wrong choice", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bOptionActionPerformed

    private void bCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateActionPerformed
        // TODO add your handling code here:
        jOptionHelp.setText("Choose which List to create to:");
        bOption.setText("Create");
        rEmployee.setVisible(true);
        rBook.setVisible(true);
        // if it's the admin
        if (!emp.getPosition().equals("ADMIN"))
        {
            rEmployee.setEnabled(false);
        }
    }//GEN-LAST:event_bCreateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        jOptionHelp.setText("Choose which List to delete from:");
        bOption.setText("Delete");
        rEmployee.setVisible(true);
        rBook.setVisible(true);
        // if it's the admin
        if (!emp.getPosition().equals("ADMIN"))
        {
            rEmployee.setEnabled(false);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        // TODO add your handling code here:
        jOptionHelp.setText("Choose which List to search:");
        bOption.setText("Search");
        rEmployee.setVisible(true);
        rBook.setVisible(true);
        rEmployee.setEnabled(true);
    }//GEN-LAST:event_bSearchActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
        jOptionHelp.setText("Choose which List to update:");
        bOption.setText("Update");
        rEmployee.setVisible(true);
        rBook.setVisible(true);
        // if it's the admin
        if (!emp.getPosition().equals("ADMIN"))
        {
            rEmployee.setEnabled(false);
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bHistroyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHistroyActionPerformed
        // TODO add your handling code here:
        jOptionHelp.setText("Choose which List to get its history:");
        bOption.setText("History");
        rEmployee.setVisible(false);
        rBook.setVisible(false);
    }//GEN-LAST:event_bHistroyActionPerformed

    private void empLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLogoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBrowse;
    private javax.swing.JButton bCreate;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bHistroy;
    private javax.swing.JButton bOption;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton empLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jOptionHelp;
    private javax.swing.JButton jbtnlogin;
    private javax.swing.JButton jbtnlogin1;
    private javax.swing.JLabel lWelcome;
    private javax.swing.ButtonGroup listOptions;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pOtions;
    private javax.swing.JRadioButton rBook;
    private javax.swing.JRadioButton rEmployee;
    private javax.swing.JRadioButton rProfessor;
    private javax.swing.JRadioButton rStudent;
    // End of variables declaration//GEN-END:variables
}
