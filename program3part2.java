class Main {
    public static void main(String[] args)
    {
        
        int arr[][] = new int[3][]; // Declaring 2-D array with 2 rows, Making the above array Jagged
       
        arr[0] = new int[1]; // First row has 3 columns
        arr[1] = new int[2]; // Second row has 2 columns
        arr[2] = new int[3]; //Third Row has 3 columns
 
        // Initializing array
        int count = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
