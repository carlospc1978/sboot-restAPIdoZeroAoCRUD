package br.com.seteideias.sbootrestapidozeroaocrud.util;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    public String dataTimeRetorno(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("MM-dd").format(localDateTime);
    }

}
