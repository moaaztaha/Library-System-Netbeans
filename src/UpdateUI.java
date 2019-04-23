
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelwa
 */
public class UpdateUI extends javax.swing.JFrame {
    
    String option;
    int index;
    Employee emp;
    /**
     * Creates new form UpdateUI
     */
    public UpdateUI() {
        initComponents();
    }
    
    public UpdateUI(Employee emp, int index, String option)
    {
        initComponents();
        this.index = index;
        this.emp = emp;
        this.option = option;
        fifth.setVisible(false);
        tFifth.setVisible(false);
        
        lWelcome.setText("Update " + option);
        if (option.equals("EMPLOYEE"))
        {
            try{
                fourth.setText("Position");
                tFirst.setText(Integer.toString(Library.employees.get(index).getId()));
                tSecond.setText(Library.employees.get(index).getName());
                tThird.setText(Library.employees.get(index).getMail());
                tFourth.setText(Library.employees.get(index).getPosition());   
            } catch (ArrayIndexOutOfBoundsException e)
            {
               JOptionPane.showMessageDialog(this, "Array out of bound!!", "Wrong index", JOptionPane.WARNING_MESSAGE); 
            }
            
        }
        else if (option.equals("BOOK"))
        {
            first.setText("ISBN");
            third.setText("Author");
            fourth.setText("Category");
            fifth.setVisible(true);
            tFifth.setVisible(true);
            
            try{
                tFirst.setText(Integer.toString(Library.books.get(index).getIsbn()));
                tSecond.setText(Library.books.get(index).getName());
                tThird.setText(Library.books.get(index).getAuthor());
                tFourth.setText(Library.books.get(index).getCategory());
                tFifth.setText(Integer.toString(Library.books.get(index).getNoCopy()));
            } catch (ArrayIndexOutOfBoundsException e)
            {
               JOptionPane.showMessageDialog(this, "Array out of bound!!", "Wrong index", JOptionPane.WARNING_MESSAGE); 
            }
        }
        else if (option.equals("STUDENT"))
        {
            try
            {
                tFirst.setText(Integer.toString(Library.students.get(index).getId()));
                tSecond.setText(Library.students.get(index).getName());
                tThird.setText(Library.students.get(index).getMail());
                tFourth.setText(Library.students.get(index).getFaclty());
            } catch (ArrayIndexOutOfBoundsException e)
            {
               JOptionPane.showMessageDialog(this, "Array out of bound!!", "Wrong index", JOptionPane.WARNING_MESSAGE); 
            }
            
        }
        else if (option.equals("PROFESSOR"))
        {
            try
            {
                tFirst.setText(Integer.toString(Library.professors.get(index).getId()));
                tSecond.setText(Library.professors.get(index).getName());
                tThird.setText(Library.professors.get(index).getMail());
                tFourth.setText(Library.professors.get(index).getFaclty());
            } catch (ArrayIndexOutOfBoundsException e)
            {
               JOptionPane.showMessageDialog(this, "Array out of bound!!", "Wrong index", JOptionPane.WARNING_MESSAGE); 
            } catch (NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(this, "Id must be a positive number!!", "Wrong index", JOptionPane.WARNING_MESSAGE); 
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

        second = new javax.swing.JLabel();
        third = new javax.swing.JLabel();
        fourth = new javax.swing.JLabel();
        tFirst = new javax.swing.JTextField();
        tSecond = new javax.swing.JTextField();
        tThird = new javax.swing.JTextField();
        tFourth = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        lWelcome = new javax.swing.JLabel();
        fifth = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        tFifth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        second.setText("Name");

        third.setText("Mail");

        fourth.setText("Faculty");

        tFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFirstActionPerformed(evt);
            }
        });

        bAdd.setText("Update");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        lWelcome.setText("Update ...");

        fifth.setText("Amount");

