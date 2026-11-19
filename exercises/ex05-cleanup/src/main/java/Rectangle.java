/** A rectangle with a width and height that can be scaled. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the rectangle's width
   * @param height the rectangle's height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return width multiplied by height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions of this rectangle.
   *
   * @param factor the multiplier for each dimension
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * Compares this rectangle's area with another's.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a strictly larger area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
