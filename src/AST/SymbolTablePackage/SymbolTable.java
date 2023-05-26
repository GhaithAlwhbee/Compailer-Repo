package AST.SymbolTablePackage;

import java.util.ArrayList;

public class SymbolTable {


    ArrayList<Row> rows = new ArrayList<>();

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public void print(){
        System.out.printf("(((\t\t\tSymbolTable\t\t\t )))\n");
        for(int i =0 ; i<rows.size();i++)
        {
            if(rows.get(i)!=null)
                System.out.printf(rows.get(i).getType() + "\t\t\t\t" + rows.get(i).getValue());
            System.out.printf("\n");
        }
    }
}
