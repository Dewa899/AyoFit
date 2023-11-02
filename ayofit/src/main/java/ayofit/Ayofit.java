/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ayofit;

/**
 *
 * @author Dewa
 */
public class Ayofit {

    public static void main(String[] args) {
        User A = new User("Genlord", "Gendewa", 20);
        BMI BMI_A = new BMI(A.getUsername(),A.getName(), A.getAge(),1.6, 60);
        BMI_A.informasiKesehatan();
    }
}
