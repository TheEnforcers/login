/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarve
 */
public class login extends javax.swing.JFrame {
    int n;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        mesC();
        dataC();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        data = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        mes = new javax.swing.JPanel();
        message = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        login = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(null);

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setLayout(null);

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        data.add(jButton2);
        jButton2.setBounds(330, 400, 65, 23);

        main.add(data);
        data.setBounds(0, 0, 680, 490);

        mes.setBackground(new java.awt.Color(255, 255, 255));
        mes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mes.setLayout(null);

        message.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBorder(null);
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });
        mes.add(message);
        message.setBounds(120, 30, 160, 40);

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mes.add(jButton1);
        jButton1.setBounds(150, 80, 110, 23);

        main.add(mes);
        mes.setBounds(120, 180, 380, 120);

        login.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        main.add(login);
        login.setBounds(250, 310, 120, 30);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        main.add(pass);
        pass.setBounds(300, 240, 170, 30);
        main.add(user);
        user.setBounds(300, 200, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setText("PASSWORD");
        main.add(jLabel4);
        jLabel4.setBounds(110, 240, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setText("USERNAME");
        main.add(jLabel3);
        jLabel3.setBounds(110, 200, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atharva1.png"))); // NOI18N
        main.add(jLabel2);
        jLabel2.setBounds(260, 10, 150, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/White_full.png"))); // NOI18N
        main.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        comp();
        mesS();
    }//GEN-LAST:event_loginActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mesC();
        if(n==1)
        {
            dataS();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mesC();
        dataC();
    }//GEN-LAST:event_jButton2ActionPerformed
public void comp()
{
    String use,pas;
    String s1[]=new String[20];
    String s2[]=new String[20];
    int i;
    s1[1]="abc";
    s2[1]="abc";
    use=user.getText();
    pas=String.valueOf(pass.getPassword());
    for(i=0;i<20;i++)
    {
        if(use.equals(s1[i]) && pas.equals(s2[i]))
        {
            message.setText("Login Successful");
            n=1;
            break;
        }
        else
        {
            message.setText("Please re-check the fields");
            n=0;
        }
    }
    
    
}
    public void mesS()  // dictionary home start
    {
                     mes.setVisible(true);
                     mes.setEnabled(true);
    }
    public void mesC()   // dictionary home close
    {
                     mes.setVisible(false);
                     mes.setEnabled(false);
    }
        public void dataS()  // dictionary home start
    {
                     data.setVisible(true);
                     data.setEnabled(true);
    }
    public void dataC()   // dictionary home close
    {
                     data.setVisible(false);
                     data.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mes;
    private javax.swing.JTextField message;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
