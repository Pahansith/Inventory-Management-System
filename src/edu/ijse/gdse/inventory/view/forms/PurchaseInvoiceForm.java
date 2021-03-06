/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse.inventory.view.forms;

import edu.ijse.gdse.inventory.controller.PaymentController;
import edu.ijse.gdse.inventory.controller.PurchaseInvoiceController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import edu.ijse.gdse.inventory.model.InventoryItem;
import edu.ijse.gdse.inventory.model.ItemDetail;
import edu.ijse.gdse.inventory.model.Payment;
import edu.ijse.gdse.inventory.model.PurchaseInvoice;
import edu.ijse.gdse.inventory.model.Vendor;
import edu.ijse.gdse.inventory.model.helper.ItemTableModel;
import edu.ijse.gdse.inventory.model.helper.UpdateInventoryItem;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import edu.ijse.gdse.inventory.other.Validation;
import edu.ijse.gdse.inventory.view.smallforms.PrintBillPrompt;
import edu.ijse.gdse.inventory.view.smallforms.PrintInvoicePreviewForm;


/**
 *
 * @author Pahansith
 */
public class PurchaseInvoiceForm extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private double total = 0;
    private ArrayList<ItemTableModel> itemTableModelList;
    private ArrayList<ItemDetail> itemDetailsList;
    private ArrayList<InventoryItem> newlyAddingItemsList;
    private Vendor selectedVendor;
    private ArrayList<UpdateInventoryItem> updateList;
    
    public PurchaseInvoiceForm() {
        initComponents();
        setTableValues();
        setDate();
        setBillNumber();
        getTableModel();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        saveLabel = new javax.swing.JLabel();
        itemTableScroll = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sellerText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totalAmountText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        invoiceNumberText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dueDateText = new org.jdesktop.swingx.JXDatePicker();
        jCheckBox1 = new javax.swing.JCheckBox();
        discountText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subTotalText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(247, 246, 242));

        jPanel8.setBackground(new java.awt.Color(43, 87, 154));
        jPanel8.setMinimumSize(new java.awt.Dimension(1120, 10));
        jPanel8.setPreferredSize(new java.awt.Dimension(1120, 7));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("New Item");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(827, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(150, 150, 150))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 80));

        jLabel4.setBackground(new java.awt.Color(68, 106, 129));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cacel");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, -1, -1));

        saveLabel.setBackground(new java.awt.Color(65, 175, 75));
        saveLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(255, 255, 255));
        saveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveLabel.setText("Save");
        saveLabel.setOpaque(true);
        saveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, -1, -1));

        itemTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Code", "Seller Code", "Description", "Brand", "Supply Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTableScroll.setViewportView(itemTable);

        add(itemTableScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1060, 320));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Seller");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 30));

        sellerText.setEditable(false);
        sellerText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(sellerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Date");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 50, 30));
        add(totalAmountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 200, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Invoice Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 90, 30));

        invoiceNumberText.setEditable(false);
        invoiceNumberText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(invoiceNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Total Amount");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 90, 30));

        dateText.setEditable(false);
        dateText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Payment Due Date");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 110, 30));
        add(dueDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 582, 200, 28));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Make A Payment?");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 140, 30));

        discountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                discountTextKeyTyped(evt);
            }
        });
        add(discountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Discount");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Sub Total");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 90, 30));

        subTotalText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                subTotalTextKeyTyped(evt);
            }
        });
        add(subTotalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void saveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseClicked
        try {
            PurchaseInvoice invoiceDetail = generatePurchaseInvoiceDetail();
            Payment payment = generatePaymentDetails();
            boolean isAdded = PurchaseInvoiceController.addNewPurchaseInvoice(invoiceDetail,updateList,payment,newlyAddingItemsList,itemDetailsList);
            if (isAdded) {
                PrintBillPrompt printForm = new PrintBillPrompt(this,tableModel);
                printForm.setVisible(true);
            }else{
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveLabelMouseClicked

    private void discountTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountTextKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double total = Double.parseDouble(totalAmountText.getText());
            double discount = Double.parseDouble(discountText.getText());
            
            subTotalText.setText(Double.toString(total - discount));
        }else{
            Validation.validateOnlyForNumbers(evt);
        }
        
        
    }//GEN-LAST:event_discountTextKeyTyped

    private void subTotalTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subTotalTextKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalTextKeyTyped

    private void discountTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountTextKeyPressed
        
    }//GEN-LAST:event_discountTextKeyPressed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField discountText;
    private org.jdesktop.swingx.JXDatePicker dueDateText;
    private javax.swing.JTextField invoiceNumberText;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane itemTableScroll;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JTextField sellerText;
    private javax.swing.JTextField subTotalText;
    private javax.swing.JTextField totalAmountText;
    // End of variables declaration//GEN-END:variables

    private void setDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String frmattedDate = dateFormat.format(date);     
        dateText.setText(frmattedDate);
    }

    private void setBillNumber(){
        try {
            
            String nextInvoiceNumber = PurchaseInvoiceController.getNextInvoiceNumber();
            invoiceNumberText.setText(nextInvoiceNumber);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    void valuesOfItems(ArrayList<ItemTableModel> itemTableModelList,ArrayList<UpdateInventoryItem> updateList,ArrayList<ItemDetail> itemDetailsList, ArrayList<InventoryItem> newlyAddingItemsList,Vendor selectedVendor) {
        this.itemTableModelList = itemTableModelList;
        this.itemDetailsList = itemDetailsList;
        this.newlyAddingItemsList = newlyAddingItemsList;
        this.selectedVendor = selectedVendor;
        this.updateList = updateList;
        
        for (ItemTableModel itemModel : itemTableModelList) {    
            
            String detailCode = itemModel.getDetailCode();
            String itemCode = itemModel.getItemCode();
            String sellerCode = itemModel.getSellerCode();
            String description = itemModel.getDescription();
            String brand = itemModel.getBrand();
            double supplyPrice = itemModel.getSupplyPrice();
            int updateQty = itemModel.getUpdateQty();
            double amount = itemModel.getAmount();
            itemModel.getDescription();
            
            Object[] rowData = {detailCode,itemCode,sellerCode,description,brand,supplyPrice,updateQty,amount};
            tableModel.addRow(rowData);
            
        }
        
        setItemTotal();
        sellerText.setText(selectedVendor.getName());
        
    }

    private void getTableModel() {
        tableModel = (DefaultTableModel) itemTable.getModel();
    }

    private void setTableValues() {
        DefaultTableCellRenderer hederRenderer = new DefaultTableCellRenderer();
        hederRenderer.setBackground(new Color(68,106,129));
        hederRenderer.setForeground(Color.WHITE);
        hederRenderer.setPreferredSize(new Dimension(itemTable.getWidth(), 30));
        hederRenderer.setFont(new Font("Segoe UI", Font.BOLD, 15));
        for (int i = 0; i < itemTable.getColumnCount(); i++) {
            itemTable.getColumnModel().getColumn(i).setHeaderRenderer(hederRenderer);
        }
        itemTable.setRowHeight(20);
        itemTableScroll.getViewport().setBackground(new Color(255, 255, 255));
    }

    private void setItemTotal(){
        for (int i = 0; i < itemTable.getRowCount(); i++) {
            double amount = (double) itemTable.getValueAt(i, 7);
            total += amount;
        }
        
        totalAmountText.setText(Double.toString(total));
        subTotalText.setText(Double.toString(total));
    }

    private PurchaseInvoice generatePurchaseInvoiceDetail() {
        String invoiceNumber = invoiceNumberText.getText();
        String vendorId = selectedVendor.getVendorId();
        String recievedDate = dateText.getText();
        
        PurchaseInvoice invoice = new PurchaseInvoice();
        invoice.setInvoiceNumber(invoiceNumber);
        invoice.setVendorId(vendorId);
        invoice.setReceivedDate(recievedDate);
        
        return invoice;
    }
    
    private Payment generatePaymentDetails(){
        Payment payment = null;
        try {
            String paymentId = PaymentController.getNextPaymentId();
            double totalAmount = Double.parseDouble(totalAmountText.getText());
            String invoiceNumber = invoiceNumberText.getText();
            Date date = dueDateText.getDate();
            SimpleDateFormat instance = new SimpleDateFormat("yyyy-MM-dd");
            String dueDate = instance.format(date);
            
            double discount = 0;
            if (!discountText.getText().isEmpty()) {
                discount = Double.parseDouble(discountText.getText());
            }
            
            payment = new Payment();
            payment.setPaymentId(paymentId);
            payment.setTotalAmount(totalAmount);
            payment.setInvoiceNumber(invoiceNumber);
            payment.setDueDate(dueDate);
            payment.setDiscount(discount);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return payment;
    }

    public void generatePreview() {
        
        HashMap<String, Object> map = new HashMap<>();
        map.put("BillNumber",invoiceNumberText.getText());
        map.put("TotalAmont",totalAmountText.getText());
        double discount =0;
        if(!discountText.getText().isEmpty()){
            discount = Double.parseDouble(discountText.getText());
        }
        map.put("Discount",discount);
        map.put("SubTotal",subTotalText.getText());
        
        InputStream file = getClass().getResourceAsStream("/edu/ijse/gdse/inventory/jasperreports/PurchaseInvoice.jrxml");
        try {
            JasperReport compiledReport = JasperCompileManager.compileReport(file);
            JasperPrint filledReport = JasperFillManager.fillReport(compiledReport, map,new JRTableModelDataSource(tableModel));
            PrintInvoicePreviewForm form = new PrintInvoicePreviewForm(this, filledReport);
            form.setVisible(true);           
        } catch (JRException ex) {
            Logger.getLogger(PurchaseInvoiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintInvoicePreviewForm form = new PrintInvoicePreviewForm();
    }
  
}
