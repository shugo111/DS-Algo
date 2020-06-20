package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    private  class Entry{
        private int key;
        private String data;

        public Entry(int key, String data) {
            this.key = key;
            this.data = data;
        }
    }

    LinkedList<Entry> list[]=new LinkedList[5];
    public void put(int key, String data){
        var index=hash(key);
        if(list[index]==null)
            list[index]=new LinkedList<>();
        for(var temp:list[index]){
            if(temp.key==key){
                temp.data=data;
                return;
            }
        }
        var entry=new Entry(key,data);

        list[index].addLast(entry);
    }

    public String get(int key){
        var index=hash(key);
        for(var temp:list[index]){
            if(temp.key==key)
                return temp.data;
        }
        return null;
    }

    public void remove(int key){
        var index=hash(key);
        var i=0;
        for(var temp:list[index]){

            if(temp.key==key){
                break;
            }
             i++;
        }
        list[index].remove(i);

    }
    private int hash(int key){
        return key%list.length;
    }
}
