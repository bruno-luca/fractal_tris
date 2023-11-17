package fttt.fractaltris.htmlBuilder;

import jakarta.servlet.ServletContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class HTMLBuilder {

    private final ServletContext servletContext;

    public HTMLBuilder(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String getHTMLFile(String fileName) throws IOException {
        InputStream inputStream = servletContext.getResourceAsStream("/" + fileName);
        if (inputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        } else {
            throw new IOException("File " + fileName + " not found");
        }
    }
}
