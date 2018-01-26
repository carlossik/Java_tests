package SupportingUtilites;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.io.*;


public class GeneralUtilites
{
    public static String randomStringGenerator(int intSize)
    {
      return  new RandomString(intSize).nextString();
    }

    public static int RandomNumber(int Low, int High)
    {
        return  new Random().nextInt((High - Low) + 1) + Low;
    }

    public static void wait(int seconds)
    {
        try
        {
            Thread.sleep(seconds * 1000);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static void wait(double seconds)
    {
        try
        {
        Thread.sleep((int)seconds * 1000);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static boolean isProcessRunning(String serviceName) throws Exception {

        Process p = Runtime.getRuntime().exec( "tasklist");
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {

            System.out.println(line);
            if (line.contains(serviceName)) {
                return true;
            }
        }

        return false;

    }

    public static void KillProcesses()
    {
        try
        {
            if (isProcessRunning("chromedriver.exe"))
            {
                Runtime.getRuntime().exec("taskkill /F /IM " + "chromedriver.exe");
            }

            if (isProcessRunning("chrome.exe"))
            {
                Runtime.getRuntime().exec("taskkill /F /IM " + "chrome.exe");
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
