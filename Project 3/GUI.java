/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI.java
 *
 * Created on Nov 27, 2012, 7:39:14 PM
 */

/**
 *
 * @author 71530
 */
import java.util.*;

public class GUI extends javax.swing.JFrame
{

    //declare arraylists here
    ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    
    

    /** Creates new form GUI */
    public GUI()
    {
        initComponents();
        
        items.add(new Item(1, "hammer", 5, 12));
        items.add(new Item(2, "circular saw", 3, 100));
        items.add(new Item(3, "nail gun", 4, 75));
        items.add(new Item(4, "measuring tape", 3, 20));
        items.add(new Item(5, "chalk line", 2, 10));

        customers.add(new Customer("Brandon", 101));
        customers.add(new DiscountCustomer("Jon", 102, .05));
        customers.add(new DiscountCustomer("Tam", 103, .05));
        customers.add(new Customer("Andre", 104));
        //loops to add names into comboboxes
        for(Customer c : customers)
        {
            this.cbxSelectName.addItem(c.getCustName());
        }


        for(Item i : items)
        {
            this.cbxSelectProd.addItem(i.getItemName());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCustDetails = new javax.swing.JPanel();
        cbxSelectName = new javax.swing.JComboBox();
        lblSelName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCustType = new javax.swing.JLabel();
        lblCustDetails = new javax.swing.JLabel();
        lblNameShown = new javax.swing.JLabel();
        lblTypeOfCustomer = new javax.swing.JLabel();
        panProdDetails = new javax.swing.JPanel();
        lblProdDetails = new javax.swing.JLabel();
        lblSelProd = new javax.swing.JLabel();
        cbxSelectProd = new javax.swing.JComboBox();
        lblProdName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblTypeOrder = new javax.swing.JLabel();
        cbxTypeOrder = new javax.swing.JComboBox();
        lblProductName = new javax.swing.JLabel();
        lblPriceTotal = new javax.swing.JLabel();
        lblQuantityOnHandTotal = new javax.swing.JLabel();
        panOrderDetails = new javax.swing.JPanel();
        lblHowMany = new javax.swing.JLabel();
        tbxQuantity = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        panOrderSum = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbxOrderSum = new javax.swing.JTextArea();
        lblOrderSub = new javax.swing.JLabel();
        lblSaH = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panCustDetails.setBackground(new java.awt.Color(204, 204, 204));
        panCustDetails.setForeground(new java.awt.Color(102, 102, 102));

        cbxSelectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSelectNameActionPerformed(evt);
            }
        });

        lblSelName.setText("Select Name");

        lblName.setText("Name:");

        lblCustType.setText("Customer Type:");

        lblCustDetails.setText("Customer Details");

        lblNameShown.setText("Name");

        lblTypeOfCustomer.setText("type of customer");

        javax.swing.GroupLayout panCustDetailsLayout = new javax.swing.GroupLayout(panCustDetails);
        panCustDetails.setLayout(panCustDetailsLayout);
        panCustDetailsLayout.setHorizontalGroup(
            panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustDetailsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustDetailsLayout.createSequentialGroup()
                        .addComponent(lblCustType)
                        .addGap(18, 18, 18)
                        .addComponent(lblTypeOfCustomer)
                        .addGap(115, 115, 115))
                    .addGroup(panCustDetailsLayout.createSequentialGroup()
                        .addComponent(lblCustDetails)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCustDetailsLayout.createSequentialGroup()
                        .addGroup(panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelName)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameShown)
                            .addComponent(cbxSelectName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        panCustDetailsLayout.setVerticalGroup(
            panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCustDetailsLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCustDetails)
                .addGap(18, 18, 18)
                .addGroup(panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSelectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCustDetailsLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addGroup(panCustDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustType)
                            .addComponent(lblTypeOfCustomer)))
                    .addComponent(lblNameShown))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        panProdDetails.setBackground(new java.awt.Color(204, 204, 204));

        lblProdDetails.setText("Product Details");

        lblSelProd.setText("Select Product");

        cbxSelectProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSelectProdActionPerformed(evt);
            }
        });

        lblProdName.setText("Product Name:");

        lblPrice.setText("Price:");

        lblQuantity.setText("Quantity On Hand:");

        lblTypeOrder.setText("Type Of Order:");

        cbxTypeOrder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Online", "In Store" }));

        lblProductName.setText("Product Name");

        lblPriceTotal.setText("Price");

        lblQuantityOnHandTotal.setText("Quantity");

        javax.swing.GroupLayout panProdDetailsLayout = new javax.swing.GroupLayout(panProdDetails);
        panProdDetails.setLayout(panProdDetailsLayout);
        panProdDetailsLayout.setHorizontalGroup(
            panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProdDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProdDetails)
                    .addGroup(panProdDetailsLayout.createSequentialGroup()
                        .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdName)
                            .addComponent(lblSelProd)
                            .addComponent(lblPrice))
                        .addGap(37, 37, 37)
                        .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPriceTotal)
                            .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblProductName)
                                .addComponent(cbxSelectProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panProdDetailsLayout.createSequentialGroup()
                        .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantity)
                            .addComponent(lblTypeOrder))
                        .addGap(18, 18, 18)
                        .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTypeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantityOnHandTotal))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panProdDetailsLayout.setVerticalGroup(
            panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProdDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panProdDetailsLayout.createSequentialGroup()
                        .addComponent(lblProdDetails)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelProd))
                    .addComponent(cbxSelectProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdName)
                    .addComponent(lblProductName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(lblPriceTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityOnHandTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panProdDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeOrder)
                    .addComponent(cbxTypeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panOrderDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        lblHowMany.setText("How many would you like to buy?");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panOrderDetailsLayout = new javax.swing.GroupLayout(panOrderDetails);
        panOrderDetails.setLayout(panOrderDetailsLayout);
        panOrderDetailsLayout.setHorizontalGroup(
            panOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderDetailsLayout.createSequentialGroup()
                .addGroup(panOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHowMany)
                    .addGroup(panOrderDetailsLayout.createSequentialGroup()
                        .addComponent(tbxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panOrderDetailsLayout.setVerticalGroup(
            panOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHowMany)
                .addGap(18, 18, 18)
                .addGroup(panOrderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panOrderSum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Summery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        tbxOrderSum.setColumns(20);
        tbxOrderSum.setRows(5);
        jScrollPane1.setViewportView(tbxOrderSum);

        lblOrderSub.setText("Order Subtotal");

        lblSaH.setText("Shipping & Handling");

        lblTotal.setText("Total");

        javax.swing.GroupLayout panOrderSumLayout = new javax.swing.GroupLayout(panOrderSum);
        panOrderSum.setLayout(panOrderSumLayout);
        panOrderSumLayout.setHorizontalGroup(
            panOrderSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderSumLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panOrderSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderSub)
                    .addComponent(lblTotal)
                    .addComponent(lblSaH))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panOrderSumLayout.setVerticalGroup(
            panOrderSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderSumLayout.createSequentialGroup()
                .addComponent(lblOrderSub)
                .addGap(26, 26, 26)
                .addComponent(lblSaH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panCustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panProdDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(panOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panOrderSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCustDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panProdDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panOrderSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panCustDetails.getAccessibleContext().setAccessibleName("null\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSelectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSelectNameActionPerformed
        int index = this.cbxSelectName.getSelectedIndex();
        //class obj       AL
        Customer c = this.customers.get(index);

        this.lblNameShown.setText(c.getCustName());
        
        if(c instanceof DiscountCustomer)
            this.lblTypeOfCustomer.setText("Discount Customer");
        else
            this.lblTypeOfCustomer.setText("Normal Customer");
        
    }//GEN-LAST:event_cbxSelectNameActionPerformed

    private void cbxSelectProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSelectProdActionPerformed

        int index = this.cbxSelectProd.getSelectedIndex();
      //class obj        AL
        Item item = this.items.get(index);

        this.lblProductName.setText(item.getItemName());
        this.lblPriceTotal.setText(item.getPrice() + "");
        this.lblQuantityOnHandTotal.setText(item.getQuantityInStore() + "");
        

        
    }//GEN-LAST:event_cbxSelectProdActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        int index = this.cbxSelectName.getSelectedIndex();
        Customer c = this.customers.get(index);
        index = this.cbxSelectProd.getSelectedIndex();
        Item item = this.items.get(index);
        String text = this.tbxQuantity.getText();
        int q = Integer.parseInt(text);        
        //Integer.parseInt(/*String goes here*/);
        //Determine whether the order is online or in store
        if(this.cbxTypeOrder.getSelectedIndex() == 0)
        {
            OnlineOrder online = new OnlineOrder(c, item, q);
            online.computePrice();
            this.tbxOrderSum.setText(online.computePrice() + "");
            this.lblOrderSub.setText(online.computePrice() + "")
            
        }
        else if(this.cbxTypeOrder.getSelectedIndex() == 1)
        {
            InStoreOrder inStore = new InStoreOrder(c, item, q, "San Marcos");
            inStore.computePrice();
            this.tbxOrderSum.setText(inStore.computePrice()+ "") ;
            this.lblOrderSub.setText(inStore.computePrice() + "")
        }
        
       
        
        //Create the correct kind of order
        //Use the order to compute the price
        
        
        /*if(this.OnlineOrder.tbxQuantity.getComputePrice());
        else if(this.InStoreOrder.tbxQuantity.getComputePrice());*/
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbxSelectName;
    private javax.swing.JComboBox cbxSelectProd;
    private javax.swing.JComboBox cbxTypeOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustDetails;
    private javax.swing.JLabel lblCustType;
    private javax.swing.JLabel lblHowMany;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameShown;
    private javax.swing.JLabel lblOrderSub;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceTotal;
    private javax.swing.JLabel lblProdDetails;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityOnHandTotal;
    private javax.swing.JLabel lblSaH;
    private javax.swing.JLabel lblSelName;
    private javax.swing.JLabel lblSelProd;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTypeOfCustomer;
    private javax.swing.JLabel lblTypeOrder;
    private javax.swing.JPanel panCustDetails;
    private javax.swing.JPanel panOrderDetails;
    private javax.swing.JPanel panOrderSum;
    private javax.swing.JPanel panProdDetails;
    private javax.swing.JTextArea tbxOrderSum;
    private javax.swing.JTextField tbxQuantity;
    // End of variables declaration//GEN-END:variables

}
