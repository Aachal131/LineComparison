package com.pratice;

public class LineComparison {
    private double x1, y1, x2, y2;
    public LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineComparison otherLine = (LineComparison) obj;
        return Double.compare(otherLine.x1, x1) == 0 &&
                Double.compare(otherLine.y1, y1) == 0 &&
                Double.compare(otherLine.x2, x2) == 0 &&
                Double.compare(otherLine.y2, y2) == 0;
    }
    public static void main(String[] args) {
        LineComparison line1 = new LineComparison(1.0, 2.0, 4.0, 6.0);
        LineComparison line2 = new LineComparison(1.0, 2.0, 4.0, 6.0);

        // Checking equality using the equals method
        if (line1.equals(line2)) {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }

    }
}