        first.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lWelcome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(first)
                            .addComponent(second)
                            .addComponent(third)
                            .addComponent(fourth)
                            .addComponent(fifth))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(bBack)
                                .addGap(44, 44, 44)
                                .addComponent(bAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tSecond)
                                        .addComponent(tThird)
                                        .addComponent(tFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tFifth, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lWelcome)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(first)
                        .addGap(28, 28, 28)
                        .addComponent(second)
                        .addGap(28, 28, 28)
                        .addComponent(third)
                        .addGap(28, 28, 28)
                        .addComponent(fourth))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tThird, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tFourth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fifth)
                    .addComponent(tFifth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFirstActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
        if (tFirst.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "You can leave this field empty!!", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
        else if (tSecond.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "You can leave this field empty!!", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
        else if (tThird.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "You can leave this field empty!!", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
        else if (tFourth.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "You can leave this field empty!!", "Empty Field", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if (option.equals("BOOK"))
            {
                try{
                    String input = tFirst.getText();
                    if (input.length() > 4)
                        throw new IdDigitsException(input);
                    
                    Library.books.get(index).setIsbn(Integer.parseInt(tFirst.getText()));
                    Library.books.get(index).setName(tSecond.getText());
                    Library.books.get(index).setCategory(tThird.getText());
                    Library.books.get(index).setCategory(tFourth.getText());
                    Library.books.get(index).setNoCopy(Integer.parseInt(tFifth.getText()));
                    JOptionPane.showMessageDialog(this, "The Book is updated Successfuly.", "Done", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Library.saveArray("BOOK");
                    } catch (IOException ex) {
                        Logger.getLogger(CreateUI.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                } catch (NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(this, "Your input must be a positive number", "Not interger Error", JOptionPane.WARNING_MESSAGE);    
                } catch (IdDigitsException e)
                {
                    JOptionPane.showMessageDialog(this, e, "Max id exceeded", JOptionPane.WARNING_MESSAGE);
                }
                
            }
            else if (option.equals("STUDENT"))
            {
                try{
                    Library.students.get(index).setId(Integer.parseInt(tFirst.getText()));
                    Library.students.get(index).setName(tSecond.getText());
                    Library.students.get(index).setMail(tThird.getText());
                    Library.students.get(index).setFaculty(tFourth.getText());
                    JOptionPane.showMessageDialog(this, "The Student is updated Successfuly.", "Done", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Library.saveArray("STUDENT");
                    } catch (IOException ex) {
                        Logger.getLogger(CreateUI.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                } catch (NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(this, "Your input must be a positive number", "Not interger Error", JOptionPane.WARNING_MESSAGE); 
                }
            }
            else if (option.equals("PROFESSOR"))
            {
                try
                {
                    Library.professors.get(index).setId(Integer.parseInt(tFirst.getText()));
                    Library.professors.get(index).setName(tSecond.getText());
                    Library.professors.get(index).setMail(tThird.getText());
                    Library.professors.get(index).setFaculty(tFourth.getText());

                    JOptionPane.showMessageDialog(this, "The Professor is updated Successfuly.", "Done", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Library.saveArray("PROFESSOR");
                    } catch (IOException ex) {
                        Logger.getLogger(CreateUI.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                } catch (NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(this, "Your input must be a positive number", "Not interger Error", JOptionPane.WARNING_MESSAGE);   
                }
            }
            else if (option.equals("EMPLOYEE"))
            {
                try
                {
                    Library.employees.get(index).setId(Integer.parseInt(tFirst.getText()));
                    Library.employees.get(index).setName(tSecond.getText());
                    Library.employees.get(index).setMail(tThird.getText());
                    Library.employees.get(index).setPosition(tFourth.getText());
                    JOptionPane.showMessageDialog(this, "The Employee is updated Successfuly.", "Done", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Library.saveArray("EMPLOYEE");
                    } catch (IOException ex) {
                        Logger.getLogger(CreateUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(this, "Your input must be a positive number", "Not interger Error", JOptionPane.WARNING_MESSAGE);    
                }
            }
            try {
                Library.saveArray(option);
            } catch (IOException ex) {
                Logger.getLogger(UpdateUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBack;
    private javax.swing.JLabel fifth;
    private javax.swing.JLabel first;
    private javax.swing.JLabel fourth;
    private javax.swing.JLabel lWelcome;
    private javax.swing.JLabel second;
    private javax.swing.JTextField tFifth;
    private javax.swing.JTextField tFirst;
    private javax.swing.JTextField tFourth;
    private javax.swing.JTextField tSecond;
    private javax.swing.JTextField tThird;
    private javax.swing.JLabel third;
    // End of variables declaration//GEN-END:variables
}
