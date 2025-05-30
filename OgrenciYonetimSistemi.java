import java.util.ArrayList;


public class OgrenciYonetimSistemi {
    private ArrayList<Ogrenci> ogrenci_listesi;
    
    public OgrenciYonetimSistemi(){
       ogrenci_listesi = new ArrayList<>();
    }
    
    
    public void ogrenciEkle(int ogr_no, String ogr_eposta, String ogr_isim){
       int index = this.ogrenciGirildiMi(ogr_no);
       if(index==-1){
           ogrenci_listesi.add(new Ogrenci(ogr_no,ogr_isim,ogr_eposta));
           System.out.println("ogrenci kaydi basarili");
       }
       else
            System.out.println("bu numarada ogrenci daha once girildi");
    }
    
    private int ogrenciGirildiMi(int ogr_no){
        int i=0;
        for( ;i<ogrenci_listesi.size();i++){
            if(ogr_no==ogrenci_listesi.get(i).getogrNo())
                return i;
        }    
        return -1;
    }
        
    
    public void ogrenciListele(){
        System.out.println("ogrenciler listeleniyor.");
        for(int i=0 ;i<ogrenci_listesi.size() ;i++){
            System.out.println( (i+1) + ".ogrencini no:" + ogrenci_listesi.get(i).getogrNo() + ", ogrenicnin ismi: "+ ogrenci_listesi.get(i).getogrIsim() + ", ogrencinin epostasi:" + ogrenci_listesi.get(i).getogrEposta());
        }
    }
    
    public void ogrenciGuncelle(int ogr_no, String ogr_isim, String ogr_eposta){
        int i;
        for( i=0; i<ogrenci_listesi.size(); i++){
            if(ogrenci_listesi.get(i).getogrNo()== ogr_no){
                ogrenci_listesi.get(i).setogrIsim(ogr_isim);
                ogrenci_listesi.get(i).setgrEposta(ogr_eposta);
                System.out.println("ogrenci guncelleme basarili.");
                break;
            }
            
        }
    }
    
    public void ogrenciSil(int ogr_no){
        int i=this.ogrenciGirildiMi(ogr_no);
        if(i!=-1){
            ogrenci_listesi.remove(ogrenci_listesi.get(i));
            System.out.println("ogrenci kaydi basariyla silindi");
        }
        else
            System.out.println("bu numara ile kayitli bir ogrenci bulunmamakta.");
    }

    
}    
