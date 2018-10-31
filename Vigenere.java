

public class Vigenere extends javax.swing.JFrame {

private String table = "abcdefghijklmnopqrstuvwxyz";
    
 public Vigenere() {
     
        initComponents();
        
        setLocationRelativeTo(this);
    }

       private String Cleaning_text(String text)
     {
         text = text.replaceAll("\n", "");  
         
        for(int x = 0; x < text.length(); x++)
        {
            int position = table.indexOf(text.charAt(x));
            
            if (position == -1)
            {
                text= text.replace(text.charAt(x), ' ');
            }
        }        
        return text;
    } 
       
public  String Encrypt(String text,String key)
{
  String cleaned_text = Cleaning_text(text);
        
  String encrypted = "";
 
  for(int t = 0,k= 0; t < cleaned_text.length(); t++,k= (k+1) % key.length())
  {
    int position = (table.indexOf(cleaned_text.charAt(t)) + table.indexOf(key.charAt(k))) % table.length();

   encrypted += table.charAt(position );

  }
   return encrypted;
}

public String Decrypt(String text,String key  )
{
  String cleaned_text = Cleaning_text(text);  
    
  String decrypted = "";

  for(int t = 0, k = 0; t < cleaned_text.length(); t++,k= (k+1) % key .length())
  {
   int position = (table.indexOf(cleaned_text.charAt(t)) - table.indexOf(key.charAt(k)));

   position = (position < 0)?(position + table.length()): position;

   decrypted += table.charAt(position);
   }
  return decrypted;
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        encrypt_button = new javax.swing.JButton();
        decrypt_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        key_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        input.setColumns(20);
        input.setRows(5);
        jScrollPane2.setViewportView(input);

        encrypt_button.setBackground(new java.awt.Color(51, 204, 255));
        encrypt_button.setText("Encrypt");
        encrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encrypt_buttonActionPerformed(evt);
            }
        });

        decrypt_button.setBackground(new java.awt.Color(51, 204, 255));
        decrypt_button.setText("Decrypt");
        decrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrypt_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Insert  key :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("VIGENERE CIPHER");

        jLabel3.setText("Insert PlainText :");

        jLabel4.setText("Insert CipherText :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(key_field, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(encrypt_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decrypt_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(encrypt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(decrypt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encrypt_buttonActionPerformed
       
        String text = input.getText();
        
        String key = key_field.getText();
        
        output.setText(Encrypt(text,key ));
    }//GEN-LAST:event_encrypt_buttonActionPerformed

    private void decrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrypt_buttonActionPerformed
       
        String text = output.getText();
        
        String key = key_field.getText();
        
        input.setText(Decrypt(text,key ));
    }//GEN-LAST:event_decrypt_buttonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new Vigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decrypt_button;
    private javax.swing.JButton encrypt_button;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField key_field;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
