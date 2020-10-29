package InsertRemove;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PeopleList extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();
    static String name, gender;
    static int age, loc;

    public PeopleList() {
        initComponents();
        people.add(new Person("Bob", 25, "M"));
        people.add(new Person("Fran", 55, "F"));
        people.add(new Person("Mike", 15, "M"));
        people.add(new Person("Sue", 30, "F"));
        lstpeople.setModel(list);
        //Person p = new Person ("",0,null);
        for (Person p : people) {
            list.addElement(p.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optmale = new javax.swing.JRadioButton();
        optfemale = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuClear = new javax.swing.JMenuItem();
        mnuAdd = new javax.swing.JMenuItem();
        mnuDelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuAll = new javax.swing.JMenuItem();
        mnuFemale = new javax.swing.JMenuItem();
        mnuMale = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("People List");

        lstpeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstpeople);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Age:");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(optmale);
        optmale.setText("Male");
        optmale.setActionCommand("M");

        buttonGroup1.add(optfemale);
        optfemale.setText("Female");
        optfemale.setActionCommand("F");
        optfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optfemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(optmale, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(optfemale)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optmale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optfemale))
                .addGap(14, 14, 14))
        );

        jMenu1.setText("File");

        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/exit.png"))); // NOI18N
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/exit.png"))); // NOI18N
        mnuClear.setText("Clear");
        mnuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuClear);

        mnuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/insert.png"))); // NOI18N
        mnuAdd.setText("Add");
        mnuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAdd);

        mnuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/delete.png"))); // NOI18N
        mnuDelete.setText("Delete");
        mnuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/all.png"))); // NOI18N
        mnuAll.setText("Show All");
        mnuAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAllActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAll);

        mnuFemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/female.png"))); // NOI18N
        mnuFemale.setText("Female");
        mnuFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFemaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuFemale);

        mnuMale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/male.png"))); // NOI18N
        mnuMale.setText("Male");
        mnuMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addComponent(txtage)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optfemaleActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteActionPerformed
        name = "" + lstpeople.getSelectedValue();
        Person p = new Person(name, 0, null);
        loc = search(people, p);
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearForm();
    }//GEN-LAST:event_mnuDeleteActionPerformed

    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpeopleMouseClicked
        // TODO add your handling code here:
        //put code here for clickin gon the name
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name, 0, ""));
        show(people.get(loc));
    }//GEN-LAST:event_lstpeopleMouseClicked

    private void mnuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddActionPerformed
        // insert a person
        //find insert point
        name = txtname.getText();
        age = Integer.parseInt(txtage.getText());
        gender = buttonGroup1.getSelection().getActionCommand();
        Person temp = new Person(name, age, gender);
        loc = search(people, temp);
        if (loc == -1) //add them to the list
        {
            loc = findInsertPoint(people, temp);
            people.add(loc, temp);
            list.add(loc, temp.getName());
        } else {
            JOptionPane.showMessageDialog(this, "new Person object must have unique name");
        }
    }//GEN-LAST:event_mnuAddActionPerformed

    private void mnuFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFemaleActionPerformed
        // only show females
        list.clear();
        for (Person per : people) {
            if (per.getGender().equals("F")) {
                list.addElement(per.getName());
            }
        }
        clearForm();
    }//GEN-LAST:event_mnuFemaleActionPerformed

    private void mnuMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMaleActionPerformed
        // only show males
         list.clear();
        for (Person per : people) {
            if (per.getGender().equals("M")) {
                list.addElement(per.getName());
            }
        }
        clearForm();
    }//GEN-LAST:event_mnuMaleActionPerformed

    private void mnuAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAllActionPerformed
        // show all
        list.clear();
        for (Person per : people) {
            loc = findInsertPoint(people, per);
            list.add(loc, per.getName());
        }
        clearForm();
    }//GEN-LAST:event_mnuAllActionPerformed

    private void mnuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClearActionPerformed
        clearForm();
    }//GEN-LAST:event_mnuClearActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleList().setVisible(true);
            }
        });
    }

    public void clearForm() {
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lstpeople.clearSelection();
    }

    public void show(Person p) {
        txtname.setText(p.getName());
        txtage.setText("" + p.getAge());
        if (p.getGender() == "M") {
            optmale.setSelected(true);
        } else {
            optfemale.setSelected(true);
        }
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (result < 0) {
            midpoint++;
        }
        return midpoint;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuAdd;
    private javax.swing.JMenuItem mnuAll;
    private javax.swing.JMenuItem mnuClear;
    private javax.swing.JMenuItem mnuDelete;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFemale;
    private javax.swing.JMenuItem mnuMale;
    private javax.swing.JRadioButton optfemale;
    private javax.swing.JRadioButton optmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
