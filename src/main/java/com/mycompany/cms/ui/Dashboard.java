/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cms.ui;


import com.mycompany.cms.dao.CoursesDao;
import com.mycompany.cms.dao.ModuleDao;
import com.mycompany.cms.dao.PersonDao;
import com.mycompany.cms.dao.StudentDao;
import com.mycompany.cms.dao.TeacherDao;
import com.mycompany.cms.dao.imp.CoursesDaoImp;
import com.mycompany.cms.dao.imp.ModuleDaoImp;
import com.mycompany.cms.dao.imp.PersonDaoImp;
import com.mycompany.cms.dao.imp.StudentDaoImp;
import com.mycompany.cms.dao.imp.TeacherDaoImp;
import com.mycompany.cms.person.Courses;
import com.mycompany.cms.person.Modules;
import com.mycompany.cms.person.Person;
import com.mycompany.cms.person.Student;
import com.mycompany.cms.person.Teacher;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private final PersonDao personDao = new PersonDaoImp();
        private final CoursesDao courseDao = new CoursesDaoImp();
                private final ModuleDao moduleDao = new ModuleDaoImp();
                        private final TeacherDao teacherDao = new TeacherDaoImp();
        private final StudentDao studentDao = new StudentDaoImp();
               




    private final String[] columns = new String[]{"Id", "Name", "Email"};
            private final String[] columnsCourse = new String[]{"Id", "Course Name"};
             private final String[] modulesModule = new String[]{"Id", "Module Name", "Module level"};
                          private final String[] gradeColumns = new String[]{"Id", "Grade", "Module"};
                                                    private final String[] gradeModule = new String[]{"Id","Name","Grade"};


             


    private final DefaultTableModel model = new DefaultTableModel();
        private final DefaultTableModel model1 = new DefaultTableModel();
                private final DefaultTableModel model2 = new DefaultTableModel();
                 private final DefaultTableModel model3 = new DefaultTableModel();
                                  private final DefaultTableModel model4 = new DefaultTableModel();
                                  private final DefaultTableModel model5 = new DefaultTableModel();

     private final Person user;

    public Dashboard(Person person) throws SQLException, ClassNotFoundException {
        this.user = person;
        initComponents();
        setUpTableModel();
        findAllStudent();
                findAllTeacher();
                findAllCourses();
                findAllModules();
            
         if(!person.getUsertype().equals("admin")){
             resultPanel.setVisible(false);
             jPanel3.setVisible(false);
             jPanel2.setVisible(false);
             adminAccessStudent1.setVisible(false);
                     adminAccessStudent.setVisible(false);
         }
         if(!person.getUsertype().equals("teacher")){
             gradePanel.setVisible(false);
         }
         showFeatures.removeAll();
        showFeatures.add(homePanel);
        showFeatures.repaint();
        showFeatures.revalidate();
        viewTotal();
        if(this.user.getUsertype().equals("teacher")){
            gradeButton.setVisible(true);
            teacherbutton1.setVisible(false);
       }else{
            gradeButton.setVisible(false);
        }
        
         if(this.user.getUsertype().equals("admin")){
            gradeButton.setVisible(false);
       }

         if(this.user.getUsertype().equals("student")){
            gradeButton.setVisible(false);
            teacherbutton1.setVisible(false);
       }

    }

    private Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setUpTableModel() {
        studentTable.setModel(model);
                
                studentTable1.setModel(model1);
                studentTable2.setModel(model2);
                                studentTable3.setModel(model3);
                                gradeTable.setModel(model4);
                                jTable1.setModel(model5);


        model.setColumnIdentifiers(columns);
                model1.setColumnIdentifiers(columns);
                model2.setColumnIdentifiers(columnsCourse);
                                model3.setColumnIdentifiers(modulesModule);
                                model4.setColumnIdentifiers(gradeColumns);
                                model5.setColumnIdentifiers(gradeModule);

                

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
        homebutton = new javax.swing.JButton();
        studentbutton = new javax.swing.JButton();
        teacherbutton = new javax.swing.JButton();
        teacherbutton1 = new javax.swing.JButton();
        teacherbutton2 = new javax.swing.JButton();
        coursebutton = new javax.swing.JButton();
        moduleButton = new javax.swing.JButton();
        gradeButton = new javax.swing.JButton();
        showFeatures = new javax.swing.JPanel();
        gradePanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        gardeName = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        searchGradeButton = new javax.swing.JButton();
        remarks = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        modulePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        userfNameTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        editButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        searchStudentTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentTable3 = new javax.swing.JTable();
        coursePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        userfNameTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        editButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable2 = new javax.swing.JTable();
        teacherPanel = new javax.swing.JPanel();
        adminAccessStudent1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        userfNameTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passwordPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lastNameTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        module = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        searchStudentTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        studentPanel = new javax.swing.JPanel();
        adminAccessStudent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userfNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchStudentTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        homePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        totalStudents = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        totalTeacher = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        totalCourses = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        totalModules = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        homebutton.setText("Home");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });

        studentbutton.setText("Student");
        studentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbuttonActionPerformed(evt);
            }
        });

        teacherbutton.setText("Teacher");
        teacherbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherbuttonActionPerformed(evt);
            }
        });

        teacherbutton1.setText("Result");
        teacherbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherbutton1ActionPerformed(evt);
            }
        });

        teacherbutton2.setText("Logout");
        teacherbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherbutton2ActionPerformed(evt);
            }
        });

        coursebutton.setText("Course");
        coursebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursebuttonActionPerformed(evt);
            }
        });

        moduleButton.setText("Module");
        moduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleButtonActionPerformed(evt);
            }
        });

        gradeButton.setText("Grade");
        gradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homebutton)
                    .addComponent(studentbutton)
                    .addComponent(teacherbutton)
                    .addComponent(teacherbutton1)
                    .addComponent(teacherbutton2)
                    .addComponent(coursebutton)
                    .addComponent(moduleButton)
                    .addComponent(gradeButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(homebutton)
                .addGap(56, 56, 56)
                .addComponent(studentbutton)
                .addGap(49, 49, 49)
                .addComponent(teacherbutton)
                .addGap(18, 18, 18)
                .addComponent(coursebutton)
                .addGap(18, 18, 18)
                .addComponent(moduleButton)
                .addGap(23, 23, 23)
                .addComponent(teacherbutton1)
                .addGap(35, 35, 35)
                .addComponent(gradeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(teacherbutton2)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        showFeatures.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jLabel25.setText("Search by id:");

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel26.setText("Name:");

        gardeName.setText("jLabel27");

        jLabel27.setText("Grade:");

        jTextField5.setText("jTextField5");

        jButton10.setText("Edit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradePanelLayout = new javax.swing.GroupLayout(gradePanel);
        gradePanel.setLayout(gradePanelLayout);
        gradePanelLayout.setHorizontalGroup(
            gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradePanelLayout.createSequentialGroup()
                        .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gardeName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradePanelLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(290, 290, 290))
        );
        gradePanelLayout.setVerticalGroup(
            gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jLabel26)
                    .addComponent(gardeName))
                .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(gradePanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        showFeatures.add(gradePanel, "card8");

        jLabel18.setText("Search by id:");

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(gradeTable);

        searchGradeButton.setText("Search");
        searchGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGradeButtonActionPerformed(evt);
            }
        });

        remarks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        remarks.setText("Response");

        jLabel19.setText("Name:");

        name.setText("jLabel20");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(remarks)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchGradeButton)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGradeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remarks)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        showFeatures.add(resultPanel, "card7");

        jLabel14.setText("Module Name:");

        jLabel15.setText("Module level:");

        jLabel16.setText("Course id:");

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        editButton3.setBackground(new java.awt.Color(0, 153, 153));
        editButton3.setForeground(new java.awt.Color(255, 255, 255));
        editButton3.setText("Edit");
        editButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton3ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userfNameTextField3)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(45, 45, 45)
                        .addComponent(editButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userfNameTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(editButton3)
                    .addComponent(jButton8))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jLabel17.setText("Search:");

        searchStudentTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchStudentTextField2KeyReleased(evt);
            }
        });

        studentTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(studentTable3);

        javax.swing.GroupLayout modulePanelLayout = new javax.swing.GroupLayout(modulePanel);
        modulePanel.setLayout(modulePanelLayout);
        modulePanelLayout.setHorizontalGroup(
            modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modulePanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchStudentTextField2))
                    .addGroup(modulePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addGap(93, 93, 93))
        );
        modulePanelLayout.setVerticalGroup(
            modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulePanelLayout.createSequentialGroup()
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modulePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modulePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchStudentTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        showFeatures.add(modulePanel, "card6");

        jLabel13.setText("Course Name:");

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        editButton2.setBackground(new java.awt.Color(0, 153, 153));
        editButton2.setForeground(new java.awt.Color(255, 255, 255));
        editButton2.setText("Edit");
        editButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userfNameTextField2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(45, 45, 45)
                        .addComponent(editButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userfNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(editButton2)
                    .addComponent(jButton6))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        studentTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(studentTable2);

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        showFeatures.add(coursePanel, "card5");

        jLabel5.setText("First Name");

        jLabel8.setText("Email");

        jLabel10.setText("Password");

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        editButton1.setBackground(new java.awt.Color(0, 153, 153));
        editButton1.setForeground(new java.awt.Color(255, 255, 255));
        editButton1.setText("Edit");
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Last Name");

        jLabel24.setText("Module Id:");

        javax.swing.GroupLayout adminAccessStudent1Layout = new javax.swing.GroupLayout(adminAccessStudent1);
        adminAccessStudent1.setLayout(adminAccessStudent1Layout);
        adminAccessStudent1Layout.setHorizontalGroup(
            adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(47, 47, 47)
                .addComponent(editButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAccessStudent1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                        .addGroup(adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 304, Short.MAX_VALUE))
                            .addComponent(passwordPasswordField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                        .addGroup(adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userfNameTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addComponent(lastNameTextField1)
                                .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(module, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        adminAccessStudent1Layout.setVerticalGroup(
            adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userfNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(emailTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(module, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel9)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(adminAccessStudent1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(passwordPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(adminAccessStudent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(editButton1)
                            .addComponent(jButton4))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel12.setText("Search:");

        searchStudentTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchStudentTextField1KeyReleased(evt);
            }
        });

        studentTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(studentTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout teacherPanelLayout = new javax.swing.GroupLayout(teacherPanel);
        teacherPanel.setLayout(teacherPanelLayout);
        teacherPanelLayout.setHorizontalGroup(
            teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(adminAccessStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchStudentTextField1))
                            .addGroup(teacherPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 104, Short.MAX_VALUE))))
                    .addGroup(teacherPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        teacherPanelLayout.setVerticalGroup(
            teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherPanelLayout.createSequentialGroup()
                        .addGroup(teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchStudentTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adminAccessStudent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        showFeatures.add(teacherPanel, "card4");

        jLabel2.setText("First Name");

        jLabel3.setText("Email");

        jLabel6.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(0, 153, 153));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Last Name");

        javax.swing.GroupLayout adminAccessStudentLayout = new javax.swing.GroupLayout(adminAccessStudent);
        adminAccessStudent.setLayout(adminAccessStudentLayout);
        adminAccessStudentLayout.setHorizontalGroup(
            adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAccessStudentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAccessStudentLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(adminAccessStudentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAccessStudentLayout.createSequentialGroup()
                        .addGroup(adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminAccessStudentLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 304, Short.MAX_VALUE))
                            .addComponent(passwordPasswordField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminAccessStudentLayout.createSequentialGroup()
                        .addGroup(adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userfNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addComponent(lastNameTextField)
                                .addGroup(adminAccessStudentLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(adminAccessStudentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminAccessStudentLayout.setVerticalGroup(
            adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAccessStudentLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userfNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAccessStudentLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel4)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(adminAccessStudentLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(adminAccessStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(editButton)
                            .addComponent(jButton3))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel1.setText("Search:");

        searchStudentTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchStudentTextFieldKeyReleased(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout studentPanelLayout = new javax.swing.GroupLayout(studentPanel);
        studentPanel.setLayout(studentPanelLayout);
        studentPanelLayout.setHorizontalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminAccessStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchStudentTextField))
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        studentPanelLayout.setVerticalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(adminAccessStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        showFeatures.add(studentPanel, "card3");

        jLabel20.setText("Students");

        totalStudents.setText("Students");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(totalStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(33, 33, 33)
                .addComponent(totalStudents)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel21.setText("Teachers");

        totalTeacher.setText("Students");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(totalTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(33, 33, 33)
                .addComponent(totalTeacher)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel22.setText("Courses");

        totalCourses.setText("Students");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(totalCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(33, 33, 33)
                .addComponent(totalCourses)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel23.setText("Students");

        totalModules.setText("Students");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(totalModules, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(33, 33, 33)
                .addComponent(totalModules)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        showFeatures.add(homePanel, "card2");

        getContentPane().add(showFeatures, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        showFeatures.removeAll();
        showFeatures.add(homePanel);
        showFeatures.repaint();
        showFeatures.revalidate();
        try {
            viewTotal();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homebuttonActionPerformed

    private void viewTotal() throws SQLException, ClassNotFoundException{
        List<Student> students = studentDao.findAll();
        List<Teacher> teacher = teacherDao.findAll();
        List<Modules> module = moduleDao.findAll();
        List<Courses> course = courseDao.findAll();
        totalStudents.setText(String.valueOf(students.size()));
        totalTeacher.setText(String.valueOf(teacher.size()));
        totalModules.setText(String.valueOf(module.size()));
        totalCourses.setText(String.valueOf(course.size()));
    }
    private void findAllStudent() throws SQLException, ClassNotFoundException {
        model.setRowCount(0);
        List<Person> persons = personDao.findAllStudent();
        for (Person person : persons) {
            Object[] row = {person.getId(), person.getfName(), person.getEmail()};
            
            model.addRow(row);
            
        }
    }
    
    private void findAllCourses() throws SQLException, ClassNotFoundException {
        model2.setRowCount(0);
        List<Courses> courses = courseDao.findAll();
        for (Courses course : courses) {
            Object[] row = {course.getCourse_id(), course.getCourse_name()};
            
            model2.addRow(row);
           
        }
    }
    
    private void findAllModules() throws SQLException, ClassNotFoundException {
        model3.setRowCount(0);
        List<Modules> modules = moduleDao.findAll();
        for (Modules module : modules) {
            Object[] row = {module.getModule_id(), module.getModule_name(), module.getLevel()};
            
            model3.addRow(row);
           
        }
    }
    
    private void findAllTeacher() throws SQLException, ClassNotFoundException {
        model1.setRowCount(0);
        List<Person> persons = personDao.findAllTeacher();
        for (Person person : persons) {
            Object[] row = {person.getId(), person.getfName(), person.getEmail()};
            
            model1.addRow(row);
        }
    }
    
    private void findAllGrade() throws SQLException, ClassNotFoundException {
        model4.setRowCount(0);
        int id = Integer.parseInt(jTextField3.getText());
        Student checkStu = studentDao.findOne(id);
        if(checkStu!=null){
            Person nam = personDao.findOne(id);
            name.setText(nam.getfName()+" "+nam.getfName());
            List<Student> students = studentDao.findAll(id);
            int pass = 0;
            int total = 0;
            for (Student student : students) {
                Person person = personDao.findOne(id);
                if(person!=null){
                    Modules module = moduleDao.findOne(student.getModule_id());
                    if(module!=null){
                        total++;
                        Object[] row = {student.getId(), student.getMarks(), module.getModule_name()};
                         if(student.getMarks()>40){
                             pass++;
                         }
                        model4.addRow(row);
                    }
                }
            }
            if(pass>=total/2){
                remarks.setText("PASS");
            }else{
                remarks.setText("FAIL");
            }
        }else{
            //message
        }
    }
    
    private void findAllGradeForResult() throws SQLException, ClassNotFoundException {
        model5.setRowCount(0);
        int id = Integer.parseInt(jTextField4.getText());
        int teacherid = this.user.getId();
        int moduleId = teacherDao.findOne(teacherid).getModule_id();
        List<Student> checkStu = studentDao.findAll(id, moduleId);
        if(checkStu!=null){
            for (Student student : checkStu) {
                Object[] row = {student.getId(),personDao.findOne(student.getId()).getfName()+" "+personDao.findOne(student.getId()).getlName(), student.getMarks()};
                model5.addRow(row);
            }   
            
            
        }else{
            //message
        }
    }
    
    
    private void removeStudent() {
        int selectedRow = studentTable.getSelectedRow();
        int id = (int) studentTable.getValueAt(selectedRow, 0);
        try {
            Person person = personDao.findOne(id);
            if (person != null) {
                int rowCount = personDao.remove(id);
                if (rowCount >= 1) {
                    
                    findAllStudent();
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
    
     private void removeTeacher() {
        int selectedRow = studentTable1.getSelectedRow();
        int id = (int) studentTable1.getValueAt(selectedRow, 0);
        try {
            Person person = personDao.findOne(id);
            if (person != null) {
                int rowCount = personDao.remove(id);
                if (rowCount >= 1) {
                    
                    findAllTeacher();
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
     
     private void removeCourse() {
        int selectedRow = studentTable2.getSelectedRow();
        int id = (int) studentTable2.getValueAt(selectedRow, 0);
        try {
            Courses course = courseDao.findOne(id);
            if (course != null) {
                int rowCount = courseDao.remove(id);
                if (rowCount >= 1) {
                    
                    findAllCourses();
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
     
      
     private void removeModule() {
        int selectedRow = studentTable3.getSelectedRow();
        int id = (int) studentTable3.getValueAt(selectedRow, 0);
        try {
            Modules module = moduleDao.findOne(id);
            if (module != null) {
                int rowCount = moduleDao.remove(id);
                if (rowCount >= 1) {
                    
                    findAllModules();
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
     private void saveStudent() throws NumberFormatException, HeadlessException {
        try {
            Person person = getValueFromTextFieldForStudent();
            int rowCount = personDao.save(person);
            if (rowCount >= 1) {
               
                resetForm();
                findAllStudent();
            } else {
                
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException ex) {
            
        }
    }
     
     
     private void saveTeacher() throws NumberFormatException, HeadlessException {
        try {
            Person person = getValueFromTextFieldForTeacher();
            int moduleId = Integer.parseInt(module.getText());
            if(moduleDao.findOne(moduleId)!=null){
                int rowCount = personDao.save(person);
                Teacher teacher = new Teacher(person.getId(),moduleId);
                if (rowCount >= 1) {
                   teacherDao.save(teacher);
                    resetTeacherForm();
                    findAllTeacher();
                } else {

                }
            }else{
                //message- enter valid module id
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException ex) {
            
        }
    }
     
     private void saveCourse() throws NumberFormatException, HeadlessException {
        try {
            Courses course = getValueFromTextFieldForCourse();
            int rowCount = courseDao.save(course);
            if (rowCount >= 1) {
               
                resetTeacherForm();
                findAllCourses();
            } else {
                
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException ex) {
            
        }
    }
     
     private void saveModule() throws NumberFormatException, HeadlessException {
        try {
            Modules module = getValueFromTextFieldForModule();
            int rowCount = moduleDao.save(module);
            if (rowCount >= 1) {
               
                resetModuleForm();
                findAllModules();
            } else {
                
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException ex) {
            
        }
    }
     
     
      private void resetForm() {
        userfNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        
        passwordPasswordField.setText("");
    }
      private void resetTeacherForm() {
        userfNameTextField1.setText("");
        lastNameTextField1.setText("");
        emailTextField1.setText("");
        
        passwordPasswordField1.setText("");
    }
      
       private void resetModuleForm() {
        userfNameTextField3.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        
    }
      
     private Person getValueFromTextFieldForStudent() throws NumberFormatException {
        String fname = userfNameTextField.getText();
        String lname = lastNameTextField.getText();
        String email = emailTextField.getText();
        
        String password = passwordPasswordField.getText();
        
        
        Person person = new Person(fname, lname, email, password, "student");
        return person;
    }
     
      private Person getValueFromTextFieldForTeacher() throws NumberFormatException {
        String fname = userfNameTextField1.getText();
        String lname = lastNameTextField1.getText();
        String email = emailTextField1.getText();
        
        String password = passwordPasswordField1.getText();
        
        
        
        Person person = new Person(fname, lname, email, password, "teacher");
        return person;
    }
      
       private Modules getValueFromTextFieldForModule() throws NumberFormatException, SQLException, ClassNotFoundException {
        String module_name = userfNameTextField3.getText();
        int level = Integer.parseInt(jTextField1.getText());
        int course_id = Integer.parseInt(jTextField2.getText());
        
        Courses course = courseDao.findOne(course_id);
        if(course!=null){
            Modules module = new Modules(module_name, level, 0 , 0, course_id);
            return module;
        }else{
            System.out.println("course id  not valid");
            return null;
        }
        
           
    }
      
       private Courses getValueFromTextFieldForCourse() throws NumberFormatException {
        String course_name = userfNameTextField2.getText();
        
        
        
        Courses course = new Courses(course_name);
        return course;
    }
      
     private void searchStudent() throws SQLException, ClassNotFoundException {
        String query = searchStudentTextField.getText();
        if (query.length() == 0) {
            findAllStudent();
        } else {
            model.setRowCount(0);
            try {
                List<Person> persons = personDao.search(searchStudentTextField.getText());
                for (Person person : persons) {
                    Object[] row = {person.getId(), person.getfName(), person.getEmail()};
                    model.addRow(row);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                
            }
        }
    }
     
     private void searchModule() throws SQLException, ClassNotFoundException {
        String query = searchStudentTextField2.getText();
        if (query.length() == 0) {
            findAllModules();
        } else {
            model3.setRowCount(0);
            try {
                List<Modules> modules = moduleDao.search(searchStudentTextField2.getText());
                for (Modules module : modules) {
                    Object[] row = {module.getModule_id(), module.getModule_name(), module.getLevel()};
                    model3.addRow(row);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                
            }
        }
    }
     
     private void searchTeacher() throws SQLException, ClassNotFoundException {
        String query = searchStudentTextField1.getText();
        if (query.length() == 0) {
            findAllTeacher();
        } else {
            model.setRowCount(0);
            try {
                List<Person> persons = personDao.search(searchStudentTextField.getText());
                for (Person person : persons) {
                    Object[] row = {person.getId(), person.getfName(), person.getEmail()};
                    model.addRow(row);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                
            }
        }
    }
     
     private void updateStudent() throws NumberFormatException {
        try {
            int selectedRow = studentTable.getSelectedRow();
            int id = (int) studentTable.getValueAt(selectedRow, 0);
            Person person = personDao.findOne(id);
            if (editButton.getText().equals("Edit")) {
                editButton.setText("Update");
                
                userfNameTextField.setText(person.getfName());
                lastNameTextField.setText(person.getlName());
                emailTextField.setText(person.getEmail());
                
                passwordPasswordField.setText(person.getPassword());
        
                
            } else if (editButton.getText().equals("Update")) {
                
                person.setfName(userfNameTextField.getText());
                person.setfName(lastNameTextField.getText());
                person.setEmail(emailTextField.getText());
                person.setPassword(passwordPasswordField.getText());
                
                
                int rowCount = personDao.updateStudent(person, id);

                if (rowCount >= 1) {
                    
                    resetForm();
                    findAllStudent();
                    editButton.setText("Edit");
                } else {
                    
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
     
     private void updateTeacher() throws NumberFormatException {
        try {
            int selectedRow = studentTable1.getSelectedRow();
            int id = (int) studentTable1.getValueAt(selectedRow, 0);
            Person person = personDao.findOne(id);
            if (editButton1.getText().equals("Edit")) {
                editButton1.setText("Update");
                
                userfNameTextField1.setText(person.getfName());
                lastNameTextField1.setText(person.getlName());
                emailTextField1.setText(person.getEmail());
                
                passwordPasswordField1.setText(person.getPassword());
        
                
            } else if (editButton1.getText().equals("Update")) {
                
                person.setfName(userfNameTextField1.getText());
                person.setfName(lastNameTextField1.getText());
                person.setEmail(emailTextField1.getText());
                person.setPassword(passwordPasswordField1.getText());
                
                
                int rowCount = personDao.updateTeacher(person, id);

                if (rowCount >= 1) {
                    
                    resetTeacherForm();
                    findAllTeacher();
                    editButton1.setText("Edit");
                } else {
                    
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
     
     private void updateCourse() throws NumberFormatException {
        try {
            int selectedRow = studentTable2.getSelectedRow();
            int id = (int) studentTable2.getValueAt(selectedRow, 0);
            Courses course = courseDao.findOne(id);
            if (editButton2.getText().equals("Edit")) {
                editButton2.setText("Update");
                
                userfNameTextField2.setText(course.getCourse_name());
                
                
                
        
                
            } else if (editButton2.getText().equals("Update")) {
                
                course.setCourse_name(userfNameTextField2.getText());
                
                
                int rowCount = courseDao.update(course, id);

                if (rowCount >= 1) {
                    
                    userfNameTextField2.setText("");
                    findAllCourses();
                    editButton2.setText("Edit");
                } else {
                    
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
    
      private void updateModule() throws NumberFormatException {
        try {
            int selectedRow = studentTable3.getSelectedRow();
            int id = (int) studentTable3.getValueAt(selectedRow, 0);
            Modules module = moduleDao.findOne(id);
            if (editButton3.getText().equals("Edit")) {
                editButton3.setText("Update");
                
                userfNameTextField3.setText(module.getModule_name());
                jTextField1.setText(String.valueOf(module.getLevel()));
             jTextField2.setVisible(false);
             jLabel16.setVisible(false);
                
                
                
        
                
            } else if (editButton3.getText().equals("Update")) {
                
                module.setModule_name(userfNameTextField3.getText());
                module.setLevel(Integer.parseInt(jTextField1.getText()));
                
                
                int rowCount = moduleDao.update(module, id);

                if (rowCount >= 1) {
                    
                    userfNameTextField3.setText("");
                    jTextField2.setVisible(true);
                    jTextField1.setText("");
             jLabel16.setVisible(true);
                    findAllModules();
                    editButton3.setText("Edit");
                } else {
                    
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }

       private void updateGrade() throws NumberFormatException {
        try {
            int selectedRow = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(selectedRow, 0);
            Student student = studentDao.findOne(id);
            if (jButton10.getText().equals("Edit")) {
                jButton10.setText("Update");
                gardeName.setText(personDao.findOne(id).getfName()+" "+personDao.findOne(id).getlName());
                
                jTextField5.setText(String.valueOf(student.getMarks()));
         
                
            } else if (jButton10.getText().equals("Update")) {
                student.setMarks(Integer.parseInt(jTextField5.getText()));
                
                
                
                int rowCount = studentDao.updateMarks(student, id,teacherDao.findOne(this.user.getId()).getModule_id());

                if (rowCount >= 1) {
                    
                    jTextField5.setText("");
                    gardeName.setText("");
             
                    findAllGradeForResult();
                    jButton10.setText("Edit");
                } else {
                    
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }
    private void studentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbuttonActionPerformed
        // TODO add your handling code here:
        showFeatures.removeAll();
        showFeatures.add(studentPanel);
        showFeatures.repaint();
        showFeatures.revalidate();
        try {
            findAllStudent();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studentbuttonActionPerformed

    private void teacherbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherbuttonActionPerformed
        // TODO add your handling code here:
        showFeatures.removeAll();
        showFeatures.add(teacherPanel);
        showFeatures.repaint();
        showFeatures.revalidate();
    }//GEN-LAST:event_teacherbuttonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        updateStudent();
    }//GEN-LAST:event_editButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        removeStudent();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void teacherbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherbutton1ActionPerformed
        // TODO add your handling code here:
         showFeatures.removeAll();
        showFeatures.add(resultPanel);
        showFeatures.repaint();
        showFeatures.revalidate();
        if(!this.user.getUsertype().equals("admin")){
            resultPanel.setVisible(false);
       }
    }//GEN-LAST:event_teacherbutton1ActionPerformed

    private void teacherbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherbutton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        LoginPage login = new LoginPage();
        login.setVisible(true);
    }//GEN-LAST:event_teacherbutton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        saveStudent();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchStudentTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchStudentTextFieldKeyReleased
        try {
            // TODO add your handling code here:
            searchStudent();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchStudentTextFieldKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        saveTeacher();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        // TODO add your handling code here:
        updateTeacher();
    }//GEN-LAST:event_editButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        removeTeacher();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchStudentTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchStudentTextField1KeyReleased
        try {
            // TODO add your handling code here:
            searchTeacher();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchStudentTextField1KeyReleased

    private void coursebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursebuttonActionPerformed
        // TODO add your handling code here:
        showFeatures.removeAll();
        showFeatures.add(coursePanel);
        showFeatures.repaint();
        showFeatures.revalidate();
    }//GEN-LAST:event_coursebuttonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        saveCourse();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void editButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton2ActionPerformed
        // TODO add your handling code here:
        updateCourse();
    }//GEN-LAST:event_editButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        removeCourse();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        saveModule();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void editButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton3ActionPerformed
        // TODO add your handling code here:
        updateModule();
    }//GEN-LAST:event_editButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        removeModule();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void searchStudentTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchStudentTextField2KeyReleased
        try {
            // TODO add your handling code here:
            searchModule();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchStudentTextField2KeyReleased

    private void moduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleButtonActionPerformed
        // TODO add your handling code here:
        showFeatures.removeAll();
        showFeatures.add(modulePanel);
        showFeatures.repaint();
        showFeatures.revalidate();
    }//GEN-LAST:event_moduleButtonActionPerformed

    private void searchGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGradeButtonActionPerformed
        try {
            // TODO add your handling code here:
            findAllGrade();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchGradeButtonActionPerformed

    private void gradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeButtonActionPerformed
       showFeatures.removeAll();
            showFeatures.add(gradePanel);
            showFeatures.repaint();
            showFeatures.revalidate();
        
       
    }//GEN-LAST:event_gradeButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            if(this.user.getUsertype().equals("teacher")){
                findAllGradeForResult();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        updateGrade();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminAccessStudent;
    private javax.swing.JPanel adminAccessStudent1;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JButton coursebutton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JButton editButton2;
    private javax.swing.JButton editButton3;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JLabel gardeName;
    private javax.swing.JButton gradeButton;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JTable gradeTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton homebutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField lastNameTextField1;
    private javax.swing.JTextField module;
    private javax.swing.JButton moduleButton;
    private javax.swing.JPanel modulePanel;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JPasswordField passwordPasswordField1;
    private javax.swing.JLabel remarks;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JButton searchGradeButton;
    private javax.swing.JTextField searchStudentTextField;
    private javax.swing.JTextField searchStudentTextField1;
    private javax.swing.JTextField searchStudentTextField2;
    private javax.swing.JPanel showFeatures;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable studentTable1;
    private javax.swing.JTable studentTable2;
    private javax.swing.JTable studentTable3;
    private javax.swing.JButton studentbutton;
    private javax.swing.JPanel teacherPanel;
    private javax.swing.JButton teacherbutton;
    private javax.swing.JButton teacherbutton1;
    private javax.swing.JButton teacherbutton2;
    private javax.swing.JLabel totalCourses;
    private javax.swing.JLabel totalModules;
    private javax.swing.JLabel totalStudents;
    private javax.swing.JLabel totalTeacher;
    private javax.swing.JTextField userfNameTextField;
    private javax.swing.JTextField userfNameTextField1;
    private javax.swing.JTextField userfNameTextField2;
    private javax.swing.JTextField userfNameTextField3;
    // End of variables declaration//GEN-END:variables
}
