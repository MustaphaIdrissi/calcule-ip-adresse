package com.iptv.calculip;

import java.nio.charset.StandardCharsets;

public class Adressip {


    public String maskk(String bip,int nb){
        String mt="255.",ipp=bip.substring(0,nb),host1,host2,host3,host4,mskip="255.0.0.0";
        int max=32,nl;
        nl=ipp.length();
        String sty=changehos(bip,nb);

            if(nb>24 && nb<=32) {
                host1 = sty.substring(0, 8);
                host2 = sty.substring(8, 16);
                host3 = sty.substring(16, 24);
                host4 = sty.substring(24, 32);

                int stringt1 =Integer.parseInt(host1);


                mskip=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
            }else if(nb>16 && nb<=24){
                host1 = sty.substring(0, 8);
                host2 = sty.substring(8, 16);
                host3 = sty.substring(16, 24);
                host4 = sty.substring(24, 32);
                mskip=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
            }else if(nb>=8 && nb<=16){
                host1 = sty.substring(0, 8);
                host2 = sty.substring(8, 16);
                host3 = sty.substring(16, 24);
                host4 = sty.substring(24, 32);
                mskip=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
            }
            else if(nb>=1 && nb<=8){
                host1 = sty.substring(0, 8);
                host2 = sty.substring(8, 16);
                host3 = sty.substring(16, 24);
                host4 = sty.substring(24, 32);
                mskip=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
            }

        return mskip;

    }


public String changehos(String dex,int nb){
    String hoip="1",netip="0";

    for(int i=1;i<nb;i++){
        hoip="1"+hoip;
    }
    for(int i=nb;i<=32;i++){
        netip="0"+netip;
    }
    String str=hoip+""+netip;
    return str;
}
    public String Nbpc(int nb){
        int max=32,shot,re;
        shot=max-nb;
        re= (int) (Math.pow(2,shot)-2);
        return Integer.toString(re);
    }

    public String BRODCST(String dex,int nbres){
        String str="",host1,host2,host3,host4,sth="";
        String sty=dex.substring(0, nbres);

        for (int i=nbres;i<=32;i++) {
            sth="1"+sth;
        }
        sty=sty+""+sth;
        if(nbres>24 && nbres<=32) {
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 32);

            int stringt1 =Integer.parseInt(host1);


            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }else if(nbres>16 && nbres<=24){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 32);
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }else if(nbres>=8 && nbres<=16){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 32);
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }
        else if(nbres>=1 && nbres<=8){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 32);
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }


        return str;
    }

    public String Premierip(String dex,int nbres){
        String str="",host1,host2,host3,host4,sth="";
        String sty=dex.substring(0, nbres);

for (int i=nbres;i<=32;i++) {
    sth="0"+sth;
}

        sty=sty+""+sth;
        if(nbres>24 && nbres<=32) {
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"1";

            int stringt1 =Integer.parseInt(host1);


            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }else if(nbres>16 && nbres<=24){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"1";
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }else if(nbres>=8 && nbres<=16){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"1";
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }
        else if(nbres>=1 && nbres<=8){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"1";
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }


        return str;
    }

    public String lastip(String dex,int nbres){
        String str="",host1,host2,host3,host4,sth="";
        String sty=dex.substring(0, nbres);

        for (int i=nbres;i<=32;i++) {
            sth="1"+sth;
        }
        sty=sty+""+sth;
        if(nbres>24 && nbres<=32) {
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"0";

            int stringt1 =Integer.parseInt(host1);


            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }else if(nbres>16 && nbres<=24){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"0";
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }else if(nbres>=8 && nbres<=16){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"0";
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }
        else if(nbres>=1 && nbres<=8){
            host1 = sty.substring(0, 8);
            host2 = sty.substring(8, 16);
            host3 = sty.substring(16, 24);
            host4 = sty.substring(24, 31)+"0";
            str=Integer.parseInt(host1,2)+"."+Integer.parseInt(host2,2)+"."+Integer.parseInt(host3,2)+"."+Integer.parseInt(host4,2);
        }


        return str;
    }



}
