
#include <bits/stdc++.h>
#include "DPR.cpp"

using namespace std;

int main(){
    
    int i,n, menu= 0;
    string nama;
    string partai;
    string bidang;
    int id;
    int idhapus;
    vector<DPR> anggota;

    while (menu != 999)
    {
        cout << '\n' <<"DAFTAR MENU " << '\n' ;
        cout << "1. Menampilkan data " << '\n' ;
        cout << "2. Menambahkan data " << '\n' ;
        cout << "3. Mengubah data " << '\n' ;
        cout << "4. Menghapus data " << '\n' ;
        cout << "999. selesai " << '\n' ;

        cout << '\n' <<"Silakan pilih MENU " << '\n' << '-' ;
        cin >> menu;
            cout << '\n';


        if(menu == 1){
            if (n == 0)
            {
                cout << "Tidak Ada Daftar anggota DPR: \n\n";
            }
            else
            {
                cout << "Daftar anggota DPR: \n";
                for(i = 0; i < n; i++){
                    cout << i+1 << "." << '\n';
                    cout << "ID     : " << anggota[i].get_id() << '\n';
                    cout << "Nama   : " << anggota[i].get_nama() << '\n';
                    cout << "Bidang : " << anggota[i].get_bidang() << '\n';
                    cout << "Partai : " << anggota[i].get_partai() << "\n\n";
                }
            }
            

        } else if(menu == 2){
            cout << "Masukkan Data:" << '\n';
            cout << "id: ";
            cin >> id;
            cout << "nama: ";
            cin >> nama;
            cout << "bidang: ";
            cin >> bidang;
            cout << "partai: ";
            cin >> partai;
            cout << '\n';

            n++;
            anggota.push_back(DPR(id, nama, bidang, partai));
            cout << "Data berhasil ditambahkan" << "\n\n";

        } else if(menu == 3){
            if (n == 0)
            {
                cout << "Tidak Ada Daftar anggota DPR: \n\n";
            }
            else
            {
                int ada = 0;
                cout << "Masukkan id: ";
                cin >> id;
                for(i = 0; i < n; i++){
                    if(anggota[i].get_id() == id){
                        ada = 1;
                    }
                }
                if (ada == 1)
                {
                    
                    cout << "Masukkan nama baru: ";
                    cin >> nama;
                    cout << "Masukkan bidang baru: ";
                    cin >> bidang;
                    cout << "Masukkan partai baru: ";
                    cin >> partai;
                    cout << '\n';

                    for(i = 0; i < n; i++){
                        if(anggota[i].get_id() == id){
                            anggota[i].set_nama(nama);
                            anggota[i].set_bidang(bidang);
                            anggota[i].set_partai(partai);
                        }
                    }
                    
                    cout << "Data berhasil diubah" << "\n\n\n";
                }
                else{
                            cout << "Tidak Ada Daftar anggota DPR dengan id " <<id <<"\n\n"; 
                }
            }
        }
        else if (menu == 4)
        {
            int ada = 0;
            if (n == 0)
            {
                cout << "Tidak Ada Daftar anggota DPR: \n\n";
            }
            else
            {
                cout << "Masukkan id yang akan dihapus: ";
                    cin >> id;
                    for(i = 0; i < n; i++){
                        if(anggota[i].get_id() == id){
                            ada = 1;
                        }
                    }

                    if (ada == 1)
                    {
                        
                    for(i = 0; i < n; i++){
                        if(anggota[i].get_id() == id){
                            anggota.erase(anggota.begin() + i);
                            n--;
                        }
                    }
                    cout << "Data dengan id " << id << " berhasil dihapus" << "\n\n";
                    }
                    else
                    {
                        cout << "Tidak Ada Daftar anggota DPR dengan id " <<id <<"\n\n"; 
                    }
            }
        }
        else if ( menu != 999 && menu != 1 && menu != 2 && menu != 3 && menu != 4)
        {
            cout << "Tidak Ada menu nomor " << menu <<"\n\n"; 
        }
        
    }
    cout <<'\n'<< "progarm selesai " << menu <<'\n'; 


    return 0;
}