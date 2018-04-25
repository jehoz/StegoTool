/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stegotool;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jesse
 */
public class GUI extends javax.swing.JFrame {
    StegoTechnique technique;
    File vesselImageFile, messageFile, outputImageFile, 
            extractImageInputFile, extractOutputFile;
    BufferedImage vesselImage, outputImage, extractImageInput;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        technique = new LSBTechnique();
    }
    
    /**
     * Converts byte quantity into human readable capacity size.
     * @param bytes Number of bytes.
     * @return Formatted string of capacity in largest storage units.
     */
    public String formatCapacity(int bytes) {
        String[] units = {"B", "KB", "MB", "GB", "TB"};
        double bCount = bytes;
        int i;
        for(i = 0; i < units.length; i++) {
            if(bCount < 1024)
                break;
            bCount /= 1024.0;
            
        }
        return String.format("%.2f", bCount) + " " + units[i];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        techniqueButtons = new javax.swing.ButtonGroup();
        vesselImageChooser = new javax.swing.JFileChooser();
        messageFileChooser = new javax.swing.JFileChooser();
        outputImageChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        vesselImageTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        vesseImageBrowseButton = new javax.swing.JButton();
        capacityLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        messageDataTextField = new javax.swing.JTextField();
        messageDataBrowseButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        outputImageTextField = new javax.swing.JTextField();
        outputImageBrowseButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        extractImageTextField = new javax.swing.JTextField();
        extractImageBrowseButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        outputMessageTextField = new javax.swing.JTextField();
        outputMessageBrowseButton = new javax.swing.JButton();
        extractButton = new javax.swing.JButton();
        BPCSRadioButton = new javax.swing.JRadioButton();
        LSBRadioButton = new javax.swing.JRadioButton();

        vesselImageChooser.setFileFilter(new CompatibleImageFilter());

        outputImageChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        vesselImageTextField.setEditable(false);

        jLabel1.setText("Vessel Image");

        vesseImageBrowseButton.setText("Browse");
        vesseImageBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vesseImageBrowseButtonActionPerformed(evt);
            }
        });

        capacityLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        capacityLabel.setForeground(new java.awt.Color(121, 121, 121));
        capacityLabel.setText("Capacity: 0 B");

        jLabel3.setText("Message Data");

        messageDataTextField.setEditable(false);

        messageDataBrowseButton.setText("Browse");
        messageDataBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageDataBrowseButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Output Image");

        outputImageTextField.setEditable(false);

        outputImageBrowseButton.setText("Browse");
        outputImageBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputImageBrowseButtonActionPerformed(evt);
            }
        });

        insertButton.setText("INSERT");
        insertButton.setEnabled(false);
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vesselImageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vesseImageBrowseButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(messageDataTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageDataBrowseButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(outputImageTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputImageBrowseButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(capacityLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vesselImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vesseImageBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capacityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageDataBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputImageBrowseButton))
                .addGap(18, 18, 18)
                .addComponent(insertButton)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insert", jPanel1);

        jLabel2.setText("Input Image");

        extractImageTextField.setEditable(false);

        extractImageBrowseButton.setText("Browse");
        extractImageBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractImageBrowseButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Output Message File");

        outputMessageTextField.setEditable(false);

        outputMessageBrowseButton.setText("Browse");
        outputMessageBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputMessageBrowseButtonActionPerformed(evt);
            }
        });

        extractButton.setText("EXTRACT");
        extractButton.setEnabled(false);
        extractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extractButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputMessageTextField)
                            .addComponent(extractImageTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extractImageBrowseButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outputMessageBrowseButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(extractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 261, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extractImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extractImageBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputMessageBrowseButton))
                .addGap(18, 18, 18)
                .addComponent(extractButton)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Extract", jPanel2);

        techniqueButtons.add(BPCSRadioButton);
        BPCSRadioButton.setText("BPCS");
        BPCSRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPCSRadioButtonActionPerformed(evt);
            }
        });

        techniqueButtons.add(LSBRadioButton);
        LSBRadioButton.setSelected(true);
        LSBRadioButton.setText("LSB");
        LSBRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LSBRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LSBRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BPCSRadioButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPCSRadioButton)
                    .addComponent(LSBRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPCSRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPCSRadioButtonActionPerformed
        technique = new BPCSTechnique();
        
        // update capacity
        if(vesselImage != null) {
            int capacity = technique.getImageCapacity(vesselImage);
            capacityLabel.setText("Capacity: " + formatCapacity(capacity));
        }
    }//GEN-LAST:event_BPCSRadioButtonActionPerformed

    private void vesseImageBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vesseImageBrowseButtonActionPerformed
        int returnVal = vesselImageChooser.showOpenDialog(this);
        int capacity;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            vesselImageFile = vesselImageChooser.getSelectedFile();
            vesselImageTextField.setText(vesselImageFile.getAbsolutePath());
            try {
                vesselImage = ImageIO.read(vesselImageFile);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            capacity = technique.getImageCapacity(vesselImage);
            capacityLabel.setText("Capacity: " + formatCapacity(capacity));
            
            // check if ready for insertion
            if(messageFile != null && outputImageFile != null) {
                insertButton.setEnabled(true);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_vesseImageBrowseButtonActionPerformed

    private void messageDataBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageDataBrowseButtonActionPerformed
        int returnVal = messageFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            messageFile = messageFileChooser.getSelectedFile();
            messageDataTextField.setText(messageFile.getAbsolutePath());
            
            // check if ready for insertion
            if(vesselImageFile != null && outputImageFile != null) {
                insertButton.setEnabled(true);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_messageDataBrowseButtonActionPerformed

    private void outputImageBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputImageBrowseButtonActionPerformed
        int returnVal = outputImageChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            outputImageFile = outputImageChooser.getSelectedFile();
            outputImageTextField.setText(outputImageFile.getAbsolutePath());
            
            // check if ready for insertion
            if(vesselImageFile != null && messageFile != null) {
                insertButton.setEnabled(true);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_outputImageBrowseButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // make sure file will fit in image
        if(messageFile.length() > technique.getImageCapacity(vesselImage)) {
            JOptionPane.showMessageDialog(null, "File too large.", "" + "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            outputImage = technique.insertFile(messageFile, vesselImage);
            ImageIO.write(outputImage, "png", outputImageFile);
            JOptionPane.showMessageDialog(null, "File successfully inserted.", "" + "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void outputMessageBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputMessageBrowseButtonActionPerformed
        int returnVal = outputImageChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            extractOutputFile = outputImageChooser.getSelectedFile();
            outputMessageTextField.setText(extractOutputFile.getAbsolutePath());
            
            // check if ready for extraction
            if(extractImageInput != null) {
                extractButton.setEnabled(true);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_outputMessageBrowseButtonActionPerformed

    private void extractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractButtonActionPerformed
        try {
            technique.extractFile(extractImageInput, extractOutputFile);
            JOptionPane.showMessageDialog(null, "File successfully extracted.", "" + "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File not found.", "" + "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extractButtonActionPerformed

    private void extractImageBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extractImageBrowseButtonActionPerformed
        int returnVal = vesselImageChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            extractImageInputFile = vesselImageChooser.getSelectedFile();
            extractImageTextField.setText(extractImageInputFile.getAbsolutePath());
            try {
                extractImageInput = ImageIO.read(extractImageInputFile);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // check if ready for extraction
            if(extractOutputFile != null) {
                extractButton.setEnabled(true);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_extractImageBrowseButtonActionPerformed

    private void LSBRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LSBRadioButtonActionPerformed
        technique = new LSBTechnique();
        
        // update capacity
        if(vesselImage != null) {
            int capacity = technique.getImageCapacity(vesselImage);
            capacityLabel.setText("Capacity: " + formatCapacity(capacity));
        }
    }//GEN-LAST:event_LSBRadioButtonActionPerformed

    
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
                
                if ("GTK+".equals(info.getName()) || "Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BPCSRadioButton;
    private javax.swing.JRadioButton LSBRadioButton;
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JButton extractButton;
    private javax.swing.JButton extractImageBrowseButton;
    private javax.swing.JTextField extractImageTextField;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton messageDataBrowseButton;
    private javax.swing.JTextField messageDataTextField;
    private javax.swing.JFileChooser messageFileChooser;
    private javax.swing.JButton outputImageBrowseButton;
    private javax.swing.JFileChooser outputImageChooser;
    private javax.swing.JTextField outputImageTextField;
    private javax.swing.JButton outputMessageBrowseButton;
    private javax.swing.JTextField outputMessageTextField;
    private javax.swing.ButtonGroup techniqueButtons;
    private javax.swing.JButton vesseImageBrowseButton;
    private javax.swing.JFileChooser vesselImageChooser;
    private javax.swing.JTextField vesselImageTextField;
    // End of variables declaration//GEN-END:variables
}

class CompatibleImageFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File f) {
        // Allow only directories, or files with ".png" extension
        return f.isDirectory() || f.getAbsolutePath().toLowerCase().endsWith(".png")
                || f.getAbsolutePath().toLowerCase().endsWith(".bmp");
    }

    @Override
    public String getDescription() {
        return "Compatible images (*.png, *.bmp)";
    }
    
}