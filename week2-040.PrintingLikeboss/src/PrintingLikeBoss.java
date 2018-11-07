public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for(int i=0; i<amount;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        for(int i=0; i<amount;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=1;i<=size;i++){
            printWhitespaces(size-i);
            printStars(i);
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int a=0;
        for(int i=1; i<=height;i++){
             printWhitespaces(height-i);
             printStars(i+a);
             a++;
             
                
           
            
        }
        printWhitespaces((2*height-1)/2-1);
         printStars(3);
         printWhitespaces((2*height-1)/2-1);
         printStars(3);
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
