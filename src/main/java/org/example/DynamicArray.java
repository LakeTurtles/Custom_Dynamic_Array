package org.example;

public class DynamicArray<String> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity){
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index){
        return(String)data[index];
    }

    public void set(int index, String value) {
        if(index < initialCapacity){
            data[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index is too Big!");
        }

    }

    public void insert(int index, String value){
        if(size == initialCapacity){
            resize();
        }

        for(int j = size; j > index; j--){
            data[j ] = data[j - 1];
        }

        data[index] = value;
        size++;

    }

    public void delete(int index) {
        for (int j = index; j < size -1; j++){
            data[j] = data[j + 1];
        }
        size--;
    }



    public boolean isEmpty(){
        return size == 0;
    }



    public boolean Contains(String value){
        for(int i = 0; i <= size -1; i++){
            String currentValue = (String)data[i];
            if(currentValue.equals(value)){
                return true;
            }
        }
        return false;
    }



    private void resize(){
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++){
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }



    public int size() { return size;}

    public void print(){
        for(int i =0; i < size; i++){
            System.out.println("data[i] = " + data[i]);;
        }
    }



    public boolean add(String value){
        if(size == initialCapacity){
            resize();
        }
        data[size] = value;
        size++;
        return true;
    }



}
