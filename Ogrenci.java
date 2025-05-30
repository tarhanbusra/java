/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TARHAN
 */
class Ogrenci {
       
    private int ogr_no;
    private String ogr_isim;
    private String ogr_eposta;
    
    Ogrenci(int ogr_no, String ogr_isim, String ogr_eposta){
        this.ogr_no = ogr_no;
        this.ogr_eposta = ogr_eposta;
        this.ogr_isim= ogr_isim;
    }
    
    public int getogrNo(){
        return ogr_no;
    }
    public String getogrIsim(){
        return ogr_isim;
    }
    public String getogrEposta(){
        return ogr_eposta;
    }
    
    public void setogrNo(int yeni_no){
        ogr_no = yeni_no;
    }
    public void setogrIsim(String yeni_isim){
        ogr_isim = yeni_isim;
    }
    public void setgrEposta(String yeni_eposta){
        ogr_eposta = yeni_eposta;
    }
    
    
}
