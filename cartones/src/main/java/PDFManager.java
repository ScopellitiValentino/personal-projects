import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.util.stream.Stream;

public class PDFManager {

    public void addTableHeader(PdfPTable table) {
        Stream.of("1-9", "10-19", "20-29","30-39","40-49",
                        "50-59","60-69","70-79","80-89","90-99")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    header.setIndent(1);
                    table.addCell(header);
                });
    }

    public void addRow(PdfPTable table, String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9, String t10) {
        Font boldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 30);

        PdfPCell c1 = new PdfPCell();
        c1.addElement(new Phrase(t1,boldFont));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        PdfPCell c2 = new PdfPCell();
        c2.addElement(new Phrase(t2,boldFont));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c2);

        PdfPCell c3 = new PdfPCell();
        c3.addElement(new Phrase(t3,boldFont));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c3);

        PdfPCell c4 = new PdfPCell();
        c4.addElement(new Phrase(t4,boldFont));
        c4.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c4);

        PdfPCell c5 = new PdfPCell();
        c5.addElement(new Phrase(t5,boldFont));
        c5.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c5);

        PdfPCell c6 = new PdfPCell();
        c6.addElement(new Phrase(t6,boldFont));
        c6.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c6);

        PdfPCell c7 = new PdfPCell();
        c7.addElement(new Phrase(t7,boldFont));
        c7.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c7);

        PdfPCell c8 = new PdfPCell();
        c8.addElement(new Phrase(t8,boldFont));
        c8.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c8);

        PdfPCell c9 = new PdfPCell();
        c9.addElement(new Phrase(t9,boldFont));
        c9.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c9);

        PdfPCell c10 = new PdfPCell();
        c10.addElement(new Phrase(t10,boldFont));
        c10.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c10);
    }

}
