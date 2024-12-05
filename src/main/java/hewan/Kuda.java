/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author ASUS
 */
public class Kuda extends Hewan {
    private final String ras;

    public Kuda(String nama, String jenis, int umur, String ras) {
        super(nama, jenis, umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nRas: " + ras;
    }
}

