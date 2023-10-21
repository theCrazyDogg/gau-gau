public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(7, 4);
        Rectangle rec2 = new Rectangle(6, 5);
        Rectangle rec3 = new Rectangle(4, 2);
        Rectangle rec4 = new Rectangle(5, 3);
        Rectangle rec5 = new Rectangle(9, 6);

        System.out.println("Draw the first rectangle:");
        rec1.visualize();

        System.out.println("Draw the second rectangle:");
        rec2.visualize();

        System.out.println("Draw the third rectangle:");
        rec3.visualize();

        System.out.println("Draw the fourth rectangle:");
        rec4.visualize();

        System.out.println("Draw the fifth rectangle:");
        rec5.visualize();
    }
}