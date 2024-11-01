/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Person;
import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;

/**
 *
 * @author  karthik
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    /**
     * Creates new form CreatePersonJPanel
     */
    CreatePersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        btnCreatePerson = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtWorkStreet = new javax.swing.JTextField();
        txtWorkUnit = new javax.swing.JTextField();
        txtWorkCity = new javax.swing.JTextField();
        txtWorkState = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtWorkZip = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtWorkPhoneNumber = new javax.swing.JTextField();
        HomeAddress = new javax.swing.JPanel();
        txtHomeStreet = new javax.swing.JTextField();
        txtHomeUnit = new javax.swing.JTextField();
        txtHomeCity = new javax.swing.JTextField();
        txtHomeState = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtHomeZip = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtHomePhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 153, 255));

        lblHeader.setBackground(new java.awt.Color(0, 102, 0));
        lblHeader.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Create Person");

        txtFirstName.setBackground(new java.awt.Color(204, 204, 204));
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setBackground(new java.awt.Color(204, 204, 204));
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtSSN.setBackground(new java.awt.Color(204, 204, 204));
        txtSSN.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtHeight.setBackground(new java.awt.Color(204, 204, 204));
        txtHeight.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnCreatePerson.setBackground(new java.awt.Color(204, 204, 204));
        btnCreatePerson.setText("Create Account");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Social Security Number:");

        jLabel4.setText("Age");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "Work address"));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        txtWorkStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkStreetActionPerformed(evt);
            }
        });

        txtWorkState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkStateActionPerformed(evt);
            }
        });

        jLabel13.setText("Street Address");

        jLabel18.setText("Unit Number");

        jLabel19.setText("City");

        jLabel20.setText("State");

        jLabel21.setText("Zip code");

        txtWorkZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkZipActionPerformed(evt);
            }
        });

        jLabel23.setText("Phone Number");

        txtWorkPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkPhoneNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtWorkStreet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(txtWorkCity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtWorkZip, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtWorkPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWorkUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtWorkCity, txtWorkPhoneNumber, txtWorkState, txtWorkStreet, txtWorkUnit, txtWorkZip});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtWorkCity, txtWorkPhoneNumber, txtWorkState, txtWorkStreet, txtWorkUnit, txtWorkZip});

        HomeAddress.setBackground(new java.awt.Color(153, 204, 255));
        HomeAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "Home Address"));
        HomeAddress.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Street Address");

        jLabel7.setText("Unit Number");

        jLabel8.setText("City");

        jLabel9.setText("State");

        jLabel22.setText("Zip code");

        jLabel24.setText("Phone Number");

        javax.swing.GroupLayout HomeAddressLayout = new javax.swing.GroupLayout(HomeAddress);
        HomeAddress.setLayout(HomeAddressLayout);
        HomeAddressLayout.setHorizontalGroup(
            HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeAddressLayout.createSequentialGroup()
                        .addComponent(txtHomeZip, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(txtHomePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeAddressLayout.createSequentialGroup()
                        .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(HomeAddressLayout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtHomeCity)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHomeStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHomeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        HomeAddressLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHomeCity, txtHomePhoneNumber, txtHomeState, txtHomeStreet, txtHomeUnit, txtHomeZip});

        HomeAddressLayout.setVerticalGroup(
            HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHomeStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHomeZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHomePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        HomeAddressLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtHomeCity, txtHomePhoneNumber, txtHomeState, txtHomeStreet, txtHomeUnit, txtHomeZip});

        jLabel5.setText("Height");

        jLabel10.setText("Weight");

        txtWeight.setBackground(new java.awt.Color(204, 204, 204));
        txtWeight.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreatePerson, txtAge, txtFirstName, txtHeight, txtLastName, txtSSN, txtWeight});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtFirstName, txtHeight, txtLastName, txtSSN, txtWeight});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String ssn = txtSSN.getText();
//        int age = Integer.parseInt(txtAge.getText());
        String age = txtAge.getText();
//        float height = Float.parseFloat(txtHeight.getText());
        String height = txtHeight.getText();
//        double weight = Double.parseDouble(txtWeight.getText());
        String weight = txtWeight.getText();

        
        String workStreet = txtWorkStreet.getText();
        String workUnit = txtWorkUnit.getText();
        String workCity = txtWorkCity.getText();
        String workState = txtWorkState.getText();
        String workZip = txtWorkZip.getText();
