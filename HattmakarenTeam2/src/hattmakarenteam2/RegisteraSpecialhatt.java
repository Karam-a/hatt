/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakarenteam2;

/**
 *
 * @author axelbrave
 */
public class RegisteraSpecialhatt extends javax.swing.JFrame {

    /**
     * Creates new form RegisteraSpecialbest�llning
     */
    public RegisteraSpecialhatt() {
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

        SpecialhattLabel = new javax.swing.JLabel();
        HattIDLabel = new javax.swing.JLabel();
        NamnLabel = new javax.swing.JLabel();
        TygLabel = new javax.swing.JLabel();
        StorlekLabel = new javax.swing.JLabel();
        ModellLabel = new javax.swing.JLabel();
        F�rgLabel = new javax.swing.JLabel();
        DekorationLabel = new javax.swing.JLabel();
        TextLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SpecialhattLabel.setText("Specialhatt");
        SpecialhattLabel.setPreferredSize(new java.awt.Dimension(80, 17));

        HattIDLabel.setText("HattID:");

        NamnLabel.setText("Namn:");

        TygLabel.setText("Tyg:");

        StorlekLabel.setText("Storlek:");

        ModellLabel.setText("Modell:");

        F�rgLabel.setText("F�rg: ");

        DekorationLabel.setText("Dekoration:");

        TextLabel.setText("Text:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(SpecialhattLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HattIDLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TygLabel)
                                    .addComponent(NamnLabel))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(F�rgLabel)
                                        .addComponent(ModellLabel)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(StorlekLabel)))
                            .addGap(161, 161, 161)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextLabel)
                            .addComponent(DekorationLabel))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(SpecialhattLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HattIDLabel)
                .addGap(18, 18, 18)
                .addComponent(NamnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TygLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StorlekLabel)
                .addGap(18, 18, 18)
                .addComponent(ModellLabel)
                .addGap(18, 18, 18)
                .addComponent(F�rgLabel)
                .addGap(18, 18, 18)
                .addComponent(DekorationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DekorationLabel;
    private javax.swing.JLabel F�rgLabel;
    private javax.swing.JLabel HattIDLabel;
    private javax.swing.JLabel ModellLabel;
    private javax.swing.JLabel NamnLabel;
    private javax.swing.JLabel SpecialhattLabel;
    private javax.swing.JLabel StorlekLabel;
    private javax.swing.JLabel TextLabel;
    private javax.swing.JLabel TygLabel;
    // End of variables declaration//GEN-END:variables
}