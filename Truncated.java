package lab.polymorphism;

/**
 * Author: Livia Stein Freitas
 * Truncates a TextBlock to a specified width.
 */

public class Truncated implements TextBlock {
  TextBlock contents;
  int new_width;

  public Truncated(TextBlock _contents, int _new_width) {
    this.contents = _contents;
    this.new_width = _new_width;
  }

  /**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception {
    int h = this.contents.height();
    if ((i >= 0) && (i <= h)) {
      return this.contents.row(i).substring(0, this.new_width);
    }
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return this.contents.height();
  }

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.contents.width();
  }
}

