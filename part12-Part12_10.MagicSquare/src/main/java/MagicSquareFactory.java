
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int number = 1;
        int row = 0;
        int column = size / 2;

        square.placeValue(column, row, number);

        for (int i = 2; i <= (size * size); i++) {
            number++;
            row = getNextRow(row, square);
            column = getNextColumn(column, square);

            if (square.readValue(column, row) != 0) {
                row += 2;
                if(row==square.getHeight()+1){
                    row=1;
                }

                column-=1;
                if(column<0){
                    column=square.getWidth()-1;
                }
            }
            square.placeValue(column, row, number);
        }

        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }

    private int getNextRow(int row, MagicSquare square) {
        if (row - 1 < 0) {
            row = square.getHeight() - 1;
        } else {
            row -= 1;
        }
        return row;
    }

    private int getNextColumn(int column, MagicSquare square) {
        if (column + 1 > square.getWidth() - 1) {
            column = 0;
        } else {
            column += 1;
        }
        return column;
    }

}
