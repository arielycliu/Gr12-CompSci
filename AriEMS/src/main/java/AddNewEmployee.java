/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.*;
/**
 *
 * @author ariel
 */
public class AddNewEmployee extends javax.swing.JFrame {

    // Attributes
    public MyHashTable theHT;
    
    /**
     * Creates new form AddNewEmployee
     */
    public AddNewEmployee() {
        initComponents();
        Type_label.setVisible(false);
        FTE_salary_input.setVisible(false);
        PTE_hPW_input.setVisible(false);
        PTE_hW_input.setVisible(false);
        PTE_wPY_input.setVisible(false);
    }
    
    public void setMainHT(MyHashTable theHTrefval){
        theHT = theHTrefval;
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
        workLoc_input = new javax.swing.JTextField();
        DeductRate_input = new javax.swing.JTextField();
        Add_button = new javax.swing.JButton();
        Type_label = new javax.swing.JLabel();
        PTE_hW_input = new javax.swing.JTextField();
        PTE_hPW_input = new javax.swing.JTextField();
        PTE_wPY_input = new javax.swing.JTextField();
        FTE_salary_input = new javax.swing.JTextField();
        Type_input = new javax.swing.JComboBox<>();
        EmpNum_input = new javax.swing.JTextField();
        firstname_input = new javax.swing.JTextField();
        lastname_input = new javax.swing.JTextField();
        gender_input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(100, 200, 600, 600));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel1.setText("Fill out employee information");

        workLoc_input.setText("Work Location");

        DeductRate_input.setText("Deduct Rate");

        Add_button.setText("Add Employee");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        Type_label.setFont(new java.awt.Font("Montserrat Medium", 0, 11)); // NOI18N
        Type_label.setText("Part Time Employee Info");

        PTE_hW_input.setText("Hourly Wage");

        PTE_hPW_input.setText("Hours Per Week");

        PTE_wPY_input.setText("Weeks Per Year");

        FTE_salary_input.setText("Yearly Salary");

