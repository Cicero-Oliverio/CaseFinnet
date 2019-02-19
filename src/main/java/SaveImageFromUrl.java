import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

  public static void main(String[] args) throws Exception {

    String urlBase = "http://showroom-painelfornecedor.finnet.com.br/";

    String imageUrl = urlBase + "?ctr=captcha&w=90&h=25&635059029773";
    String destinationFile = "C:\\Users\\800041817\\IdeaProjects\\CaseFinnet\\src\\test\\resources\\image\\image.png";

    saveImage(imageUrl, destinationFile);
  }

  public static void saveImage(String imageUrl, String destinationFile) throws IOException {
    URL url = new URL(imageUrl);
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destinationFile);

    byte[] b = new byte[2048];
    int length;

    while ((length = is.read(b)) != -1) {
      os.write(b, 0, length);
    }

    is.close();
    os.close();
  }

}