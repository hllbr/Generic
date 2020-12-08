
import java.util.ArrayList;


public class Main {
    /*
    Generic classlar veya generic Metodlar bizim türden bağımsız işlem yaptığımız metodlar veya classlardır.
    Biz herhangi bir türe bağlı kalmadan bir metodu veya bir classı yazabiliriz
    
    */
    public static void main(String[] args) {
        toplama(3, 4, 5);
        ArrayList<String> arrayList = new ArrayList<String>();//String veri tipine bağımlıyız
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();//integer veri tipine bağımlıyız
        Character[] char_dizi = {'j','a','v','a'}; 
        Integer[] int_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"@prince","hllbr","@hllbr","h2lbr","hdoublelbr"};
        Ogrenci [] ogrenci_dizi = {new Ogrenci("halil"),new Ogrenci("ibrahim"),new Ogrenci("koçak"),new Ogrenci("halibrahim")};
        
        
        ChatYazdır.yazdır(char_dizi);
        System.out.println("***************************************************");
        IntegerYazdır.yazdır(int_dizi);
        System.out.println("***************************************************");
        StringYazdır.yazdır(string_dizi);
        System.out.println("***************************************************");
        OgrenciYazdır.yazdır(ogrenci_dizi);
        /*
        
        generic sınıf bu kadar çok yazdırma class yazma ihtiyacından tasarruf sağlıyor türden bağımsız bir şekilde tek bir yazdır metodu ile işlemlerimizi halletmemiz için bize zaman ve enerjiden tasarruf sağlıyor
        
        */
        System.out.println("Generic yazdır metodu devrededir \n bu satırın altındaki satırlar tek bir metod yazılarak çalıştırılıyor.");
        YazdırmaSınıfı<Character> yazdır_char = new YazdırmaSınıfı<Character>();
        YazdırmaSınıfı<String> yazdır_string = new YazdırmaSınıfı<String>();
        YazdırmaSınıfı<Integer> yazdır_integer = new YazdırmaSınıfı<Integer>();
        YazdırmaSınıfı<Ogrenci> yazdır_ogrenci = new YazdırmaSınıfı<Ogrenci>();
        System.out.println("*************************************************");
        System.out.println("-------------------------------------------------");
        yazdır_char.Yazdır(char_dizi);
        System.out.println("*************************************************");
        System.out.println("-------------------------------------------------");
        yazdır_string.Yazdır(string_dizi);
        System.out.println("*************************************************");
        System.out.println("-------------------------------------------------");
        yazdır_integer.Yazdır(int_dizi);
        System.out.println("*************************************************");
        System.out.println("-------------------------------------------------");
        yazdır_ogrenci.Yazdır(ogrenci_dizi);
        
    }
      public static void toplama(int a,int b,int c){//integer türüne bağlı olarak yazılmış bir metod
        System.out.println(a+b+c);
    }
}
