import java.util.Scanner;
public class Matrizes {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int tamMatriz = 0;
        System.out.println("Digite o tamanho da matriz:");
        tamMatriz = in.nextInt();
        System.out.println("Passe a sua matriz de adjacência:");
        int a [] [] = new int [tamMatriz] [tamMatriz];
        int b [] [] = new int [tamMatriz] [tamMatriz];
        int c [] [] = new int [tamMatriz] [tamMatriz];
        for (int w = 0; w < tamMatriz;w++) {
            for (int x = 0; x < tamMatriz; x++) {
                a [w] [x] = in.nextInt();
                b [w] [x] = a [w] [x];
                c [w][x] = 0;
            }
        }
        
        
        for (int i = 0; i < tamMatriz; i++) {
            for (int j = 0; j < tamMatriz; j++) {
                for (int k = 0 ; k < tamMatriz; k++) {
                    c [i] [j] = c [i] [j] + (a [i][k]*b [k][j]);
                }
            }
        }

        System.out.println("Sou matriz de adjacência ^2");
        for (int w = 0; w < 4;w++) {
            for (int x = 0; x < 4; x++) {
                System.out.print(c [w][x] + " ");
            }
            System.out.println();
        }
    }

}

