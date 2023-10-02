/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhapxuat;

import java.util.Scanner;

/**
 *
 * @author KhanhCT
 */
public class NhapXuat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi ban nhap diem: ");
        Integer diem = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap tuoi");
        Double tuoi = Double.parseDouble(sc.nextLine());
        System.out.println("xuat ten:"+ten);
        System.out.println("nhap diem"+diem);
        System.out.println("nhap tuoi"+tuoi);
        
    }
    
}
