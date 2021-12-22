package src.ru.vsu.sc.savenkova_a_v;

public class Picture {
    private static final Line L1 = new Line(3, -7/4);
    private static final Line L2 = new Line(-2, 1);
    private static final Rectangle R1 = new Rectangle(0,-1,10,3);
    private static final Rectangle R2 = new Rectangle(-6, -4,-4,2);

    public static Enum.SimpleColor getColor(double x, double y) {
        if (R2.isPointInsideRectangle(x,y)) {
            return Enum.SimpleColor.GRAY;
        }
        if (R1.isPointInsideRectangle(x,y)) {
            if (!L1.isPointAboveLine(x,y)) {
                return Enum.SimpleColor.YELLOW;
            } else if (L2.isPointAboveLine(x,y)) {
                return Enum.SimpleColor.WHITE;
            } else return Enum.SimpleColor.BLUE;
        } else if (L1.isPointAboveLine(x,y)) {
            if (L2.isPointAboveLine(x,y)) {
                return Enum.SimpleColor.GREEN;
            } else return Enum.SimpleColor.BLUE;
        } else if (!L2.isPointAboveLine(x,y)) {
            return Enum.SimpleColor.YELLOW;
        }
        return Enum.SimpleColor.GRAY;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));
    }

}
