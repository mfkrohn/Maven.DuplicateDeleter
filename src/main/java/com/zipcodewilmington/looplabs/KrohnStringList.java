package com.zipcodewilmington.looplabs;

public class KrohnStringList {

    private String[] krohnList;

    public KrohnIntList(String[] krohnList) {
        this.krohnList = krohnList;
    }

    public String get(Integer index){
        return krohnList[index];

    }

    public Integer length(){
        return krohnList.length;
    }

    public Integer[] toArray(){

        return krohnList;
    }

    public void removeAtIndex(Integer index){

        Integer[] newKrohnList = new Integer[krohnList.length-1];
        int j = 0;
        for (int i = 0; i < krohnList.length; i++) {

            if(i != index){
                newKrohnList[j] = krohnList[i];
                j++;
            }
            else {

            }
        }
        this.krohnList = newKrohnList;



    }

    public void removeSpecific(Integer numberToRemove){
        for (int i = 0; i < krohnList.length; i++) {
            if(krohnList[i] == numberToRemove){
                removeAtIndex(i);
                break;
            }
        }
    }

    public Integer occurrences(Integer numberToCount) {
        Integer counter = 0;
        for(Integer thisInt : krohnList){
            if(numberToCount == thisInt){
                counter++;
            }
        }
        return  counter;
    }

    public void removeAllButOne(Integer indexToRemove) {
        int counter = 0;
        for (int i = 0; i < krohnList.length; i++) {

            if(krohnList[i] == indexToRemove){
                counter++;
            }
            if(counter > 1 && krohnList[i] == indexToRemove){
                removeAtIndex(i);
                i--;
            }
        }

    }

    public void removeAll(Integer numberToRemove){
        for(Integer thisInt : krohnList){
            if(thisInt == numberToRemove){
                removeSpecific(thisInt);
            }
        }
    }
}
