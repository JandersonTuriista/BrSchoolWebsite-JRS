package view;

import controler.CtrlAluno;
import javax.swing.JOptionPane;
import model.Aluno;

public class CadAlunos extends javax.swing.JFrame {

    public CadAlunos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        txtTurno = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jbtCadastrar = new javax.swing.JButton();
        jbtExibir = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAtualizar = new javax.swing.JButton();
        txtMatri = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(512, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel2.setText("Nº Matrícula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel4.setText("Série:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel5.setText("Turma:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jLabel6.setText("Turno:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 390, -1));
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 48, -1));
        getContentPane().add(txtTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 48, -1));
        getContentPane().add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 48, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 185, -1));

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

        jbtExcluir.setText("Excluir");
        jbtExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jbtAtualizar.setText("Atualizar");
        jbtAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        txtMatri.setModel(new javax.swing.SpinnerNumberModel());
        getContentPane().add(txtMatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 185, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alunologin.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
    //Botão Cadastrar 
    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed
        //Cria um novo objeto/classe "Aluno"
        Aluno aluno = new Aluno();
        //Altera os valores das variáveis na classe "Alunos" 
        aluno.setNome(txtNome.getText());
        aluno.setMatricula((int) txtMatri.getValue());
        aluno.setSenha(txtSenha.getText());
        aluno.setSerie(txtSerie.getText());
        aluno.setTurma(txtTurma.getText());
        aluno.setTurno(txtTurno.getText());
        //Chama o objeto/classe "CtrlAluno"
        CtrlAluno ctrlAluno = new CtrlAluno();
        //Chama o método salvar na classe "CtrlAluno"
        ctrlAluno.salvarCtrl(aluno);
        //Mostra a Mensagem de confirmação
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }//GEN-LAST:event_jbtCadastrarActionPerformed

    //Botão Exibir
    private void jbtExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExibirActionPerformed
        //Chama o objeto/classe "CtrlAluno"
        CtrlAluno ctrlAluno = new CtrlAluno();
        //Chama o objeto/classe "Aluno" e mostra os dados do aluno pelo NOME
        Aluno aluno = ctrlAluno.getCtrl((int) txtMatri.getValue());
        //Mostra os dados do Aluno
        JOptionPane.showMessageDialog(this, "Nome: " + aluno.getNome() +
            " Matricula: " + aluno.getMatricula() + " Serie: " + aluno.getSerie() +
            " Turma: " + aluno.getTurma() + " Turno: " + aluno.getTurno() + "");
    }//GEN-LAST:event_jbtExibirActionPerformed

    //Botão Excluir
    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        //Chama o objeto/classe "CtrlAluno"
        CtrlAluno ctrlAluno = new CtrlAluno();
        //Variável que recebe o retorno da classe CtrlAluno
        boolean exluiu = ctrlAluno.excluirCtrl((int) txtMatri.getValue());
        //Se for excluido, mostra essa mensagem
        if(exluiu){
            JOptionPane.showMessageDialog(this, "Excluido");
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    //Botão Atualizar
    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
        //Chama o objeto/classe CtrlAluno
        CtrlAluno ctrlAluno = new CtrlAluno();
        //Chama o objeto/classe Aluno
        Aluno aluno = new Aluno();
        //Modifica os dados do aluno usando a Primary Key matricula
        aluno.setNome(txtNome.getText());
        aluno.setMatricula((int) txtMatri.getValue());
        aluno.setSenha(txtSenha.getText());
        aluno.setSerie(txtSerie.getText());
        aluno.setTurma(txtTurma.getText());
        aluno.setTurno(txtTurno.getText());
        //Variável de retorno da classe
        boolean atualizou = ctrlAluno.updateCtrl(aluno);
        //Se atualizou, mostra essa mensagem
        if(atualizou){
            JOptionPane.showMessageDialog(this, "Atualizou");
        }
    }//GEN-LAST:event_jbtAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadAlunos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtCadastrar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExibir;
    private javax.swing.JSpinner txtMatri;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTurma;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}