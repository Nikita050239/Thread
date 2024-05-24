public class Tab {
    final int size = 10;
    public void table(){
        for (int row = 1; row < size ; row++) {
            for (int col = 1; col < size; col++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int sum = row*col;
                System.out.print(sum);
                if (sum < 10){
                    System.out.print("  ");
                }
                if (sum >= 10){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
