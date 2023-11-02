/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayofit;

/**
 *
 * @author Dewa
 */
public class Diet extends BMI{
    private int Calories;
    private String FrekOlahraga;

    public Diet(int Calories, String Username, String Name, int Age, int Height, int Weight) {
        super(Username, Name, Age, Height, Weight);
        this.Calories = Calories;
    }
    
    
    
    public void programDiet(int HasilBMI, int Calories, String FrekOlahraga){
    }
}