        Type_input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type of Employee", "Part-time Employee", "Full-time Employee" }));
        Type_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Type_inputActionPerformed(evt);
            }
        });

        EmpNum_input.setText("Employee Number");
        EmpNum_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNum_inputActionPerformed(evt);
            }
        });

        firstname_input.setText("First Name");

        lastname_input.setText("Last Name");
        lastname_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname_inputActionPerformed(evt);
            }
        });

        gender_input.setText("Gender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EmpNum_input)
                            .addComponent(gender_input, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastname_input, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workLoc_input, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeductRate_input, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Type_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FTE_salary_input, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PTE_hW_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PTE_hPW_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PTE_wPY_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpNum_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeductRate_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workLoc_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Type_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Type_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTE_hW_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTE_hPW_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTE_wPY_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FTE_salary_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Add_button)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Error(String errormsg){
        ErrorPopup errorWindow = new ErrorPopup();
        errorWindow.setVisible(true);
        errorWindow.setErrorLabel(errormsg);
    } 
    
    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        // Add employee to hashtable after checking all the values are the proper type  
        
        ArrayList<String> inputs = new ArrayList<String>();
        inputs.add(EmpNum_input.getText());
        inputs.add(firstname_input.getText());
        inputs.add(lastname_input.getText());
        inputs.add(gender_input.getText());
        inputs.add(workLoc_input.getText());
        inputs.add(DeductRate_input.getText());
        
        // Makre sure everything is filled in
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i).isEmpty() == true) {
                Error("Make sure all fields are filled in.");
                return;
            }
        }
        
        try { // Check if empnum and deduct rate are integers
            int eN = Integer.parseInt(EmpNum_input.getText());
            double dR = Double.parseDouble(DeductRate_input.getText());
        } catch (Exception e) {
            String errormsg = "Employee number and deduct rate should be numbers.";
            System.out.println(errormsg);
            Error(errormsg);
            return;
        }
        // Set variables
        int eN = Integer.parseInt(EmpNum_input.getText());
        String fN = firstname_input.getText();
        String lN = lastname_input.getText();
        String g = gender_input.getText();
        String wL = workLoc_input.getText();
        double dR = Double.parseDouble(DeductRate_input.getText());
        
        // Run hashtable function to search for employee number and check if it already exists
        if (theHT.doesEmpNumAlreadyExist(eN) != null) {
            String errormsg = "Employee number already exists.";
            System.out.println(errormsg);
            Error(errormsg); // return error since we don't allow duplicates
            return;
        }
        
        // Check that everything is either num or string and everything is filled in
        Object employeeType = Type_input.getSelectedItem();
        if (employeeType != "Choose Type of Employee"){
            System.out.println("The person is an " + employeeType);
            if (employeeType == "Part-time Employee"){ // check part time employee info
                try {
                    double hW = Double.parseDouble(PTE_hW_input.getText());
                    double hPW = Double.parseDouble(PTE_hPW_input.getText());
                    double wPY = Double.parseDouble(PTE_wPY_input.getText());
                } catch (Exception e) {
                    String errormsg = "Make sure hours worked, hours per week, and weeks per year are integers.";
                    System.out.println(errormsg);
                    Error(errormsg);
                    return;
                }
                double hW = Double.parseDouble(PTE_hW_input.getText());
                double hPW = Double.parseDouble(PTE_hPW_input.getText());
                double wPY = Double.parseDouble(PTE_wPY_input.getText());
                
                // add the PTE
                PTE somePTE;
                somePTE = new PTE(eN, fN, lN, g, wL, dR, hW, hPW, wPY);
                theHT.addEmployee(somePTE);
                System.out.println("Added " + somePTE.firstName);
                Error("Successfully Added Employee");
                super.dispose(); // close window
            }
            else if (employeeType == "Full-time Employee") { // check full time employee info
                // Check if salary is double
                try {
                    double salary = Double.parseDouble(FTE_salary_input.getText());
                } catch (Exception e) {
                    String errormsg = "Make sure the salary is numerical.";
                    System.out.println(errormsg);
                    Error(errormsg);
                    return;
                }
                // Add the FTE
                double salary = Double.parseDouble(FTE_salary_input.getText());
                FTE someFTE;
                someFTE = new FTE(eN, fN, lN, g, wL, dR, salary);
                theHT.addEmployee(someFTE);
                System.out.println("Added " + someFTE.firstName);
                Error("Successfully Added Employee");
                super.dispose(); // close window
            }
        } else {
            String errormsg = "Please indicate employee type";
            System.out.println(errormsg);
            Error(errormsg);
        }
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void Type_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Type_inputActionPerformed

        // Change the input text avaliable based on if they are part time or full time
        Object employeeType = Type_input.getSelectedItem();
        if (employeeType != null){
            if (employeeType == "Part-time Employee"){
                Type_label.setText("Part-time Employee Info");
                Type_label.setVisible(true);
                PTE_hW_input.setVisible(true);
                PTE_hPW_input.setVisible(true);
                PTE_wPY_input.setVisible(true);

                // HIDE full time stuff
                FTE_salary_input.setVisible(false);
                Type_input.removeItem("Choose Type of Employee"); // remove the option
            }
            else if (employeeType == "Full-time Employee") {
                Type_label.setText("Full-time Employee Info");
                Type_label.setVisible(true);
                FTE_salary_input.setVisible(true);

                // HIDE part time stuff
                PTE_hW_input.setVisible(false);
                PTE_hPW_input.setVisible(false);
                PTE_wPY_input.setVisible(false);
                Type_input.removeItem("Choose Type of Employee"); // remove the option
            }
        }
    }//GEN-LAST:event_Type_inputActionPerformed

    private void EmpNum_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNum_inputActionPerformed
        // Check if number
        try {
            int eN = Integer.parseInt(EmpNum_input.getText());
        } catch (Exception e) {
            Error("Employee Number must be a number");
        }
        
    }//GEN-LAST:event_EmpNum_inputActionPerformed

    private void lastname_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname_inputActionPerformed

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
    private javax.swing.JButton Add_button;
    private javax.swing.JTextField DeductRate_input;
    private javax.swing.JTextField EmpNum_input;
    private javax.swing.JTextField FTE_salary_input;
    private javax.swing.JTextField PTE_hPW_input;
    private javax.swing.JTextField PTE_hW_input;
    private javax.swing.JTextField PTE_wPY_input;
    private javax.swing.JComboBox<String> Type_input;
    private javax.swing.JLabel Type_label;
    private javax.swing.JTextField firstname_input;
    private javax.swing.JTextField gender_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastname_input;
    private javax.swing.JTextField workLoc_input;
    // End of variables declaration//GEN-END:variables
}
