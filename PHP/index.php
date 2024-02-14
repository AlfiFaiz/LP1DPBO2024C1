
<?php
/*Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
soal Latihan 1 dalam mata kuliah Desain Pemograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

include 'DPR.php';

$anggotaDPR = array(
    new DPR(1, "ALFI", "SPS", "OLAHRAGA", "1.jpg"),
    new DPR(2, "Faiz", "mlm", "Seni", "2.jpg"),
    new DPR(3, "mandor", "pdm", "Pendidikan", "1.jpg"),
    new DPR(4, "Muhammad", "pdd", "Hukum", "2.jpg")
);

// Menampilkan Data dalam Tabel
echo "<table border='1'>";
echo "MENAMPILKAN DATA";
echo "<br>";
echo "<tr><th>ID</th><th>Nama</th><th>Bidang</th><th>Partai</th><th>Foto</th></tr>";
foreach ($anggotaDPR as $isi) {
    echo "<tr>";
    echo "<td>" . $isi->get_id() . "</td>";
    echo "<td>" . $isi->get_nama() . "</td>";
    echo "<td>" . $isi->get_bidang() . "</td>";
    echo "<td>" . $isi->get_partai() . "</td>";
    echo "<td><img src='" . $isi->get_foto() . "' width='50' height='50'></td>";
    echo "</tr>";
}
echo "</table>";

echo "<br>";

echo "MENAMBAHKAN DATA";
echo "<br>";
// Menambahkan Data
$TambahAnggota = new DPR(5, "yeyu", "pgh", "Teknologi", "1.jpg");
$anggotaDPR[] = $TambahAnggota;

// Menampilkan Data setelah Penambahan
echo "<table border='1'>";
echo "<tr><th>ID</th><th>Nama</th><th>Bidang</th><th>Partai</th><th>Foto</th></tr>";
foreach ($anggotaDPR as $isi) {
    echo "<tr>";
    echo "<td>" . $isi->get_id() . "</td>";
    echo "<td>" . $isi->get_nama() . "</td>";
    echo "<td>" . $isi->get_bidang() . "</td>";
    echo "<td>" . $isi->get_partai() . "</td>";
    echo "<td><img src='" . $isi->get_foto() . "' width='50' height='50'></td>";
    echo "</tr>";
}
echo "</table>";

// Mengubah Data
$idubah = 1;
foreach ($anggotaDPR as $tujuan => $isi) {
    if ($isi->get_id() == $idubah) {
        $isi->set_nama("Alfi");
        $isi->set_bidang("Olahraga");
        $isi->set_partai("sps");
        break;
    }
}
echo "<br>";
echo "MENGUBAH DATA";
echo "<br>";


// Menampilkan Data setelah Perubahan
echo "<table border='1'>";
echo "<tr><th>ID</th><th>Nama</th><th>Bidang</th><th>Partai</th><th>Foto</th></tr>";
foreach ($anggotaDPR as $isi) {
    echo "<tr>";
    echo "<td>" . $isi->get_id() . "</td>";
    echo "<td>" . $isi->get_nama() . "</td>";
    echo "<td>" . $isi->get_bidang() . "</td>";
    echo "<td>" . $isi->get_partai() . "</td>";
    echo "<td><img src='" . $isi->get_foto() . "' width='50' height='50'></td>";
    echo "</tr>";
}
echo "</table>";
echo "DATA DENGAN ID 1 TELAH DI UPDATE";

// Menghapus Data
$idhapus = 3;
foreach ($anggotaDPR as $tujuan => $isi) {
    if ($isi->get_id() == $idhapus) {
        unset($anggotaDPR[$tujuan]);
        break;
    }
}

echo "<br>";
echo "<br>";
echo "MENGHAPUS DATA";
echo "<br>";

// Menampilkan Data setelah Penghapusan
echo "<table border='1'>";
echo "<tr><th>ID</th><th>Nama</th><th>Bidang</th><th>Partai</th><th>Foto</th></tr>";
foreach ($anggotaDPR as $isi) {
    echo "<tr>";
    echo "<td>" . $isi->get_id() . "</td>";
    echo "<td>" . $isi->get_nama() . "</td>";
    echo "<td>" . $isi->get_bidang() . "</td>";
    echo "<td>" . $isi->get_partai() . "</td>";
    echo "<td><img src='" . $isi->get_foto() . "' width='50' height='50'></td>";
    echo "</tr>";
}
echo "</table>";

echo "<br>";

echo "Program selesai.";

?>
