package com.example.jsoncrud;

public class Konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="https://mobile6.000webhostapp.com/servicephp/tambahPgw.php";
    public static final String URL_GET_ALL = "https://mobile6.000webhostapp.com/servicephp/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "https://mobile6.000webhostapp.com/servicephp/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "https://mobile6.000webhostapp.com/servicephp/updatePgw.php";
    public static final String URL_DELETE_EMP = "https://mobile6.000webhostapp.com/servicephp/hapusPgw.php?id=";


    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Script PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan";
    public static final String KEY_MHS_EMAIL = "email";

    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";

    //ID Mahasiswa
    //mhs itu singkatan dari Mahasiswa
    public static final String MHS_ID = "mhs_id";

}