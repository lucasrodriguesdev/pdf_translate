package br.com.lrsofts.translate;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import br.com.lrsofts.reader.PdfReader;


public class App {
	public static void main(String[] args) {
		PdfReader pdf = new PdfReader();
		// Instantiates a client
		Translate translate = TranslateOptions.getDefaultInstance().getService();
		pdf.read();
		// The text to translate
		String text = "Hello, world!";
		String text2 = pdf.getFrase();
		String text3 = pdf.getText();
		// Translates some text into Russian
		Translation translation = translate.translate(text3, TranslateOption.sourceLanguage("en"),
				TranslateOption.targetLanguage("pt-br"));

		System.out.printf("Text: %s%n", text3);
		System.out.println("********************************************************");
		System.out.printf("Translation: %s%n", translation.getTranslatedText());
		

	}
	
}
