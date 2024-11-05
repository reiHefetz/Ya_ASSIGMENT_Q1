public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }
    public static boolean check (int i ) {
        String str = Integer.toString(i);
        int str_length = str.length();
        int sum = 0;
        for (int j = 0; j < str_length; j++) {
            int digit = Character.getNumericValue(str.charAt(j));
            sum += Math.pow(digit, str_length);
        }
        return sum == i;
    }
    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        int x = 0;
        int [] arr = new int[n];
        for (int i = 10; x <n; i ++)
        {
            if (check(i))
            {
                arr [x] = i;
                x ++;

            }
        }
        return  arr;
    }

}