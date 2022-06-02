/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosorte;

import com.lambdaworks.crypto.SCryptUtil;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Borja
 */
public class AppJogos extends javax.swing.JFrame {

    /**
     * Creates new form AppLogin
     */
    public AppJogos() {
        initComponents();
        jDialogEntrada.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCadastro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonAluno = new javax.swing.JButton();
        jDialogEntrada = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jDialogJogo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonJogo = new javax.swing.JButton();
        jButtonLerTermosDoJogo = new javax.swing.JButton();
        jButtonSairDoJogo = new javax.swing.JButton();
        jDialogTentarSorte = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jDialogCadastro.setTitle("registo do Jogador");
        jDialogCadastro.setLocationByPlatform(true);
        jDialogCadastro.setMinimumSize(new java.awt.Dimension(461, 370));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 100, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mail:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 150, 70, 30);

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(120, 50, 200, 30);

        jTextFieldMail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldMail);
        jTextFieldMail.setBounds(120, 150, 200, 30);
        jPanel1.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(120, 99, 200, 30);

        jButtonAluno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAluno.setText("Criar");
        jButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogCadastroLayout = new javax.swing.GroupLayout(jDialogCadastro.getContentPane());
        jDialogCadastro.getContentPane().setLayout(jDialogCadastroLayout);
        jDialogCadastroLayout.setHorizontalGroup(
            jDialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCadastroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jDialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jDialogCadastroLayout.setVerticalGroup(
            jDialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCadastroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAluno)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jDialogEntrada.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login Valido");

        javax.swing.GroupLayout jDialogEntradaLayout = new javax.swing.GroupLayout(jDialogEntrada.getContentPane());
        jDialogEntrada.getContentPane().setLayout(jDialogEntradaLayout);
        jDialogEntradaLayout.setHorizontalGroup(
            jDialogEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEntradaLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jDialogEntradaLayout.setVerticalGroup(
            jDialogEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEntradaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jDialogJogo.setTitle("jogo");
        jDialogJogo.setLocationByPlatform(true);
        jDialogJogo.setMinimumSize(new java.awt.Dimension(590, 380));

        jPanel2.setMinimumSize(new java.awt.Dimension(590, 390));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/th (1).jpeg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setMinimumSize(new java.awt.Dimension(590, 363));

        jButtonJogo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonJogo.setText("Jogar");
        jButtonJogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJogoActionPerformed(evt);
            }
        });

        jButtonLerTermosDoJogo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonLerTermosDoJogo.setText("Ler termos do Jogo");
        jButtonLerTermosDoJogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLerTermosDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLerTermosDoJogoActionPerformed(evt);
            }
        });

        jButtonSairDoJogo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSairDoJogo.setText("Sair do Jogo");
        jButtonSairDoJogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButtonLerTermosDoJogo)
                        .addGap(86, 86, 86)
                        .addComponent(jButtonSairDoJogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLerTermosDoJogo)
                    .addComponent(jButtonJogo)
                    .addComponent(jButtonSairDoJogo))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogJogoLayout = new javax.swing.GroupLayout(jDialogJogo.getContentPane());
        jDialogJogo.getContentPane().setLayout(jDialogJogoLayout);
        jDialogJogoLayout.setHorizontalGroup(
            jDialogJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogJogoLayout.setVerticalGroup(
            jDialogJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jDialogTentarSorte.setTitle("Cultura Geral");
        jDialogTentarSorte.setMinimumSize(new java.awt.Dimension(590, 380));

        jButton1.setText("Girar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogTentarSorteLayout = new javax.swing.GroupLayout(jDialogTentarSorte.getContentPane());
        jDialogTentarSorte.getContentPane().setLayout(jDialogTentarSorteLayout);
        jDialogTentarSorteLayout.setHorizontalGroup(
            jDialogTentarSorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTentarSorteLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jDialogTentarSorteLayout.setVerticalGroup(
            jDialogTentarSorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTentarSorteLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APP LOGIN");
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 90, 64, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 150, 60, 30);

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsername);
        jTextFieldUsername.setBounds(150, 90, 180, 30);

        jPasswordFieldPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldPass);
        jPasswordFieldPass.setBounds(150, 150, 180, 30);

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(280, 220, 100, 30);

        jButton2.setText("Novo Usuario ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 220, 110, 30);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String username = jTextFieldUsername.getText();
        char[] passWord = jPasswordFieldPass.getPassword();
        String pwd = String.copyValueOf(passWord);

        if (verificaUsername(username)) {
            validaLogin(username, pwd);
            JOptionPane.showMessageDialog(null, "O seu Login é correto", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            jDialogEntrada.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login incorreto!", "Login incorreto!", JOptionPane.ERROR_MESSAGE);
            int resposta = JOptionPane.showConfirmDialog(this, "  Utilizador não Existe. Deseja criar uma conta?", "Criar Nova conta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resposta == JOptionPane.NO_OPTION) {
                this.dispose();
            } else if (resposta == JOptionPane.YES_OPTION) {
                jDialogCadastro.setVisible(true);
            } else if (resposta == JOptionPane.CLOSED_OPTION) {
            }

        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunoActionPerformed
        String nome = jTextFieldNome.getText();
        String mail = jTextFieldMail.getText();
        char[] senha = jPasswordFieldSenha.getPassword();
        String pwd = codifica(String.copyValueOf(senha));
        gravarDadosAluno(nome, pwd, mail);
        int resposta = JOptionPane.showConfirmDialog(this, "conta criada com sucesso. Deseja jogar agora ?", "MENSAGEM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.NO_OPTION) {
            this.dispose();
        } else if (resposta == JOptionPane.YES_OPTION) {
            jDialogJogo.setVisible(true);

        } else if (resposta == JOptionPane.CLOSED_OPTION) {
        }

    }//GEN-LAST:event_jButtonAlunoActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jButtonLerTermosDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLerTermosDoJogoActionPerformed
        JOptionPane.showMessageDialog(null, "o Presente jogo  de Cultura geral consiste em responder  perguntas opcionais relacionado com paises da sua Escolha que no final do jogo veras as sua cotaçoes ",
                "jogo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonLerTermosDoJogoActionPerformed

    private void jButtonSairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDoJogoActionPerformed

        this.dispose();

    }//GEN-LAST:event_jButtonSairDoJogoActionPerformed

    private void jButtonJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJogoActionPerformed
        jDialogTentarSorte.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJogoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialogCadastro.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random r = new Random();
        int nr = r.nextInt(6)+1;

        jButtonSao_Tome.setIcon(imagem[nr]);
    }//GEN-LAST:event_jButton1ActionPerformed
                }

            }

            {
            }
        }
    }
    private boolean verificaUsername(String username) {
        boolean existe = false;
        try {
            String sqlQuery = "select Nome,password from Usuario where nome = ?";
            int id = -1;
            String passGuardada = null;
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:BDLogin.db3");
            Statement stat = con.createStatement();
            ResultSet rs;
            PreparedStatement pst;
            pst = (PreparedStatement) con.prepareStatement(sqlQuery);
            pst.setString(1, username);
            rs = (ResultSet) pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                passGuardada = rs.getString("password");
                existe = true;
            }
            pst.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex); 
        } catch (SQLException ex) {
            //Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);   
        }
        return existe;
    }

    public static String codifica(String originalPassword) {
        String generatedSecuredPasswordHash = SCryptUtil.scrypt(originalPassword, 16, 16, 16);
        return generatedSecuredPasswordHash;
    }

    private boolean validaLogin(String username, String pwd) {
        try {
            String sqlQuery = "select id,password from login where username = ?";
            String passGuardada = " ";
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:BDLogin.db3");
            Statement stat = con.createStatement();
            ResultSet rs;
            PreparedStatement pst;
            pst = (PreparedStatement) con.prepareStatement(sqlQuery);
            pst.setString(1, username);
            rs = (ResultSet) pst.executeQuery();
            if (rs.next()) {

                passGuardada = rs.getString("password");

            }
            pst.close();
            con.close();
            boolean matched = SCryptUtil.check(pwd, passGuardada);
            return matched;
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);  
        } catch (SQLException ex) {
            // Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return false;
    }

    private void gravarDadosAluno(String nome, String senha, String mail) {
        try {
            String sqlQuery = "insert into Usuario(Nome,Senha,mail) " + "select * from (select ?,?,?) as tmp " + "where not exists (" + "select nome from Usuario where nome =?) " + "limit 1";
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:BDJogo.db3");
            PreparedStatement pst;
            pst = (PreparedStatement) con.prepareStatement(sqlQuery);
            pst.setString(1, nome);
            pst.setString(2, senha);
            pst.setString(3, mail);
            int result = pst.executeUpdate();
            if (result == 0) {
                System.out.println("Login Incorreto");
            }
            pst.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);   
        } catch (SQLException ex) {
            // Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
//    
    // para permitir gerar
    private class jogo extends Thread{
        public void run (){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(AppJogos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            java.util.logging.Logger.getLogger(AppJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAluno;
    private javax.swing.JButton jButtonJogo;
    private javax.swing.JButton jButtonLerTermosDoJogo;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSairDoJogo;
    private javax.swing.JDialog jDialogCadastro;
    private javax.swing.JDialog jDialogEntrada;
    private javax.swing.JDialog jDialogJogo;
    private javax.swing.JDialog jDialogTentarSorte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

  ImageIcon imagem [] = {new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/Angola.jpeg")),
  new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/Espanha.jpeg")),
  new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/Franca.jpeg")),
  new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/senegal.jpeg")),
          new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/Inglaterra.jpeg")),
          new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/cabo-verde.jpeg")),
          new javax.swing.ImageIcon(getClass().getResource("/BandeirasPaises/portugal.jpeg"))
  };  

 
    
}