
package br.com.fatecpg.calcfin.frames;

import br.com.fatecpg.calcfin.MDI;
import javax.swing.JLabel;

public class DescontoComercialComposto extends javax.swing.JInternalFrame {


   
    public DescontoComercialComposto() {
        initComponents();


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Solicitacao_jLabel = new javax.swing.JLabel();
        ValorTitulo_jLabel = new javax.swing.JLabel();
        ValorTitulo = new javax.swing.JFormattedTextField();
        Desconto_jLabel = new javax.swing.JLabel();
        TaxaJuros_jLabel = new javax.swing.JLabel();
        PrazoOp_jLabel = new javax.swing.JLabel();
        Desconto = new javax.swing.JFormattedTextField();
        TaxaJuros = new javax.swing.JFormattedTextField();
        PrazoOp = new javax.swing.JFormattedTextField();
        OpPrazo_ComboBox = new javax.swing.JComboBox();
        Calcular = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Resultado_jLabel = new javax.swing.JLabel();
        Resultado_jFormattedTextField = new javax.swing.JFormattedTextField();

        setTitle("Desconto Comercial Composto");

        Solicitacao_jLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Solicitacao_jLabel.setText("Digite os valores a serem calculados:");

        ValorTitulo_jLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ValorTitulo_jLabel.setText("Valor do título:");

        ValorTitulo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        Desconto_jLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Desconto_jLabel.setText("Desconto:");

        TaxaJuros_jLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TaxaJuros_jLabel.setText("Taxa de juros:");

        PrazoOp_jLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PrazoOp_jLabel.setText("Prazo da operação:");

        Desconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        TaxaJuros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getPercentInstance())));

        PrazoOp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        OpPrazo_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "Mês", "Ano" }));

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Resultado_jLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Resultado_jLabel.setText("Resultado:");

        Resultado_jFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Solicitacao_jLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ValorTitulo_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ValorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Desconto_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TaxaJuros_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaxaJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrazoOp_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrazoOp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(OpPrazo_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Resultado_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Resultado_jFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Solicitacao_jLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorTitulo_jLabel)
                    .addComponent(ValorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desconto_jLabel)
                    .addComponent(Desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaxaJuros_jLabel)
                    .addComponent(TaxaJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrazoOp_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrazoOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpPrazo_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resultado_jLabel)
                    .addComponent(Resultado_jFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static void main(String[] args) {
        MDI mdi = new MDI();
        mdi.setVisible(true);

        DescontoComercialComposto f = new DescontoComercialComposto();
        mdi.desktopPane.add(f);
        f.setVisible(true);
    }


    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

        double vtitulo = Double.parseDouble(ValorTitulo.getText());
        double desconto = Double.parseDouble(Desconto.getText());
        double tjuros = Double.parseDouble(TaxaJuros.getText());
        double prazoOp = Double.parseDouble(PrazoOp.getText());

        double X;

        if (OpPrazo_ComboBox.getSelectedItem().equals("Dia")){
            X = prazoOp;
        } else if (OpPrazo_ComboBox.getSelectedItem().equals("Mês")){
            X = (prazoOp * 30);
        } else if (OpPrazo_ComboBox.getSelectedItem().equals("Ano")){
            X = (prazoOp * 360);
        }

        double Result = vtitulo * Math.pow((1+tjuros),(vtitulo/prazoOp))-1;



    }//GEN-LAST:event_CalcularActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed

        ValorTitulo.setText("");
        Desconto.setText("");
        TaxaJuros.setText("");
        PrazoOp.setText("");
        Resultado_jFormattedTextField.setText("");

    }//GEN-LAST:event_LimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JFormattedTextField Desconto;
    private javax.swing.JLabel Desconto_jLabel;
    private javax.swing.JButton Limpar;
    private javax.swing.JComboBox OpPrazo_ComboBox;
    private javax.swing.JFormattedTextField PrazoOp;
    private javax.swing.JLabel PrazoOp_jLabel;
    private javax.swing.JFormattedTextField Resultado_jFormattedTextField;
    private javax.swing.JLabel Resultado_jLabel;
    private javax.swing.JLabel Solicitacao_jLabel;
    private javax.swing.JFormattedTextField TaxaJuros;
    private javax.swing.JLabel TaxaJuros_jLabel;
    private javax.swing.JFormattedTextField ValorTitulo;
    private javax.swing.JLabel ValorTitulo_jLabel;
    // End of variables declaration//GEN-END:variables

}
