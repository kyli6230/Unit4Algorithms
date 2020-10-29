package Sorting;

import InsertRemove.Person;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Assignment extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();
    int nums[] = new int[50000];
    
    public Assignment() {
        initComponents();
        lstnums.setModel(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList<>();
        btnGenerate = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBubble = new javax.swing.JButton();
        btnSelection = new javax.swing.JButton();
        btnInsertion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRecursion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstnums);

        btnGenerate.setBackground(new java.awt.Color(51, 255, 255));
        btnGenerate.setText("Generate Numbers");
        btnGenerate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        lblTime.setBackground(new java.awt.Color(204, 255, 255));
        lblTime.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sorting Algorithnms");

        btnBubble.setBackground(new java.awt.Color(153, 255, 255));
        btnBubble.setText("Bubble Sort");
        btnBubble.setEnabled(false);
        btnBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBubbleActionPerformed(evt);
            }
        });

        btnSelection.setBackground(new java.awt.Color(153, 255, 255));
        btnSelection.setText("Selection Sort");
        btnSelection.setEnabled(false);
        btnSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectionActionPerformed(evt);
            }
        });

        btnInsertion.setBackground(new java.awt.Color(153, 255, 255));
        btnInsertion.setText("Insertion Sort");
        btnInsertion.setEnabled(false);
        btnInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBubble)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recursion");

        btnRecursion.setBackground(new java.awt.Color(153, 255, 255));
        btnRecursion.setText("Quick Sort");
        btnRecursion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecursion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecursion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnClear.setBackground(new java.awt.Color(153, 255, 255));
        btnClear.setText("Clear List");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionActionPerformed
        insertionSort(nums);
        list.clear();
        for (int x : nums) { //read only for loop
            list.addElement(x);
        }
        turnOff();
    }//GEN-LAST:event_btnInsertionActionPerformed

    private void btnSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectionActionPerformed
        selectionSort(nums);
        list.clear();
        for (int x : nums) { //read only for loop
            list.addElement(x);
        }
        turnOff();
    }//GEN-LAST:event_btnSelectionActionPerformed

    private void btnBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBubbleActionPerformed
        bubbleSort(nums);
        list.clear();
        for (int x : nums) { //read only for loop
            list.addElement(x);
        }
        turnOff();
    }//GEN-LAST:event_btnBubbleActionPerformed

    public void turnOn(){
        btnBubble.setEnabled(true);
        btnInsertion.setEnabled(true);
        btnSelection.setEnabled(true);
    }
    
    public void turnOff(){
        btnBubble.setEnabled(false);
        btnInsertion.setEnabled(false);
        btnSelection.setEnabled(false);
    }
    
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        list.clear();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 50000 + 1);
        }
        
        for (int x : nums) { //read only for loop
            list.addElement(x);
        }
        turnOn();
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        list.clear();
        turnOff();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRecursionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursionActionPerformed
        bubbleSort(nums);
        list.clear();
        for (int x : nums) { //read only for loop
            list.addElement(x);
        }
        turnOff();
    }//GEN-LAST:event_btnRecursionActionPerformed

    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++) { 
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while
}

//supporting swap method

public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}

////////////////////////////////////////////////////////////////

public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(a, i, minIndex);
   } //end for
}  

//supporting findMinimum method

public static int findMinimum(int[] a, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}

//supporting swap method (same as bubble sort swap)
/////////////////////////////////////////////////////////////

public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}//end for
}//end method

    
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
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBubble;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnInsertion;
    private javax.swing.JButton btnRecursion;
    private javax.swing.JButton btnSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JList<String> lstnums;
    // End of variables declaration//GEN-END:variables
}
