/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternakan;

/**
 *
 * @author ASUS
 */
import hewan.Hewan;

public interface CRUD {
    void tambahHewan(Hewan hewan);
    void tampilkanHewan();
    void updateHewan(int index, Hewan hewan);
    void hapusHewan(int index);
}

