
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
public class SearchUI extends javax.swing.JFrame {

    String option;
    Employee emp;
    DefaultTableModel model;
    /**
     * Creates new form SearchUI
     */
    public SearchUI() {
        initComponents();
    }
    
    public SearchUI(Employee emp, String option)
    {
        initComponents();
        this.option = option;
        this.emp = emp;
        jLabel1.setText(option + " Key:");
        
        if (option.equals("STUDENT"))
           {

               model = (DefaultTableModel)jTable1.getModel();
               model.addColumn("ID");
               model.addColumn("Name");
               model.addColumn("Mail");
               model.addColumn("Faculty");
               model.addColumn("Current");
               model.addColumn("Max");
           }
           else if (option.equals("PROFESSOR"))
           {

               model = (DefaultTableModel)jTable1.getModel();
               model.addColumn("ID");
               model.addColumn("Name");
               model.addColumn("Mail");
               model.addColumn("Faculty");
               model.addColumn("Current");
               model.addColumn("Max");
           }
           else if (option.equals("BOOK"))
           {

               model = (DefaultTableModel)jTable1.getModel();
               model.addColumn("ISBN");
               model.addColumn("Name");
               model.addColumn("Author");
               model.addColumn("Category");
               model.addColumn("Loanable");
               model.addColumn("Amount");  
           }
           else if (option.equals("EMPLOYEE"))
           {

               model = (DefaultTableModel)jTable1.getModel();
               model.addColumn("ID");
               model.addColumn("Name");
               model.addColumn("Mail");
               model.addColumn("Position");  
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search Key:");

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

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSearch)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        // TODO add your handling code here:
        ArrayList <Integer> results = emp.searchByName(jTextField1.getText(), option);
        
        if (results ==  null || results.size() <= 0)
        {
            JOptionPane.showMessageDialog(this, "NO Matching!!", "Nothing found", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
           if (option.equals("STUDENT"))
           {
               model.setRowCount(results.size());
               int row = 0;
               int col;

               for (int i:results)
               {
                   col = 0;
                   model.setValueAt(Library.students.get(i).getId(), row, col++);
                   model.setValueAt(Library.students.get(i).getName(), row, col++);
                   model.setValueAt(Library.students.get(i).getMail(), row, col++);
                   model.setValueAt(Library.students.get(i).getFaclty(), row, col++);
                   model.setValueAt(Library.students.get(i).getCurrent(), row, col++);
                   model.setValueAt(Library.students.get(i).getMax(), row, col++);
                   row++;
               }
           }
           else if (option.equals("PROFESSOR"))
           {
               model.setRowCount(results.size());
               int row = 0;
               int col;

               for (int i:results)
               {
                   col = 0;
                   model.setValueAt(Library.professors.get(i).getId(), row, col++);
                   model.setValueAt(Library.professors.get(i).getName(), row, col++);
                   model.setValueAt(Library.professors.get(i).getMail(), row, col++);
                   model.setValueAt(Library.professors.get(i).getFaclty(), row, col++);
                   model.setValueAt(Library.professors.get(i).getCurrent(), row, col++);
                   model.setValueAt(Library.professors.get(i).getMax(), row, col++);
                   row++;
               } 
           }
           else if (option.equals("BOOK"))
           {
               model.setRowCount(results.size());
               int row = 0;
               int col;

               for (int i:results)
               {
                   col = 0;
                   model.setValueAt(Library.books.get(i).getIsbn(), row, col++);
                   model.setValueAt(Library.books.get(i).getName(), row, col++);
                   model.setValueAt(Library.books.get(i).getAuthor(), row, col++);
                   model.setValueAt(Library.books.get(i).getCategory(), row, col++);
                   model.setValueAt(Library.books.get(i).loanable(), row, col++);
                   model.setValueAt(Library.books.get(i).getNoCopy(), row, col++);
                   row++;
               }   
           }
           else if (option.equals("EMPLOYEE"))
           {
               model.setRowCount(results.size());
               int row = 0;
               int col;

               for (int i:results)
               {
                   col = 0;
                   model.setValueAt(Library.employees.get(i).getId(), row, col++);
                   model.setValueAt(Library.employees.get(i).getName(), row, col++);
                   model.setValueAt(Library.employees.get(i).getMail(), row, col++);
                   model.setValueAt(Library.employees.get(i).getPosition(), row, col++);
                   row++;
               }   
           }   
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}