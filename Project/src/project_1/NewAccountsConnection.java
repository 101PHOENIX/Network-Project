/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.sql.*;


/**
 *
 * @author Lenovo
 */
/*
 *  bir veritabanı bağlantısı oluşturmak için bir yöntem sağlayan bir sınıfı tanımlar.
    NewAccountsConnection adında bir sınıf tanımlanır.
    Sınıf içinde, con adında bir Connection nesnesi oluşturulur.
    NewAccountsConnectionDB() adında bir static metot tanımlanır. Bu metot, bir Connection nesnesi döndürür.
    Metot içinde, SQLite JDBC sürücüsü yüklenir ve veritabanı dosyasının yolunu belirten bir dize oluşturulur.
    Bağlantı DriverManager.getConnection() yöntemi kullanılarak oluşturulur.
    Bağlantı başarılı olursa, "Connection Succeeded" mesajı yazdırılır ve bağlantı nesnesi döndürülür.
    Eğer bir hata oluşursa, hata mesajı yazdırılır ve null döndürülür.
Bu sınıf ve metot, diğer bileşenlerin kullanması gereken bir veritabanı bağlantısı sağlar. Bağlantı oluşturma kodunu merkezi bir konumda tutarak, kodun tekrarlanmasını önler ve bakımı kolaylaştırır.
 */
public class NewAccountsConnection {

    Connection con = null;

    public static Connection NewAccountsConnectionDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            String dbPath = "C://Users//Casper//OneDrive//Documents//NetBeansProjects//Project//Users.db"; // Veritabanı dosyanızın tam yolunu belirtin
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            System.out.println("Connection Succeeded");
            return con;
        } catch (Exception e) {
            System.out.println("Connection Failed" + e);
            return null;
        }

    }
}
