
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
 * @author super
 */
public class Forms extends javax.swing.JFrame {

    private String gender;
    private String licence;
    private String jinsia;
    private String leseni;
    Connection con=null;
    PreparedStatement pst=null;
    /**
     * Creates new form Home
     */
    public Forms() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        a = new javax.swing.JCheckBox();
        b = new javax.swing.JCheckBox();
        c = new javax.swing.JCheckBox();
        d = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        licenceID = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        btncsubmit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmale = new javax.swing.JRadioButton();
        cfemale = new javax.swing.JRadioButton();
        doesntmatter = new javax.swing.JRadioButton();
        caddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ca = new javax.swing.JCheckBox();
        cb = new javax.swing.JCheckBox();
        cc = new javax.swing.JCheckBox();
        cd = new javax.swing.JCheckBox();
        cdoesntmatter = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        educationlist = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Driver Portal Form ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 11, 476, 100);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("licence ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(21, 186, 101, 29);
        getContentPane().add(address);
        address.setBounds(190, 310, 199, 29);

        a.setText("A");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a);
        a.setBounds(182, 240, 33, 23);

        b.setText("B");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(182, 271, 44, 23);

        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c);
        c.setBounds(259, 240, 49, 23);

        d.setText("D");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        getContentPane().add(d);
        d.setBounds(259, 271, 56, 23);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setText("Age:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 150, 43, 29);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setText("Sex:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(31, 149, 39, 29);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setText("licence Class:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(21, 235, 129, 29);
        getContentPane().add(licenceID);
        licenceID.setBounds(182, 188, 199, 29);

        male.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(80, 150, 55, 25);

        female.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(140, 150, 67, 25);
        getContentPane().add(age);
        age.setBounds(290, 150, 80, 30);

        btncsubmit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btncsubmit.setText("Submit");
        btncsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btncsubmit);
        btncsubmit.setBounds(610, 540, 100, 60);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setText("Education Level:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 400, 170, 29);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(51, 0, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Company Form");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 230, 100);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Do you want A driver?");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 120, 210, 20);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 230, 60, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Qualifications of Driver you want:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 300, 190, 30);
        jPanel3.add(name);
        name.setBounds(20, 190, 180, 30);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name of Your Company/Business:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 160, 175, 30);

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Licence Class:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 420, 110, 23);

        cmale.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmale.setText("Male");
        cmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmaleActionPerformed(evt);
            }
        });
        jPanel3.add(cmale);
        cmale.setBounds(60, 350, 55, 25);

        cfemale.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cfemale.setText("Female");
        cfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfemaleActionPerformed(evt);
            }
        });
        jPanel3.add(cfemale);
        cfemale.setBounds(120, 350, 67, 25);

        doesntmatter.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        doesntmatter.setText("Doesn't Matter");
        doesntmatter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doesntmatterActionPerformed(evt);
            }
        });
        jPanel3.add(doesntmatter);
        doesntmatter.setBounds(60, 380, 120, 25);

        caddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddressActionPerformed(evt);
            }
        });
        jPanel3.add(caddress);
        caddress.setBounds(20, 260, 180, 30);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sex:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 350, 39, 30);

        ca.setText("A");
        ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caActionPerformed(evt);
            }
        });
        jPanel3.add(ca);
        ca.setBounds(40, 450, 33, 23);

        cb.setText("B");
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        jPanel3.add(cb);
        cb.setBounds(80, 450, 31, 23);

        cc.setText("C");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel3.add(cc);
        cc.setBounds(120, 450, 33, 23);

        cd.setText("D");
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });
        jPanel3.add(cd);
        cd.setBounds(160, 450, 33, 23);

        cdoesntmatter.setText("Doesn't Matter");
        cdoesntmatter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdoesntmatterActionPerformed(evt);
            }
        });
        jPanel3.add(cdoesntmatter);
        cdoesntmatter.setBounds(40, 480, 140, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(500, 10, 220, 600);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Are you A Driver?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 120, 210, 20);

        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(380, 550, 110, 50);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel16.setText("Current Address:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 310, 170, 29);

        educationlist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        educationlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor Degree", "Higher Diploma", "Advanced Diploma", "Certificate", " " }));
        educationlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationlistActionPerformed(evt);
            }
        });
        getContentPane().add(educationlist);
        educationlist.setBounds(200, 400, 190, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ENTER YOUR FULLNAME:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 360, 180, 30);
        getContentPane().add(fullname);
        fullname.setBounds(190, 360, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caddressActionPerformed

    private void cfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfemaleActionPerformed
        // TODO add your handling code here:
        jinsia="Female";
    }//GEN-LAST:event_cfemaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender="Male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender="Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        licence="a";
    }//GEN-LAST:event_bActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
        licence="b";
    }//GEN-LAST:event_aActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
        licence="c";
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
        licence="d";
    }//GEN-LAST:event_dActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            // TODO add your handling code here:
            con=DriverManager.getConnection("jdbc:mysql://localhost/driver_portal","root","");
            String sql="INSERT INTO Drivers(FullName,LicenceID,LicenceClass,EducationLevel,Address,Age,Sex) VALUES(?,?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);
             pst.setString(1,fullname.getText());
            pst.setString(2,licenceID.getText());
            
            pst.setString(3,licence);
            String value=educationlist.getSelectedItem().toString();
            pst.setString(4,value);
            pst.setString(5,address.getText());
            pst.setString(6,age.getText());
            pst.setString(7,gender);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"SUBMITTED SUCESSFULLY");
            Home m=new Home();
            m.setVisible(true);
        } catch (Exception ex) {
              JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void educationlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_educationlistActionPerformed

    private void btncsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncsubmitActionPerformed
        try {
            // TODO add your handling code here:
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/driver_portal","root","");
            String query="INSERT INTO driver_seeker(CompanyName,Address,Sex,LicenceClass) VALUES(?,?,?,?)";
            pst=con.prepareStatement(query);
            pst.setString(1,name.getText());
            pst.setString(2,caddress.getText());
            pst.setString(3,jinsia);
            pst.setString(4,leseni);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Submitted Sucessfully");
            Home m=new Home();
            m.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_btncsubmitActionPerformed

    private void cmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmaleActionPerformed
        // TODO add your handling code here:
        jinsia="Male";
    }//GEN-LAST:event_cmaleActionPerformed

    private void doesntmatterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doesntmatterActionPerformed
        // TODO add your handling code here:
        jinsia="Not Matter";
    }//GEN-LAST:event_doesntmatterActionPerformed

    private void caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caActionPerformed
        // TODO add your handling code here:
        leseni="a";
    }//GEN-LAST:event_caActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
        leseni="b";
    }//GEN-LAST:event_cbActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
leseni="c";       // TODO add your handling code here:
    }//GEN-LAST:event_ccActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
 leseni="d";       // TODO add your handling code here:
    }//GEN-LAST:event_cdActionPerformed

    private void cdoesntmatterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdoesntmatterActionPerformed
leseni="Not Matter";        // TODO add your handling code here:
    }//GEN-LAST:event_cdoesntmatterActionPerformed

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
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox a;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JCheckBox b;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btncsubmit;
    private javax.swing.JCheckBox c;
    private javax.swing.JCheckBox ca;
    private javax.swing.JTextField caddress;
    private javax.swing.JCheckBox cb;
    private javax.swing.JCheckBox cc;
    private javax.swing.JCheckBox cd;
    private javax.swing.JCheckBox cdoesntmatter;
    private javax.swing.JRadioButton cfemale;
    private javax.swing.JRadioButton cmale;
    private javax.swing.JCheckBox d;
    private javax.swing.JRadioButton doesntmatter;
    private javax.swing.JComboBox<String> educationlist;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField licenceID;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables

}
