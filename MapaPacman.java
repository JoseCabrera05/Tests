public class MapaPacman {
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
        }
    }
}