package Utils;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class IdentifyCaptcha {


  public static void main(String[] args) throws TesseractException {

    String inputFilePath = "/home/cicero-oliverio/Downloads/OCR/image/download.png";

    Tesseract tesseract = new Tesseract();
    tesseract.setDatapath("/usr/share/tesseract-ocr/4.00/tessdata/");

    try{

      String fullText = tesseract.doOCR(new File(inputFilePath));

      System.out.println(fullText);

    }catch (TesseractException e){
      e.printStackTrace();
    }

  }

}
