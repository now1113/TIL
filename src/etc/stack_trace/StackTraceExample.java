package etc.stack_trace;

import java.util.Arrays;
import java.util.List;

public class StackTraceExample {

    public static void main(String[] args) {
        Item item = new Item();
        item.setId("id");
        item.setName("name");

        Item item2 = new Item();
        item2.setId(null);
        item2.setName(null);

        //case1
        StackTraceImpl.method(item);
        //case2
        StackTraceImpl.method(item2);
        //case3
        StackTraceImpl.method(null);
    }

    static class Item {
        public String id;
        public String name;

        public String getId() {
            return this.id;
        }
        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    static class StackTraceImpl {
        public static void method(Item item) {
            if(item == null) {
                throw new NullPointerException();
            }
            method2(item);
        }

        public static List<String> method2(Item item) {
            return List.of(item.getId(), item.getName());
        }
    }
}
