
package project_1;

import java.sql.*;


public class DbConnection {
     Connection con = null;
public static void main(String[] args) {
        /*
         * Bu kod bir SQLite veritabanına bağlanıyor ve "Users" tablosundaki verileri alarak ekrana yazdırıyor gibi görünüyor. İşlem adımları şu şekilde:
        İlk olarak, bir veritabanı bağlantısı oluşturuluyor. Bağlantı dizesi jdbc:sqlite:C://Users//Casper//OneDrive//Documents//NetBeansProjects//Project//Users.db kullanılarak oluşturuluyor.
        Bağlantı başarılıysa, "Veritabanına bağlandınız!" mesajı yazdırılıyor.
        Bir SQL sorgusu oluşturuluyor. Bu sorgu, "Users" tablosundan tüm verileri seçiyor.
        Sorgu çalıştırılıyor ve sonuçlar bir döngüde işleniyor. Her bir sonuç satırı için, "UserID", "UserName" ve "Password" sütunlarındaki değerler ekrana yazdırılıyor.
        Eğer bir hata oluşursa, bununla ilgili bir mesaj yazdırılıyor.
         */
        String url = "jdbc:sqlite:C://Users//Casper//OneDrive//Documents//NetBeansProjects//Project//Users.db";
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Veritabanına bağlandınız!");

            String sql = "select * from Users";

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while(rs.next()){
                    System.out.println(rs.getInt("UserID") + " " 
                    + rs.getString("UserName") + " " 
                    + rs.getInt("Password") + " " );
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        } 
        catch (Exception e) {
            System.out.println("Connection Failed" + e);
        }
    }
    
}





