import java.util.*;
import java.lang.*;
import java.math.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.io.*;
import java.nio.file.*;
import javax.swing.JSpinner.ListEditor;
import java.nio.file.attribute.FileTime;
import java.net.*;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;


 class  Sınıf {
	
	private static Scanner tara;
    public static void main(String [] args) {
    	String oyuncu, bilgisayar="";
    	tara=new Scanner(System.in);
    	Random generator=new Random();
    	out.println("Taş için T, Kağıt için K, Makas için M girin:");
    	int pcsayac=generator.nextInt(3)+1;
    	if(pcsayac==1)
    		bilgisayar="T";
    	else if(pcsayac==2)
    		bilgisayar="K";
    	else if(pcsayac==3)
    		bilgisayar="M";
    	out.println("Oyuncu: ");
    	oyuncu=tara.next().toUpperCase();
    	out.println("Bilgisayar: "+bilgisayar);
    	if(oyuncu.equals(bilgisayar))
    		out.println("Berabere");
    	else if(oyuncu.equals("T")&&bilgisayar.equals("M"))
    		out.println("Taş makası kırar. Sen kazandın");
    	else if(bilgisayar.equals("K")&&oyuncu.equals("T"))
    		out.println("Kağıt taşı sarar. bilgisayar Kazandın");
    	else if(oyuncu.equals("K")&&bilgisayar.equals("M"))
    		out.println("Makas kağıdı keser. Bilgisayar kazandın");
    	else if(bilgisayar.equals("T")&& oyuncu.equals("K"))
    		out.println("Kağıt taşı sarar. Sen Kazandı");
    	else if(oyuncu.equals("M") && bilgisayar.equals("K"))
    		out.println("Makas kağıdı keser. Sen kazandınız.");
    	else if(bilgisayar.equals("T") && oyuncu.equals("M"))
    		out.println("Taş makası kırar. Bilgisayar kazandı");
    	else
    		out.println("Hatalı giriş");
    		
    }
}
