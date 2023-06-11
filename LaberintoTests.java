import java.util.Scanner;

public class elLaberinto {

    static int[][] elLaberinto = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
            { 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 },
            { 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
            { 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 },
            { 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
            { 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
            { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    static int spotX, spotY;
    static int limIX, limIY, limSX, limSY;
    static int torchRange = 3;
    static int[] dioSpotX={5,9,4}, diospotY={13,8,6};

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        spotX = 2;
        spotY = 0;
        limIX = 0;
        limIY = 0;
        limSX = elLaberinto.length - 1;
        limSY = elLaberinto[0].length - 1;

        boolean walk = true;
        String action;
        direction();

        while (walk == true) {
            commands();
            System.out.print("Proceda a moverse. ");
            action = entrada.nextLine();

                 static void east() {
                   if ((spotY < limSY) && (elLaberinto[spotX][spotY + 1] != 1)) {
                        spotY = spotY + 1;
                   } else {
                       System.out.print("Camino bloqueado... ");
                       }
                  }

                  static void west() {
                      if ((spotY > limIY) && (elLaberinto[spotX][spotY - 1] != 1)) {
                          spotY = spotY - 1;
                      } else {
                         System.out.print("No puedes ir más allá! ");
                     }
                  }

                  static void south() {
                      if ((spotX < limSX) && (elLaberinto[spotX + 1][spotY] != 1)) {
                          spotX = spotX + 1;
                      } else {
                          System.out.print("No puedes ir más allá! ");
                     }
                 }

                  static void north() {
                      if ((spotX > limIX) && (elLaberinto[spotX - 1][spotY] != 1)) {
                          spotX = spotX - 1;
                      } else {
                          System.out.print("No puedes ir más allá! ");
                      }
                  }
                      }

    

    static void move(String direction) {
        if (direction.equals("east")) {
            if ((spotY < limSY) && (elLaberinto[spotX][spotY + 1] != 1)) {
                spotY = spotY + 1;
            } else {
                System.out.print("Camino bloqueado... ");
            }
        } else if (direction.equals("west")) {
            if ((spotY > limIY) && (elLaberinto[spotX][spotY - 1] != 1)) {
                spotY = spotY - 1;
            } else {
                System.out.print("Camino bloqueado...");
            }
        } else if (direction.equals("south")) {
            if ((spotX < limSX) && (elLaberinto[spotX + 1][spotY] != 1)) {
                spotX = spotX + 1;
            } else {
                System.out.print("Camino bloqueado...");
            }
        } else if (direction.equals("north")) {
            if ((spotX > limIX) && (elLaberinto[spotX - 1][spotY] != 1)) {
                spotX = spotX - 1;
            } else {
                System.out.print("Camino bloqueado...");
            }
        }
    }

    for (int v=0;v<3;v=v+1){
        dioSpotX[v] = newSpotX(dioSpotX[v], diospotY[v]);
        diospotY[v] = newSpotY(dioSpotX[v], diospotY[v]);
    }

    static void direction() {

        printLabyrinth();
    }

    static void nulo()

    {
        System.out.print("movement invalido.");

    }

    static void commands() {
        System.out.println("CMDs: [W]north,[S]south,[A]west,[D]east,[F]Fin");
    }

    static void printLabyrinth() {
        int i, j;
        System.out.println("");
        System.out.println("+----------------------------------------------------------+");
        for (i = 0; i < (elLaberinto.length); i = i + 1) {
            System.out.print("|");
            for (j = 0; j < (elLaberinto[i].length); j = j + 1) {

                if ((i == spotX) && (j == spotY)) {
                    System.out.print("A");
                } else {
                    if (elLaberinto[i][j] == 1) {
                        System.out.print("X");
                    } else {
                        System.out.print("  ");
                    }
                    ;
                }
            }
                if((spotX+torchRange>=i)&&(spotX-torchRange<=i)&&(spotY+torchRange>=j)&&(spotY-torchRange<=j))
                {
                    if(elLaberinto[i][j]==1)        {factor ="[]";}
                    else if(elLaberinto[i][j]==2)   {factor ="/|";}
                    else if(elLaberinto[i][j]==5)   {factor ="/\\";}
                    else if(elLaberinto[i][j]==9)   {factor ="O-";}
                    else {factor ="··";};
                    for (int v=0;v<3;v=v+1){
                        if((i==dioSpotX[v])&&(j==diospotY[v])) {factor ="^^";}
                    }
                }
                else
                {
                    factor ="  ";
                }

  
    System.out.print(factor );

    

    private int newSpotY(int i, int i0) {
        
    }
            }
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| A |                                                      |");
        System.out.println("+----------------------------------------------------------+");
    }
    static int movement(){
        double movementChance=Math.random();
        if (movementChance<0.40) {return 1;}
            else if(movementChance<0.80) {return -1;}
                else {return 0;}
    }

    static int newSpotX(int oldSpotX, int oldSpotY){
        int variable = movement();
        int newSpotX = oldSpotX;
        if((oldSpotX!=minX&&oldSpotX!=maxX)){
            if (elLaberinto[oldSpotX+variable][oldSpotY]!=1){
                newSpotX = oldSpotX + variable;
            }
        }
        return newSpotX;
    }

    static int nuevaPosY(int oldSpotX, int oldSpotY){
        int variable = movement();
        int newPosY = oldSpotY;
        if((oldSpotY!=minY&&oldSpotY!=maxY)){
            if (elLaberinto[oldSpotX][oldSpotY+variable]!=1){
                newPosY = oldSpotY + variable;
            }
        }
        return newPosY;
    }
            System.out.print("|");
            System.out.println();

}
