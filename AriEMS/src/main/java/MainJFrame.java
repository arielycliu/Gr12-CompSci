/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ariel
 */
public class MainJFrame extends javax.swing.JFrame {

    // Attributes
    public MyHashTable theHT;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        SaveEmployee loadData = new SaveEmployee();
        theHT = loadData.readData();
        Save_button.setVisible(false);
        Add5_button.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Add5_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Display_Button = new javax.swing.JButton();
        Add_button = new javax.swing.JButton();
        Search_button = new javax.swing.JButton();
        Save_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(350, 100, 600, 600));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("System");

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("Employee");

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel3.setText("Management");

        Add5_button.setBackground(new java.awt.Color(255, 255, 255));
        Add5_button.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        Add5_button.setText("Add 5 Employees (testing only)");
        Add5_button.setActionCommand("");
        Add5_button.setAlignmentY(0.0F);
        Add5_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Add5_button.setContentAreaFilled(false);
        Add5_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add5_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add5_buttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        jLabel4.setText("What would you like to do?");

        Display_Button.setBackground(new java.awt.Color(255, 255, 255));
        Display_Button.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        Display_Button.setText("Display & Edit Employees");
        Display_Button.setAlignmentY(0.0F);
        Display_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Display_Button.setContentAreaFilled(false);
        Display_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Display_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_ButtonActionPerformed(evt);
            }
        });

        Add_button.setBackground(new java.awt.Color(255, 255, 255));
        Add_button.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        Add_button.setText("Add Employee");
        Add_button.setAlignmentY(0.0F);
        Add_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Add_button.setContentAreaFilled(false);
        Add_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        Search_button.setBackground(new java.awt.Color(255, 255, 255));
        Search_button.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        Search_button.setText("Search Employee");
        Search_button.setAlignmentY(0.0F);
        Search_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Search_button.setContentAreaFilled(false);
        Search_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        Save_button.setBackground(new java.awt.Color(255, 255, 255));
        Save_button.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        Save_button.setText("Save Employee");
        Save_button.setAlignmentY(0.0F);
        Save_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Save_button.setContentAreaFilled(false);
        Save_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Add5_button, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add5_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add5_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add5_buttonActionPerformed
        // Add 5 random employees - for testing purposes
        PTE newPTE;
        FTE newFTE;
        
        newPTE = new PTE(111111, "Bugs", "Bunny", "M", "DA", 0.2, 22.50, 25, 40.0);
	theHT.addEmployee(newPTE);
		
        newFTE = new FTE(111112, "Lola", "Bunny", "F", "DA", 0.1, 120000.0);
        theHT.addEmployee(newFTE);

        newPTE = new PTE(111113, "Daffy", "Duck", "M", "DA", 0.2, 17.0, 20.0, 25.0);
        theHT.addEmployee(newPTE);
        
        newFTE = new FTE(111114, "Patrick", "Li", "M", "ON", 0.1, 1200000.0);
        theHT.addEmployee(newFTE);

        newPTE = new PTE(111115, "Ariel", "Liu", "F", "CA", 0.2, 17.0, 20.0, 40.0);
        theHT.addEmployee(newPTE);   
        System.out.println("SUCCESS - added 5 employees");
        SaveEmployee theSave = new SaveEmployee();
        theSave.saveData(theHT); // save employee
    }//GEN-LAST:event_Add5_buttonActionPerformed

    private void Display_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_ButtonActionPerformed
        // Open window for display table and editing
        DisplayEmployees DisplayWindow = new DisplayEmployees();
        DisplayWindow.setVisible(true);
        DisplayWindow.setMainHT(theHT);
        DisplayWindow.DisplayEmployeesFillTableStartup();
    }//GEN-LAST:event_Display_ButtonActionPerformed

    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        // Open window to add employees
        AddNewEmployee AddWindow = new AddNewEmployee();
        AddWindow.setVisible(true);
        AddWindow.setMainHT(theHT); 
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        // Open new search window
        SearchEmployee SearchWindow = new SearchEmployee();
        SearchWindow.setVisible(true);
        SearchWindow.setMainHT(theHT);
    }//GEN-LAST:event_Search_buttonActionPerformed

    private void Save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_buttonActionPerformed
        // TODO add your handling code here:
        SaveEmployee saving = new SaveEmployee();
        saving.saveData(theHT);
    }//GEN-LAST:event_Save_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add5_button;
    private javax.swing.JButton Add_button;
    private javax.swing.JButton Display_Button;
    private javax.swing.JButton Save_button;
    private javax.swing.JButton Search_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
