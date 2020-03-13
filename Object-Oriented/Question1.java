import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;
import java.util.Scanner;

public class Question1	{
@SuppressWarnings({	"resource",	"unused" })
public static void main(String[]	args)	throws IOException	{
URLConnection	connection	=	null;
try {
connection	=	new URL("http://sun.com").openConnection();
}	catch (IOException	e)	{
e.printStackTrace();
}
String	text =	new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();

System.out.print(text.substring(0,101));

}
}