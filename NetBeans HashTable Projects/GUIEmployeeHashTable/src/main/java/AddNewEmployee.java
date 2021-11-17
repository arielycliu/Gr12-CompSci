/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class AddNewEmployee extends javax.swing.JFrame {

    private MyHashTable mainHT;  // contains the ref value for theHT of MainJFrame.

    /**
     * Creates new form AddNewEmployee
     */
    public AddNewEmployee() {
        initComponents();
        ExtraInfoLabel.setVisible(false);
        PTEInputhW.setVisible(false);
        PTEInputhPW.setVisible(false);
        PTEInputwPY.setVisible(false);
        FTEInputSalary.setVisible(false);
    }
    
    public void setMainHT(MyHashTable theRefVal) {
        mainHT = theRefVal;
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
        InputTypeEmployee = new javax.swing.JComboBox<>();
        InputEmNum = new javax.swing.JTextField();
        InputFirstName = new javax.swing.JTextField();
        InputLastName = new javax.swing.JTextField();
        InputGender = new javax.swing.JTextField();
        InputWorkLoc = new javax.swing.JTextField();
        InputDeductRate = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        ExtraInfoLabel = new javax.swing.JLabel();
        PTEInputhW = new javax.swing.JTextField();
        PTEInputhPW = new javax.swing.JTextField();
        PTEInputwPY = new javax.swing.JTextField();
        FTEInputSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adding a new employee");

        InputTypeEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type of Employee", "Part-time Employee", "Full-time Employee" }));
        InputTypeEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTypeEmployeeActionPerformed(evt);
            }
        });

        InputEmNum.setText("Employee Number");
        InputEmNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmNumActionPerformed(evt);
            }
        });

        InputFirstName.setText("First Name");

        InputLastName.setText("Last Name");
        InputLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputLastNameActionPerformed(evt);
            }
        });

        InputGender.setText("Gender");

        InputWorkLoc.setText("Work Location");

        InputDeductRate.setText("Deduct Rate");

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ExtraInfoLabel.setText("Part Time Employee Info");

        PTEInputhW.setText("Hourly Wage");

        PTEInputhPW.setText("Hours Per Week");

        PTEInputwPY.setText("Weeks Per Year");

        FTEInputSalary.setText("Yearly Salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(InputEmNum, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(InputGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InputWorkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InputDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputTypeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExtraInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FTEInputSalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(PTEInputhW, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(PTEInputhPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PTEInputwPY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 80, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputEmNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputDeductRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputWorkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(InputTypeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExtraInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTEInputhW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTEInputhPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTEInputwPY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FTEInputSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void InputTypeEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTypeEmployeeActionPerformed
        
        // Change the input text avaliable based on if they are part time or full time
        Object employeeType = InputTypeEmployee.getSelectedItem();
        if (employeeType != null){
            if (employeeType == "Choose Type of Employee") {
                System.out.println("You have to indicate if you are part time or full time employee.");
            }
            else if (employeeType == "Part-time Employee"){
                ExtraInfoLabel.setText("Part-time Employee Info");
                ExtraInfoLabel.setVisible(true);
                PTEInputhW.setVisible(true);
                PTEInputhPW.setVisible(true);
                PTEInputwPY.setVisible(true);
                
                // HIDE full time stuff
                FTEInputSalary.setVisible(false);
            }
            else if (employeeType == "Full-time Employee") {
                ExtraInfoLabel.setText("Full-time Employee Info");
                ExtraInfoLabel.setVisible(true);
                FTEInputSalary.setVisible(true);
                
                // HIDE part time stuff
                PTEInputhW.setVisible(false);
                PTEInputhPW.setVisible(false);
                PTEInputwPY.setVisible(false);
            }
        }
    }//GEN-LAST:event_InputTypeEmployeeActionPerformed

    private void InputLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputLastNameActionPerformed

    private void InputEmNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputEmNumActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        int eN = Integer.parseInt(InputEmNum.getText());
        String fN = InputFirstName.getText();
        String lN = InputLastName.getText();
        int g = Integer.parseInt(InputGender.getText());
        int wL = Integer.parseInt(InputWorkLoc.getText());
        int dR = Integer.parseInt(InputDeductRate.getText());        
        Object employeeType = InputTypeEmployee.getSelectedItem();
        
        // Check that everything is either num or string and everything is filled in
        
        if (employeeType != null){
            System.out.println("The person is an " + employeeType);
            if (employeeType == "Part-time Employee"){
                double hW = Double.parseDouble(PTEInputhW.getText());
                double hPW = Double.parseDouble(PTEInputhPW.getText());
                double wPY = Double.parseDouble(PTEInputwPY.getText());
                
                PTE somePTE;
                somePTE = new PTE(eN, fN, lN, g, wL, dR, hW, hPW, wPY);
                mainHT.addToTable(somePTE);
                System.out.println("Added " + somePTE.firstName);
            }
            else if (employeeType == "Full-time Employee") {
                double salary = Double.parseDouble(FTEInputSalary.getText());
                
                FTE someFTE;
                someFTE = new FTE(eN, fN, lN, g, wL, dR, salary);
                mainHT.addToTable(someFTE);
                System.out.println("Added " + someFTE.firstName);
            }
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExtraInfoLabel;
    private javax.swing.JTextField FTEInputSalary;
    private javax.swing.JTextField InputDeductRate;
    private javax.swing.JTextField InputEmNum;
    private javax.swing.JTextField InputFirstName;
    private javax.swing.JTextField InputGender;
    private javax.swing.JTextField InputLastName;
    private javax.swing.JComboBox<String> InputTypeEmployee;
    private javax.swing.JTextField InputWorkLoc;
    private javax.swing.JTextField PTEInputhPW;
    private javax.swing.JTextField PTEInputhW;
    private javax.swing.JTextField PTEInputwPY;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
