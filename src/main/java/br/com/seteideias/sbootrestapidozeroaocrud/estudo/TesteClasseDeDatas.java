package br.com.seteideias.sbootrestapidozeroaocrud.estudo;

import br.com.seteideias.sbootrestapidozeroaocrud.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Log4j2
public class TesteClasseDeDatas {

    private DateUtil dateUtil;

    public static void main(String[] args) {

        //todo
//        String s = dateUtil.dataTimeRetorno(LocalDateTime.now());
//        log.info("data -> "+s);

        log.info("data -> "+teste());

    }

    public static String teste(){
        return "OOOI";
    }

}
