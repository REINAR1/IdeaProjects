package com.itschool;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static String[] authors = {"Jack London", "William Shakespeare", "Biern Strastroup", "Herbert Wales", "Bruce Ecckel"};

    public static void main(String[] args) {
//      twoDimensionalArray_1();
//      twoDimensionalArray_2();
//      twoDimensionalArray_3();
//      twoDimensionalArraysCompare();
//
//      threeDimensionalArray_1();
//      threeDimensionalArray_2();

//      fourDimensionalArray_1();
//      fourDimensionalArray_2();
//
//      jaggedArray_1();
//      jaggedArray_2();
//
//
//      int[][] array2D = ArrayFill(4, 12, 7);
//
//      randomArray();
//      arrayClone();
//      quickSort();

//      libraryExample();
//-----------------------
//      classWork1();
//      classWork4();
//      classWork6();
        classWork7();
//      classWork11_Hard();
//
//      homeworkExample1();
//      homeworkExample2();
    }

    /**
     * Дан Двумерный массив из четного числа строк. Поменять местами первую строку со второй, третью — с четвертой и т. д.
     */
    private static void classWork7() {
        final int N = 10, M = 7;
        int[][] array = new int[N][M];
        Random random = new Random();

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = random.nextInt(10);
                System.out.printf("%3d", array[row][column]);
            }
            System.out.println();
        }

        int temp;
        for (int row = 0; row < array.length; row += 2) {
//         System.out.println(Arrays.toString(array[row]));
            for (int column = 0; column < array[row].length; column++) {
                temp = array[row][column];
                array[row][column] = array[row + 1][column];
                array[row + 1][column] = temp;
            }
        }

        System.out.println();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%3d", array[row][column]);
            }
            System.out.println();
        }
    }

    private static void printArray(double[][] array) {
        System.out.println();
        for (double[] row : array) {
            for (double element : row) {
                System.out.print(String.format("%6.2f", element));
            }
            System.out.println();
        }
    }

    // Двумерные массивы. Пример 1
    private static void twoDimensionalArray_1() {
        System.out.println("\nДвумерный массив. Пример 1");
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        System.out.println("Двумерный прямоугольный массив : ");

        System.out.print(array[0][0] + " ");
        System.out.print(array[0][1] + " ");
        System.out.print(array[0][2] + " ");
        System.out.print("\n");
        System.out.print(array[1][0] + " ");
        System.out.print(array[1][1] + " ");
        System.out.print(array[1][2] + " ");
        System.out.print("\n");
        System.out.print(array[2][0] + " ");
        System.out.print(array[2][1] + " ");
        System.out.print(array[2][2] + " ");
    }
    // Двумерные массивы. Пример 2

    private static void twoDimensionalArray_2() {
        System.out.println("\nДвумерный массив. Пример 2");
        int[][] array = new int[3][3];

        // Заполнение массива
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = i * j + 1;
            }
        }

        System.out.println("Двумерный прямоугольный массив : ");

        // Выводим массив на экран
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(Arrays.deepToString(array));
    }
    // Двумерные массивы. Пример 3

    private static void twoDimensionalArray_3() {
        System.out.println("\nДвумерный массив. Пример 3");
        // Компилятор определяет размер массива на основании выражения инициализации.
        int[][] array = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 0, 1}
        };

        System.out.println("Двумерный прямоугольный массив : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    // Сравнение двумерных массивов

    private static void twoDimensionalArraysCompare() {
        System.out.println("\nСравнение двумерных массивов");

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] array2 = new int[3][3];
        // Заполнение массива
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2[i][j] = (new Random()).nextInt(10);
            }
        }

        System.out.println("\nArray1:");
        for (int[] a : array1)
            System.out.println(Arrays.toString(a));

        System.out.println("\nArray2:");
        for (int[] a : array2)
            System.out.println(Arrays.toString(a));

        if (Arrays.equals(array1, array2))
            System.out.println("Массивы равны!");
        else
            System.out.println("Массивы не равны!");


        System.out.println("Клонируем содержимое одного массива:");
        for (int row = 0; row < array1.length; row++)
            for (int column = 0; column < array1[row].length; column++)
                array1[row][column] = array2[row][column];

        System.out.println("\nArray1:");
        for (int[] a : array1)
            System.out.println(Arrays.toString(a));

        System.out.println("\nArray2:");
        for (int[] a : array2)
            System.out.println(Arrays.toString(a));

        System.out.println("\nПри обычном сравнении через equals двумерный массив - это экземпляр Object[], а не int[][]");
        if (Arrays.equals(array1, array2))
            System.out.println("Массивы равны!");
        else
            System.out.println("Массивы не равны!");

        System.out.println("\nПоэтому сравнивать нужно через deepEquals:");
        if (Arrays.deepEquals(array1, array2))
            System.out.println("Массивы равны!");
        else
            System.out.println("Массивы не равны!");
    }
    // Трёхмерные массивы. Пример 1

    private static void threeDimensionalArray_1() {
        System.out.println("\nТрехмерный массив. Пример 1");
        int[][][] array = new int[3][3][3];

        array[0][0][0] = 1;
        array[0][0][1] = 2;
        array[0][0][2] = 3;
        array[0][1][0] = 4;
        array[0][1][1] = 5;
        array[0][1][2] = 6;
        array[0][2][0] = 7;
        array[0][2][1] = 8;
        array[0][2][2] = 9;

        array[1][0][0] = 1;
        array[1][0][1] = 2;
        array[1][0][2] = 3;
        array[1][1][0] = 4;
        array[1][1][1] = 5;
        array[1][1][2] = 6;
        array[1][2][0] = 7;
        array[1][2][1] = 8;
        array[1][2][2] = 9;

        array[2][0][0] = 1;
        array[2][0][1] = 2;
        array[2][0][2] = 3;
        array[2][1][0] = 4;
        array[2][1][1] = 5;
        array[2][1][2] = 6;
        array[2][2][0] = 7;
        array[2][2][1] = 8;
        array[2][2][2] = 9;

        System.out.println("Трехмерный прямоугольный массив : ");

        for (int layer = 0; layer < 3; layer++) {
            for (int row = 0; row < 3; row++) {
                for (int element = 0; element < 3; element++) {
                    System.out.print(array[layer][row][element] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // Трёхмерные массивы. Пример 2

    private static void threeDimensionalArray_2() {
        System.out.println("\nТрехмерный массив. Пример 2");

        int[][][] array =
                {
                        {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
                };


        System.out.println("Трехмерный прямоугольный массив : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));
    }
    // Четырёхмерные массивы. Пример 1

    private static void fourDimensionalArray_1() {
        System.out.println("\nЧетырехмерный массив. Пример 1");

        int[][][][] array = new int[2][2][2][2];

        array[0][0][0][0] = 0;
        array[0][0][0][1] = 1;
        array[0][0][1][0] = 2;
        array[0][0][1][1] = 3;

        array[0][1][0][0] = 4;
        array[0][1][0][1] = 5;
        array[0][1][1][0] = 6;
        array[0][1][1][1] = 7;

        array[1][0][0][0] = 8;
        array[1][0][0][1] = 9;
        array[1][0][1][0] = 10;
        array[1][0][1][1] = 11;

        array[1][1][0][0] = 12;
        array[1][1][0][1] = 13;
        array[1][1][1][0] = 14;
        array[1][1][1][1] = 15;

        System.out.println("Четырехмерный прямоугольный массив : ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // Четырёхмерные массивы. Пример 2

    private static void fourDimensionalArray_2() {
        System.out.println("\nЧетырехмерный массив. Пример 2");
        int[][][][] array =
                {
                        {
                                {{0, 1}, {2, 3}},
                                {{4, 5}, {6, 7}}
                        },
                        {
                                {{8, 9}, {10, 11}},
                                {{12, 13}, {14, 0xF}}
                        }
                };

        System.out.println("Четырехмерный прямоугольный массив : ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    // Зубчатые массивы. Пример 1

    private static void jaggedArray_1() {
        System.out.println("\nЗубчатые массивы. Пример 1");

        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{1, 2, 3, 4, 5};
        jagged[2] = new int[]{1, 2, 3};

        System.out.println("Зубчатый двумерный массив : ");

        // Во внешнем цикле выполняется проход по всем вложенным массивам.
        for (int i = 0; i < jagged.length; ++i) {
            // Во внутреннем цикле выполняется обращение к каждому элементу вложенного массива.
            for (int j = 0; j < jagged[i].length; ++j) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Зубчатые массивы. Пример 2

    private static void jaggedArray_2() {
        System.out.println("\nЗубчатые массивы. Пример 2");
        int[][] jagged =
                {
                        {1, 2},
                        {1, 2, 3, 4, 5},
                        {1, 2, 3}
                };

        System.out.println("Зубчатый двумерный массив : ");

        // Во внешнем цикле выполняется проход по всем вложенным массивам.
        for (int i = 0; i < jagged.length; ++i) {
            // Во внутреннем цикле выполняется обращение к каждому элементу вложенного массива.
            for (int j = 0; j < jagged[i].length; ++j) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Наполнение массива одинаковыми данными

    private static int[][] ArrayFill(int rows, int columns, int number) {
        System.out.println("\nНаполнение массива одинаковыми данными");

        int[][] array2D = new int[rows][columns];

        // Функция fill принимает одномерный массив
        for (int i = 0; i < array2D.length; i++)
            Arrays.fill(array2D[i], number);

        System.out.println("Двумерный квадратный массив : ");
        for (int[] subArray : array2D) {
            for (int element : subArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        return array2D;
    }

    /**
     * Заполнение массива случайными значениями
     */
    private static void randomArray() {
        System.out.println("\nЗаполнение массива случайными значениями");

        Random random = new Random();
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(100);

        System.out.println("Двумерный квадратный массив со случайными элементами : ");

        for (int[] subArray : array) {
            for (int element : subArray) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    private static void arrayClone() {
        final int ROWS = 5, COLUMNS = 5;
        double[][] array = new double[ROWS][COLUMNS];

        Random r = new Random();
        for (int row = 0; row < ROWS; row++)
            for (int cols = 0; cols < COLUMNS; cols++)
                array[row][cols] = 50 - r.nextDouble() * 100;

        printArray(array);
        double[][] clone = array.clone();
        System.out.println("Clone");
        printArray(clone);
        System.out.println(Arrays.deepToString(array));
    }

    // Сортировка QuickSort
    private static void quickSort() {
        System.out.println("\nСортировка двухмерного массива методом QuickSort");
        int[][] num = {
                {5, 4, 45, 12},
                {7, 5, 8, 85},
                {0, 6, 99, 50}
        };

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                System.out.print(num[row][col] + "\t");
            }
            System.out.println();
        }

        int rows = num.length;
        int columns = num[0].length;

        // Сюда запишем наш двухмерный массив
        int[] flat = new int[rows * columns];

        // Переписываем двухмерный массив в одномерный
        int counter = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                flat[counter++] = num[row][col];
            }
        }
        System.out.println(Arrays.toString(flat));
        // Сортируем одномерный массив
        Arrays.sort(flat);
        System.out.println(Arrays.toString(flat));

        // Переписываем одномерный массив в двухмерный
        counter = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                num[row][col] = flat[counter++];
            }
        }

        System.out.println("Массив после сортировки : ");

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(num[row][col] + "\t");
            }
            System.out.println();
        }
    }

    // Пример с книжной библиотекой
    private static void libraryExample() {
        System.out.println("\nПример с библиотекой");
        String[][][] library = new String[3][4][5];

        int counter = 1;
        String AutorName = "";
        String BookName = "";
        for (int locker = 0; locker < library.length; locker++) {
            for (int shelf = 0; shelf < library[locker].length; shelf++) {
                for (int cell = 0; cell < library[locker][shelf].length; cell++) {
                    AutorName = authors[(int) (Math.random() * authors.length)];
                    BookName = "Название " + counter * 2;

                    library[locker][shelf][cell] = BookName + " (" + AutorName + ")";
                    ++counter;
                }
            }
        }

        for (int bookCase = 0; bookCase < library.length; bookCase++) {
            for (int shelf = 0; shelf < library[bookCase].length; shelf++) {
                for (int book = 0; book < library[bookCase][shelf].length; book++) {
                    System.out.println("Шкаф: " + (bookCase + 1) + "-ый " +
                            " Полка: " + (shelf + 1) + "-ая " + "Ячейка: " + (book + 1) + "-ая. Книга: " + library[bookCase][shelf][book]);
                }
            }
        }
    }

    private static void classWork1() {
        final int ROWS = 6, COLUMNS = 6;
        double[][] array = new double[ROWS][COLUMNS];

        Random r = new Random();
        for (int row = 0; row < ROWS; row++)
            for (int cols = 0; cols < COLUMNS; cols++)
                array[row][cols] = 50 - r.nextDouble() * 100;

        printArray(array);

        int indMaxRow = 0;
        int indMaxCol = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > array[indMaxRow][indMaxCol]) {
                    indMaxRow = row;
                    indMaxCol = col;
                }
            }
        }

        System.out.println("Max [" + indMaxRow + "][" + indMaxCol + "] = " + array[indMaxRow][indMaxCol]);

        int indMinRow = 0;
        int indMinCol = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] < array[indMinRow][indMinCol]) {
                    indMinRow = row;
                    indMinCol = col;
                }
            }
        }

        System.out.println("Min [" + indMinRow + "][" + indMinCol + "] = " + array[indMinRow][indMinCol]);


        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (col < row) {
                    array[row][col] = 0;
                }
            }
        }
        printArray(array);

        for (int row = 0; row < array.length; row++) {
            for (int col = row + 1; col < array[row].length; col++) {
                double temp = array[row][col];
                array[row][col] = array[col][row];
                array[col][row] = temp;
            }
        }
        printArray(array);
    }


    /**
     * Задан Двумерный массив вещественных чисел. Найти:
     * а) максимальную сумму абсолютных значений (модулей) элементов по строкам и номер строки с такой суммой;
     * б) максимальную сумму абсолютных значений (модулей) элементов по столбцам и номер столбца с такой суммой.
     */
    private static void classWork4() {
        final int ROWS = 4, COLUMNS = 5;
        double[][] array = new double[ROWS][COLUMNS];

        Random r = new Random();
        for (int row = 0; row < ROWS; row++)
            for (int cols = 0; cols < COLUMNS; cols++)
                array[row][cols] = 5 - r.nextDouble() * 10;

        printArray(array);
/*      for (double[] a : array)
         System.out.println(Arrays.toString(a));
 */
        double[] sumsRows = new double[ROWS];

        for (int row = 0; row < ROWS; row++)
            for (int cols = 0; cols < COLUMNS; cols++)
                sumsRows[row] += Math.abs(array[row][cols]);

        System.out.println(Arrays.toString(sumsRows));

        int indMax = 0;
        for (int i = 1; i < sumsRows.length; i++) {
            if (sumsRows[i] > sumsRows[indMax])
                indMax = i;
        }
        System.out.println("Max in Rows= " + sumsRows[indMax] + ", at: " + indMax);


        System.out.println();
        double[] sumsCols = new double[COLUMNS];

        for (int cols = 0; cols < COLUMNS; cols++)
            for (int row = 0; row < ROWS; row++)
                sumsCols[cols] += Math.abs(array[row][cols]);


        System.out.println(Arrays.toString(sumsCols));

        int indMaxcols = 0;
        for (int i = 0; i < sumsCols.length; i++) {
            if (sumsCols[i] > sumsCols[indMaxcols])
                indMaxcols = i;
        }
        System.out.println("Max in Cols= " + sumsCols[indMaxcols] + ", at: " + indMaxcols);
    }

    /**
     * Дан Двумерный массив целых чисел. В каждом его столбце найти:
     * а) сумму нечетных элементов;
     * б) количество положительных элементов;
     * в) количество элементов, кратных а или b.
     */
    private static void classWork6() {
        final int COLUMNS = 5;
        final int ROWS = 5;

        int[][] arr2D = new int[ROWS][];
        int[] results = new int[COLUMNS];
        for (int row = 0; row < arr2D.length; row++) {
            arr2D[row] = new int[COLUMNS];
            for (int column = 0; column < arr2D[row].length; column++) {
                arr2D[row][column] = 5 - (int) (Math.random() * 10);
                System.out.print(arr2D[row][column] + "\t");
            }
            System.out.println();
        }

        int[] sum = new int[COLUMNS];
        int[] positivesQuantity = new int[COLUMNS];
        int a = 3, b = 2;
        int[] a_or_b_modulo_Quantity = new int[COLUMNS];

        for (int column = 0; column < arr2D[0].length; column++) {
            for (int row = 0; row < arr2D.length; row++) {
                /* a */
                if (arr2D[row][column] % 2 == 1)
                    sum[column] += arr2D[row][column];
                /* b */
                if (arr2D[row][column] > 0)
                    positivesQuantity[column]++;
                /* c */
                if (arr2D[row][column] % a == 0 || arr2D[row][column] % b == 0)
                    a_or_b_modulo_Quantity[column]++;
            }
        }

        System.out.println("Sums of even elements: " + Arrays.toString(sum));
        System.out.println("Quantity of positive elements: " + Arrays.toString(positivesQuantity));
        System.out.println("Element dividng by " + a + " or " + b + " : " + Arrays.toString(a_or_b_modulo_Quantity));
    }

    private static void classWork11_Hard() {
        final int R = 5, C = 18;
        int[][] array = new int[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                array[r][c] = c;// (int)(Math.random()*10);
                System.out.printf("%5d", array[r][c]);
            }
            System.out.println();
        }

        int temp;
        for (int n = 0; n < C; n++) {
            for (int r = 0; r < R; r++) {
                for (int c = C - 1; c > 0 + 1 + n * 2; c--) {
                    temp = array[r][c];
                    array[r][c] = array[r][c - 1];
                    array[r][c - 1] = temp;
                }
            }
        }

        System.out.println();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                System.out.printf("%5d", array[r][c]);
            }
            System.out.println();
        }

    }

    // Типовая задача из домашнего задания. Пример 1
    private static void homeworkExample1() {
        //В двухмерном массиве целых чисел заменить все элементы,
        //меньшие среднего арифметического, значением среднего арифметического,
        //округленного до целого. Массив заполняется случайным образом.

        System.out.println("\nТиповая задача из ДЗ. Пример 1");

        int N = 5;
        int[][] array = new int[N][N];

        int average = 0;

        Random random = new Random();

        System.out.println("Исходный массив : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                // Выводим элемент массива
                System.out.print(array[i][j] + " ");
                // и тут же будем суммировать элементы массива
                average += array[i][j];
            }
            System.out.println();
        }

        // Находим среднее арифметическое
        average /= (N * N);

        System.out.println("\nCреднее арифметическое - " + average + "\n");

        System.out.println("Массив после перестановки : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < average)
                    array[i][j] = average;
                // Выводим элемент массива
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Типовая задача из домашнего задания. Пример 2
    private static void homeworkExample2() {
        //Найти сумму всех четных элементов Двумерного массива целых чисел A[10, 10].
        System.out.println("\nТиповая задача из ДЗ. Пример 2");

        int N = 10;
        int[][] matrix = new int[N][N];
        int sum = 0;
        Random random = new Random();

        System.out.println("Квадратный двумерный массив : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Присваиваем значение элементу массива
                matrix[i][j] = random.nextInt(100);
                // Выводим элемент массива на экран
                System.out.print(matrix[i][j] + "\t");

                // Сумма четных элементов
                if (matrix[i][j] % 2 == 0)
                    sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Сумма чётных элементов массива - " + sum);
    }
}