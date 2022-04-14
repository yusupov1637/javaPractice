package HomePratice;

public class practice {
   
	
    public static void main(String args[]) {
    	final int arr[] = {}; 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
    }

    // berilgan arrayda n bor bo'lsa true bo'lmasa false return qilsin.
    public static boolean exists(int arr[], int n) {
        return false;
    }

    // berilgan arrayda n nechi marta borligini topin return qiling.
    public static int count(int[] arr, int n) {
        return 0;
    }

    // beriglan arrayni n bilan to'ldiring. ozirda o'sha arrayni return qiling.
    public static int[] fill(int[] arr, int n) {
        return arr; // array return qilinggan.
    }

    // berilgan arrayning startIndex dan boshlab endIndex gacha kataklarini n bilan to'ldiring.
    public static int[] fill(int[] arr, int startIndex, int endIndex, int n) {
        return arr; // array return qilinggan.
    }

    // a arrayni b arrayga ko'chirib o'tkazing va b ni return qiling.
    // b array nig uzunligicha ko'chirib o'tkazing.
    public static int[] copy(int[] a, int[] b) {
        return b; // b return qilingan.
    }

    // a arraydan b arrayga length ta elementini ko'chirib o'tkazing.
    public static int[] copy(int[] a, int[] b, int length) {

        return b; // b return qilingan.
    }

    // a arrayning aStartIndex dan boshlab b arrayning bStartIndexiga  length ta elementini ko'chirib o'tkazing.
    public static int[] copy(int[] a, int[] b, int aStartIndex, int bStartIndex, int length) {

        return b; // b return qilingan.
    }

    // berilgan arraydan eng kichik elementini toping va shu elementni return qiling
    public static int min(int[] arr) {
        return 0;
    }

    // berilgan arraydan eng kichik elementini topib uni indexsini return qiling.
    public static int minIndex(int[] arr) {
        return 0;
    }

    // berilgan arraydan eng katta elementini toping va shu elementni return qiling
    public static int max(int[] arr) {
        return 0;
    }

    // berilgan arraydan eng katta elementini topib uni indexsini return qiling.
    public static int maxIndex(int[] arr) {
        return 0;
    }

    // arraydagi o'xshash elementlarini o'chirib tashlang va xosil bo'lgan arrayni return qiling.
    public static int[] removeDuplicate(int[] arr) {
        return new int[0];
    }

    // arraydan qiymati n ga teng bo'lgan elementlarni o'chirib tashlang. Xosil bo'lgan arrayni return qiling
    public static int[] removeELement(int[] arr, int n) {
        return new int[0];
    }

    // a va b arraydagi birxil bo'lgan elementlarni yanig arrayga joylab return qiling
    public static int[] duplicatedElements(int[] a, int[] b) {
        return new int[0];
    }

    // berilgan arrayni  o'sish bo'yicha  sort qiling (tartiblang) va xosil bo'lgan arrayni  return qiling.
    public static int[] sortAsc(int[] arr) {

        return arr;
    }

    // berilgan arrayni kamayish bo'yicha sort qiling (tartiblang) va xosil bo'lgan arrayni  return qiling.
    public static int[] sortDesc(int[] arr) {

        return arr;
    }

}