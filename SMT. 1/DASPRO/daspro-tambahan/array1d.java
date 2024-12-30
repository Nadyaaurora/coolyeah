public class array1d {
    public static void main(String[] args) {
        char[] arr = new char[15];
        char huruf = 'A'; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = huruf++;      
        }

        int index = 0;

        for (int j = 1; index < arr.length; j++) {  
            for (int k = 0; k < 5 - j; k++) { 
                System.out.print(" ");
            }
            for (int l = 0; l < j; l++) { 
                if (index < arr.length) {  
                    System.out.print(arr[index++]);
                }
            }
            System.out.println();
        }
    }
}
