package ManagementSystem;
import ConnectionProvider.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentHomePage extends javax.swing.JFrame 
{
    public StudentHomePage()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentresultpage = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        rollnoofstudent = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentresultpage.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        studentresultpage.setText("Student Result page");
        getContentPane().add(studentresultpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 350, 60));

        rollno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollno.setText("Roll Number");
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 40));
        getContentPane().add(rollnoofstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 30));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-search-30.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, 40));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-cancel-24.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 130, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png"))); // NOI18N
        background.setText("jLabel3");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       
        String rollNo = rollnoofstudent.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= st.executeQuery("SELECT * FROM result WHERE rollNo='"+rollNo+"'");
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "Roll no doesn't exit");
            }
            else
            {
                StudentResultPage frame = new StudentResultPage(rollNo);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null); 
            }  
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
         if(flag==0)
         {
             setVisible(false);
         }
    }//GEN-LAST:event_cancelActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StudentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField rollnoofstudent;
    private javax.swing.JButton search;
    private javax.swing.JLabel studentresultpage;
    // End of variables declaration//GEN-END:variables
}
