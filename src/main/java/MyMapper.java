import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class MyMapper<T> {

    private final ObjectMapper mapper;


    public MyMapper() {
        this.mapper = new JsonMapper();
    }

    public String writeToString(T obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

    public void writeToFile(File file, T obj) throws IOException {
        mapper.writeValue(file, obj);
    }

    public void writeToFile(Writer writer, T obj) throws IOException {
        mapper.writeValue(writer, obj);
    }

    public T readValue(String str, Class<T> clazz) throws JsonProcessingException {
        return mapper.readValue(str, clazz);
    }

    public T readFromFile(File file, Class<T> clazz) throws IOException {
        return mapper.readValue(file, clazz);
    }
}
