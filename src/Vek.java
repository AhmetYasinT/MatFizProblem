
import java.util.Scanner;


public class Vek {
    private String isim;
    private int i;
    private int j;
    private int k;
    
    public Vek(String isim){
        this.isim=isim;
        
        Scanner sca = new Scanner(System.in);
        System.out.println(isim + " in i , j ve k değerlerini girin..");
        System.out.print("i : ");
        this.i = sca.nextInt();
        System.out.print("k : ");
        this.k=sca.nextInt();
        System.out.print("j : ");
        this.j=sca.nextInt();
        
     
    }    
    
    public String getIsim(){
        return isim;
    }
    
    public void setIsim(String isim){
        this.isim=isim;
    }
    
    public int getI(){
        return i;
    }
    
    public void setI(int i){
        this.i=i;
    }
    
    public int getJ(){
        return j;
    }
    
    public void setJ(int j){
        this.j=j;
    }
    
    public int getK(){
        return j;
    }
        
    public void setK(int k){
        this.k=k;
    }
}
