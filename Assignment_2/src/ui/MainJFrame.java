/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Person;
import model.PersonDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Address;

/**
 *
 * @author karthik
 */
public class MainJFrame extends javax.swing.JFrame {

    private PersonDirectory personDirectory;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    
    private Address workAddress1;
    private Address homeAddress1;
    
    private Address workAddress2;
    private Address homeAddress2;
    
    private Address workAddress3;
    private Address homeAddress3;
    
    private Address workAddress4;
    private Address homeAddress4;
    
    private Address workAddress5;
    private Address homeAddress5;
    
    private Address workAddress6;
    private Address homeAddress6;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.personDirectory = new PersonDirectory();
        this.workAddress1 = new Address();
        this.homeAddress1 = new Address();
        this.workAddress2 = new Address();
        this.homeAddress2 = new Address();
        this.workAddress3 = new Address();
        this.homeAddress3 = new Address();
        this.workAddress4 = new Address();
        this.homeAddress4 = new Address();
        this.workAddress5 = new Address();
        this.homeAddress5 = new Address();
        this.workAddress6 = new Address();
        this.homeAddress6 = new Address();
        
        Person person1 = personDirectory.addPerson();
        person1.setFirstName("Karthik");
        person1.setLastName("Kashyap");
        person1.setSsn(4812009);
        person1.setAge(25);
        person1.setHeight(6.2f);
        person1.setWeight(77.5);
        
        
        
        workAddress1.setStreetAddress("1175");
        workAddress1.setUnitNumber("50");
        workAddress1.setCity("Boston");
        workAddress1.setState("MA");
        workAddress1.setZip(02215);
        workAddress1.setPhoneNumber(9986294228l);
        person1.setWorkAddress(workAddress1);
        
        homeAddress1.setStreetAddress("111 tremont street");
        homeAddress1.setUnitNumber("11150");
        homeAddress1.setCity("Boston");
        homeAddress1.setState("Massachusetts");
        homeAddress1.setZip(21150);
        homeAddress1.setPhoneNumber(8627774812l);
        person1.setHomeAddress(homeAddress1);
        
        Person person2 = personDirectory.addPerson();
        person2.setFirstName("Raj");
        person2.setLastName("Kumar");
        person2.setSsn(1234567);
        person2.setAge(27);
        person2.setHeight(5.9f);
        person2.setWeight(67.5);


        workAddress2.setStreetAddress("550 Mission Main St");
        workAddress2.setUnitNumber("1080");
        workAddress2.setCity("Dallas");
        workAddress2.setState("Texas");
        workAddress2.setZip(1234567890);
        workAddress2.setPhoneNumber(9986294298l);
        person2.setWorkAddress(workAddress2);

        homeAddress2.setStreetAddress("109 germanian street");
        homeAddress2.setUnitNumber("1111");
        homeAddress2.setCity("Mumbai");
        homeAddress2.setState("Maharashtra");
        homeAddress2.setZip(4010304);
        homeAddress2.setPhoneNumber(8627223812l);
        person2.setHomeAddress(homeAddress2);

        // Person 3
        Person person3 = personDirectory.addPerson();
        person3.setFirstName("Yatish");
        person3.setLastName("M");
        person3.setSsn(1234);
        person3.setAge(34);
        person3.setHeight(5.3f);
        person3.setWeight(51.9);


        workAddress3.setStreetAddress("41 calument street");
        workAddress3.setUnitNumber("1550");
        workAddress3.setCity("Bangalore");
        workAddress3.setState("KA");
        workAddress3.setZip(4011001);
        workAddress3.setPhoneNumber(9862965228l);
        person3.setWorkAddress(workAddress3);


        Address homeAddress3 = new Address();
        homeAddress3.setStreetAddress("9012 Maple St");
        homeAddress3.setUnitNumber("Apt 5B");
        homeAddress3.setCity("Village Town");
        homeAddress3.setState("GA");
        homeAddress3.setZip(13579);
        homeAddress3.setPhoneNumber(6727774812l);
        person3.setHomeAddress(homeAddress3);

        // Person 4
        Person person4 = personDirectory.addPerson();
        person4.setFirstName("Dave");
        person4.setLastName("Hood");
        person4.setSsn(222334444); 
        person4.setAge(38);
        person4.setHeight(6.5f);
        person4.setWeight(98.5);
       

