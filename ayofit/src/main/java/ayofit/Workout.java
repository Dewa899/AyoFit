/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayofit;

/**
 *
 * @author Dewa
 */
public class Workout extends BMI {
    private String Gender;

    public Workout(String Gender, String Username, String Name, int Age, int Height, int Weight) {
        super(Username, Name, Age, Height, Weight);
        this.Gender = Gender;
    }
    
    
    
    public void programWorkout(int HasilBMI, String Gender){}
}
