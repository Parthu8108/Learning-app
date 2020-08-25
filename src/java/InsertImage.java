    import java.sql.*;  
    import java.io.*;  
    public class InsertImage {  
    public static void main(String[] args) {  
    try{  
    Class.forName("org.apache.derby.jdbc.ClientDriver");  
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/java","parth","1234");  
                  
    PreparedStatement ps=con.prepareStatement("insert into images values(?,?)"); 
    ps.setString(1,"nine");  
    
    FileInputStream fin=new FileInputStream("C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\src\\java\\9.jpg");  
    ps.setBinaryStream(2,fin,fin.available());  
    int i=ps.executeUpdate();  
    System.out.println(i+" records affected");  
              
    con.close();  
    }
    catch (Exception e) 
    {e.printStackTrace();
    System.out.println(e);}  
    }  
    }  