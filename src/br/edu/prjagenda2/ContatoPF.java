package br.edu.prjagenda2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ContatoPF extends ContatoBasico{
    private Calendar dataNascimento;

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        Calendar cal= Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        cal.setTime(sdf.parse(dataNascimento));

        this.dataNascimento=cal;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return super.toString()+
                "" +
                "dataNascimento=" + sdf.format(dataNascimento.getTime()) +
                '}';
    }
}
