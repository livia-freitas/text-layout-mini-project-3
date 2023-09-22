package lab.polymorphism;

import java.io.PrintWriter;

public class TextBlockTests {
  public static void main (String[] args) throws Exception{
     // Prepare for input and output
     PrintWriter pen = new PrintWriter(System.out, true);

     // Create blocks to use for the next tests
     TextBlock block = new TextLine("Hello World");
     BoxedBlock box = new BoxedBlock(block);
     HComposition HCompose = new HComposition(block, box);
     VComposition VCompose = new VComposition(block, box);

     /**
      * TRUNCATE TESTS 
      */

     // Create and print a truncated version of a basic TextBlock
     Truncated TB_trunk = new Truncated(block, 14);
     TBUtils.print(pen, TB_trunk);

     // Create and print a truncated version of a BoxedBlock
     Truncated box_trunk = new Truncated(box, 9);
     TBUtils.print(pen, box_trunk);

    // Create and print a truncated version of a horizontal composition
    Truncated HCompose_trunk = new Truncated(HCompose, 14);
    TBUtils.print(pen, HCompose_trunk);

    // Create and print a truncated version of a vertical composition
    Truncated VCompose_trunk = new Truncated(VCompose, 9);
    TBUtils.print(pen, VCompose_trunk);
    
    // Truncated block with width 0.
    Truncated empty_trunk = new Truncated(block, 0);
    TBUtils.print(pen, empty_trunk);

    // Truncated block with larger width than the original block
    Truncated wide_trunk = new Truncated(block, 30); 
    TBUtils.print(pen, wide_trunk);
 
     // Clean up after ourselves.
     pen.close();
  }
}
