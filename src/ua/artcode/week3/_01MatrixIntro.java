package ua.artcode.week3;

import ua.artcode.utils.MatrixUtils;

/**
 * Created by serhii on 09.07.16.
 */
public class _01MatrixIntro {

    public static void main(String[] args) {
        int[][] mat1 = new int[3][5];
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0

        int[] arr = mat1[0];

        int el1 = mat1[0][1];

        mat1[0][1] = 23;


        int[][] mat2 =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

        int el2 = mat2[2][1];

        int[] ints = {2, 2, 2, 2, 2};
        mat2[2] = ints;


        String[][] table = {
                {"id","name","age"},
                {"1","Lada","18"},
                {"2","Nastia","18"},
                {"3","Andrey","18"},
                {"4","Serhii","18"}
        };

        int rowLength = table.length;
        int columnLength = table[0].length;

        String ageStrLada = table[1][2];
        // String -> Prmitive
        // Primitive -> String
        // primitive + "";
        int ageIntLada = Integer.parseInt(ageStrLada);
        // Double.parseDouble("23.23");
        // Boolean.parseBoolean("true");

        ageIntLada++;

        table[1][2] = String.valueOf(ageIntLada);

        int[][] mat3 = MatrixUtils.generate(5, 5, 0, 100);
        String mat3Str = MatrixUtils.toString(mat3);

        System.out.println(mat3Str);

    }


}
