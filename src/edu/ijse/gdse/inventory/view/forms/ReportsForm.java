/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse.inventory.view.forms;

import java.awt.Color;

/**
 *
 * @author Pahansith
 */
public class ReportsForm extends javax.swing.JPanel {
    
    public ReportsForm() {
        initComponents();
        showDailySales();
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
        jPanel1 = new javax.swing.JPanel();
        purchaseReportLabel = new javax.swing.JLabel();
        salesReportLabel = new javax.swing.JLabel();
        stockReportLabel = new javax.swing.JLabel();
        hostPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 240));
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setPreferredSize(new java.awt.Dimension(1120, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(247, 246, 242));
        jPanel7.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(169, 111, 110));
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

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 1120, 7);

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Reports");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(796, 13, 174, 67);

        jPanel1.setBackground(new java.awt.Color(247, 246, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 227, 212)));
        jPanel1.setLayout(null);

        purchaseReportLabel.setBackground(new java.awt.Color(247, 246, 242));
        purchaseReportLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        purchaseReportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseReportLabel.setText("Purchase Reports");
        purchaseReportLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 227, 212)));
        purchaseReportLabel.setOpaque(true);
        purchaseReportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseReportLabelMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseReportLabelMouseClicked(evt);
            }
        });
        jPanel1.add(purchaseReportLabel);
        purchaseReportLabel.setBounds(180, 0, 173, 68);

        salesReportLabel.setBackground(new java.awt.Color(247, 246, 242));
        salesReportLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salesReportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesReportLabel.setText("Sales Reports");
        salesReportLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 227, 212)));
        salesReportLabel.setOpaque(true);
        salesReportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesReportLabelMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesReportLabelMouseClicked(evt);
            }
        });
        jPanel1.add(salesReportLabel);
        salesReportLabel.setBounds(3, 0, 180, 68);

        stockReportLabel.setBackground(new java.awt.Color(247, 246, 242));
        stockReportLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockReportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockReportLabel.setText("Stock Reports");
        stockReportLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 227, 212)));
        stockReportLabel.setOpaque(true);
        stockReportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockReportLabelMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockReportLabelMouseClicked(evt);
            }
        });
        jPanel1.add(stockReportLabel);
        stockReportLabel.setBounds(350, 0, 170, 68);

        jPanel7.add(jPanel1);
        jPanel1.setBounds(0, 10, 520, 68);

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 80));

        hostPanel.setBackground(new java.awt.Color(242, 242, 240));
        hostPanel.setLayout(new java.awt.BorderLayout());
        add(hostPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1120, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void salesReportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportLabelMouseClicked
        showDailySales();
    }//GEN-LAST:event_salesReportLabelMouseClicked

    private void salesReportLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportLabelMouseEntered
        salesReportLabel.setBackground(new Color(247,246,209));
    }//GEN-LAST:event_salesReportLabelMouseEntered

    private void purchaseReportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseReportLabelMouseClicked
        hostPanel.removeAll();
        PurchaseReportForm purchaseForm = new PurchaseReportForm();
        hostPanel.add(purchaseForm);
        hostPanel.revalidate();
    }//GEN-LAST:event_purchaseReportLabelMouseClicked

    private void stockReportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockReportLabelMouseClicked
        hostPanel.removeAll();
        StockReportForm stockReportForm = new StockReportForm();
        hostPanel.add(stockReportForm);
        hostPanel.revalidate();
    }//GEN-LAST:event_stockReportLabelMouseClicked

    private void purchaseReportLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseReportLabelMouseEntered
        purchaseReportLabel.setBackground(new Color(247,246,209));
    }//GEN-LAST:event_purchaseReportLabelMouseEntered

    private void stockReportLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockReportLabelMouseEntered
        stockReportLabel.setBackground(new Color(247,246,209));
    }//GEN-LAST:event_stockReportLabelMouseEntered

    private void showDailySales() {
        hostPanel.removeAll();
        SalesReportForm saleForm = new SalesReportForm();
        hostPanel.add(saleForm);
        hostPanel.revalidate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hostPanel;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel purchaseReportLabel;
    private javax.swing.JLabel salesReportLabel;
    private javax.swing.JLabel stockReportLabel;
    // End of variables declaration//GEN-END:variables

    
}