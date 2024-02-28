/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ordenizahalog;

/**
 *
 * @author dehal
 */
public class FlamesGUI extends javax.swing.JFrame implements FlamesInterface {

    /**
     * Creates new form FlamesGUI
     */
    public FlamesGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        firstPerson = new javax.swing.JTextField();
        fpLabel = new javax.swing.JLabel();
        secondPerson = new javax.swing.JTextField();
        spLabel = new javax.swing.JLabel();
        rLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsArea = new javax.swing.JTextArea();
        calculateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(255, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        header.setFont(new java.awt.Font("Bell MT", 2, 48)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("Love-O-Meter");

        firstPerson.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N
        firstPerson.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstPersonActionPerformed(evt);
            }
        });

        fpLabel.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        fpLabel.setForeground(new java.awt.Color(255, 255, 255));
        fpLabel.setText("First Person");

        secondPerson.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N
        secondPerson.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondPersonActionPerformed(evt);
            }
        });

        spLabel.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        spLabel.setForeground(new java.awt.Color(255, 255, 255));
        spLabel.setText("Second Person");

        rLabel.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        rLabel.setForeground(new java.awt.Color(255, 255, 255));
        rLabel.setText("Results:");

        resultsArea.setColumns(20);
        resultsArea.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        resultsArea.setRows(5);
        resultsArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(resultsArea);

        calculateButton.setBackground(new java.awt.Color(255, 153, 153));
        calculateButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(255, 255, 255));
        calculateButton.setText("Calculate!");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("<3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(fpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(spLabel)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(firstPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(secondPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(header))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(rLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fpLabel)
                    .addComponent(spLabel))
                .addGap(18, 18, 18)
                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(rLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstPersonActionPerformed

    private void secondPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondPersonActionPerformed
    // where the process starts: when you push the "Calculate!" button
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        analyzeRelationship();
    }//GEN-LAST:event_calculateButtonActionPerformed
    
    // Instance variables (private for encapsulation)
    private String inputString1;
    private String inputString2;
    private StringBuffer modifiedString1;
    private StringBuffer modifiedString2;

    // Getters and setters
    @Override
    public String getInputString1() {
        return inputString1;
    }

    public void setInputString1(String inputString1) {
        this.inputString1 = inputString1;
    }

    @Override
    public String getInputString2() {
        return inputString2;
    }

    public void setInputString2(String inputString2) {
        this.inputString2 = inputString2;
    }

    public StringBuffer getModifiedString1() {
        return modifiedString1;
    }

    public void setModifiedString1(StringBuffer modifiedString1) {
        this.modifiedString1 = modifiedString1;
    }

    public StringBuffer getModifiedString2() {
        return modifiedString2;
    }

    public void setModifiedString2(StringBuffer modifiedString2) {
        this.modifiedString2 = modifiedString2;
    }

    @Override
    public String analyzeRelationship() {
        setInputString1(firstPerson.getText());
        setInputString2(secondPerson.getText());

        // Create modified strings here to avoid potential null pointer exceptions
        setModifiedString1(new StringBuffer(getInputString1()));
        setModifiedString2(new StringBuffer(getInputString2()));
        
        // mechanism to remove the similar letters found in the two strings
        for (int x = 0; x < getInputString1().length(); x++) {
            char xChar = getInputString1().charAt(x);
            for (int y = 0; y < getInputString2().length(); y++) {
                char yChar = getInputString2().charAt(y);
                if (xChar == yChar && getModifiedString1().indexOf(String.valueOf(xChar)) != -1
                        && getModifiedString2().indexOf(String.valueOf(yChar)) != -1) {
                    int index1 = getModifiedString1().indexOf(String.valueOf(xChar));
                    getModifiedString1().deleteCharAt(index1);
                    int index2 = getModifiedString2().indexOf(String.valueOf(yChar));
                    getModifiedString2().deleteCharAt(index2);
                }
            }
        }

        // Calculate remaining letters
        int remLetters = modifiedString1.length() + modifiedString2.length();

        // Determine the result of the analysis
        String resultOfAnalysis;
        if (remLetters > 6) {
            int indLetter = remLetters % 6;
            switch (indLetter) {
                case 1:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are FRIENDS";
                    break;
                case 2:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are LOVERS";
                    break;
                case 3:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are ACQUAINTANCES";
                    break;
                case 4:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are MARRIED";
                    break;
                case 5:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are ENEMIES";
                    break;
                case 6:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are SWEETHEARTS";
                    break;
                default:
                    resultOfAnalysis = "No connection detected...";
            }
        } else {
            switch (remLetters) {
                case 1:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are FRIENDS";
                    break;
                case 2:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are LOVERS";
                    break;
                case 3:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are ACQUAINTANCES";
                    break;
                case 4:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are MARRIED";
                    break;
                case 5:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are ENEMIES";
                    break;
                case 6:
                    resultOfAnalysis = inputString1 + " and " + inputString2 + " are SWEETHEARTS";
                    break;
                default:
                    resultOfAnalysis = "No connection detected...";
            }
        }

        // Display the result in the output area
        resultsArea.append("A match made in heaven? " + resultOfAnalysis + "\n");
        return resultOfAnalysis;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField firstPerson;
    private javax.swing.JLabel fpLabel;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rLabel;
    private javax.swing.JTextArea resultsArea;
    private javax.swing.JTextField secondPerson;
    private javax.swing.JLabel spLabel;
    // End of variables declaration//GEN-END:variables
}
