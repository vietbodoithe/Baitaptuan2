/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.net.InetAddress;
public class GetIP {
    public static void main(String[] args) {
        try{
           InetAddress inet=InetAddress.getByName("www.gooogle.com");
           System.out.println("Dia chi ip cua trang web google.com" + inet.getHostAddress());
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
