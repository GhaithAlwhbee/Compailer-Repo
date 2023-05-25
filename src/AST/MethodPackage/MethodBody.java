package AST.MethodPackage;

import AST.Statements.BlockStatement;

public class MethodBody {

    BlockStatement blockStatement;

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement) {
        this.blockStatement = blockStatement;
    }

    @Override
    public String toString() {
        return "MethodBody{ " + blockStatement +" }";
    }
}
