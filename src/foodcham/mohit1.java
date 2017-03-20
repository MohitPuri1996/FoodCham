package foodcham;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class mohit1 extends javax.swing.JFrame implements Runnable{
     String query,table,custom,name,phone,normal1,normal2;
     int q1,q2,q3;int x;
String []ss={"Table1","Table2","Table3"};
    JButton jb[];
    public mohit1() {
        jb=new JButton[3];
        for(int i=0;i<3;i++){
            jb[i]=new JButton();
            
        }
        jButton1=new JButton();
        jButton2=new JButton();
        jButton3=new JButton();
        
        jb[0]=jButton1;
        jb[1]=jButton2;
        jb[2]=jButton3;
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Table1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Table2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Table3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jButton3.getBackground()==Color.RED){
            notify();
            System.out.println(name+" "+phone+" "+table+" "+custom+" "+q1+" "+normal1+" "+q2+" "+normal2+" "+q3);
        }
        else{notify();
            System.out.println(name+" "+phone+" "+table+" "+custom+" "+q1+" "+normal1+" "+q2+" "+normal2+" "+q3);
            System.err.println("mohit");
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(jButton3.getBackground()==Color.RED){
            System.out.println(name+" "+phone+" "+table+" "+custom+" "+q1+" "+normal1+" "+q2+" "+normal2+" "+q3);
          //  notify();
        }
        else{
            System.out.println(name+" "+phone+" "+table+" "+custom+" "+q1+" "+normal1+" "+q2+" "+normal2+" "+q3);
            System.err.println("mohit");
        //notify();
        //notify();
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(jButton3.getBackground()==Color.RED){
            System.out.println(name+" "+phone+" "+table+" "+custom+" "+q1+" "+normal1+" "+q2+" "+normal2+" "+q3);
        //notify();
         }
         else{            System.out.println(name+" "+phone+" "+table+" "+custom+" "+q1+" "+normal1+" "+q2+" "+normal2+" "+q3);
            System.err.println("mohit");
        //notify();
         }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public synchronized void run(){
        if(Thread.currentThread().getName().equals("Table1")){
            
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "root");
            query="Select * from fc2 where table_no='Table1'";
            System.err.println("Thread 1");
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                table=rs.getString("table_no");
                System.out.println(table);
               
                
                name=rs.getString("name");
                phone=rs.getString("phone_no");
                custom=rs.getString("Customize");
                normal1=rs.getString("normal1");normal2=rs.getString("normal2");
                q1=rs.getInt("quantity");
                q2=rs.getInt("quantity1");
                q3=rs.getInt("quantity2");
            }
             check(table);
            con.close();
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();    
        }
           
            //getData(query);// notify();
        }
        else if(Thread.currentThread().getName().equals("Table2")){
             query="Select * from fc2 where table_no='Table2'";
               System.err.println("Thread 2");
 try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "root");
           // query="Select * from fc2 where table_no='Table1'";
            System.err.println("Thread 1");
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                table=rs.getString("table_no");
                System.out.println(table);
                name=rs.getString("name");
                phone=rs.getString("phone_no");
                custom=rs.getString("Customize");
                normal1=rs.getString("normal1");normal2=rs.getString("normal2");
                
                q1=rs.getInt("quantity");
                q2=rs.getInt("quantity1");
                q3=rs.getInt("quantity2");
            }
             check(table);
            con.close();
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();    
        }
              
               

//getData(query);
        }
        else if(Thread.currentThread().getName().equals("Table3")){
             query="Select * from fc2 where table_no='Table3'";
               System.err.println("Thread 3");
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "root");
           // query="Select * from fc2 where table_no='Table1'";
            System.err.println("Thread 1");
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                table=rs.getString("table_no");
                System.out.println(table);
               
                
                name=rs.getString("name");
                phone=rs.getString("phone_no");
                custom=rs.getString("Customize");
                normal1=rs.getString("normal1");normal2=rs.getString("normal2");
                
                q1=rs.getInt("quantity");
                q2=rs.getInt("quantity1");
                q3=rs.getInt("quantity2");
            }
             check(table);
            con.close();
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();    
        }
       
//            getData(query);
        }
        }
    public void check(String s) throws InterruptedException{
        System.out.println("in");
        for(int i=0;i<3;i++){
             System.out.println("in2");
              x=i;
            if(ss[i].equals(s)){
                System.err.println("in"+s);
               jb[i].setBackground(Color.RED);
                   try{wait();}catch(Exception e){
                       e.printStackTrace();
                   }
            }
        }
    }
    public  void getData(String query){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "root");
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                table=rs.getString("table_no");
                System.out.println(table);
                name=rs.getString("name");
                phone=rs.getString("phone_no");
                custom=rs.getString("Customize");
                normal1=rs.getString("normal1");normal2=rs.getString("normal2");
                
                q1=rs.getInt("quantity");
                q2=rs.getInt("quantity1");
                q3=rs.getInt("quantity2");
            }
             check(table);
            con.close();
            rs.close();
            
        }catch(Exception e){
            e.printStackTrace();    
        }
    }
    
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
            java.util.logging.Logger.getLogger(mohit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mohit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mohit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mohit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   mohit1 m= new mohit1();
                   m.setVisible(true);
                   Thread t1=new Thread(m);t1.setName("Table1");
                   Thread t2=new Thread(m);t2.setName("Table2");
                   Thread t3=new Thread(m);t3.setName("Table3");
                   t1.start();
                   t2.start();
                   t3.start();


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
