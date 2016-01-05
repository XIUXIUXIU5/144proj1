import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ComputeSHA {
	public static void main(String [ ] args) throws NoSuchAlgorithmException, IOException
	{
		  byte[] encoded = Files.readAllBytes(Paths.get(args[0]));
		 MessageDigest md = MessageDigest.getInstance("SHA");
		 md.update(encoded);
		 byte[] rawBytes = md.digest();
	     StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < rawBytes.length; i++) {
	          sb.append(String.format("%02x",rawBytes[i]));
	        }
	     System.out.println(sb.toString());
	}	
}
