> #### Muhammad Daffa Grahito Triharsanto - 2206820075 - Pemrograman Lanjut B

## Module 5 - Pemrograman Lanjut 2023/2024 Genap

**Screenshots of the performance testing table results with JMeter:**

### `/all-student`:
![all-student-request in Table screenshot](https://cdn.discordapp.com/attachments/1201794782402187324/1216054175834701906/image.png?ex=65fefdb4&is=65ec88b4&hm=ffdac37b7b1ff0a681c7775c89edc8449ac8ef76655436cdb185f144c2d5ed43&)

### `/all-student-name`:
![all-student-name-request in Table screenshot](https://cdn.discordapp.com/attachments/1201794782402187324/1216055409756995694/image.png?ex=65fefeda&is=65ec89da&hm=d0790c10ffe87e269bfa8280c935db603ae4b4af2b0eef5618dbeceacbd043dc&)

### `/highest-gpa`:
![all-student-name-request in Table screenshot](https://cdn.discordapp.com/attachments/1201794782402187324/1216056073132445707/image.png?ex=65feff79&is=65ec8a79&hm=e087075db889edfa69a34c1a28fb0b35249f503b314c530625f4a9f3fa16a923&)

**Screenshots of the performance testing table results with Command Line:**

### `/all-student`:
![all-student-request in CLI screenshot](https://cdn.discordapp.com/attachments/1201794782402187324/1216059478319960124/image.png?ex=65ff02a4&is=65ec8da4&hm=9668e61f322b380e0d7912ff146fd874c1b1a37700f83f55a0d62d77eee3e7ac&)

### `/all-student-name`:
![all-student-name-request in CLI screenshot](https://cdn.discordapp.com/attachments/1201794782402187324/1216059526252462222/image.png?ex=65ff02b0&is=65ec8db0&hm=e0274ed07e5632df3fe6000052859546a2f0def1b02d494f7aeb5887e3ce41c3&)

### `/highest-gpa`:
![all-student-name-request in CLI screenshot](https://cdn.discordapp.com/attachments/1201794782402187324/1216059575023964231/image.png?ex=65ff02bb&is=65ec8dbb&hm=4773a70900ca1fc1e79d2d4c0767bb15f0cb96c30e7020b7a3e9b43456ac9ea1&)

## Reflection ✏️

![Reflections Module 5](https://cdn.discordapp.com/attachments/1201794782402187324/1216081219675099309/image.png?ex=65ff16e4&is=65eca1e4&hm=782e0dfbe18bf77df00c03e226d8d25bc1ef536a1f728b4398672b9c968f7089&)

1. Perbedaan dari *approach* performance testing menggunakan JMeter dan *profiling* dengan InteliJ Profiler adalah kalau JMeter digunakan untuk melakukan pengujian beban (*load testing*) dan pengujian stres (*stress testing*) pada web app, server FTP, dan server database, sedangkan IntelliJ Profiler digunakan untuk menganalisis performa aplikasi Java selama runtime yang melibatkan perilaku *runtime application*, penggunaan memori, penggunaan CPU, dan lain sebagainya. Profiler memberikan gambaran keseluruhan tentang eksekusi program secara besar-besaran tanpa mengganggu program yang sedang berjalan. Keduanya sama-sama bisa memberikan gambaran bagaimana performa dari code/project kita dan membentuk pendekatan komprehensif untuk mengoptimalkan kinerja aplikasi.

2. Proses *profiling* membantu dalam mengidentifikasi dan memahami titik-titik lemah dalam aplikasi melalui beberapa cara:
   
   1)  **Analisis Detail Kinerja Kode**, *profiling* memberikan wawasan mendalam tentang bagaimana setiap bagian dari kode berperilaku selama runtime. *Profiling* memungkinkan kita melihat bagaimana aplikasi mengelola memori sehingga kita bisa mengidentifikasi alokasi memori yang berlebihan. Kita juga dapat mengamati penggunaan CPU, kecepatan eksekusi, dan sumber daya lainnya agar membantu menemukan *bottleneck* (titik lemah)  dalam logika aplikasi. 
   2) **Optimasi**: Dengan mengetahui titik lemah logika aplikasi, kita dapat mengoptimalkan kode atau mengubah algoritma untuk meningkatkan kinerjanya. Misalnya, jika ada function yang memakan waktu lama, kita harus mengubahnya dengan cara yang lebih efisien.

3. Ya, Profiler IntelliJ sangat efektif dalam membantu menganalisis dan mengidentifikasi *bottleneck* dalam *code application*. Profiler terintegrasi langsung dengan IntelliJ IDEA, sehingga memudahkan kita untuk memantau statistik kinerja secara langsung selama aplikasi berjalan. Kita dapat melihat penggunaan CPU, memori, dan informasi lainnya. Dengan proaktif mengidentifikasi dan menyelesaikan masalah *bottleneck*, kita dapat secara signifikan meningkatkan pengalaman pengguna, memastikan skalabilitas aplikasi, dan menjaga efisiensi operasional, sehingga menjamin keberhasilan dan kelangsungan aplikasi.
   
4. Mungkin beberapa tantangan utama dari melakukan *performance testing* dan *profiling*nya adalah menentukan suatu method atau bagian yang tidak efisien. Apabila suatu method di define sangat simple namun tidak efisien sebenarnya mudah untuk di benarkan, tetapi apabila kita mendefinisikan suatu method yang rumit akan cukup sulit untuk mencari bagian yang membuatnya tidak efisien dan membenarkannya. Lalu meningkatkan performanya juga merupakan tantangan utama, karena kita harus memastikan bahwa peningkatan performa tidak mengganggu fungsi dan fungsionalitas lain dari sistem dan mengubah bagaimana algoritma yang paling efisien untuk aplikasi kita. Selain itu, kita juga harus memastikan bahwa peningkatan performa yang kita lakukan tidak menghasilkan efek samping yang tidak diinginkan, seperti peningkatan penggunaan memori atau penurunan stabilitas sistem.

5. *Profiling* dengan InteliJ Profiler membantu mengidentifikasi *bug*, *bottleneck*, dan masalah kinerja. Dengan InteliJ Profiler kita dapat melihat method yang mengkonsumsi *resource* paling banyak dengan *flame graph* sehingga didapat area kode yang memerlukan perbaikan agar bisa mengoptimalkan kinerja aplikasi. Dengan diberikannya kinerja aplikasi, termasuk penggunaan memori, penggunaan CPU, waktu eksekusi metode, dan pemanggilan stack, kita dapat lebih mudah memahami secara rinci bagaimana aplikasi berperilaku selama runtime. Kita juga dapat melakukan pengujian kinerja yang lebih akurat dan komprehensif dengan mengukur dan membandingkan kinerja aplikasi dalam berbagai kondisi beban dan mendapatkan wawasan yang lebih baik tentang bagaimana aplikasi akan berperilaku saat proses optimasi.

6. Sebenarnya sejauh ini saya belum pernah menemukan situasi dimana hasil dari *profiling* berbeda jauh dengan performance testing menggunakan JMeter, namun apabila memang hal tersebut mungkin terjadi mungkin pertama perlu dipastikan bahwa kedua alat tersebut dikonfigurasi dengan benar dan konsisten. Perbedaan mungkin disebabkan oleh ketidakakuratan skenario pengujian, kesalahan dalam pemrofilan, atau perbedaan dalam interpretasi data sehingga hasil yang didapat juga bisa berbeda. Jika diperlukan, harus diulang pengujiannya dengan penyesuaian skenario dan konfigurasi yang tepat untuk mendapatkan hasil yang lebih konsisten antara JMeter dan IntelliJ Profiler. 

7. Setelah menganalisis hasil dari pengujian kinerja dan profilisasi, ada beberapa strategi yang dapat diimplementasikan untuk mengoptimalkan kode aplikasi:
    - Lakukan *profiling* untuk mengidentifikasi bagian kode yang memakan waktu dan sumber daya terbanyak, lalu gunakan *benchmarking* untuk membandingkan performa berbagai pendekatan atau implementasi.
    - Analisis algoritma dan struktur data yang tepat dan paling efisien untuk menemukan peluang perbaikan.
    - Kurangi pembuatan objek yang tidak perlu, gunakan kembali objek bila memungkinkan, dan bebaskan memori dengan cepat. Kelola struktur data untuk meminimalkan *memory fragmentation* dan meningkatkan *cache locality*.
    - Identifikasi bagian kode yang dapat dieksekusi secara bersamaan dan gunakan threading atau *multiprocessing* untuk *parallel computating*.
  
    Lalu untuk memastikan perubahan yang kita lakukan tidak mengubah fungsionalitas aplikasi kita bisa menjalankan test setelah optimasi untuk menilai dampak dari apa yang kita ubah. Lalu kita bisa mencatat optimasi yang dilakukan untuk membantu pemahaman lebih lanjut akan perubahan yang kita buat.