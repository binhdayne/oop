public class Week4 {

    /**
     * get ucln.
     * @return ucln(a,b).
     */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * get ucln.
     * @return ucln(a,b).
     */
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * get ucln.
     * @return ucln(a,b).
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = (double) Math.round(weight / (height * height) * 10) / 10;
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI < 23 && BMI >= 18.5) {
            return "Bình thường";
        } else if (BMI < 25 && BMI >= 23) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}