/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import static Aritmetica.Aritmetica.division;
/**
 *
 * @author Alumno Mañana
 */
public class test {
    public static void main(String[] args) {
        int res = 0;
        try{
            res = division(10,0);
            
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Siempre estoy!");
        }
    }
}
