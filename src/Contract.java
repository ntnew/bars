import java.util.*;

public class Contract {
    private Map<String, Object> contractFields = new HashMap<>();

    public void setField(String name,Object object){
        contractFields.put(name, object);
    }

    public Object getFieldByName(String name){
        Iterator<Map.Entry<String, Object>> iterator = contractFields.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> pair = iterator.next();
            if(pair.getKey().equals(name))
                return pair.getValue();
        }
        System.out.println("Такого поля нет");
        return null;
    }

    public Map<String, Object> getContractFields() {
        return contractFields;
    }

    public void setContractFields(Map<String, Object> contractFields) {
        this.contractFields = contractFields;
    }
}
