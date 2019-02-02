/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Buddhika Lakshan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/citypak", "root", "123");
            // Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/citypak", "root", "123");
            Statement statement = (Statement) connection.createStatement();

            BufferedReader in = new BufferedReader(new FileReader("src/javaapplication1/d.csv"));
            String str;
            while ((str = in.readLine()) != null) {
                String[] ar = str.split(",");
                System.out.println("insert into customer values ('"+ar[0]+"','"+ar[1]+"','"+ar[2]+"','"+ar[3]+"','"+ar[4]+"','"+ar[5]+"','"+ar[6]+"','"+ar[7]+"','"+ar[8]+"','"+ar[9]+"','"+ar[10]+"','"+ar[11]+"');");

              //  statement.executeUpdate("insert into customer values ('"+ar[0]+"','"+ar[1]+"','"+ar[2]+"','"+ar[3]+"','"+ar[4]+"','"+ar[5]+"','"+ar[6]+"','"+ar[7]+"','"+ar[8]+"','"+ar[9]+"','"+ar[10]+"','"+ar[11]+"')");
                // new scv.SaveCsvPin().SaveCsv(ar[0], ar[1], ar[2], ar[3], ar[4], jTable1);
              //  new uploadCsv.SaveCsvPin().SaveCsv(ar[0], ar[1], ar[2], ar[3], ar[4]);
            }
          //  response.sendRedirect("addCardModel.jsp?msg=Successfully Uploading");
            in.close();
        } catch (Exception e) {
           // response.sendRedirect("addCardModel.jsp?msg=error Uploading");
            e.printStackTrace();
        }

    }

}
