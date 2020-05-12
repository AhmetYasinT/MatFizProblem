
import java.util.Scanner;


public class Main {
    
    //Basit matematik problemleri
    //Daire Alan - Matematik
    //Üçgen Çevresi - Matematik 
    //3 boyutlu vektörlerin iç çarpımı - Fizik
    
    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz..");
        String islemler = "1. Daire alanı hesaplama\n"
                        + "2. Üçgen çevresi hesaplama\n"
                        + "3. İki vektörün iç çarpımını hesaplama\n"
                        + "4. Çıkış için q'a basınız..";
        
        while(true){
            
            System.out.println(islemler);
            System.out.println("************************************");
            System.out.print("Yapmak istediğiniz işlemi seçiniz.. : ");
            String islem = sca.nextLine();
            
            if(islem.equals("q")){
                
                System.out.println("Programdan çıkılıyor...Hoşçakalın..");
                break;
            }
            else if(islem.equals("1")){
                
                System.out.println("\n");
                System.out.print("Dairenin yarı çap : ");
                int yaricap = sca.nextInt();
                sca.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            }
            else if (islem.equals("2")){
                
                System.out.println("\n");
                System.out.print("Kenar 1 : ");
                int k1 = sca.nextInt();
                System.out.print("Kenar 2 : ");
                int k2 = sca.nextInt();
                System.out.print("Kenar 3 : ");
                int k3 = sca.nextInt();
                sca.nextLine();
                
                Problem.Matematik.ucgenCevresi(k1, k2, k3);
            }
            else if(islem.equals("3")){
               
               System.out.println("\n");
               Vek vek1 = new Vek("Vektör1");
               Vek vek2 = new Vek("Vektör2");
               
               Problem.Fizik.icCarpim(vek1, vek2);
            }
            else{
                System.out.println("Geçersiz İşlem..");
            }
        }
    }
}
