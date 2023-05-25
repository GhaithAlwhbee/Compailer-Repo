package app;

import AST.Program;
import AST.clases.CompilationUnit;
import Antlr.dartLexer;
import Antlr.dartParser;
import Visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String []args) throws IOException
    {
        String path = "Files/test.txt";
        CharStream charStream = fromFileName(path);
        dartLexer lexer = new dartLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        dartParser parser = new dartParser(tokens);
//        ParseTree tree = parser.program();
//        BaseVisitor baseVisitor = new BaseVisitor();
//        Program program = (Program) baseVisitor.visit(tree);
//        System.out.println(program);
        ParseTree tree = parser.compilationUnit();
        BaseVisitor baseVisitor = new BaseVisitor();
        CompilationUnit program = (CompilationUnit) baseVisitor.visit(tree);
        System.out.println(program);

    }

}
