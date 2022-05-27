package com.libros.gestion.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
@Override
public void serialize (Date value, JsonGenerator gen, SerializerProvider arg2)
        throws IOException, JsonProcessingException {
        gen.writeString(formatter.format(value));
        }*/
public class CustomDateSerializer extends JsonSerializer<Date> {


    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        jsonGenerator.writeString(formatter.format(date));

    }
}