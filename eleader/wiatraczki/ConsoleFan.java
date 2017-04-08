package eleader.wiatraczki;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class ConsoleFan extends FANGEN 
{
    public ConsoleFan(int size, CharSet chars)
    {
        super(size, chars);
        this.stream = System.out;
    }
}
