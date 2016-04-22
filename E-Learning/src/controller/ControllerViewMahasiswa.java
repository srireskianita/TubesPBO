/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import model.*;

/**
 *
 * @author LENOVO X230
 */
public class ControllerViewMahasiswa implements ActionListener{

    Aplikasi app;//inisialisasi class Aplikasi pada package model
    MenuUtama mu;//inisialisasi Halaman Utama pada package View
    
    //inisialiasi Halaman-halaman untuk Menu Dosen
    MenuDosen md;
    InputDataDosen idd;
    DeleteDosen dd;
    
    TambahTugas tg;
    CariDosen cd;
    HasilPencarianDosen hpd;
    TambahMahasiswa tm;
    DeleteMhs dm;
    CreateKelas ck;
    //inisialiasi Halaman-halaman untuk Menu Mhs
    MenuMahasiswa mm;
    InputDataMhs idm;
    CariMahasiswa cm;
    HasilPencarianMahasiswa hpm;
    HapusDataMhs hdm;
    PilihKelas pk;
    LihatInfoKelas lik;
    //inisialiasi Halaman-halaman untuk Menu Lain
    MenuLain lain;
    InputMatkul imk;
    CariMK cmk;
    HasilPencarianMatakuliah hpmk;
    DeleteMatakuliah dmk;
  
