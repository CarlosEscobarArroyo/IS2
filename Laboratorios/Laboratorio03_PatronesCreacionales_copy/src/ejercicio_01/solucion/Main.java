package ejercicio_01.solucion;

 
  public class Main {                                                                                                          
      public static void main(String[] args) {              
          // Cliente trabaja contra la abstracción GameFactory
          GameFactory factory = new RPGFactory();

          // 1) La fábrica crea el juego (factory method)
          Game game = factory.createGame();

          // 2) Usas el juego mediante su interfaz polimórfica
          System.out.println(game.getInfo());
          game.start();

          // 3) Usas el método extra que pide el ejercicio
          factory.playGame();

          System.out.println("------");

          // Cambiar de producto = cambiar la fábrica concreta
          factory = new FPSFactory();
          game = factory.createGame();
          System.out.println(game.getInfo());
          game.start();
          factory.playGame();
      }
  }
