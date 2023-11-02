/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayofit;

/**
 *
 * @author Dewa
 */
public class BMI extends User {
    private double Height;
    private double Weight;
    private int HasilBMi;

    public BMI(String Username, String Name, int Age, double Height, double Weight ) {
        super(Username, Name, Age);
        this.Height = Height;
        this.Weight = Weight;
    }

    public double hitungBMI(){
        return Weight/(Height * Height);
    }
    
    public void informasiKesehatan(){
        System.out.println("Hasil BMI : " + hitungBMI());
    }
    
    
}
