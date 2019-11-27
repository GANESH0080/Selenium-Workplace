import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PDFReaderTest {

	@Test
	public void ReadPDF() throws IOException {
		URL url = new URL("file:////C://Users//Gsalunkhe//Downloads//Form12BB (1).pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileStream = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileStream);
		String PDFContent = new PDFTextStripper().getText(document);
		System.out.println(PDFContent);

	}
}
