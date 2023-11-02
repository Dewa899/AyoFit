/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayofit;

/**
 *
 * @author Dewa
 */
public class User {
    private String Username;
    private String Name;
    private String Email;
    private int Age;

    public User(String Username, String Name, int Age) {
        this.Username = Username;
        this.Name = Name;
        this.Age = Age;
    }

    public String getUsername() {
        return Username;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
    
    
    
    public void Register(){}
    public void Login(){}
    public void TrackMyWorkout(){}
    public void TrakMyDiet(){}
    
}
