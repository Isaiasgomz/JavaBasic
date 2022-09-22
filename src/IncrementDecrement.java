public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
//        posfija
        lives++;
        lives--;
       System.out.println(lives);

//       prefija
        int gift = 100 + ++lives;
        System.out.println(gift);
  }
}
