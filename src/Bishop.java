import java.io.IOException;
import java.util.ArrayList;


public class Bishop extends Piece {

  public Bishop(int color) throws IOException {
    super(color);
  }

  @Override
  protected ArrayList<int[]> allPossibleMoves(int currentX, int currentY, Board board) {
    ArrayList<int[]> moves = new ArrayList<int[]>();
    int x,y;
    
    // to the down-right
    x = currentX;
    y = currentY;
    while (true) {
      x++;
      y++;
      
      // out of bounds
      if (!board.onBoard(x, y)) {
        break;
      }
      
      // possible to move to enemy position
      if (!board.emptyAt(x, y) && board.getColorAt(x, y) != _color) {
        moves.add(new int[]{x, y});
        break;
      }
      // can't move to ally position
      if (!board.emptyAt(x, y) && board.getColorAt(x,y) == _color) {
        break;
      }
      
      moves.add(new int[]{x, y});
    }    
    
    // to the down-left
    x = currentX;
    y = currentY;
    while (true) {
      x--;
      y++;
      
      // out of bounds
      if (!board.onBoard(x, y)) {
        break;
      }
      
      // possible to move to enemy position
      if (!board.emptyAt(x, y) && board.getColorAt(x, y) != _color) {
        moves.add(new int[]{x, y});
        break;
      }
      // can't move to ally position
      if (!board.emptyAt(x, y) && board.getColorAt(x,y) == _color) {
        break;
      }
      
      moves.add(new int[]{x, y});
    }    
    
    // to the up-left
    x = currentX;
    y = currentY;
    while (true) {
      x--;
      y--;
      
      // out of bounds
      if (!board.onBoard(x, y)) {
        break;
      }
      
      // possible to move to enemy position
      if (!board.emptyAt(x, y) && board.getColorAt(x, y) != _color) {
        moves.add(new int[]{x, y});
        break;
      }
      // can't move to ally position
      if (!board.emptyAt(x, y) && board.getColorAt(x,y) == _color) {
        break;
      }
      
      moves.add(new int[]{x, y});
    }    
    
    // to the up-right
    x = currentX;
    y = currentY;
    while (true) {
      x++;
      y--;
      
      // out of bounds
      if (!board.onBoard(x, y)) {
        break;
      }
      
      // possible to move to enemy position
      if (!board.emptyAt(x, y) && board.getColorAt(x, y) != _color) {
        moves.add(new int[]{x, y});
        break;
      }
      // can't move to ally position
      if (!board.emptyAt(x, y) && board.getColorAt(x,y) == _color) {
        break;
      }
      
      moves.add(new int[]{x, y});
    }
    
    return moves;
  }
  
  public String toString() {
    return "B";
  }

}
