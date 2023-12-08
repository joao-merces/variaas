package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatarData {
    private SimpleDateFormat dateFormat;
    private String padrao = "dd/MM/yyyy";

    public FormatarData(String padrao) {
        this.padrao = padrao;
    }

    public String formato(Date data) {
        return dateFormat.format(data);
    }

    public Date parse(String dateString) throws java.text.ParseException {
        return dateFormat.parse(dateString);
    }
}
