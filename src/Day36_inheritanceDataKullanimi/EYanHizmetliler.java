package Day36_inheritanceDataKullanimi;

public class EYanHizmetliler extends BMuhasebe{

    int saatUcret=19;
    int gunlukMesai=8;

    protected void maas(){

        System.out.println("Yan Hizmetliler"+(30*saatUcret*gunlukMesai)+"maas alir");
    }

    protected void issizliksigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli özel sigorta yaptırabilir");


    }

    public static void main(String[] args) {

    }
}
