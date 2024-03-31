package serialisasi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author HP COREi3
 */
public class MainForm extends javax.swing.JFrame {
    public static transient Product product; // Menambah keyword transient
    private final String path;
    private static final String FILE_NAME = "product.ser"; // Menambah keyword static dan final

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        product = new Product();
        path = System.getProperty("user.dir") + File.separator
                + "product.ser";

    }
    
    private void lihatHasilSerialization() {
    FileReader fileReader;
    BufferedReader bufferedReader;
    StringBuilder stringBuilder = new StringBuilder();
    try {
        File file = new File(path);
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\r\n");
        }
        bufferedReader.close();
        fileReader.close();
    } catch (IOException e) {
        // Tangani kesalahan dengan tepat
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    jTextArea1.setText(stringBuilder.toString());
}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntri = new javax.swing.JButton();
        btnDoSerialization = new javax.swing.JButton();
        btnDoDeserializationa = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        areaSerelization = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDeserialization = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        btnEntri.setBackground(new java.awt.Color(204, 204, 204));
        btnEntri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntri.setText("1. Entri DataProduk");
        btnEntri.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntriActionPerformed(evt);
            }
        });

        btnDoSerialization.setBackground(new java.awt.Color(204, 204, 204));
        btnDoSerialization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoSerialization.setText("2. Lakukan Serialization");
        btnDoSerialization.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDoSerialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoSerializationActionPerformed(evt);
            }
        });

        btnDoDeserializationa.setBackground(new java.awt.Color(204, 204, 204));
        btnDoDeserializationa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoDeserializationa.setText("3. Lakukan Deserialization");
        btnDoDeserializationa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDoDeserializationa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoDeserializationaActionPerformed(evt);
            }
        });

        jSplitPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jSplitPane2.setDividerLocation(220);
        jSplitPane2.setDividerSize(10);
        jSplitPane2.setOneTouchExpandable(true);

        areaSerelization.setBackground(new java.awt.Color(153, 153, 153));
        areaSerelization.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL SERIALIZATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout areaSerelizationLayout = new javax.swing.GroupLayout(areaSerelization);
        areaSerelization.setLayout(areaSerelizationLayout);
        areaSerelizationLayout.setHorizontalGroup(
            areaSerelizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        areaSerelizationLayout.setVerticalGroup(
            areaSerelizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaSerelizationLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(areaSerelization);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL DESERIALIZATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        areaDeserialization.setColumns(20);
        areaDeserialization.setRows(5);
        jScrollPane2.setViewportView(areaDeserialization);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnEntri, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDoSerialization, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDoDeserializationa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoDeserializationa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoSerialization, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntri, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSplitPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoSerializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoSerializationActionPerformed
      
        FileOutputStream fos;
        ObjectOutputStream oos;
        try{
            fos = new FileOutputStream(new File(path));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
            //baca isi file ke textarea
            lihatHasilSerialization();
        }catch (FileNotFoundException e) {
        }catch (IOException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoSerializationActionPerformed

    private void btnEntriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntriActionPerformed
        // TODO add your handling code here:
        AddProduct add = new AddProduct(this,true);
        add.setVisible(true);
    }//GEN-LAST:event_btnEntriActionPerformed

    private void btnDoDeserializationaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoDeserializationaActionPerformed
                                                          
    FileInputStream fis;
    ObjectInputStream ois;
    try {
        File file = new File(path);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this, "File serialization tidak ditemukan.");
            return;
        }
        fis = new FileInputStream(file);
        ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Product k2 = (Product) obj;
        areaDeserialization.setText(k2.toString());
        ois.close();
        fis.close();
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "File serialization tidak ditemukan.");
    } catch (IOException | ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }

    }//GEN-LAST:event_btnDoDeserializationaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | IllegalAccessException |
                InstantiationException | UnsupportedLookAndFeelException e){
        }
        java.awt.EventQueue.invokeLater(()->{
            new MainForm().setVisible(true);
        });
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeserialization;
    private javax.swing.JPanel areaSerelization;
    private javax.swing.JButton btnDoDeserializationa;
    private javax.swing.JButton btnDoSerialization;
    private javax.swing.JButton btnEntri;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
