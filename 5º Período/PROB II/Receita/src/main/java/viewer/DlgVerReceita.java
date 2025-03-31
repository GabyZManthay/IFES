/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

/**
 *
 * @author Gabrielly Zeni Manthay
 */
public class DlgVerReceita extends javax.swing.JDialog {

    /**
     * Creates new form DlgVerReceita
     */
    public DlgVerReceita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPesquisarReceita = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtFldNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        pnlDadosReceitas = new javax.swing.JPanel();
        lblNomeReceita = new javax.swing.JLabel();
        txtFldNomeReceita = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtFldCategoria = new javax.swing.JTextField();
        lblIngredientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAIngredientes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAModoPreparo = new javax.swing.JTextArea();
        lblModoPreparo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPesquisarReceita.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Receita"));

        lblNome.setText("Nome:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisarReceitaLayout = new javax.swing.GroupLayout(pnlPesquisarReceita);
        pnlPesquisarReceita.setLayout(pnlPesquisarReceitaLayout);
        pnlPesquisarReceitaLayout.setHorizontalGroup(
            pnlPesquisarReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisarReceitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addGap(18, 18, 18)
                .addComponent(txtFldNome)
                .addContainerGap())
            .addGroup(pnlPesquisarReceitaLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPesquisarReceitaLayout.setVerticalGroup(
            pnlPesquisarReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisarReceitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisarReceitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addContainerGap())
        );

        pnlDadosReceitas.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Recita"));

        lblNomeReceita.setText("Nome da Receita");

        lblCategoria.setText("Categoria");

        lblIngredientes.setText("Ingredientes");

        txtAIngredientes.setColumns(20);
        txtAIngredientes.setRows(5);
        jScrollPane1.setViewportView(txtAIngredientes);

        txtAModoPreparo.setColumns(20);
        txtAModoPreparo.setRows(5);
        jScrollPane2.setViewportView(txtAModoPreparo);

        lblModoPreparo.setText("Modo de Preparo");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosReceitasLayout = new javax.swing.GroupLayout(pnlDadosReceitas);
        pnlDadosReceitas.setLayout(pnlDadosReceitasLayout);
        pnlDadosReceitasLayout.setHorizontalGroup(
            pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosReceitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosReceitasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(pnlDadosReceitasLayout.createSequentialGroup()
                        .addGroup(pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeReceita)
                            .addComponent(txtFldNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(txtFldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(pnlDadosReceitasLayout.createSequentialGroup()
                        .addGroup(pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngredientes)
                            .addComponent(lblModoPreparo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDadosReceitasLayout.setVerticalGroup(
            pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosReceitasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeReceita)
                    .addComponent(lblCategoria))
                .addGap(5, 5, 5)
                .addGroup(pnlDadosReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngredientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModoPreparo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPesquisarReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPesquisarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(pnlDadosReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new FrmPrincipal().setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblModoPreparo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeReceita;
    private javax.swing.JPanel pnlDadosReceitas;
    private javax.swing.JPanel pnlPesquisarReceita;
    private javax.swing.JTextArea txtAIngredientes;
    private javax.swing.JTextArea txtAModoPreparo;
    private javax.swing.JTextField txtFldCategoria;
    private javax.swing.JTextField txtFldNome;
    private javax.swing.JTextField txtFldNomeReceita;
    // End of variables declaration//GEN-END:variables
}
