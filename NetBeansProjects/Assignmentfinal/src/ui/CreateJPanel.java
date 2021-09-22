/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Personalprofile;

/**
 *
 * @author susan
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    Personalprofile personalprofile;
    
    public CreateJPanel(Personalprofile personalprofile) {
        initComponents();
        
        this.personalprofile = personalprofile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeodata = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTele = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedicalNum = new javax.swing.JLabel();
        lblAccountNum = new javax.swing.JLabel();
        lblLicenseNum = new javax.swing.JLabel();
        lblVehicleIdentity = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIPO = new javax.swing.JLabel();
        lblIdentityNum = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtgeodata = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txttele = new javax.swing.JTextField();
        txtfax = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtssn = new javax.swing.JTextField();
        txtmedicalnum = new javax.swing.JTextField();
        txtaccountnum = new javax.swing.JTextField();
        txtlicense = new javax.swing.JTextField();
        txtvehicle = new javax.swing.JTextField();
        txtlinkedin = new javax.swing.JTextField();
        txtipo = new javax.swing.JTextField();
        txtidentitynum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        lblCreate.setText("Create Profile");

        lblName.setText("Name:");

        lblGeodata.setText("Geographical Data:");

        lblDOB.setText("Date of Birth:");

        lblTele.setText("Telephone:");

        lblFax.setText("Fax:");

        lblEmail.setText("Email:");

        lblSSN.setText("SSN:");

        lblMedicalNum.setText("Medical Number:");

        lblAccountNum.setText("Account Number:");

        lblLicenseNum.setText("License Number:");

        lblVehicleIdentity.setText("Vehicle Identity:");

        lblLinkedIn.setText("LinkedIn:");

        lblIPO.setText("IPO:");

        lblIdentityNum.setText("Identity Number:");

        txtgeodata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgeodataActionPerformed(evt);
            }
        });

        txtfax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfaxActionPerformed(evt);
            }
        });

        txtmedicalnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicalnumActionPerformed(evt);
            }
        });

        txtaccountnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccountnumActionPerformed(evt);
            }
        });

        txtlicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlicenseActionPerformed(evt);
            }
        });

        txtvehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvehicleActionPerformed(evt);
            }
        });

        txtlinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlinkedinActionPerformed(evt);
            }
        });

        txtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipoActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeodata)
                            .addComponent(lblName)
                            .addComponent(lblDOB)
                            .addComponent(lblTele)
                            .addComponent(lblFax)
                            .addComponent(lblEmail)
                            .addComponent(lblSSN)
                            .addComponent(lblMedicalNum)
                            .addComponent(lblAccountNum)
                            .addComponent(lblLicenseNum)
                            .addComponent(lblVehicleIdentity)
                            .addComponent(lblLinkedIn)
                            .addComponent(lblIPO)
                            .addComponent(lblIdentityNum))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txtgeodata)
                            .addComponent(txtdob)
                            .addComponent(txttele)
                            .addComponent(txtfax)
                            .addComponent(txtemail)
                            .addComponent(txtssn)
                            .addComponent(txtmedicalnum)
                            .addComponent(txtaccountnum)
                            .addComponent(txtlicense)
                            .addComponent(txtvehicle)
                            .addComponent(txtlinkedin)
                            .addComponent(txtipo)
                            .addComponent(txtidentitynum)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblCreate)))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGeodata)
                                    .addComponent(txtgeodata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDOB)
                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTele)
                                    .addComponent(txttele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFax)
                                    .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblSSN))
                            .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedicalNum)
                            .addComponent(txtmedicalnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAccountNum)
                            .addComponent(txtaccountnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicenseNum)
                            .addComponent(txtlicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblVehicleIdentity))
                    .addComponent(txtvehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtlinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIPO)
                    .addComponent(txtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdentityNum)
                    .addComponent(txtidentitynum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtgeodataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgeodataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgeodataActionPerformed

    private void txtaccountnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccountnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccountnumActionPerformed

    private void txtlicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlicenseActionPerformed

    private void txtvehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvehicleActionPerformed

    private void txtlinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlinkedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlinkedinActionPerformed

    private void txtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipoActionPerformed

    private void txtfaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfaxActionPerformed

    private void txtmedicalnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicalnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicalnumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        personalprofile.setName(txtname.getText());
        personalprofile.setBanknum(txtaccountnum.getText());
  
        personalprofile.setDOB(txtdob.getText());
        personalprofile.setEmail(txtemail.getText());
        personalprofile.setFax(txtfax.getText());
        personalprofile.setGeodata(txtgeodata.getText());
        personalprofile.setIPO(txtipo.getText());
        personalprofile.setIdentitynum(txtidentitynum.getText());
        personalprofile.setLinkedIn(txtlinkedin.getText());
        personalprofile.setMedicalnum(txtmedicalnum.getText());
        personalprofile.setSSN(txtssn.getText());
        personalprofile.setTele(txttele.getText());
        personalprofile.setVehicleidentity(txtvehicle.getText());
        personalprofile.setLicensenum(txtlicense.getText());
        
        JOptionPane.showMessageDialog(this,"Personal profile saved");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAccountNum;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblGeodata;
    private javax.swing.JLabel lblIPO;
    private javax.swing.JLabel lblIdentityNum;
    private javax.swing.JLabel lblLicenseNum;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTele;
    private javax.swing.JLabel lblVehicleIdentity;
    private javax.swing.JTextField txtaccountnum;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtgeodata;
    private javax.swing.JTextField txtidentitynum;
    private javax.swing.JTextField txtipo;
    private javax.swing.JTextField txtlicense;
    private javax.swing.JTextField txtlinkedin;
    private javax.swing.JTextField txtmedicalnum;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtssn;
    private javax.swing.JTextField txttele;
    private javax.swing.JTextField txtvehicle;
    // End of variables declaration//GEN-END:variables
}
