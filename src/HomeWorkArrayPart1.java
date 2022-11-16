public class HomeWorkArrayPart1 {
        public static void main(String[] args) {
            char comma = ',';
            int[] arr1 = new int[3];
            arr1[0] = 1;
            arr1[1] = 2;
            arr1[2] = 3;
            for (int i = 0; i < arr1.length; i++) {

                if (i == arr1.length - 1) {
                    comma = ' ';
                }

                System.out.print(arr1[i] + "" + comma);
            }
            System.out.println();
            comma = ',';
            for (int j = arr1.length - 1; j >= 0; j--) {
                if (j == 0) {
                    comma = ' ';
                }
                System.out.print(arr1[j] + "" + comma);
            }
            System.out.println();
            for (int k = 0; k < arr1.length; k++) {
                if (arr1[k] % 2 == 0) {
                    arr1[k]++;
                }
                System.out.print(arr1[k] + "" + comma);
            }
            System.out.println();
            double[] arr2 = new double[3];
            arr2[0] = 1.57;
            arr2[1] = 7.654;
            arr2[2] = 9.986;

            comma = ',';

            for (int i = 0; i <= arr2.length - 1; i++) {
                if (i == 0) {
                    comma = ' ';
                }
                System.out.print(arr2[i] + "" + comma);
            }
            System.out.println();
            comma = ',';
            for (int i = arr2.length - 1; i >= 0; i--) {
                if (i == 0) {
                    comma = ' ';
                }
                System.out.print(arr2[i] + "" + comma);
            }
            System.out.println();

            char[] firstName = {'H', 'a', 'r', 'l', 'a', 'm', 'e', 'n', 'k', 'o'};

            comma = ',';
            for (int i = 0; i < firstName.length; i++) {
                if (i == firstName.length - 1) {
                    comma = ' ';
                }
                System.out.print(firstName[i] + "" + comma);
            }
            System.out.println();
            comma = ',';
            for (int i = firstName.length - 1; i >= 0; i--) {
                if (i == 0) {
                    comma = ' ';
                }
                System.out.print(firstName[i] + "" + comma);
            }
            System.out.println();
        }
    }