    public ControllerViewMahasiswa() {
        app = new Aplikasi();
        mu = new MenuUtama();
        //instansiasi Halaman-halaman untuk Menu Dosen
        md = new MenuDosen();
        idd= new InputDataDosen();
        dd = new DeleteDosen();
       
        tg= new TambahTugas();
        cd= new CariDosen();
        hpd= new HasilPencarianDosen();
        tm = new TambahMahasiswa();
        dm = new DeleteMhs();
        ck=new CreateKelas();
        ////instansiasi Halaman-halaman untuk Menu Mhs
        mm = new MenuMahasiswa();
        idm = new InputDataMhs();
        cm = new CariMahasiswa();
        hdm=new HapusDataMhs();
        hpm= new HasilPencarianMahasiswa();
        pk= new PilihKelas();
        lik= new LihatInfoKelas();
        ////instansiasi Halaman-halaman untuk Menu Lain
        lain= new MenuLain();
        imk= new InputMatkul();
        cmk= new CariMK();
        dmk= new DeleteMatakuliah();
        
        hpmk = new HasilPencarianMatakuliah();
        
        
        mu.setVisible(true);
        mu.getKeluar().addActionListener(this);
        //c Menu Dosen
        mu.getMenuDosen().addActionListener(this);
        
        md.getBtnInputDosen().addActionListener(this);
        idd.getBtnSubmit().addActionListener(this);
        md.getBtnHapusDosen().addActionListener(this);
        dd.getHapus().addActionListener(this);
       
        md.getBtnTambahTugas().addActionListener(this);
        tg.getSubmit().addActionListener(this);
        md.getBtnCariDosen().addActionListener(this);
        cd.getBtnCariDosen().addActionListener(this);
        md.getBtnTambahMhs().addActionListener(this);
        md.getBtnHapusMhs().addActionListener(this);
        dm.getHapus().addActionListener(this);
        md.getKembali().addActionListener(this);
        idd.getKembali().addActionListener(this);
        dd.getKembali().addActionListener(this);
        tg.getKembali().addActionListener(this);
        cd.getKembali().addActionListener(this);
        tm.getKembali().addActionListener(this);
        tm.getBtnSubmit().addActionListener(this);
        dm.getKembali().addActionListener(this);
        dm.getHapus().addActionListener(this);
        hpd.getKembali().addActionListener(this);
        mm.getLihatInfoKelas().addActionListener(this);
        lik.getCari().addActionListener(this);
        lik.getKembali().addActionListener(this);
        md.getCreateKelas().addActionListener(this);
        ck.getCreate().addActionListener(this);
        ck.getKembali().addActionListener(this);
        
         
        //Listener semua tombol pada semua Halaman menu mhs
        mu.getMenuMhs().addActionListener(this);
        mm.getInputMhs().addActionListener(this);
        mm.getKembali().addActionListener(this);
        idm.getSubmit().addActionListener(this);
        idm.getKembali().addActionListener(this);
        mm.getKembali().addActionListener(this);
        mm.getCariMhs().addActionListener(this);
        cm.getCari().addActionListener(this);
        cm.getKembali().addActionListener(this);
        hpm.getKembali().addActionListener(this);
        mm.getHapusMhs().addActionListener(this);
        hdm.getKembali().addActionListener(this);
        hdm.getHapus().addActionListener(this);
        mm.getPilihKelas().addActionListener(this);
        pk.getTambah().addActionListener(this);
        pk.getKembali().addActionListener(this);
       
        
        
        //Listener semua tombol pada semua Halaman menu lain
        mu.getMenuLain().addActionListener(this);
        lain.getInputMK().addActionListener(this);
        imk.getSubmit().addActionListener(this);
        lain.getKembali().addActionListener(this);
        imk.getKembali().addActionListener(this);
        lain.getCariMK().addActionListener(this);
        cmk.getCari().addActionListener(this);
        cmk.getKembali().addActionListener(this);
        hpmk.getBtnKembali().addActionListener(this);
        lain.getHapusMK().addActionListener(this);
        dmk.getHapus().addActionListener(this);
        dmk.getKembali().addActionListener(this);
  
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
  
       //Menu dosen
       if (o.equals(mu.getMenuDosen())){
            md.setVisible(true);//untuk menampilan Halaman menu dosen
            mu.dispose();//menutup halaman menu utama
        }
        else if (o.equals(md.getBtnInputDosen())){
            idd.setVisible(true);//untuk menampilkan Halaman Input Data Dosen
            md.dispose();//menutup halaman menu utama
        }
        else if(o.equals(idd.getBtnSubmit())){
            String nama = idd.getTxtNamaDosen().getText();//mengambil text dari txtNamaDosen field yang disimpan di variabel nama
            long nip = Long.parseLong(idd.getTxtNip().getText());//mengambil text dari txtNip field yang disimpan di variabel nip
            Dosen d = new Dosen(nama,nip);//instansiasi objek Dosen
            app.addDosen(d);//memanggil method addDosen pada class Aplikasi
            System.out.println(app.getNdosen());
            JOptionPane.showMessageDialog(null, "Input Berhasil");//menampilkan dialog pesan Inputan berhasil
        }
        else if(o.equals(idd.getKembali())){
            md.setVisible(true);//untuk menampilkan Halaman Menu Dosen
            idd.dispose();//menutup halaman menu input data dosen
        }
        //untuk menampilkan halaman Delete Dosen ketika pilih tombol Hapus Dosen 
        else if(o.equals(md.getBtnHapusDosen())){
            dd.setVisible(true);
            md.dispose();
        }
        //untuk menghapus data dosen sesuai nip dosen yang di inputkan
        else if (o.equals(dd.getHapus())){
            long nip = Long.parseLong(idd.getTxtNip().getText());
            app.deleteDosen(nip);
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }
        //untuk kembali ke halaman delete dosne
        else if(o.equals(dd.getKembali())){
            md.setVisible(true);
            dd.dispose();
        }
        //untuk menuju ke halaman tambah tugas
        else if (o.equals(md.getBtnTambahTugas())){
            tg.setVisible(true);
            md.dispose();
        }
        //untuk tambah tugas
        else if(o.equals(tg.getSubmit())){
            String Kelas = tg.getTxtKelas().getText();
            long nip= Long.parseLong(tg.getTxtNip().getText());
            String KodeMk = tg.getTxtKodeMK().getText();
            String NamaMk = tg.getTxtNamaMK().getText();
            String KodeTugas = tg.getTxtKodeTugas().getText();
            String Desk=tg.getDeskripsi().getText();
            
            app.getDosen(nip).getKelasbyKodeKelas(Kelas).createTugas(KodeTugas, Desk);
            JOptionPane.showMessageDialog(null, "Input berhasil");
        }
        //untuk kembali ke Halaman menu dosen
       else if( o.equals(tg.getKembali())){
           md.setVisible(true);
           tg.dispose();;
       }
       //untuk menuju ke halaman cari dosen
        else if (o.equals(md.getBtnCariDosen())){
            cd.setVisible(true);
            md.dispose();
        }
       //untuk kembali ke halaman menu dosen
        else if(o.equals(cd.getKembali())){
            md.setVisible(true);
            cd.dispose();
        }
        //untuk menampilkan hasil pencarian dosen
        else if (o.equals(cd.getBtnCariDosen())){
            long nip= Long.parseLong(cd.getTxtNip().getText());
            
            hpd.setVisible(true);
            cd.dispose();
           
            hpd.getTxtHasilCariDosen().setText(app.getDosen(nip).toString()+"\n");
        }
        //untuk kembali ke halaman cari dosen
        else if(o.equals(hpd.getKembali())){
            cd.setVisible(true);
            hpd.dispose();
        }
        //untuk menuju ke halaman tambah mahasiswa di kelas
        else if (o.equals(md.getBtnTambahMhs())){
            tm.setVisible(true);
            tm.showListKelas(app);
            md.dispose();
        }
        //untuk menambahkan data-data mahasiswa untuk ditambahkan ke dalam kelas
        else if (o.equals(tm.getBtnSubmit())){
            String kelas= tm.getTxtKelas().getSelectedItem().toString();
            long nim=Long.parseLong(tm.getTxtNim().getText());
            long nip=Long.parseLong(tm.getTxtNip().getText());
            Mahasiswa m= app.getMahasiswabyNim(nim);
             
            app.getDosen(nip).getKelasbyKodeKelas(kelas).addMahasiswa(m);
            
            JOptionPane.showMessageDialog(null,"Mahasiswa berhasil ditambah");
        }
        //untuk kembali ke halasam menu dosen
        else if(o.equals(tm.getKembali())){
            md.setVisible(true);
            tm.dispose();
        }
        //untuk menuju ke halaman delete mahasiswa disuatu kelas
        else if(o.equals(md.getBtnHapusMhs())){
            dm.setVisible(true);
            md.dispose();
        }
        //untuk kembali ke halaman menu dosen
        else if(o.equals(dm.getKembali())){
            md.setVisible(true);
            dm.dispose();
        }
        //untuk delete mahasiswa di suatu kelas
        else if (o.equals(dm.getHapus())){
            String kelas= dm.getTxtKelas().getText();
            long nim=Long.parseLong(dm.getTxtNim().getText());
            long nip=Long.parseLong(dm.getTxtNip().getText());
            
            Mahasiswa m=app.getMahasiswabyNim(nim);
            app.getDosen(nip).getKelasbyKodeKelas(kelas).removeMahasiswa(nim);
            
            JOptionPane.showMessageDialog(null, "Mahasiswa Berhasil dihapus");
        }
        //untuk kembali ke menu utama
        else if(o.equals(md.getKembali())){
            mu.setVisible(true);
            md.dispose();
        }
        
        // untuk menuju ke halaman create kelas
        else if (o.equals(md.getCreateKelas())){
            ck.setVisible(true);
            md.dispose();
        }
        //untuk membuat kelas
        else if (o.equals(ck.getCreate())){
            String kelas= ck.getTxtKelas().getText();
            long nip=Long.parseLong(ck.getTxtNip().getText());
            app.getDosen(nip).createKelas(kelas, 20);
           
            JOptionPane.showMessageDialog(null, "Create Kelas Berhasil");
        }
        //untuk kembali ke manu dosen
        else if (o.equals(ck.getKembali())){
            md.setVisible(true);
            ck.dispose();
        }
        //MENU MAHASISWA
        //untuk menuju ke Halaman menu mhs
        else if(o.equals(mu.getMenuMhs())){
            mm.setVisible(true);
            mu.dispose();
        }
        //untuk menuju ke Halaman input data mhs
        else if(o.equals(mm.getInputMhs())){
            idm.setVisible(true);
            mm.dispose();
        }
        //untuk melakukan submit data mhs
        else if (o.equals(idm.getSubmit())){
            String Nama = idm.getTxtNama().getText();
            long Nim= Long.parseLong(idm.getTxtNIM().getText());
            Mahasiswa m= new Mahasiswa(Nama, Nim);
            app.addMahasiswa(m);
            System.out.println(app.getNmhs());
            JOptionPane.showMessageDialog(null, "Input berhasil");
        }
        ////untuk kembali ke Halaman menu mhs
        else if(o.equals(idm.getKembali())){
            mm.setVisible(true);
            idm.dispose();
        }
        //untuk menuju ke Halaman cari mhs
        else if(o.equals(mm.getCariMhs())){
            cm.setVisible(true);
            mm.dispose();
        }
        //untuk menuju ke Halaman menu mhs
        else if(o.equals(cm.getKembali())){
            mm.setVisible(true);
            cm.dispose();     
        }
        //untuk melakukan pencarian data mhs dan menampilkannya
        else if(o.equals(cm.getCari())){
            long nim= Long.parseLong(cm.getTxtCariMhs().getText());
            System.out.println(nim);
            hpm.setVisible(true);
            cm.dispose();
            System.out.println(app.getMahasiswabyNim(nim).getNama());
            System.out.println(app.getMahasiswabyNim(nim).getId());
            hpm.getTxthasilcarimhs().setText(app.getMahasiswabyNim(nim).toString()+"\n");
            
        }
        ////untuk menuju ke Halaman cari mhs
        else if(o.equals(hpm.getKembali())){
            cm.setVisible(true);
            hpm.dispose();
        }
        
        //untuk menuju ke Halaman hapus data mhs
        else if (o.equals(mm.getHapusMhs())){
            hdm.setVisible(true);
            mm.dispose();
        }
        ////untuk menghapus data mhs
        else if(o.equals(hdm.getHapus())){
             long nim= Long.parseLong(hdm.getTxtNim().getText());
             app.deleteMahasiswa(nim);
             JOptionPane.showMessageDialog(null, "Data Terhapus");
             
        }
        ////untuk menuju ke Halaman menu mhs
        else if(o.equals(hdm.getKembali())){
            mm.setVisible(true);
            hdm.dispose();
        }//untuk menuju ke Halaman menu utama
        else if (o.equals(mm.getKembali())){
            mu.setVisible(true);
            mm.dispose();
        }
        ////untuk menuju ke Halaman pilih kelas
        else if (o.equals(mm.getPilihKelas())){
            pk.setVisible(true);
            pk.showListKelas(app);
            mm.dispose();
        }
        //untuk bergabung atau masuk ke kelas
        else if (o.equals(pk.getTambah())){
            String kelas= pk.getTxtKelas().getSelectedItem().toString();
            long nim=Long.parseLong(pk.getTxtNim().getText());
            long nip=Long.parseLong(pk.getTxtNip().getText());
            Mahasiswa m= app.getMahasiswabyNim(nim);
             
            app.getDosen(nip).getKelasbyKodeKelas(kelas).addMahasiswa(m);
            
            JOptionPane.showMessageDialog(null,"Mahasiswa berhasil ditambah");
        }
       
        ////untuk kembali ke halaman memu mhs
        else if (o.equals(pk.getKembali())){
            mm.setVisible(true);
            pk.dispose();
        }
        //untuk menampilkan info kelas
        else if (o.equals(mm.getLihatInfoKelas())){
            lik.setVisible(true);
            mm.dispose();
        }
        //untuk mencari data kelas yg ingin ditampilkan
        else if (o.equals(lik.getCari())){
            String kelas=lik.getTxtKelas().getText();
            long nip=Long.parseLong(lik.getTxtNip().getText());
            lik.getTxtInfo().setText(app.getDosen(nip).toString()+"\n");
            
 
        }
        //untuk menuju ke Halaman menu mhs
        else if( o.equals(lik.getKembali())){
            mm.setVisible(true);
            lik.dispose();
        }
        
        //Menu Lain
        //untuk menuju ke Halaman menu Lain
        else if(o.equals(mu.getMenuLain())){
            lain.setVisible(true);
            mu.dispose();
        }
       //untuk kembali ke Halaman menu utama
        else if(o.equals(lain.getKembali())){
            mu.setVisible(true);
            lain.dispose();
        }
        //untuk menuju ke Halaman Input data MK
        else if (o.equals(lain.getInputMK())){
            imk.setVisible(true);
            lain.dispose();
        }
        //untuk melakukan input data mk
        else if (o.equals(imk.getSubmit())){
            String KodeMk = tg.getTxtKodeMK().getText();
            String NamaMk = tg.getTxtNamaMK().getText();
            Matakuliah mk= new Matakuliah(KodeMk,NamaMk);
            app.addMatakuliah(mk);
            JOptionPane.showMessageDialog(null, "Input berhasil");
        }
        //untuk menuju ke Halaman menu lain
        else if (o.equals(imk.getKembali())){
            lain.setVisible(true);
            imk.dispose();
        }
        //untuk menuju ke Halaman cari mk
        else if (o.equals(lain.getCariMK())){
            cmk.setVisible(true);
            lain.dispose();
        }
        //untuk melakukan pencarian data mk
        else if (o.equals(cmk.getCari())){
            String kodeMk= cmk.getTxtkodeMK().getText();
            
            hpmk.setVisible(true);
            cmk.dispose();
            hpmk.getTxtMatakuliah().append(app.getMatkul(kodeMk).toString()+"\n");
        }
        //untuk kembali ke halaman cari mk
        else if(o.equals(hpmk.getBtnKembali())){
            cmk.setVisible(true);
            hpmk.dispose();
        }
         //untuk kembali ke halaman menu lain
        else if(o.equals(cmk.getKembali())){
            lain.setVisible(true);
            cmk.dispose();
        }
         //untuk menuju ke halaman delete data mhs
        else if (o.equals(lain.getHapusMK())){
            dmk.setVisible(true);
            lain.dispose();
        }
        // //untuk kembali ke halaman menu lain
        else if(o.equals(dmk.getKembali())){
            lain.setVisible(true);
            dmk.dispose();
        }
        //untuk keluar aplikasi
        else if (o.equals(mu.getKeluar())){     
            int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda Yakin Ingin Keluar?", 
                                  "Pilih", 
                                  JOptionPane.YES_NO_OPTION); 
             if (selectedOption == JOptionPane.YES_OPTION) {
                         mu.dispose();
               }
            
        }    
    }
    
}
