/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse.inventory.view.smallforms;

import edu.ijse.gdse.inventory.controller.ItemMajorController;
import edu.ijse.gdse.inventory.controller.ItemTypeController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import edu.ijse.gdse.inventory.model.ItemMajor;
import edu.ijse.gdse.inventory.model.ItemType;
import edu.ijse.gdse.inventory.other.TextFieldHandler;
import edu.ijse.gdse.inventory.view.forms.NewVendorForm;

/**
 *
 * @author Pahansith
 */
public class NewItemMajorForm extends javax.swing.JFrame {
    
    private static NewVendorForm motherForm;
    private DefaultComboBoxModel model;
    
    /**
     * Creates new form NewTaxSchemeForm
     */
    public NewItemMajorForm() {
        initComponents();
        setFrameValues();
        setIdText();
        setTypeCombo();
    }

    

    public NewItemMajorForm(NewVendorForm motherForm) {
        this();
        this.motherForm = motherForm;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        addLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    New Category");
        jLabel1.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Category");

        categoryText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoryText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoryTextKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Description");

        descriptionText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descriptionText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descriptionTextKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        idText.setEditable(false);
        idText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        addLabel.setBackground(new java.awt.Color(65, 175, 75));
        addLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addLabel.setForeground(new java.awt.Color(255, 255, 255));
        addLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLabel.setText("Add New");
        addLabel.setOpaque(true);
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
        });

        cancelLabel.setBackground(new java.awt.Color(68, 106, 129));
        cancelLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelLabel.setForeground(new java.awt.Color(255, 255, 255));
        cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelLabel.setText("Cancel");
        cancelLabel.setOpaque(true);
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
        });

        typeCombo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeCombo.setForeground(new java.awt.Color(0, 102, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Item Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionText)
                    .addComponent(categoryText)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionTextKeyTyped
        
    }//GEN-LAST:event_descriptionTextKeyTyped

    private void categoryTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryTextKeyTyped
       
    }//GEN-LAST:event_categoryTextKeyTyped

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        if (TextFieldHandler.isAllTextFieldsFilled(descriptionText,categoryText,idText)) {
            try {
                String description = descriptionText.getText();
                String category = categoryText.getText();
                String productCode = idText.getText();
                ItemType selectedItemType = (ItemType) typeCombo.getSelectedItem();
                String typeId = selectedItemType.getTypeId();
                ItemMajor itemMajor = new ItemMajor(productCode, category, description, typeId);
                
                boolean addNewItemMajor = ItemMajorController.addNewItemMajor(itemMajor);
                
                if (addNewItemMajor) {
                    
                    JOptionPane.showMessageDialog(NewItemMajorForm.this, "Added Succesfully !", "Add Category", JOptionPane.INFORMATION_MESSAGE);
                    setIdText();
                    TextFieldHandler.clearTextFields(categoryText,descriptionText);
                    
                } else {
                    JOptionPane.showMessageDialog(NewItemMajorForm.this, "Cannot Add", "Add Category", JOptionPane.ERROR);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }//GEN-LAST:event_addLabelMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelLabelMouseClicked

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewItemMajorForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JTextField categoryText;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables

    
    private void setFrameValues() {
        getContentPane().setBackground(new Color(0.5f, 0.5f, 0.5f, 0.5f));
        setBackground(new Color(0.5f, 0.5f, 0.5f, 0.5f));
    }

    private void setIdText() {
        try {
            String nextItemMajorId = ItemMajorController.getNextItemMajorId();
            idText.setText(nextItemMajorId);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void setTypeCombo() {
        try {
            ArrayList<ItemType> itemTypes = ItemTypeController.viewAllItemTypeDetails();
            model = (DefaultComboBoxModel) typeCombo.getModel();
            for (ItemType itemType : itemTypes) {
                model.addElement(itemType);
            }
            
            typeCombo.setSelectedIndex(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewItemMajorForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
