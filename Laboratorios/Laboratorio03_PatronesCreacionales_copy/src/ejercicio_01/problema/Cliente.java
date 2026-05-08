/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01.problema;

/**
 *
 * @author jacks
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameFactory factory = new FPSFactory();
        Game game = factory.createGame();
        game.start();

        factory = new RPGFactory();
        game = factory.createGame();
        game.start();
    }
    
}
