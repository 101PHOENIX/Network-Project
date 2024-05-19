/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class New_Account extends javax.swing.JFrame {

    // Tüm girdiğimiz değerleri alt alta komut satırına yazıyor.
    public static <String> void print(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
            System.out.println();
        }
    }

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form New_Account
     */
    public New_Account() {
        initComponents();
        // NewAccountsConnection klasındaki NewAccountsConnectionDB fonksiyonunu çalıştırıyor.
        con = NewAccountsConnection.NewAccountsConnectionDB();
        // Uygulamayı sayfanın ortasında başlatıyor.
        this.setLocationRelativeTo(null);

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
        jLabel7 = new javax.swing.JLabel();
        btn_new_Account_cancel = new javax.swing.JButton();
        btn_new_Account_Create = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_user_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psw_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("NEW ACCOUNT CREATION PLATFORM");

        btn_new_Account_cancel.setText("Cancel");
        btn_new_Account_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_Account_cancelActionPerformed(evt);
            }
        });

        btn_new_Account_Create.setText("Create");
        btn_new_Account_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_Account_CreateActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel3.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(psw_Password))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txt_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_new_Account_cancel)
                                .addGap(70, 70, 70)
                                .addComponent(btn_new_Account_Create)))
                        .addGap(152, 152, 152))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psw_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_new_Account_cancel)
                    .addComponent(btn_new_Account_Create))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_Account_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_Account_CreateActionPerformed
        // Ayrı ayrı stringler, patternlar ve matcherlar oluşturarak Password, firsst name, last name ve birth date
        // textlerini kendi koyduğum kurallara göre düzenledim.
        
        // Boşluk koyamaz ve sayı kullanmalı.
        String re = "[\\S]+" + "[0-9]+";
        Pattern p1 = Pattern.compile(re);
        Matcher mt = p1.matcher(psw_Password.getText());
        
        // Textlere yazılmış değerleri NewAccounts Databasene attığım kısım ayrıca burada Regular Expressions kullandım.
        // Yukarıda verilen kısıtlamalara göre databasese değer alıyor, uygun değilse tekrar şunu gir mesajını veriyor.
        // Eğer başarılı bir şekilde girmişse Yeni hesap başarılı bir şekilde oluşturuldu mesajını veriyor.
        try {
            String sql = "INSERT INTO Users(UserName,Password) VALUES (?,?);";
            pst = con.prepareStatement(sql);
            pst.setString(1, txt_user_name.getText());
        
            if (mt.matches()) {
                pst.setString(2, psw_Password.getText());
            } else if (!mt.matches()) {
                JOptionPane.showMessageDialog(null, "re-enter your password");
                rs.close();
            }
        
            pst.execute();
        
            JOptionPane.showMessageDialog(null, "New Account is successfully created.");
            pst.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Program is failed" + e);
        }

        // NewAccounts Databasene attıktan sonra Login JFrame geri dönüyor.
        Login LG = new Login();
        LG.setVisible(true);
        LG.pack();
        LG.setLocationRelativeTo(null);
        LG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

        // String araryine girdiğimiz değerleri koyuyorum.
        String[] strings = {txt_user_name.getText(), psw_Password.getText()};

        // Generics function'nı kullandım.
        New_Account.<String>print(strings);
    }//GEN-LAST:event_btn_new_Account_CreateActionPerformed

    private void btn_new_Account_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_Account_cancelActionPerformed
        // Login JFrame geri gönderiyor.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        this.dispose();

    }//GEN-LAST:event_btn_new_Account_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

//        public static <A> void print(A[] list){
//            
//        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new_Account_Create;
    private javax.swing.JButton btn_new_Account_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField psw_Password;
    private javax.swing.JTextField txt_user_name;
    // End of variables declaration//GEN-END:variables
}
