package com.example.roomsiswa.navigasi

interface DestinasiNavigasi {
    //Nama unique untuk jalur composable
    val route: String
    //String resource id yang berisi judul yang ditampilkan di layar halaman
    val titleRes: Int
}