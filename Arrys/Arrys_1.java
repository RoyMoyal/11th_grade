public class Main {

    //1. הפעולה מחזירה אמת אם סכום הערכים הזוגיים במערך מתחלק בk ללא שארית
    public static boolean f1(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }
        if (sum % k == 0)
            return true;
        else
            return false;
    }

    //2. הפעולה מחזירה אמת אם K הוא המספר הקטן ביותר במערך
    public static boolean TheBiggestNum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k)
                return false;
        }
        return true;
    }

    //3. הפעולה מחזירה אמת אם כל המספרים במערך אי זוגיים וגדולים מעשר
    public static boolean ReversLogic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= 10)
                return false;
        }
        return true;
    }

    //4. הפעולה תחזיר אמת אם כל המחרוזות מתחילות ומסתיימות באותה אות
    public static boolean ReversLogic2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) != arr[i].charAt(arr.length-1))
                return false;
        }
        return true;
    }

    //5. הפעולה מחזירה את מספר הפעמים שS מופיע במערך
    public static int FindingSum(String[] arr, String s) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s))
                count++;
        }
        return count;
    }

    //6. הפעולה מחזירה אמת אם המערך לא סימטרי
    public static boolean simetry(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i--])
                return false;
        }
        return true;
    }

    //7. הפעולה תחזיר אמת אם כל שני מספרים גדולים מ20
    public static boolean f7(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + arr[i--] <= 20)
                return false;
        }
        return true;
    }

    //8. הפעולה תחזיר אמת אם מכפלת כל שני תאים גדולה מK
    public static boolean f8(int[] arr , int k){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]*arr[i--]<=k)
                return false;
        }
        return true;
    }

    //9. הפעולה תחזיר אמת אם כל מספר שלישי הוא חיבור של שני המספרים לפניו
    public static boolean Chacking(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if (arr[i-2] + arr[i--] != arr[i])
                return false;
        }
        return true;
    }

    //10. הפעולה מחזירה את המספר שמופיע פעמיים במערך
    public static int duplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    return arr[i];
            }
        }
        return -1; // אם לא נמצא
    }

    //11. הפעולה מדפיסה את כל זוגות המספרים במערך שסכומם שווה לX
    public static void loop(int[] arr, int x) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[j] + arr[i] == x)
                    System.out.println(arr[j] + " , " + arr[i]);
            }
        }
    }

    //.12 הפעולה מחזירה מערך חדש המכיל רק את המספרים בטווח בין M לN
    public static int[] arrInRange(int[] arr , int n, int m){
        // בודק כמה מספרים יש
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=n && arr[i]>=m)
            count++;
        }
        // השמה במערך חדש
        int[] arrInRange = new int[count];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=n && arr[i]>=m)
                arrInRange[index]=arr[i];
            index++;
        }
            return arrInRange;
    }

    // 13. הפעולה מחזירה מערך חדש של תווים, כל תא בה יכיל את ערך התא הראשון בכל מחזורת במערך בהתאמה
    public static char[] firstLetterString(String[] arr) {
        char[] charArr = new char[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {
           charArr[i]=arr[i].charAt(i);
        }
        return charArr;
    }

    //14. הפעולה מחזירה אמת אם סכום המספרים במחצית הראשונה של המערך שווה לסכום המחצית השנייה
    public static boolean halfEquals(int[] arr){
        int half = arr.length/2;
        int sumFirstHalf=0;
        int sumSecondHalf=0;

        // חצי ראשון
        for (int i = 0; i < half; i++) {
            sumFirstHalf += arr[i];
        }

        //חצי שני
        for (int i = half; i < arr.length; i++) {
                sumSecondHalf=+arr[i];
        }

      return sumFirstHalf==sumSecondHalf;
    }

    public static void main(String[] args)
    {

    }
}
