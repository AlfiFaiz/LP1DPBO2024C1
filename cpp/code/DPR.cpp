/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 1 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

// import library
#include <iostream>
#include <vector>
#include <string>

//using standard namaspace
using namespace std;

class DPR
{
  private:
    string nama;
    string partai;
    string bidang;
    int id;

  public:
    DPR()
    {
      this->nama = "";
      this->partai = "";
      this->bidang = "";
      this->id = '-';
    }

    DPR(int id, string nama, string partai, string bidang)
    {
      this->nama = nama;
      this->partai = partai;
      this->bidang = bidang;
      this->id = id;
    }


    string get_nama()
    {
      return this->nama;
    }

    void set_nama(string nama)
    {
      this->nama = nama;
    }

    string get_partai()
    {
      return this->partai;
    }

    void set_partai(string partai)
    {
      this->partai = partai;
    }

    string get_bidang()
    {
      return this->bidang;
    }

    void set_bidang(string bidang)
    {
      this->bidang = bidang;
    }

    int_least64_t get_id()
    {
      return this->id;
    }

    void set_id(int id)
    {
      this->id = id;
    }
    
    ~DPR()
    {

    }
};
