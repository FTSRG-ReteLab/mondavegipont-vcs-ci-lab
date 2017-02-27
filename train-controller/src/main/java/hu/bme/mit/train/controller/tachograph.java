package hu.bme.mit.train.controller; /**
 * Created by meres on 2/27/17.
 */

import com.google.common.collect.*;

import java.util.Date;

public class tachograph
{
    HashBasedTable<Date, Integer, Integer> table;

    public tachograph()
    {
        table = HashBasedTable.create();
    }

    public void logValue(Date date,Integer position, Integer speed)
    {
        table.put(date, position, speed);
        System.out.println("date:" + date + "Position:" + position + "Speed:" +  speed);
    }
}
