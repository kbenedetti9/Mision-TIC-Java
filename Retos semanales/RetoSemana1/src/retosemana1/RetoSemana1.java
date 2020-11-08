package retosemana1;

/**
 *
 * @author Karen Benedetti M
 */
public class RetoSemana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizasig = {{1, 98, 11}, {2, 86, 14}, {3, 99, 12}, {4, 89, 12}, {5, 89, 12}, {6, 96, 10},
        {7, 93, 13}, {8, 87, 15}, {9, 89, 10}, {10, 92, 10}, {11, 99, 15}, {12, 90, 12},
        {13, 87, 15}, {14, 96, 12}, {15, 92, 15}, {16, 85, 10}, {17, 86, 10}, {18, 97, 14},
        {19, 90, 14}, {20, 98, 12}};
        int[][] matrizreg = {{1, 100, 10}, {2, 86, 10}, {3, 97, 15}, {4, 93, 15}, {5, 94, 13}, {6, 93, 13},
        {7, 95, 12}, {8, 85, 11}, {9, 90, 11}, {10, 90, 12}, {11, 85, 12}, {12, 89, 12},
        {13, 85, 12}, {14, 93, 11}, {15, 89, 10}, {16, 89, 14}, {17, 93, 12}, {18, 99, 11},
        {19, 93, 13}, {20, 99, 11}};

        Planilla planilla = new Planilla();
        planilla.control(matrizasig, matrizreg);
    }

}
