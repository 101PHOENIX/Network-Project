package project_1;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
/*
 * grafiksel kullanıcı arayüzünde renk değişikliklerini yöneten bir yardımcı sınıfı tanımlar.
    Source adında bir sınıf tanımlanır.
    changeColor() metodu, belirtilen JPanel bileşeninin arka plan rengini belirli bir renk (240, 240, 240) olarak değiştirir.
    normalColor() metodu, belirtilen JPanel bileşeninin arka plan rengini belirli bir normal renk (204, 204, 204) olarak değiştirir.
    serverChange() metodu, belirtilen JLabel bileşeninin metin rengini yeşil olarak değiştirir.
    serverNormal() metodu, belirtilen JLabel bileşeninin metin rengini siyah olarak değiştirir.
    NormalWhite() metodu, belirtilen JPanel bileşeninin arka plan rengini beyaz (255, 255, 255) olarak değiştirir.
Bu sınıf, grafiksel kullanıcı arayüzü üzerinde farklı renk durumlarını yönetmek için kullanılabilir. Örneğin, bir durumun başlangıcında veya bir olayın gerçekleştiğinde bileşenlerin rengini değiştirmek için kullanılabilir.
 */
public class Source {

    public void changeColor(JPanel panel1) {
        panel1.setBackground(new Color(240, 240, 240));

    }

    public void normalColor(JPanel panel1) {
        panel1.setBackground(new Color(204, 204, 204));

    }

    public void serverChange(JLabel label1) {
        label1.setForeground(Color.GREEN);
    }

    public void serverNormal(JLabel label1) {
        label1.setForeground(Color.BLACK);
    }

    public void NormalWhite(JPanel panel1) {
        panel1.setBackground(new Color(255, 255, 255));
    }

    
}
