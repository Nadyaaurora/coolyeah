public class DataDosen19 {
    void dataSemuaDosen(Dosen19[] arrayDosen) {
        int i = 1;
        for (Dosen19 dosen : arrayDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.print("Jenis Kelamin : ");
            if (dosen.jenisKelamin) {
                System.out.println("Pria");
            } else {
                System.out.println("Wanita");
            }
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("------------------------------------");
            i++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen19[] arrayDosen) {
        int pria = 0, wanita = 0;
        for (Dosen19 dosen : arrayDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;
        double rataPria, rataWanita;

        for (Dosen19 dosen : arrayDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jmlPria++;
            } else {
                totalWanita += dosen.usia;
                jmlWanita++;
            }
        }

        if (jmlPria == 0) {
            rataPria = 0;
        } else {
            rataPria = (double) totalPria / jmlPria;
        }

        if (jmlWanita == 0) {
            rataWanita = 0;
        } else {
            rataWanita = (double) totalWanita / jmlWanita;
        }

        System.out.println("Rata-rata usia Dosen Pria   : " + String.format("%.2f", rataPria));
        System.out.println("Rata-rata usia Dosen Wanita : " + String.format("%.2f", rataWanita));
    }

    void infoDosenPalingTua(Dosen19[] arrayDosen) {
        Dosen19 tertua = arrayDosen[0];

        for (Dosen19 dosen : arrayDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen paling tua adalah :");
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.print("Jenis Kelamin : ");
        if (tertua.jenisKelamin) {
            System.out.println("Pria");
        } else {
            System.out.println("Wanita");
        }
        System.out.println("Usia          : " + tertua.usia);
    }

    void infoDosenPalingMuda(Dosen19[] arrayDosen) {
        Dosen19 termuda = arrayDosen[0];

        for (Dosen19 dosen : arrayDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen paling muda adalah:");
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.print("Jenis Kelamin : ");
        if (termuda.jenisKelamin) {
            System.out.println("Pria");
        } else {
            System.out.println("Wanita");
        }
        System.out.println("Usia          : " + termuda.usia);
    }
}
