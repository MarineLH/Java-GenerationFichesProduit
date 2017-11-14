import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFGenerator {

	public static void main(String[] args) {

		Integer num = 3;

		Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream("Outpout/PDF/HelloWorld" + num.toString() + ".pdf"));

			document.open();
			document.add(new Paragraph("A hello World PDF document."));
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
