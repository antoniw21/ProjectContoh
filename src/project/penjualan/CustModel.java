package project.penjualan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LIKMI
 */
public class CustModel {
    private String idmember,nama, alamat, status;
    private double total;
    
    public String getIdmember() {
        return idmember;    }
    
    public void setIdmember(String idmember) {        
        this.idmember = idmember;        }
    
    public String getNama() {
        return nama;        }
    
    public void setNama(String nama) {        
        this.nama = nama;        }
    
    public String getAlamat() {
        return alamat;    
    }
    
    public void setAlamat(String alamat) {        
        this.alamat = alamat;    
    }
    
    public String getStatus() {
        return status;    
    }
    
    public void setStatus(String status) {        
        this.status = status;    
    }

    
    public double getTotal() {        
        return total;    
    }
    
    public void setTotal(double total) {        
        this.total = total;    
    }

    
    
}
