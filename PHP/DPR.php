<?php
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 1 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

class DPR
{
    private $nama;
    private $partai;
    private $bidang;
    private $id;
    private $foto; // tambahan properti foto

    public function __construct($id, $nama, $partai, $bidang, $foto)
    {
        $this->nama = $nama;
        $this->partai = $partai;
        $this->bidang = $bidang;
        $this->id = $id;
        $this->foto = $foto;
    }

    public function get_nama()
    {
        return $this->nama;
    }

    public function set_nama($nama)
    {
        $this->nama = $nama;
    }

    public function get_partai()
    {
        return $this->partai;
    }

    public function set_partai($partai)
    {
        $this->partai = $partai;
    }

    public function get_bidang()
    {
        return $this->bidang;
    }

    public function set_bidang($bidang)
    {
        $this->bidang = $bidang;
    }

    public function get_id()
    {
        return $this->id;
    }

    public function set_id($id)
    {
        $this->id = $id;
    }

    public function get_foto()
    {
        return $this->foto;
    }

    public function set_foto($foto)
    {
        $this->foto = $foto;
    }

    public function __destruct()
    {
    }
}
?>
