/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tocar
 */
public class searchemp extends javax.swing.JFrame {
    
    /**
     * Creates new form search 
     */
    private MyHashTable mainHT;
    public searchemp() {
        initComponents();
        empinfotitle.setVisible(false);
        firstname.setVisible(false);
        lastname.setVisible(false);
        empstatus.setVisible(false);
        hourlywage.setVisible(false);
        hoursperweek.setVisible(false);
        weeksperyear.setVisible(false);
        annualnetincome.setVisible(false);
        fn.setVisible(false);
        ln.setVisible(false);
        es.setVisible(false);
        hw.setVisible(false);
        hweek.setVisible(false);
        wy.setVisible(false);
        ani.setVisible(false);
    }
    public void setMainHT(MyHashTable theRefVal){
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

        jTextField6 = new javax.swing.JTextField();
        searchemp = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        empinfotitle = new java.awt.Label();
        firstname = new java.awt.Label();
        lastname = new java.awt.Label();
        empnuminput = new java.awt.TextField();
        hourlywage = new javax.swing.JLabel();
        hoursperweek = new java.awt.Label();
        weeksperyear = new java.awt.Label();
        annualnetincome = new java.awt.Label();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        hw = new javax.swing.JTextField();
        hweek = new javax.swing.JTextField();
        wy = new javax.swing.JTextField();
        ani = new javax.swing.JTextField();
        empstatus = new java.awt.Label();
        es = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        compresp = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchemp.setText("Search Employee");
        searchemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchempActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        empinfotitle.setAlignment(java.awt.Label.CENTER);
        empinfotitle.setText("Employee Info");

        firstname.setText("First Name:");

        lastname.setText("Last Name:");

        empnuminput.setText("Employee Number");

        hourlywage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hourlywage.setText("Hourly Wage:");

        hoursperweek.setText("Hours per Week:");

        weeksperyear.setText("Weeks per Year:");

        annualnetincome.setText("Annual Net Income: ");

        fn.setEditable(false);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });

        ln.setEditable(false);

        hw.setEditable(false);
        hw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hwActionPerformed(evt);
            }
        });

        hweek.setEditable(false);

        wy.setEditable(false);

        ani.setEditable(false);

        empstatus.setText("Employee Status:");

        es.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compresp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weeksperyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(empinfotitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(firstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(hourlywage, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(53, 53, 53)))
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(annualnetincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(empstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(19, 19, 19)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fn)
                                        .addComponent(ln)
                                        .addComponent(hw)
                                        .addComponent(hweek)
                                        .addComponent(wy)
                                        .addComponent(ani)
                                        .addComponent(es)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchemp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empnuminput, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                            .addComponent(hoursperweek, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchemp)
                            .addComponent(empnuminput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(compresp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empinfotitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hourlywage)
                            .addComponent(hw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoursperweek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hweek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weeksperyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(annualnetincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed
    
    private void searchempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchempActionPerformed
    int theEmpNum = Integer.parseInt(empnuminput.getText());
    EmployeeInfo Posinlist;
    FTE fteemp=null;
    PTE pteemp=null;
    Posinlist=mainHT.searchByEmployeeNumber(theEmpNum);
    if(Posinlist==null){
        empinfotitle.setVisible(false);
        firstname.setVisible(false);
        lastname.setVisible(false);
        empstatus.setVisible(false);
        hourlywage.setVisible(false);
        hoursperweek.setVisible(false);
        weeksperyear.setVisible(false);
        annualnetincome.setVisible(false);
        fn.setVisible(false);
        ln.setVisible(false);
        es.setVisible(false);
        hw.setVisible(false);
        hweek.setVisible(false);
        wy.setVisible(false);
        ani.setVisible(false);
        compresp.setText("There is no Employee Number "+theEmpNum);
    }
    else{
        empinfotitle.setVisible(true);
        firstname.setVisible(true);
        lastname.setVisible(true);
        empstatus.setVisible(true);
        hourlywage.setVisible(true);
        hoursperweek.setVisible(true);
        weeksperyear.setVisible(true);
        annualnetincome.setVisible(true);
        fn.setVisible(true);
        ln.setVisible(true);
        es.setVisible(true);
        hw.setVisible(true);
        hweek.setVisible(true);
        wy.setVisible(true);
        ani.setVisible(true);
        compresp.setText("Displaying Information for Employee Number "+theEmpNum);
        fn.setText(Posinlist.firstName);
        ln.setText(Posinlist.lastName);
        if (Posinlist instanceof PTE){
            es.setText("Part-Time");
            pteemp = (PTE) Posinlist; 
            String HourlyWage = Double.toString(pteemp.hourlyWage);              
            String HoursPerWeek = Double.toString(pteemp.hoursPerWeek);
            String WeeksPerYear = Double.toString(pteemp.weeksPerYear);
            String PteAnnualIncome = Double.toString(pteemp.CalcPteAnnualNetIncome());
            System.out.println(Double.toString(pteemp.hourlyWage));
            hw.setText(HourlyWage);
            System.out.println(HourlyWage);
            System.out.println("fuck this shit im out");
            hweek.setText(HoursPerWeek);
            wy.setText(WeeksPerYear);
            ani.setText(PteAnnualIncome);
        }    
        // TODO add your handling code here:
        else{
            es.setText("Full-Time");
        }
    }
    }//GEN-LAST:event_searchempActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void hwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hwActionPerformed

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
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ani;
    private java.awt.Label annualnetincome;
    private javax.swing.JLabel compresp;
    private java.awt.Label empinfotitle;
    private java.awt.TextField empnuminput;
    private java.awt.Label empstatus;
    private javax.swing.JTextField es;
    private javax.swing.JButton exit;
    private java.awt.Label firstname;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel hourlywage;
    private java.awt.Label hoursperweek;
    private javax.swing.JTextField hw;
    private javax.swing.JTextField hweek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField6;
    private java.awt.Label lastname;
    private javax.swing.JTextField ln;
    private javax.swing.JButton searchemp;
    private java.awt.Label weeksperyear;
    private javax.swing.JTextField wy;
    // End of variables declaration//GEN-END:variables
}
