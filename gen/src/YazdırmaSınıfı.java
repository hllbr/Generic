
public class YazdırmaSınıfı<E> {//biz burada classa ben sana fazklı türlerden veri tipleri gönderiyorum bunları yazdır demiş oluyoruz(Bu işlemler için ön tanımlama)
    public void Yazdır(E[] dizi){
        for(E e:dizi){
            System.out.println(e);
        }
    }
    
}
