import java.util.*;
import static java.lang.System.out;

class Key{
    public static void main(String args[]){
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if(!(obj instanceof Key)){
            return false;
        }

        Key other = (Key) obj;

        return this.name !=null ? this.name.equals(other.name) : false;
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }
}