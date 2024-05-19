package project_1;

/*
 *  tek bir kullanıcıya ait mevcut kullanıcı bilgisini yönetmek için bir Singleton tasarım deseni uyguluyor.
    CurrentUser adında bir sınıf tanımlanıyor.
    Sınıfın içinde, private static CurrentUser instance ve private String username olmak üzere iki özellik tanımlanıyor.
    Sınıfın kurucu metodunda herhangi bir işlev belirtilmemiş, yani varsayılan (boş) bir kurucu metod kullanılıyor.
    getInstance() adında bir metod tanımlanıyor. Bu metod, sınıfın tek bir örneğini almak için kullanılır. Eğer örnek henüz oluşturulmamışsa, yeni bir örnek oluşturulur ve bu örneğin referansı döndürülür. Eğer örnek zaten varsa, mevcut örneğin referansı döndürülür.
    getUsername() ve setUsername(String username) metodları tanımlanıyor. Bu metodlar, mevcut kullanıcı adını almak ve değiştirmek için kullanılır. Bu sayede sınıf, uygulamanın herhangi bir yerinden mevcut kullanıcı adına erişim sağlar.
 */
public class CurrentUser {
    private static CurrentUser instance;
    private String username;

    private CurrentUser() {}

    public static CurrentUser getInstance() {
        if (instance == null) {
            instance = new CurrentUser();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
