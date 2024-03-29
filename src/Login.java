
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jbtnUserName = new javax.swing.JLabel();
        jbtnPassword = new javax.swing.JLabel();
        jbtnTextField = new javax.swing.JTextField();
        jbtnPassField = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        bStudent = new javax.swing.JRadioButton();
        bProfessor = new javax.swing.JRadioButton();
        bEmployee = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("             Login System");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jbtnUserName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbtnUserName.setText("ID");

        jbtnPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbtnPassword.setText("Password");

        jbtnTextField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jbtnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTextFieldActionPerformed(evt);
            }
        });

        jbtnPassField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnPassField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jbtnPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPassFieldActionPerformed(evt);
            }
        });

        loginbtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        resetbtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jbtnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnBack.setText("BACK");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        buttonGroup1.add(bStudent);
        bStudent.setText("Student");

        buttonGroup1.add(bProfessor);
        bProfessor.setText("Professor");

        buttonGroup1.add(bEmployee);
        bEmployee.setText("Employee");
        bEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBack)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bStudent)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnPassword)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnPassField)
                                    .addComponent(jbtnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(bProfessor)
                                .addGap(43, 43, 43)
                                .addComponent(bEmployee)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnUserName)
                    .addComponent(jbtnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPassword)
                    .addComponent(jbtnPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bStudent)
                    .addComponent(bProfessor)
                    .addComponent(bEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn)
                    .addComponent(resetbtn))
                .addGap(33, 33, 33)
                .addComponent(jbtnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Make two string vars and get text from textField
    */
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        int id = Integer.parseInt(jbtnTextField.getText());
                
        if (bEmployee.isSelected())
        {
            int index = Library.login(id, String.valueOf(jbtnPassField.getPassword()), "EMPLOYEE");
            if (index == -1)
            {
               JOptionPane.showMessageDialog(this, "There's no employee with this ID!!", "No Matching", JOptionPane.WARNING_MESSAGE); 
            }
            else if (index == 3)
            {
                JOptionPane.showMessageDialog(this, "Wrong password!!", "Password", JOptionPane.WARNING_MESSAGE);
            }
            else if (index == 999)
            {
                // Get the object
                System.out.println("Loged");
                int i = Library.isAvailable(id, "EMPLOYEE");
                EmployeeUI eUI = new EmployeeUI(Library.employees.get(i));
                eUI.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Internal Error!!", "Internal", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if (bProfessor.isSelected())
        {
            int index = Library.login(Integer.parseInt(jbtnTextField.getText()), String.valueOf(jbtnPassField.getPassword()), "PROFESSOR");
            if (index == -1)
            {
               JOptionPane.showMessageDialog(this, "There's no professor with this ID!!", "No Matching", JOptionPane.WARNING_MESSAGE); 
            }
            else if (index == 3)
            {
                JOptionPane.showMessageDialog(this, "Wrong password!!", "Password", JOptionPane.WARNING_MESSAGE);
            }
            else if (index == 999)
            {
                // Get the object
                try
                {
                    System.out.println("Loged");
                    int i = Library.isAvailable(id, "PROFESSOR");
                    ProfessorUI pUI = new ProfessorUI(Library.professors.get(i));
                    pUI.setVisible(true);
                    this.dispose();
                } catch (IndexOutOfBoundsException e)
                {
                    JOptionPane.showMessageDialog(this, "Internal Error!!", "Not found", JOptionPane.WARNING_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Internal Error!!", "Internal", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if (bStudent.isSelected())
        {
            int index = Library.login(Integer.parseInt(jbtnTextField.getText()), String.valueOf(jbtnPassField.getPassword()), "STUDENT");
            if (index == -1)
            {
               JOptionPane.showMessageDialog(this, "There's no student with this ID!!", "No Matching", JOptionPane.WARNING_MESSAGE); 
            }
            else if (index == 3)
            {
                JOptionPane.showMessageDialog(this, "Wrong password!!", "Password", JOptionPane.WARNING_MESSAGE);
            }
            else if (index == 999)
            {
                try
                {
                    System.out.println("Loged");
                    int i = Library.isAvailable(id, "PROFESSOR");
                    StudentUI sUI = new StudentUI(Library.students.get(i));
                    sUI.setVisible(true);
                    this.dispose();
                } catch (IndexOutOfBoundsException e)
                {
                    JOptionPane.showMessageDialog(this, "Internal Error!!", "Not found", JOptionPane.WARNING_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Internal Error!!", "Internal", JOptionPane.WARNING_MESSAGE);
            } 
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You have to choose one option!", "Choose", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_loginbtnActionPerformed

    private void jbtnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnTextFieldActionPerformed

    private void jbtnPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPassFieldActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        jbtnTextField.setText(null);
        jbtnPassField.setText(null);
    }//GEN-LAST:event_resetbtnActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void bEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEmployeeActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bEmployee;
    private javax.swing.JRadioButton bProfessor;
    private javax.swing.JRadioButton bStudent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JPasswordField jbtnPassField;
    private javax.swing.JLabel jbtnPassword;
    private javax.swing.JTextField jbtnTextField;
    private javax.swing.JLabel jbtnUserName;
    private javax.swing.JButton loginbtn;
    private javax.swing.JButton resetbtn;
    // End of variables declaration//GEN-END:variables
}
