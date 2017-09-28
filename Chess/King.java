package Chess;

import java.util.ArrayList;

public class King extends Piece
{
    /**
     * Constructor
     *
     * @param color PieceColor of set color
     * @param type  PieceType of what kind of piece
     */
    public King(PieceColor color, PieceType type)
    {
        super(color, type);
    }

    @Override
    public ArrayList<Square> getPossibleMoves()
    {
        return null;
    }

    @Override
    public ArrayList<Square> generatePossibleMoves()
    {
        return null;
    }
}