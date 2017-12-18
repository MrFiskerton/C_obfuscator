import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by mrfiskerton on 18.12.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CLexer C_Lexer = new CLexer(CharStreams.fromStream(new FileInputStream(new File("input.txt"))));
        TokenStream cts = new CommonTokenStream(C_Lexer);
        CParser C_Parser = new CParser(cts);
        C_Parser.start();
    }
}
