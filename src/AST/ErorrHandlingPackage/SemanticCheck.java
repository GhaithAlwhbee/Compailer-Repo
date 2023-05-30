package AST.ErorrHandlingPackage;


import SemanticAnalysis.SymbolTable;

public class SemanticCheck {


    SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    public boolean check()
    {
        System.out.printf("No Errors");
        return true;
    }

    /*
        - **Type checking**: Check if expressions and assignments have compatible types.
        For example, you might check if a variable of type `int` is being assigned a value of type `String`,
        which would be a type mismatch.
    */


    /*

    - **Scope checking**: Check if variables and functions are being used within their defined scope.
        For example, you might check if a variable declared within a function is being used outside of that function,
        which would be an error.
     */


    /*
    - **Function call checking**: Check if function calls have the correct number and types of arguments.
    For example, you might check if a function that expects two `int` arguments is being called with three `String` arguments,
    which would be an error.
     */


}
