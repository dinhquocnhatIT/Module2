package regex;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Test {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(300000000);

        
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(',');

        DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);
        System.out.println(formatter.format(bd.longValue()));
    }
}