//        long workPhoneNumber = Long.parseLong(txtWorkPhoneNumber.getText());
        String workPhoneNumber = txtWorkPhoneNumber.getText();

        
        String homeStreet = txtHomeStreet.getText();
        String homeUnit = txtHomeUnit.getText();
        String homeCity = txtHomeCity.getText();
        String homeState = txtHomeState.getText();
        String homeZip = txtHomeZip.getText();
//        long homePhoneNumber = Long.parseLong(txtHomePhoneNumber.getText());
        String homePhoneNumber = txtHomePhoneNumber.getText();

        if ("".equals(firstName) || "".equals(lastName) || "".equals(height) || "".equals(weight) || "".equals(age) || "".equals(ssn)
                || "".equals(workStreet) || "".equals(workUnit) || "".equals(workCity) || "".equals(workState) ||"".equals(workPhoneNumber) || "".equals(workZip) 
                || "".equals(homeStreet) || "".equals(homeUnit) || "".equals(homeCity) || "".equals(homeState) || "".equals(homePhoneNumber) || "".equals(homeZip)) {
            JOptionPane.showMessageDialog(null, "Please enter all the details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int ageNew;
        try {
            ageNew = Integer.parseInt(age);
            if (ageNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric Age!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        long workPhonenumberNew;
        try {
            workPhonenumberNew = Long.parseLong(workPhoneNumber);
              if (workPhonenumberNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric Work Phone Number!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        long homePhonenumberNew;
        try {
            homePhonenumberNew = Long.parseLong(homePhoneNumber);
            if (homePhonenumberNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric Home Phone Number!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        float heightNew;
        try {
            heightNew = Float.parseFloat(height);
            if (heightNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric Height!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double weightNew;
        try {
            weightNew = Double.parseDouble(weight);
            if (weightNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric Weight!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        


        long ssnNew;
        try {
            ssnNew = Long.parseLong(ssn);
            if (ssnNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric SSN!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
       
        
        int workZipNew;
        try {
            workZipNew = Integer.parseInt(workZip);
            if (workZipNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric zip code!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int homeZipNew;
        try {
            homeZipNew = Integer.parseInt(homeZip);
            if (homeZipNew < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a numeric zip code!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Person person = personDirectory.addPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSsn(ssnNew);
        person.setAge(ageNew);
        person.setHeight(heightNew);
        person.setWeight(weightNew);
        
        
        Address workAddress = new Address();
        Address homeAddress = new Address();
        
        workAddress.setStreetAddress(workStreet);
        workAddress.setUnitNumber(workUnit);
        workAddress.setCity(workCity);
        workAddress.setState(workState);
        workAddress.setPhoneNumber(workPhonenumberNew);
        workAddress.setZip(workZipNew);
        person.setWorkAddress(workAddress);
        
        homeAddress.setStreetAddress(homeStreet);
        homeAddress.setUnitNumber(homeUnit);
        homeAddress.setCity(homeCity);
        homeAddress.setPhoneNumber(homePhonenumberNew);
        homeAddress.setState(homeState);
        homeAddress.setZip(homeZipNew);
        person.setHomeAddress(homeAddress);

        JOptionPane.showMessageDialog(null, "Person successfully created");

        txtFirstName.setText("");
        txtLastName.setText("");
        txtSSN.setText("");
        txtHeight.setText("");
        txtAge.setText(" ");
        txtWeight.setText(" ");
        
        txtWorkStreet.setText("");
        txtWorkUnit.setText("");
        txtWorkCity.setText("");
        txtWorkState.setText("");
        txtWorkPhoneNumber.setText(" ");
        txtWorkZip.setText("");
        
        txtHomeStreet.setText("");
        txtHomeUnit.setText("");
        txtHomeCity.setText("");
        txtHomeState.setText("");
        txtHomePhoneNumber.setText(" ");
        txtHomeZip.setText("");
        
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void txtWorkStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkStreetActionPerformed

    private void txtWorkStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkStateActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtWorkZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkZipActionPerformed

    private void txtWorkPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeAddress;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHomeCity;
    private javax.swing.JTextField txtHomePhoneNumber;
    private javax.swing.JTextField txtHomeState;
    private javax.swing.JTextField txtHomeStreet;
    private javax.swing.JTextField txtHomeUnit;
    private javax.swing.JTextField txtHomeZip;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWorkCity;
    private javax.swing.JTextField txtWorkPhoneNumber;
    private javax.swing.JTextField txtWorkState;
    private javax.swing.JTextField txtWorkStreet;
    private javax.swing.JTextField txtWorkUnit;
    private javax.swing.JTextField txtWorkZip;
    // End of variables declaration//GEN-END:variables
}
