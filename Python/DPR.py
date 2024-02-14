class DPR:
    def __init__(self, id, nama, bidang, partai):
        self.id = id
        self.nama = nama
        self.partai = partai
        self.bidang = bidang

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_nama(self):
        return self.nama

    def set_nama(self, nama):
        self.nama = nama

    def get_partai(self):
        return self.partai

    def set_partai(self, partai):
        self.partai = partai

    def get_bidang(self):
        return self.bidang

    def set_bidang(self, bidang):
        self.bidang = bidang


anggota = []

while True:
    print('\nDAFTAR MENU')
    print('1. Menampilkan data')
    print('2. Menambahkan data')
    print('3. Mengubah data')
    print('4. Menghapus data')
    print('999. Selesai')

    menu = int(input('\nSilakan pilih MENU -> '))

    if menu == 1:
        if not anggota:
            print('Tidak Ada Daftar anggota DPR\n')
        else:
            print('Daftar anggota DPR:')
            for i, data in enumerate(anggota, start=1):
                print("+----+---------------------+---------------------+---------------------+");
                print("| ID | Nama                | Bidang              | Partai              |");
                print("+----+---------------------+---------------------+---------------------+");
        
                print(f"{data.get_id()} {data.get_nama()} {data.get_bidang()} {data.get_partai()}\n")


    elif menu == 2:
        id = int(input('Masukkan id: '))
        nama = input('Masukkan nama: ')
        bidang = input('Masukkan bidang: ')
        partai = input('Masukkan partai: ')

        anggota.append(DPR(id, nama, bidang, partai))
        print('Data berhasil ditambahkan\n')

    elif menu == 3:
        if not anggota:
            print('Tidak Ada Daftar anggota DPR\n')
        else:
            id = int(input('Masukkan id: '))
            ada = False

            for data in anggota:
                if data.get_id() == id:
                    ada = True
                    break

            if ada:
                nama = input('Masukkan nama baru: ')
                bidang = input('Masukkan bidang baru: ')
                partai = input('Masukkan partai baru: ')

                for data in anggota:
                    if data.get_id() == id:
                        data.set_nama(nama)
                        data.set_bidang(bidang)
                        data.set_partai(partai)

                print('Data berhasil diubah\n')
            else:
                print(f'Tidak Ada Daftar anggota DPR dengan id {id}\n')

    elif menu == 4:
        if not anggota:
            print('Tidak Ada Daftar anggota DPR\n')
        else:
            id = int(input('Masukkan id yang akan dihapus: '))
            ada = False

            for i, data in enumerate(anggota):
                if data.get_id() == id:
                    ada = True
                    anggota.pop(i)
                    print(f'Data dengan id {id} berhasil dihapus\n')
                    break

            if not ada:
                print(f'Tidak Ada Daftar anggota DPR dengan id {id}\n')

    elif menu == 999:
        break

    else:
        print(f'Tidak Ada menu nomor {menu}\n')

print('\nProgram selesai')
