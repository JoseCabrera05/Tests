import java.util.Scanner;

public class MapaPacman2 {
    public static void main(String[] args) {
        char[][] mapa = {
                { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
                { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
                { '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#' },
                { '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#' },
                { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
                { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
                { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
                { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }
        };

        int pacmanX = 5; 
        int pacmanY = 3; 

        boolean terminado = false;
        Scanner scanner = new Scanner(System.in);

        while (!terminado) {
            
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    if (i == pacmanY && j == pacmanX) {
                        System.out.print('C'); 
                    } else {
                        System.out.print(mapa[i][j]);
                    }
                }
                System.out.println();
            }

            
            System.out.print("Ingrese un movimiento (w/a/s/d): ");
            String movimiento = scanner.nextLine();

 
            switch (movimiento) {
                case "w":
                    if (mapa[pacmanY - 1][pacmanX] != '#') {
                        mapa[pacmanY][pacmanX] = ' ';
                        pacmanY--;
                    }
                    break;
                case "a":
                    if (mapa[pacmanY][pacmanX - 1] != '#') {
                        mapa[pacmanY][pacmanX] = ' ';
                        pacmanX--;
                    }
                    break;
                case "s":
                    if (mapa[pacmanY + 1][pacmanX] != '#') {
                        mapa[pacmanY][pacmanX] = ' ';
                        pacmanY++;
                    }
                    break;
                case "d":
                    if (mapa[pacmanY][pacmanX + 1] != '#') {
                        mapa[pacmanY][pacmanX] = ' ';
                        pacmanX++;
                    }
                    break;
                case "q":
                    terminado = true;
                    break;
                default:
                    System.out.println("Movimiento inválido.");
            }
        }

        System.out.println("Juego terminado.");
        scanner.close();
    }
}
