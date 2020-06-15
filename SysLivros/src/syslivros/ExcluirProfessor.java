/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syslivros;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ExcluirProfessor extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirProfessor
     */
    public ExcluirProfessor() {
        initComponents();
        try {
                Conexao.conectar("root", "positivo");
                System.out.println("conetado!ура товарищи!");
                
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null,"Erro ao conectar ao banco"+ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
            } 
           
        try{
        PopulaCombo();
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(this,"Erro ao carregar professores"+ ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void PopulaCombo()throws  SQLException{
String SQL="select nome  from Professores  ";
ResultSet rs = Conexao.ConexaoJDBC.createStatement().executeQuery(SQL);
   DefaultComboBoxModel model =(DefaultComboBoxModel) cbProfessor.getModel();
   model.removeAllElements();
   while(rs.next()){
   model.addElement(rs.getString("nome"));
   }

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfessor = new javax.swing.JLabel();
        cbProfessor = new javax.swing.JComboBox();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Excuir professor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblProfessor.setText(" Professor: ");

        cbProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um professor", "Bruno" }));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        btnVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVoltarKeyPressed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExcluirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessor)
                    .addComponent(cbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-338)/2, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
if(!cbProfessor.getSelectedItem().equals("Selecione um professor")){
if(JOptionPane.showConfirmDialog(this, "Deseja realmente excluir professor", "Exclusão de professor", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
  int idProf []=new int[2000];
    int i=1;
    try {
        PreparedStatement ps =Conexao.ConexaoJDBC.prepareStatement("select * from Professores where idProfessores>0");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            
            idProf[i]=rs.getInt("idProfessores");
            
        i++;
        }
        int id=1;
     id=cbProfessor.getSelectedIndex();
     id++;
       
           // PreparedStatement ps = Conexao.ConexaoJDBC.prepareStatement("update professores set nome = ? where idProfessores = ? ");  
        //ps.setString(1,"");
    //  ps.setString(2,id);
           // ps.execute();
      
    String SQL=("delete from Professores where idProfessores = "+idProf[id]);
    Conexao.ConexaoJDBC.createStatement().execute(SQL);
             JOptionPane.showMessageDialog(this,"Professor excluído com sucesso","Exclusão de professor",JOptionPane.INFORMATION_MESSAGE );
             new Cadastrar_Excluir_Prof().setVisible(true);
             this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao excluir professor"+ ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex ){JOptionPane.showMessageDialog(this, "ERRO "+ex.getMessage());
    }
       
    }
}else{JOptionPane.showMessageDialog(this,"Selecione um professor","Erro",JOptionPane.ERROR_MESSAGE);
lblProfessor.setForeground(Color.red);
        
}

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
btnExcluirActionPerformed(null);
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
    new Cadastrar_Excluir_Prof().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVoltarKeyPressed
btnVoltarActionPerformed(null);
    }//GEN-LAST:event_btnVoltarKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

          
         
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       try{
        Conexao.desconectar();
        System.out.println("Desconectado!");
}catch(Exception ex){
JOptionPane.showMessageDialog(this,"Erro ao desconectar o banco"+ ex.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
}   
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(ExcluirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirProfessor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbProfessor;
    private javax.swing.JLabel lblProfessor;
    // End of variables declaration//GEN-END:variables
}
