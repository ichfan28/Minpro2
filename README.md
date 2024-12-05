# Posttes 2
1. Kelas Hewan (Superkelas)

   Kelas Hewan adalah kelas dasar yang mendefinisikan atribut umum dari hewan, yaitu:

    Nama (String)
    Jenis (String)
    Umur (int)

   Constructor Hewan digunakan untuk menginisialisasi objek hewan dengan nama, jenis, dan umur.

Getter dan Setter:

    Untuk mengakses dan mengubah nilai atribut nama, jenis, dan umur.

  Metode toString:

    Digunakan untuk mengembalikan representasi string dari objek Hewan, menampilkan semua atribut dalam format yang lebih mudah       dibaca.

2. Kelas Turunan Ayam, Kambing, Kuda, dan Sapi

  Setiap kelas (seperti Ayam, Kambing, Kuda, dan Sapi) adalah turunan dari kelas Hewan. Masing-masing kelas ini mewarisi atribut    dan metode dari kelas Hewan.

    Ayam dan Kambing hanya mewarisi konstruktor Hewan dan menambahkan fungsionalitas dasar.

    Kuda memiliki atribut tambahan berupa ras (String), yang disertakan dalam konstruktor dan metode toString. Saat melakukan   toString(), kelas Kuda akan menambahkan informasi tentang ras pada hasil output.

    Sapi juga hanya mewarisi atribut dari kelas Hewan tanpa tambahan atribut atau metode khusus.

3. Interface CRUD

Interface CRUD mendefinisikan operasi yang dapat dilakukan pada daftar hewan:

    Tambah Hewan (tambahHewan(Hewan hewan))
    Tampilkan Hewan (tampilkanHewan())
    Update Hewan (updateHewan(int index, Hewan hewan))
    Hapus Hewan (hapusHewan(int index))

Interface ini digunakan oleh kelas Peternakan untuk mengimplementasikan operasi CRUD pada koleksi hewan.
4. Kelas Peternakan

Kelas Peternakan mengimplementasikan interface CRUD, yang berarti harus menyediakan implementasi untuk semua metode yang ada di interface tersebut.

    Daftar Hewan (daftarHewan):
        Sebuah ArrayList untuk menyimpan objek Hewan yang ada di peternakan.

    Metode tambahHewan:
        Menambahkan objek Hewan baru ke dalam daftar hewan.

    Metode tampilkanHewan:
        Menampilkan semua hewan yang ada di dalam peternakan menggunakan metode toString yang sudah didefinisikan di kelas Hewan dan kelas turunannya.

    Metode updateHewan:
        Mengupdate data hewan yang ada pada index tertentu di dalam daftar.

    Metode hapusHewan:
        Menghapus hewan pada index tertentu dalam daftar.

5. Bagian Main di Kelas Peternakan

Di bagian main, sebuah objek Peternakan dibuat dan pengguna dapat memilih berbagai opsi yang tersedia di menu untuk melakukan operasi CRUD pada daftar hewan. Program menggunakan Scanner untuk mengambil input dari pengguna.

    Menu Program:
        Tambah Hewan: Pengguna diminta untuk memasukkan nama, jenis, dan umur hewan yang ingin ditambahkan.
        Tampilkan Hewan: Program akan menampilkan semua hewan yang sudah ada di daftar peternakan.
        Update Hewan: Pengguna diminta untuk memasukkan index hewan yang ingin diupdate, serta data baru untuk hewan tersebut.
        Hapus Hewan: Pengguna diminta untuk memasukkan index hewan yang ingin dihapus.
        Keluar: Program akan berhenti dan keluar.

Alur Program

    Program dimulai dengan menampilkan menu utama, yang memberi pengguna pilihan untuk menambah, menampilkan, memperbarui, menghapus, atau keluar dari aplikasi.
    Berdasarkan pilihan pengguna, program akan meminta data yang diperlukan (misalnya nama, jenis, umur hewan), dan kemudian melakukan operasi sesuai pilihan.
    Setiap kali pengguna memilih untuk menambahkan hewan, data akan dimasukkan ke dalam daftar hewan peternakan dan diupdate.
    Setelah melakukan operasi, program akan kembali menampilkan menu untuk pilihan lainnya hingga pengguna memilih untuk keluar.
