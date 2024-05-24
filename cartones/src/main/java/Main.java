import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;


public class Main
{
    public static void main(String[] args ) throws IOException, DocumentException {

        Integer cantidad = 1;

        while (cantidad <= 1){
            Carton carton = new Carton("Carton"+cantidad+".pdf");
            cantidad++;
        }

    }
}
