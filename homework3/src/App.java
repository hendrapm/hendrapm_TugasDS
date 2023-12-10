public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int max_iteration = 10;
        for (int i=0;i<=max_iteration;i++) {
            for (int j=0;j<=i;j++) {
                if (i < max_iteration/2 || i+j < max_iteration) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
