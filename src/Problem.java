
public class Problem {
    public static class Matematik{
        
        public static void daireAlan(int yariCap){
           
            System.out.println("Dairenin Alanı : " + (yariCap * yariCap * Math.PI));
        }
        
        public static void ucgenCevresi(int k1 , int k2 , int k3){
            
            System.out.println("Üçgenin Çevresi : " + (k1 + k2 + k3));
        }
    }
    
    public static class Fizik{
        
        public static void icCarpim(Vek vek1 , Vek vek2){
            
            int iccarpim = vek1.getI() * vek2.getI() +  vek1.getJ() * vek2.getJ() + vek1.getK() * vek2.getK();
            System.out.println(vek1.getIsim() + " il " + vek2.getIsim() + " in iç çarpımı : " + iccarpim);
        }
    }
}
