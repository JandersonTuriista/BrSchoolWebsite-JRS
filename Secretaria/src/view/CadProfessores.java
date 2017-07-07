package view;

import controler.CtrlProfessor;
import javax.swing.JOptionPane;
import model.Professor;

public class CadProfessores extends javax.swing.JFrame {

    public CadProfessores() {
        initComponents(); 
        //torna invisíveis os label's e as caixas de textos opicinais "anos e disciplinas"
        txtAno2.setVisible(false);
        txtAno3.setVisible(false);
        jLabel7.setVisible(false);
        jLabel6.setVisible(false);
        
        txtDisciplina2.setVisible(false);
        txtDisciplina3.setVisible(false);
        txtDisciplina4.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jbtCadastrar = new javax.swing.JButton();
        jbtExibir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbtAtualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDisciplina2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDisciplina3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDisciplina4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAno = new javax.swing.JSpinner();
        txtAno2 = new javax.swing.JSpinner();
        txtAno3 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(512, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 185, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, -1));

        jbtExibir.setText("Exibir");
        jbtExibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExibirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtExibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, -1, -1));

        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jbtExcluir.setText("Excluir");
        jbtExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jLabel4.setText("Ano:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jbtAtualizar.setText("Atualizar");
        jbtAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        jLabel5.setText("Disciplina");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 390, -1));
        getContentPane().add(txtDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 101, -1));

        jLabel6.setText("Ano:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jLabel7.setText("Ano:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));
        getContentPane().add(txtDisciplina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 101, -1));

        jLabel9.setText("Disciplina");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));
        getContentPane().add(txtDisciplina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 101, -1));

        jLabel10.setText("Disciplina");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));
        getContentPane().add(txtDisciplina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 101, -1));

        jLabel11.setText("Disciplina");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        txtAno.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        getContentPane().add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 52, -1));

        txtAno2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        getContentPane().add(txtAno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 52, -1));

        txtAno3.setModel(new javax.swing.SpinnerNumberModel(0, null, 3, 1));
        getContentPane().add(txtAno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 52, -1));

        jRadioButton1.setText("Leciona outros anos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jRadioButton2.setText("Leciona outras disciplinas");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oie_transparent.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 273));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed
        //Chama o objeto/classe "Professor"
        Professor professor = new Professor();
        //Modifica os valores das variavéis na classe Professor
        professor.setNome(txtNome.getText());
        professor.setSenha(txtSenha.getText());
        professor.setAno((int) txtAno.getValue());
        professor.setAno2((int) txtAno2.getValue());
        professor.setAno3((int) txtAno3.getValue());
        professor.setDisciplina(txtDisciplina.getText());
        professor.setDisciplina2(txtDisciplina2.getText());
        professor.setDisciplina3(txtDisciplina3.getText());
        professor.setDisciplina4(txtDisciplina4.getText());
        //Chama o objeto/classe "CtrlProfessor"
        CtrlProfessor ctrlProfessor = new CtrlProfessor();
        //Chama o metodo de salvar, na classe "CtrlProfessor"
        ctrlProfessor.salvarCtrl(professor);
        //Janela dizendo que o professor foi cadastrado
        JOptionPane.showMessageDialog(this, "Professor cadastrado com sucesso!");
    }//GEN-LAST:event_jbtCadastrarActionPerformed

    private void jbtExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExibirActionPerformed
        //Chama o objeto/classe "CtrlProfessor"

        CtrlProfessor ctrlProfessor = new CtrlProfessor();
        //Chama o objeto/classe "Professor" pelo nome já casdastrado
        Professor professor = ctrlProfessor.getCtrl(txtNome.getText());
        //Janela que exibi os dados
        JOptionPane.showMessageDialog(this, "Nome: " + professor.getNome() +
            " / Senha: " + professor.getSenha() + " / Anos: " + professor.getAno() +
            " " +professor.getAno2() +" " + professor.getAno3() +
            " / Disciplinas: " + professor.getDisciplina() + " " +
            professor.getDisciplina2() + " " + professor.getDisciplina3() +
            " " + professor.getDisciplina4() + "");
    }//GEN-LAST:event_jbtExibirActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        //Chama o objeto/classe "CtrlProfessor"
        CtrlProfessor ctrlProfessor = new CtrlProfessor();
        //Variável que recebe se o registro foi excluído do Bando de Dados
        boolean exluiu = ctrlProfessor.excluirCtrl(txtNome.getText());
        //Mostra a janel se o Registro foi excluído
        if(exluiu){
            JOptionPane.showMessageDialog(this, "Excluido");
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
        //Chama o objeto/classe "CtrlProfessor"
        CtrlProfessor ctrlProfessor = new CtrlProfessor();
        //Modifica os valores das variavéis na classe Professor
        Professor professor = new Professor();
        professor.setNome(txtNome.getText());
        professor.setSenha(txtSenha.getText());
        professor.setAno((int) txtAno.getValue());
        professor.setAno2((int) txtAno2.getValue());
        professor.setAno3((int) txtAno3.getValue());
        professor.setDisciplina(txtDisciplina.getText());
        professor.setDisciplina2(txtDisciplina2.getText());
        professor.setDisciplina3(txtDisciplina3.getText());
        professor.setDisciplina4(txtDisciplina4.getText());
        //Variável de Retorno se o o registro  foi atualizado ou não
        boolean atualizou = ctrlProfessor.updateCtrl(professor);
        //Se atualizado mostra a janela
        if(atualizou){
            JOptionPane.showMessageDialog(this, "Atualizou");
        }
    }//GEN-LAST:event_jbtAtualizarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        txtAno2.setVisible(true);
        txtAno3.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        txtDisciplina2.setVisible(true);
        txtDisciplina3.setVisible(true);
        txtDisciplina4.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadProfessores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtCadastrar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExibir;
    private javax.swing.JSpinner txtAno;
    private javax.swing.JSpinner txtAno2;
    private javax.swing.JSpinner txtAno3;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtDisciplina2;
    private javax.swing.JTextField txtDisciplina3;
    private javax.swing.JTextField txtDisciplina4;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}