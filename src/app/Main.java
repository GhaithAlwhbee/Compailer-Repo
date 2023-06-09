package app;

import AST.Program;
import AST.clases.CompilationUnit;
import Antlr.dartLexer;
import Antlr.dartParser;
import Visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String []args) throws IOException
    {
        //String path = "Files/test.txt";
        String path = "Files/test2.txt";
        CharStream charStream = fromFileName(path);
        dartLexer lexer = new dartLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        dartParser parser = new dartParser(tokens);

        ParseTree tree = parser.compilationUnit();
        BaseVisitor baseVisitor = new BaseVisitor();
        CompilationUnit program = (CompilationUnit) baseVisitor.visit(tree);
        System.out.printf("\n(((\t\t\tAST\t\t\t)))\n");
        System.out.println(program);


        System.out.printf("//////////////  to html ///////////////");

        String html = program.toHtml();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.html"))) {
            writer.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
