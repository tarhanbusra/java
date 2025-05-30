import java.util.Scanner;

public class TestOgrenciYonetimSistemi001 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("ogrenci yonetim sisytemine hosgeldinizz.");
        OgrenciYonetimSistemi OYS = new OgrenciYonetimSistemi();
       
        
        int secenek;
        do{
            secenek= menu();
            switch(secenek){
                case 1:
                    yeniKayit(OYS);
                    break;
                case 2:
                    kayitGuncelle(OYS);
                    break;
                case 3:
                    kayitSil(OYS);
                    break;
                case 4:
                    kayitGoster(OYS);
                    break; 
                case 5:
                    System.exit(0);
            }
        }while(secenek!=5);
    }
    
        public static int menu(){
            Scanner input = new Scanner(System.in);
            
            System.out.println("1-Yeni Ogrenci Kayit");
            System.out.println("2-Ogrenci Kayit Guncelle");
            System.out.println("3-Ogrenci Kayit Sil");
            System.out.println("4-Tum Ogrenci Kayitlarini Goster");
            System.out.println("5-Programi Sonlandir");
            System.out.print("\nBir secenek seciniz: ");
            int secenek = input.nextInt();
        
            return secenek;  
        }
        
        public static void yeniKayit(OgrenciYonetimSistemi OYS){
            Scanner input= new Scanner(System.in);
            int ogrenci_no;
            String ogrenci_isim, ogrenci_eposta;
            
            System.out.println("ogrencinin numarasini giriniz:");
            ogrenci_no=input.nextInt();
            input.nextLine();
            System.out.println("ogrencinin ismini giriniz:");
            ogrenci_isim=input.nextLine();
            System.out.println("ogrencinin epostasini giriniz:");
            ogrenci_eposta=input.nextLine();
            OYS.ogrenciEkle(ogrenci_no, ogrenci_eposta, ogrenci_isim);
            
        }
        
        public static void kayitGuncelle(OgrenciYonetimSistemi OYS){
            Scanner input = new Scanner(System.in);
          
            int ogrenci_no;
            String ogrenci_isim,ogrenci_eposta;
          
            System.out.println("guncellenecek ogrenci nosu");
            ogrenci_no=input.nextInt();
            input.nextLine();
            System.out.println("ogrenci ismi");
            ogrenci_isim=input.nextLine();
            System.out.println("ogrenci eposta");
            ogrenci_eposta=input.nextLine();
            
            OYS.ogrenciGuncelle(ogrenci_no, ogrenci_isim, ogrenci_eposta);
            System.out.println(" ");
        }
        
        public static void kayitSil(OgrenciYonetimSistemi OYS){
        
            Scanner input= new Scanner(System.in);
            
            int ogrenci_no;
            System.out.println("kaydini silmek istediginiz ogrencinin nosunu giriniz");
            ogrenci_no=input.nextInt();
            OYS.ogrenciSil(ogrenci_no);
            System.out.println();
        }
        
        public static void kayitGoster(OgrenciYonetimSistemi OYS){
            OYS.ogrenciListele();
            System.out.println();
        }
        
        
    }
    

