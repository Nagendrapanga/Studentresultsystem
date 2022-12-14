package ManagementSystem;
import javax.swing.JOptionPane;

public class AdminHomePage extends javax.swing.JFrame
{
    public AdminHomePage()
    {
        initComponents();
    }
    private void initComponents()
    {
        addstudent = new javax.swing.JButton();
        addresult = new javax.swing.JButton();
        liststudents = new javax.swing.JButton();
        updatestudent = new javax.swing.JButton();
        liststudentresults = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addstudent.setFont(new java.awt.Font("Segoe UI", 1, 14));
        addstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-student.png"))); 
        addstudent.setText("Add Student");
        addstudent.setMaximumSize(new java.awt.Dimension(180, 70));
        addstudent.setMinimumSize(new java.awt.Dimension(180, 70));
        addstudent.setPreferredSize(new java.awt.Dimension(180, 70));
        addstudent.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                addstudentActionPerformed(evt);
            }
        });
        getContentPane().add(addstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, 60));

        addresult.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        addresult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-grade-24.png")));
        addresult.setText("Add Result");
        addresult.setMaximumSize(new java.awt.Dimension(180, 70));
        addresult.setMinimumSize(new java.awt.Dimension(180, 70));
        addresult.setPreferredSize(new java.awt.Dimension(180, 70));
        addresult.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addresultActionPerformed(evt);
            }
        });
        getContentPane().add(addresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, 40));

        liststudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        liststudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png")));
        liststudents.setText("List Students");
        liststudents.setMaximumSize(new java.awt.Dimension(180, 70));
        liststudents.setMinimumSize(new java.awt.Dimension(180, 70));
        liststudents.setPreferredSize(new java.awt.Dimension(180, 70));
        liststudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liststudentsActionPerformed(evt);
            }
        });
        getContentPane().add(liststudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 180, 40));

        updatestudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatestudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-edit student.png")));
        updatestudent.setText("Update Student");
        updatestudent.setMaximumSize(new java.awt.Dimension(180, 70));
        updatestudent.setMinimumSize(new java.awt.Dimension(180, 70));
        updatestudent.setPreferredSize(new java.awt.Dimension(180, 70));
        updatestudent.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                updatestudentActionPerformed(evt);
            }
        });
        getContentPane().add(updatestudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 190, 40));

        liststudentresults.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        liststudentresults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-checklist-30.png")));
        liststudentresults.setText("List Student Results");
        liststudentresults.setMaximumSize(new java.awt.Dimension(180, 70));
        liststudentresults.setMinimumSize(new java.awt.Dimension(180, 70));
        liststudentresults.setPreferredSize(new java.awt.Dimension(180, 70));
        liststudentresults.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                liststudentresultsActionPerformed(evt);
            }
        });
        getContentPane().add(liststudentresults, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 200, 40));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/icons8-submit-document-32.png")));
        logout.setText("Logout");
        logout.setMaximumSize(new java.awt.Dimension(180, 70));
        logout.setMinimumSize(new java.awt.Dimension(180, 70));
        logout.setPreferredSize(new java.awt.Dimension(180, 70));
        logout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 130, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementSystem/wp7701735-anime-school-aesthetic-wallpapers.png")));
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -100, -1, -1));

        pack();
    }

    private void updatestudentActionPerformed(java.awt.event.ActionEvent evt)
    {
        UpdateStudent frame= new UpdateStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void addresultActionPerformed(java.awt.event.ActionEvent evt)
    {
        AddResults frame= new AddResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) 
    {
        int flag = JOptionPane.showConfirmDialog(null,"Are You Sure Do You Want To Exit","Submit",JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            setVisible(false);
             Home frame = new Home();
             frame.setVisible(true);
             frame.setLocationRelativeTo(null);
        }
    }

    private void addstudentActionPerformed(java.awt.event.ActionEvent evt) 
    {
        AddStudent frame= new AddStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void liststudentsActionPerformed(java.awt.event.ActionEvent evt) 
    {
        ListStudents frame= new ListStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void liststudentresultsActionPerformed(java.awt.event.ActionEvent evt) 
    {
        ListstudentResults frame= new ListstudentResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new AdminHomePage().setVisible(true);
            }
        });
    }
    private javax.swing.JButton addresult;
    private javax.swing.JButton addstudent;
    private javax.swing.JLabel background;
    private javax.swing.JButton liststudentresults;
    private javax.swing.JButton liststudents;
    private javax.swing.JButton logout;
    private javax.swing.JButton updatestudent;
  
}
