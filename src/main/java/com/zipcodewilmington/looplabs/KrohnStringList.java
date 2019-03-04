package com.zipcodewilmington.looplabs;

public class KrohnStringList {

    private String[] krohnList;

    public KrohnStringList(String[] krohnList) {
        this.krohnList = krohnList;
    }

    public String get(Integer index){
        return krohnList[index];

    }

    public Integer length(){
        return krohnList.length;
    }

    public String[] toArray(){

        return krohnList;
    }

    public void removeAtIndex(Integer index){

        String[] newKrohnList = new String[krohnList.length-1];
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

    public void removeSpecific(String stringToRemove){
        for (int i = 0; i < krohnList.length; i++) {
            if(krohnList[i].equals(stringToRemove)){
                removeAtIndex(i);
                break;
            }
        }
    }

    public Integer occurrences(String stringToCount) {
        Integer counter = 0;
        for(String thisString : krohnList){
            if(stringToCount.equals(thisString)){
                counter++;
            }
        }
        return  counter;
    }





    public void removeAll(String stringToRemove){
        for(String thisString : krohnList){
            if(thisString == stringToRemove){
                removeSpecific(thisString);
            }
        }
    }
}
