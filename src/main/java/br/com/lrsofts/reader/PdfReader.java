package br.com.lrsofts.reader;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfReader {
	private String frase = "Creates a new File instance by converting the givenpathname string into an abstract pathname.\n"+
			"If the given string isthe empty string, then the result is the empty abstract pathname.";
	private String st;
	
	public String getFrase() {
		return frase;
	}
	public String getText() {
		return st;
	}
	
	/**
	 * verificar
	 */
	public void read() {
		try{
			PDDocument document = null; 
			System.out.println(System.getProperty("user.dir")); // verifica diretorio
			document = PDDocument.load(new File("testPdf2.pdf"));
			document.getClass();
			if( !document.isEncrypted() ){
			    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
			    stripper.setSortByPosition( true );
			    PDFTextStripper Tstripper = new PDFTextStripper();
			    st = Tstripper.getText(document);
			    System.out.println("Text:"+st);
			}
			}catch(Exception e){
			    e.printStackTrace();
			}
	}
}
