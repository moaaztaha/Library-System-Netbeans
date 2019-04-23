
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class DeleteUI extends javax.swing.JFrame {

    String option;
    Employee emp;
    /**
     * Creates new form DeleteUI
     */
    public DeleteUI() {
        initComponents();
    }
    
    public DeleteUI(Employee emp, String option)
    {
        initComponents();
        this.option = option;
        this.emp = emp;
        lWelcome.setText("Delete " + option);

        this.setTitle("Delete");

            
        if (option.equals("STUDENT"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
        else if (option.equals("PROFESSOR"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
        else if (option.equals("BOOK"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
        else if (option.equals("EMPLOYEE"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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

        lWelcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lWelcome.setText("Delete ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lWelcome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "You can't leave this field empty!!", "Wrong choice", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int o = emp.delete(Integer.parseInt(jTextField1.getText()), option);
            if (o == -1 || 0 == -2)
            {
                JOptionPane.showMessageDialog(this, "You can't delete this user.", "Wrong choice", JOptionPane.WARNING_MESSAGE);   
            }
            else
            {
                JOptionPane.showMessageDialog(this, "The " + option + " is deleted Successfuly.", "Done", JOptionPane.INFORMATION_MESSAGE);    
            try {
                Library.saveArray(option);
            } catch (IOException ex) {
                Logger.getLogger(DeleteUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (option.equals("STUDENT"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
        else if (option.equals("PROFESSOR"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
        else if (option.equals("BOOK"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
        else if (option.equals("EMPLOYEE"))
        {

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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
        }
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lWelcome;
    // End of variables declaration//GEN-END:variables
}
