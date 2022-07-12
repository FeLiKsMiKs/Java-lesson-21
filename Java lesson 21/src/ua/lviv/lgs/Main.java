package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.List;
public class Main {
    public static void main (String[] args) throws IOException {
        List <String> annotationValuesList = AnnotationFile.getAnnotationValue ( School.class );

        for (String str : annotationValuesList) {
            System.out.println(str);
        }

        AnnotationFile.writeObjectToFile (annotationValuesList, new File ( "MyAnnotation.obj") );
        AnnotationFile.writeItemsToFile(annotationValuesList, new File("MyAnnotation.txt"));
    }
}
