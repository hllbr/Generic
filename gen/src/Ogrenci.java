/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 90552
 */
public class Ogrenci {
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrenci(String isim) {
        this.isim = isim;
    }
    /*
    biz inheritance projelerimizden her classın default olarak yani varsayılan olarak object classından türediğini biliyoruz.
    object classın içinde bir çok metodu bulunuyor.
    biz bu metodları override edersek değişik işlemler gerçekleştirebiliyoruz
    
    */

    @Override
    public String toString() {
        /*
        bn yapıdaki objeyi sout ile direkt olarak bastırabileceğiz
        */
        return "isim :"+isim ;
    }
}
