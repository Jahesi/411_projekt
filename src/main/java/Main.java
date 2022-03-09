import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws IOException {

        //Eingabe lesen
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Start Position X:");
        String inputStartX = reader.readLine();
        System.out.print("Start Position Y:");
        String inputStartY = reader.readLine();
        System.out.print("End Position X:");
        String inputEndX = reader.readLine();
        System.out.print("End Position Y:");
        String inputEndtY = reader.readLine();

        int startX = Integer.parseInt(inputStartX);
        int startY = Integer.parseInt(inputStartY);
        int endX = Integer.parseInt(inputEndX);
        int endY = Integer.parseInt(inputEndtY);

        //Spielfeldpos init
        int[][] startPos = new int[startX][startY];
        int[][] endPos = new int[endX][endY];

        //Spielfeld struktur 4x4
        int[][] spielfeld = new int[3][3];

        //Pfadmatrix init, speichert array

        //FnW Algo

        //Ausagbe des Pfades in coordinaten der Nodes
    }
}
    // Floyd Warshall Algorithm in Java
    // Source: https://www.programiz.com/dsa/floyd-warshall-algorithm

    class FloydWarshall {
        final static int INF = 9999, nV = 4;

        // Implementing floyd warshall algorithm
        void floydWarshall(int graph[][]) {
            int matrix[][] = new int[nV][nV];
            int i, j, k;

            for (i = 0; i < nV; i++)
                for (j = 0; j < nV; j++)
                    matrix[i][j] = graph[i][j];

            // Adding vertices individually
            for (k = 0; k < nV; k++) {
                for (i = 0; i < nV; i++) {
                    for (j = 0; j < nV; j++) {
                        if (matrix[i][k] + matrix[k][j] < matrix[i][j])
                            matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }
}
