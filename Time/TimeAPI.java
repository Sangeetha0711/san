package Time;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class TimeAPI {
	

	public static void main(String[] args) {
		int count=0,count1=0;
		LocalDate localDate = LocalDate.now();//to print the current lap date
		LocalTime now = LocalTime.now();//to get the current lap time
		System.out.println(now);
		//now=now.plusMinutes(20);
		//System.out.println(now);
		System.out.println("IST TIME:"+now);
		OffsetTime d1;
		d1=OffsetTime.now(ZoneOffset.UTC);
		System.out.println("UTC TIME:"+d1);
		//System.out.println(OffsetTime.now(ZoneOffset.UTC));
		Year sd=Year.of(2000);
		Year ed=Year.of(2022);
		int diff=ed.getValue()-sd.getValue();
		for(int i=sd.getValue();i<=ed.getValue();i++) {
			if(i%4==0) {
				count=count +1;
				
			}
			count1=diff*365+count;
		}
		System.out.println(count1);
		YearMonth yd=YearMonth.of(2022,05 );
		System.out.println(yd.atEndOfMonth().getDayOfWeek().name());
		
	}

}

