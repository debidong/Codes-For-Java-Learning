package cn.bowen.ex01;

import java.util.StringJoiner;

public class MyList {
    private Object[] objects;
    private int count;
    private int capacity = 10;

    public MyList() {
        objects = new Object[capacity];
        count = 0;
    }

    private void newArray(int _capacity) {
        this.objects = new Object[_capacity];
    }

    public int getLength() {
        return count;
    }

    public void add(Object obj) {
        if(obj==null) {
            return;
        } else if (count < capacity) {
            objects[count] = obj;
        } else {
            int _capacity = capacity + 10;
            newArray(_capacity);
            objects[count] = obj;
        }
        count ++;
    }

    public Object get(int index) {
        if(index < 0 || index >= count)
            return null;
        return objects[index];
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",");
//        for(Object o: objects) {
//            sj.add(o.toString());
//        }
//        cannot write like this because not all elements in objects[] are not pointing to null
        for (int cnt = 0; cnt < count; cnt ++) {
            sj.add(objects[cnt].toString());
//            sj.add(this.get(cnt).toString());
        }

        return sj.toString();
    }
}
