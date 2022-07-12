package ua.lviv.lgs;
import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
public class AnnotationFile {
	 public static List <String> getAnnotationValue ( Class<?> customClass ) {

	        List<String> annotationValues = new ArrayList <String> ();

	        Field[] fields = customClass.getDeclaredFields ( );

	        for (int i = 0; i < fields.length; i++) {
	            Field field = fields[i];

	            if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
	                annotationValues.add(field.getType().getSimpleName() + " " + field.getName() + " --- "
	                                     + field.getAnnotation(MyAnnotation.class).purpose ());
	            }
	        }

	        return annotationValues;
	    }

	    public static void writeObjectToFile (Object object, File file ) throws IOException {
	        OutputStream       os  = new FileOutputStream ( file);
	        ObjectOutputStream oos = new ObjectOutputStream( os);
	        oos.writeObject(object);
	        oos.close();
	        os.close();
	    }

	    public static void writeItemsToFile(List<String> list, File file) throws IOException {
	        Files.write ( file.toPath ( ), list );
	    }
}
