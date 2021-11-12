import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String userName,pw,secim;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kullanıcı adınıız giriniz:");
        userName=scan.nextLine();
        System.out.print("Şifrenizi giriniz:");
        pw=scan.nextLine();


        if(userName.equals("patika")&&pw.equals("java101")){
            System.out.println("Kullanıcı adınız ve şifreniz doğru.\nGiriş Yapıldı!");
        }
        else{
            System.out.println("Girilen bilgiler hatalı. \n Şifrenizi Sıfırlamak istermisiniz?(e/h)");
            secim=scan.nextLine();
            switch (secim) {
                case "e":
                    System.out.print("şifreinizi sırıklamak istiyorsunuz. Lütfen yeni şifrenizi girin:");
                    pw=scan.nextLine();
                    if(pw.equals("java101")){
                        System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz!!!");
                    }
                    else{
                        System.out.println("Şifreniz başarılı bir şekilde oluşturuldu.");
                    }
                    break;
                case "h":
                    System.out.println("Girilen bilgiler yanlış ve yeni şifre oluşturmak istemediğiniz için porgramdan çıkılıyor.");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.");
                    break;
            }

        }
        scan.close();




    }
}
