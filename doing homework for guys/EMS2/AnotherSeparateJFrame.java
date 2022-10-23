

import java.net.*;
import java.io.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class AnotherSeparateJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnotherSeparateJFrame
     */
    public AnotherSeparateJFrame() {
        initComponents();
        
        jTextField1.setText("");
        jLabel2.setText("It feels like ----- C there!");
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("City");

        jTextField1.setText("jTextField1");

        jButton1.setText("Get the weather info from openweathermap.org");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("feels_like temperature gets written here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String theCityName = jTextField1.getText();
        String theCity = "&q=" + theCityName;
        
        		
	String stringURL = "https://api.openweathermap.org/data/2.5/weather?units=metric&mode=json";
	//String theCity = "&q=toronto"; // case of the city name doesn't matter :-)
	String theAppid = "&appid="; // My API Key for openweathermap.org
		
	stringURL += theCity;
	stringURL += theAppid;
		
	// Code adapted from that presented in
	// https://www.twilio.com/blog/5-ways-to-make-http-requests-in-java
		

	URL theUrl = null;
	try {
		theUrl = new URL(stringURL);
			
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	HttpURLConnection connection = null;
	try {
		connection = (HttpURLConnection) theUrl.openConnection();
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	String respMsg = "This is my bogus response message!";
	try {
		respMsg = connection.getResponseMessage();
		//System.out.println("respMsg is " + respMsg);
			
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
	/*
	String headerField;
	for (int i = 0; i < 100; i++) {
            headerField = connection.getHeaderField(i);
            System.out.println("headerField at " + i + " is " + headerField);
	}
	*/
		

	InputStream responseStream = null;
	try {
		responseStream = connection.getInputStream();
		//System.out.println("responseStream is " + responseStream);
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("\n\n***** No such city in their system! *****\n\n");
	}
		
		
	byte[] theData = new byte[1000]; // Make this byte array comfortably large
	try {
		int numBytesRead = responseStream.read(theData);
		/*
		System.out.println("\n\nnumBytesRead is " + numBytesRead);
		//System.out.println("theData is " + theData);
		for (int i = 0; i <= numBytesRead; i++) {
			System.out.print((char) theData[i]);
		}
		System.out.println("\n\n");
		*/
		// Look for the "feels_like" tag and grab its temperature value!
		String strData = new String(theData);
		System.out.println(strData);
		int posFeelsLike = strData.indexOf("\"feels_like\"");
		//System.out.println("posFeelsLike is " + posFeelsLike);
		int pos = posFeelsLike + 13;
		int p = 0;
		byte[] feelsLike = new byte[10]; // Make this byte array comfortably large
		while (theData[pos] != ',') {
			feelsLike[p] = theData[pos];
			pos++;
			p++;
		}
		String feelsLikeTemp = new String(feelsLike);
		double dFeelsLikeTemp = Double.parseDouble(feelsLikeTemp);
		System.out.println("\n\nThe temperature feels like " + dFeelsLikeTemp);
          
        jLabel2.setText("It feels like " + dFeelsLikeTemp + " C there!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AnotherSeparateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnotherSeparateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnotherSeparateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnotherSeparateJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnotherSeparateJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}