import java.util.*;
import static java.lang.System.out;

class Key{
    public static void main(String args[]){
        Key a = new Key("salut");
        out.println(a.name);
		HashMap<Key, String> map = new HashMap<>();
        map.put(new Key("foo"), "FOO");
        out.println(map.get(new Key("foo"))); // FOO
        out.println(map.get(new Key("bar"))); // null
	}

    private String name;

    Key(String text){
        this.name = text;
    }
}