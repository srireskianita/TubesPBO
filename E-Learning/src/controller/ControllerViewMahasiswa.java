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

    
    MenuUtama mu;
    
    //Menu Dosen
    MenuDosen md;
    InputDataDosen idd;
    DeleteDosen dd;
    
    TambahTugas tg;
    CariDosen cd;
    HasilPencarianDosen hpd;
    TambahMahasiswa tm;
    DeleteMhs dm;
    CreateKelas ck;
    //Menu Mhs
    MenuMahasiswa mm;
    InputDataMhs idm;
    CariMahasiswa cm;
    HasilPencarianMahasiswa hpm;
    HapusDataMhs hdm;
    PilihKelas pk;
    LihatInfoKelas lik;
    //menu lain
    MenuLain lain;
    InputMatkul imk;
    CariMK cmk;
    HasilPencarianMatakuliah hpmk;
    DeleteMatakuliah dmk;
    
    

    Aplikasi app;

    public ControllerViewMahasiswa() {
        mu = new MenuUtama();
        //Menu Dosen
        md = new MenuDosen();
        idd= new InputDataDosen();
        dd = new DeleteDosen();
       
        tg= new TambahTugas();
        cd= new CariDosen();
        hpd= new HasilPencarianDosen();
        tm = new TambahMahasiswa();
        dm = new DeleteMhs();
        ck=new CreateKelas();
        //Menu Mhs
        mm = new MenuMahasiswa();
        idm = new InputDataMhs();
        cm = new CariMahasiswa();
        hdm=new HapusDataMhs();
        hpm= new HasilPencarianMahasiswa();
        pk= new PilihKelas();
        lik= new LihatInfoKelas();
        //Menu Lain
        lain= new MenuLain();
        imk= new InputMatkul();
        cmk= new CariMK();
        dmk= new DeleteMatakuliah();
        app = new Aplikasi();
        hpmk = new HasilPencarianMatakuliah();
        
        
        mu.setVisible(true);
        mu.getKeluar().addActionListener(this);
        //menu dosen
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
        
         
        //menu mhs
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
        
        
        //menu lain
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
            md.setVisible(true);
            mu.dispose();
        }
        else if (o.equals(md.getBtnInputDosen())){
            idd.setVisible(true);
            md.dispose();
        }
        else if(o.equals(idd.getBtnSubmit())){
            String nama = idd.getTxtNamaDosen().getText();
            long nip = Long.parseLong(idd.getTxtNip().getText());
            Dosen d = new Dosen(nama,nip);
            app.addDosen(d);
            System.out.println(app.getNdosen());
            JOptionPane.showMessageDialog(null, "Input Berhasil");
        }
        else if(o.equals(idd.getKembali())){
            md.setVisible(true);
            idd.dispose();
        }
        else if(o.equals(md.getBtnHapusDosen())){
            dd.setVisible(true);
            md.dispose();
        }
        else if (o.equals(dd.getHapus())){
            long nip = Long.parseLong(idd.getTxtNip().getText());
            app.deleteDosen(nip);
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }
        else if(o.equals(dd.getKembali())){
            md.setVisible(true);
            dd.dispose();
        }
        
        else if (o.equals(md.getBtnTambahTugas())){
            tg.setVisible(true);
            md.dispose();
        }
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
       else if( o.equals(tg.getKembali())){
           md.setVisible(true);
           tg.dispose();;
       }
        else if (o.equals(md.getBtnCariDosen())){
            cd.setVisible(true);
            md.dispose();
        }
       
        else if(o.equals(cd.getKembali())){
            md.setVisible(true);
            cd.dispose();
        }
        else if (o.equals(cd.getBtnCariDosen())){
            long nip= Long.parseLong(cd.getTxtNip().getText());
            
            hpd.setVisible(true);
            cd.dispose();
           
            hpd.getTxtHasilCariDosen().append(app.getDosen(nip).toString()+"\n");
        }
        else if(o.equals(hpd.getKembali())){
            cd.setVisible(true);
            hpd.dispose();
        }
        else if (o.equals(md.getBtnTambahMhs())){
            tm.setVisible(true);
            tm.showListKelas(app);
            md.dispose();
        }
        else if (o.equals(tm.getBtnSubmit())){
            String kelas= tm.getTxtKelas().getSelectedItem().toString();
            long nim=Long.parseLong(tm.getTxtNim().getText());
            long nip=Long.parseLong(tm.getTxtNip().getText());
            Mahasiswa m= app.getMahasiswabyNim(nim);
             
            app.getDosen(nip).getKelasbyKodeKelas(kelas).addMahasiswa(m);
            
            JOptionPane.showMessageDialog(null,"Mahasiswa berhasil ditambah");
        }
        else if(o.equals(tm.getKembali())){
            md.setVisible(true);
            tm.dispose();
        }
        else if(o.equals(md.getBtnHapusMhs())){
            dm.setVisible(true);
            md.dispose();
        }
        else if(o.equals(dm.getKembali())){
            md.setVisible(true);
            dm.dispose();
        }
        else if (o.equals(dm.getHapus())){
            String kelas= dm.getTxtKelas().getText();
            long nim=Long.parseLong(dm.getTxtNim().getText());
            long nip=Long.parseLong(dm.getTxtNip().getText());
            
            Mahasiswa m=app.getMahasiswabyNim(nim);
            app.getDosen(nip).getKelasbyKodeKelas(kelas).removeMahasiswa(nim);
            
            JOptionPane.showMessageDialog(null, "Mahasiswa Berhasil dihapus");
        }
        else if(o.equals(md.getKembali())){
            mu.setVisible(true);
            md.dispose();
        }

        else if (o.equals(md.getCreateKelas())){
            ck.setVisible(true);
            md.dispose();
        }
        else if (o.equals(ck.getCreate())){
            String kelas= ck.getTxtKelas().getText();
            long nip=Long.parseLong(ck.getTxtNip().getText());
            app.getDosen(nip).createKelas(kelas, 20);
           
            JOptionPane.showMessageDialog(null, "Create Kelas Berhasil");
        }
        else if (o.equals(ck.getKembali())){
            md.setVisible(true);
            ck.dispose();
        }
        //menu mhs
        else if(o.equals(mu.getMenuMhs())){
            mm.setVisible(true);
            mu.dispose();
        }
        else if(o.equals(mm.getInputMhs())){
            idm.setVisible(true);
            mm.dispose();
        }
        else if (o.equals(idm.getSubmit())){
            String Nama = idm.getTxtNama().getText();
            long Nim= Long.parseLong(idm.getTxtNIM().getText());
            Mahasiswa m= new Mahasiswa(Nama, Nim);
            app.addMahasiswa(m);
            System.out.println(app.getNmhs());
            JOptionPane.showMessageDialog(null, "Input berhasil");
        }
        else if(o.equals(idm.getKembali())){
            mm.setVisible(true);
            idm.dispose();
        }
        else if(o.equals(mm.getCariMhs())){
            cm.setVisible(true);
            mm.dispose();
        }
        else if(o.equals(cm.getKembali())){
            mm.setVisible(true);
            cm.dispose();     
        }
        else if(o.equals(cm.getCari())){
            long nim= Long.parseLong(cm.getTxtCariMhs().getText());
            System.out.println(nim);
            hpm.setVisible(true);
            cm.dispose();
            System.out.println(app.getMahasiswabyNim(nim).getNama());
            System.out.println(app.getMahasiswabyNim(nim).getId());
            hpm.getTxthasilcarimhs().append(app.getMahasiswabyNim(nim).toString()+"\n");
            
        }
        else if(o.equals(hpm.getKembali())){
            cm.setVisible(true);
            hpm.dispose();
        }
        
        
        else if (o.equals(mm.getHapusMhs())){
            hdm.setVisible(true);
            mm.dispose();
        }
        else if(o.equals(hdm.getHapus())){
             long nim= Long.parseLong(hdm.getTxtNim().getText());
             app.deleteMahasiswa(nim);
             JOptionPane.showMessageDialog(null, "Data Terhapus");
             
        }
        else if(o.equals(hdm.getKembali())){
            mm.setVisible(true);
            hdm.dispose();
        }
        else if (o.equals(mm.getKembali())){
            mu.setVisible(true);
            mm.dispose();
        }
        else if (o.equals(mm.getPilihKelas())){
            pk.setVisible(true);
            mm.dispose();
        }
        else if (o.equals(pk.getTambah())){
            String kelas= pk.getTxtKelas().getText();
           JOptionPane.showMessageDialog(null, "Berhasil Ditambah");
        }
        else if (o.equals(pk.getKembali())){
            mm.setVisible(true);
            pk.dispose();
        }
        else if (o.equals(mm.getLihatInfoKelas())){
            lik.setVisible(true);
            mm.dispose();
        }
        else if (o.equals(lik.getCari())){
            String kelas=lik.getTxtKelas().getText();
            
        }
        else if( o.equals(lik.getKembali())){
            mm.setVisible(true);
            lik.dispose();
        }
        
        //Menu Lain
        else if(o.equals(mu.getMenuLain())){
            lain.setVisible(true);
            mu.dispose();
        }
        else if(o.equals(lain.getKembali())){
            mu.setVisible(true);
            lain.dispose();
        }
        else if (o.equals(lain.getInputMK())){
            imk.setVisible(true);
            lain.dispose();
        }
        else if (o.equals(imk.getSubmit())){
            String KodeMk = tg.getTxtKodeMK().getText();
            String NamaMk = tg.getTxtNamaMK().getText();
            Matakuliah mk= new Matakuliah(KodeMk,NamaMk);
            app.addMatakuliah(mk);
            JOptionPane.showMessageDialog(null, "Input berhasil");
        }
        else if (o.equals(imk.getKembali())){
            lain.setVisible(true);
            imk.dispose();
        }
        else if (o.equals(lain.getCariMK())){
            cmk.setVisible(true);
            lain.dispose();
        }
        else if (o.equals(cmk.getCari())){
            String kodeMk= cmk.getTxtkodeMK().getText();
            
            hpmk.setVisible(true);
            cmk.dispose();
            hpmk.getTxtMatakuliah().append(app.getMatkul(kodeMk).toString()+"\n");
        }
        else if(o.equals(hpmk.getBtnKembali())){
            cmk.setVisible(true);
            hpmk.dispose();
        }
        else if(o.equals(cmk.getKembali())){
            lain.setVisible(true);
            cmk.dispose();
        }
        else if (o.equals(lain.getHapusMK())){
            dmk.setVisible(true);
            lain.dispose();
        }
        else if(o.equals(dmk.getKembali())){
            lain.setVisible(true);
            dmk.dispose();
        }
        
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
