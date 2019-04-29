package com.example.mert.stoktakip.models;

public class UrunSatis {
    private int id;
    private String barkodNo;
    private String kadi;
    private int adet;
    private float satisFiyati;
    private String satisTarihi;
    private String aciklama;

    public UrunSatis() {}

    public UrunSatis(String barkodNo, String kadi, int adet, float satisFiyati, String satisTarihi, String aciklama) {
        this.barkodNo = barkodNo;
        this.kadi = kadi;
        this.adet = adet;
        this.satisFiyati = satisFiyati;
        this.satisTarihi = satisTarihi;
        this.aciklama = aciklama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKadi() {
        return kadi;
    }

    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

    public String getBarkodNo() {
        return barkodNo;
    }

    public void setBarkodNo(String barkodNo) {
        this.barkodNo = barkodNo;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public float getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(float satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public String getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(String satisTarihi) {
        this.satisTarihi = satisTarihi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
