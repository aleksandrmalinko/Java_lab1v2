import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phones {
    Map<String, ArrayList<String>> hashMap_ = new HashMap<>();

    public String add_phone(String name, String phone_number){
        if (hashMap_.get(name) == null){
            hashMap_.put(name, new ArrayList<>());
            hashMap_.get(name).add(phone_number);
        }
        else{
            hashMap_.get(name).add(phone_number);
        }
        return "Added";

    }

    public String delete_man(String name){
        if (hashMap_.get(name) == null){
            return "Man not found";
        }
        else{
            hashMap_.remove(name);
            return "Man has been removed";
        }
    }

    public String delete_phone(String phone){
        ArrayList temparray = new ArrayList();
        for (String key: hashMap_.keySet()) {
            temparray = hashMap_.get(key);
            for(int i = 0; i < temparray.size(); i++){
                if (temparray.get(i) == phone) {
                    temparray.remove(i);
                    return "Phone has been removed";
                }
            }
        }
        return "Phone not found";
    }

    public String delete_phone(String name, String phone){
        if (hashMap_.get(name) != null) {
            ArrayList temparray = new ArrayList();
            temparray = hashMap_.get(name);
            for (int i = 0; i < temparray.size(); i++) {
                if (temparray.get(i) == phone) {
                    temparray.remove(i);
                    return "Phone has been removed";
                }
            }
            return "Phone not found";
        }
        return "Man not found";
    }

    public final String get_name(String phone){
        String returnedstring = "Not found";
        ArrayList temparray = new ArrayList();
        for (String key: hashMap_.keySet()) {
            temparray = hashMap_.get(key);
            for(int i = 0; i < temparray.size(); i++){
                if (temparray.get(i) == phone) {
                    returnedstring = key;
                    return returnedstring;
                }
            }
        }
        return returnedstring;
    }

    public final String get_phone(String name){
        String returned = "Man not found";
        if (hashMap_.get(name) != null) {
            ArrayList templist = hashMap_.get(name);
            returned = name + ":\n";
            for (int i = 0; i < templist.size(); i++) {
                returned = returned + templist.get(i) + "\n";
            }
        }
        return returned;
    }

}
