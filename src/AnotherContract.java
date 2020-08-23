import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AnotherContract {

    private List<Field> fields = new ArrayList<>();

    public void setField(Field field){
        fields.add(field);
    }

    public Field getField(String fieldName){
        Field field;
        for (Field x : fields){
            if(x.getName().equals(fieldName)) return x;
        }
        return null;
    }

}
