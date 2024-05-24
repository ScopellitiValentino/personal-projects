import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPRow;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Carton {
    private Document document = new Document(PageSize.A4.rotate());
    private PDFManager manager = new PDFManager();
    private PdfPTable table = new PdfPTable(10);
    private SecureRandom cellSelector = new SecureRandom();
    private SecureRandom numberSelector = new SecureRandom();
    private List<String> usedNumbers = new ArrayList<String>();
    private String name;

    public Carton(String name) throws DocumentException, FileNotFoundException {
        this.name = name;
        Constructor();
    }

    public void Constructor() throws DocumentException, FileNotFoundException {
        PdfWriter.getInstance(document, new FileOutputStream(name));
        document.open();
        manager.addTableHeader(table);
        RowConstructor();
        RowConstructor();
        RowConstructor();
        document.add(table);
        document.close();
    }

    public void RowConstructor() {
        String r1= "";String r2= "";String r3= "";String r4= "";String r5= "";
        String r6= "";String r7= "";String r8= "";String r9= "";String r10= "";
        Integer count = 1;
        Boolean r1Checked = false;Boolean r2Checked = false;Boolean r3Checked = false;Boolean r4Checked = false;Boolean r5Checked = false;
        Boolean r6Checked = false;Boolean r7Checked = false;Boolean r8Checked = false;Boolean r9Checked = false;Boolean r10Checked = false;

        while (count <= 5) {
            if (cellSelector.nextDouble() < 0.1 && !r1Checked) {

                while (!r1Checked){
                r1 = String.valueOf(numberSelector.nextInt((9 - 1)) + 1);
                if (!usedNumbers.contains(r1)) {
                    usedNumbers.add(r1);
                    r1Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.2 && !r2Checked) {

                while (!r2Checked){
                    r2 = String.valueOf(numberSelector.nextInt((19 - 10)) + 10);
                    if (!usedNumbers.contains(r2)) {
                        usedNumbers.add(r2);
                        r2Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.3 && !r3Checked) {

                while (!r3Checked){
                    r3 = String.valueOf(numberSelector.nextInt((29 - 20)) + 20);
                    if (!usedNumbers.contains(r3)) {
                        usedNumbers.add(r3);
                        r3Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.4 && !r4Checked) {

                while (!r4Checked){
                    r4 = String.valueOf(numberSelector.nextInt((39 - 30)) + 30);
                    if (!usedNumbers.contains(r4)) {
                        usedNumbers.add(r4);
                        r4Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.5 && !r5Checked) {

                while (!r5Checked){
                    r5 = String.valueOf(numberSelector.nextInt((49 - 40)) + 40);
                    if (!usedNumbers.contains(r5)) {
                        usedNumbers.add(r5);
                        r5Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.6 && !r6Checked) {

                while (!r6Checked){
                    r6 = String.valueOf(numberSelector.nextInt((59 - 50)) + 50);
                    if (!usedNumbers.contains(r6)) {
                        usedNumbers.add(r6);
                        r6Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.7 && !r7Checked) {

                while (!r7Checked){
                    r7 = String.valueOf(numberSelector.nextInt((69 - 60)) + 60);
                    if (!usedNumbers.contains(r7)) {
                        usedNumbers.add(r7);
                        r7Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.8 && !r8Checked) {

                while (!r8Checked){
                    r8 = String.valueOf(numberSelector.nextInt((79 - 70)) + 70);
                    if (!usedNumbers.contains(r8)) {
                        usedNumbers.add(r8);
                        r8Checked = true;}}

            } else if (cellSelector.nextDouble() < 0.9 && !r9Checked) {

                while (!r9Checked){
                    r9 = String.valueOf(numberSelector.nextInt((89 - 80)) + 80);
                    if (!usedNumbers.contains(r9)) {
                        usedNumbers.add(r9);
                        r9Checked = true;}}


            } else if (cellSelector.nextDouble() > 0.9 && !r10Checked){

                while (!r10Checked){
                    r10 = String.valueOf(numberSelector.nextInt((99 - 90)) + 90);
                    if (!usedNumbers.contains(r10)) {
                        usedNumbers.add(r10);
                        r10Checked = true;}}

            }
            count++;
        }
            manager.addRow(table,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10);
    }

}