        Address workAddress4 = new Address();
        workAddress4.setStreetAddress("800 Pine St");
        workAddress4.setUnitNumber("second floor");
        workAddress4.setCity("City Center");
        workAddress4.setState("IL");
        workAddress4.setZip(24680);
        workAddress4.setPhoneNumber(9129544228l);
        person4.setWorkAddress(workAddress4);

        Address homeAddress4 = new Address();
        homeAddress4.setStreetAddress("3456 Cedar St");
        homeAddress4.setUnitNumber("Unit 15");
        homeAddress4.setCity("Rural Town");
        homeAddress4.setState("NC");
        homeAddress4.setZip(98765);
        homeAddress4.setPhoneNumber(8628884531l);
        person4.setHomeAddress(homeAddress4);

        // Person 5
        Person person5 = personDirectory.addPerson();
        person5.setFirstName("Eva");
        person5.setLastName("Martinez");
        person5.setSsn(555667777);
        person5.setAge(42);
        person5.setHeight(5.11f);
        person5.setWeight(98);

        Address workAddress5 = new Address();
        workAddress5.setStreetAddress("900 Walnut St");
        workAddress5.setUnitNumber("Suite 20");
        workAddress5.setCity("Midtown");
        workAddress5.setState("MI");
        workAddress5.setZip(13579); 
        workAddress5.setPhoneNumber(6528734581l);
        person5.setWorkAddress(workAddress5);

        Address homeAddress5 = new Address();
        homeAddress5.setStreetAddress("6789 Birch St");
        homeAddress5.setUnitNumber("Apt 30");
        homeAddress5.setCity("Coastal City");
        homeAddress5.setState("OR");
        homeAddress5.setZip(2468);
        homeAddress5.setPhoneNumber(8605341812l);
        person5.setHomeAddress(homeAddress5);

      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnListPersons = new javax.swing.JButton();
        btnSearchPerson = new javax.swing.JButton();
        txtSearchInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topJPanel.setBackground(new java.awt.Color(102, 153, 255));

        btnAddPerson.setBackground(new java.awt.Color(255, 102, 102));
        btnAddPerson.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAddPerson.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnListPersons.setBackground(new java.awt.Color(255, 102, 102));
        btnListPersons.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnListPersons.setForeground(new java.awt.Color(255, 255, 255));
        btnListPersons.setText("List Person");
        btnListPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListPersonsActionPerformed(evt);
            }
        });

        btnSearchPerson.setBackground(new java.awt.Color(255, 102, 102));
        btnSearchPerson.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnSearchPerson.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchPerson.setText("Search for Person");
        btnSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPersonActionPerformed(evt);
            }
        });

        txtSearchInput.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchInput.setText("Type name or street address");
        txtSearchInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchInputFocusLost(evt);
            }
        });
        txtSearchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchInputActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 204, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Person Profile");

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListPersons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSearchPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(btnListPersons)
                .addGap(116, 116, 116)
                .addComponent(txtSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        topJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddPerson, btnListPersons});

        jSplitPane1.setTopComponent(topJPanel);

        userProcessContainer.setBackground(new java.awt.Color(204, 204, 204));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        CreatePersonJPanel panel = new CreatePersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("CreatePersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnListPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListPersonsActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel panel = new ManagePersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("ManagePersonJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListPersonsActionPerformed

    private void btnSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPersonActionPerformed
        // TODO add your handling code here:
        Person result = personDirectory.searchPerson(txtSearchInput.getText());
        
        if("".equals(txtSearchInput.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter a first name/last name or street address!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            if(result == null) {
                JOptionPane.showMessageDialog(null, "Person does not exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                Address workResult = result.getWorkAddress();
                Address homeResult = result.getHomeAddress();
        
                ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, result, workResult, homeResult);
                userProcessContainer.add("ViewPersonJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnSearchPersonActionPerformed

    private void txtSearchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchInputActionPerformed

    private void txtSearchInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchInputFocusGained
        // TODO add your handling code here:
        if(txtSearchInput.getText().equalsIgnoreCase("Type name or street address"))
        {
            txtSearchInput.setText("");
            txtSearchInput.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtSearchInputFocusGained

    private void txtSearchInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchInputFocusLost
        // TODO add your handling code here:
        if(txtSearchInput.getText().equalsIgnoreCase(""))
        {
            txtSearchInput.setText("Type name or street address");
            txtSearchInput.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtSearchInputFocusLost

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
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnListPersons;
    private javax.swing.JButton btnSearchPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JTextField txtSearchInput;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
