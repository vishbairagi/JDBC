package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class student {
    public void Createdb(){
        //driver load
        try{
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "-";
        String databasesName = "MYDB";
        Connection conn =  DriverManager.getConnection(url,username,password);
        Statement stm = conn.createStatement();
        
        
        System.out.println("Connected Successfully");
        String query = "create database DB";
        boolean b1=stm.execute(query);
        System.out.println("DataBase deleted successfully:"+b1);
        conn.close();
        
        }catch(Exception e){
        e.printStackTrace();
        
        
        }
        //conn establish
        //statement create
        //execute - query
        //conn close
        
        }
        public void createTable(){

            try{
                String url = "jdbc:mysql://localhost:3306/";
               
                String username = "root";
                String password = "-";
                String databasesName = "MYDB";
                Connection conn =  DriverManager.getConnection(url,username,password);
                Statement stm = conn.createStatement();
                
                
                System.out.println("Connected Successfully");
                String query =" ";
                boolean b1=stm.execute(query);
                System.out.println("insert into table successfully:"+b1);
                conn.close();
                
                }catch(Exception e){
                e.printStackTrace();
                
                
                } 
        }
        public void createData() {
            
            try{
                String url = "jdbc:mysql://localhost:3306/";
                String db = "db";
                String username = "root";
                String password = "-";
                String databasesName = "MYDB";
                Connection conn =  DriverManager.getConnection(url+db,username,password);
                Statement stm = conn.createStatement();
                
                
                System.out.println("Connected Successfully");
                String query = "insert into student(s_id,s_name,s_EmailId)values(3,'Raman','raman89@gmail.com')";
                stm.execute(query);
                System.out.println("data inserted into table successfully:");
                conn.close();
                
                }catch(Exception e){
                e.printStackTrace();
                
                
                } 
        
            
        }
        public void readData() {
            try{
                String url = "jdbc:mysql://localhost:3306/";
                String db = "db";
                String username = "root";
                String password = "-";
                String databasesName = "MYDB";
                Connection conn =  DriverManager.getConnection(url+db,username,password);
                Statement stm = conn.createStatement();
                
                
                System.out.println("Connected Successfully");
                String query = "select * from student";
                 ResultSet rs=stm.executeQuery(query);
                 while (rs.next()) {
                    System.out.println("id ="+ rs.getInt(1)); 
                    System.out.println("id ="+ rs.getString(2));
                    System.out.println("id ="+ rs.getString(3)); 
 

                     
                 }
                System.out.println("Read  successfully:"+rs);
                conn.close();
                
                }catch(Exception e){
                e.printStackTrace();
                
                
                } 
           
        }
        public void updateData() {
            try{
                String url = "jdbc:mysql://localhost:3306/";
                String db = "db";
                String username = "root";
                String password = "-";
                String databasesName = "MYDB";
                Connection conn =  DriverManager.getConnection(url+db,username,password);
                Statement stm = conn.createStatement();
             System.out.println("Connected Successfully");
                String query = "update student set s_name='ram' where s_id=2";
                stm.execute(query);
                System.out.println("Data updated successfully:");
                conn.close();
                 }catch(Exception e){
                e.printStackTrace();
                
                
                } 
           
        }
}
