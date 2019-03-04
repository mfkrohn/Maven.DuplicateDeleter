package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    private String[] stringArray;
    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
        this.stringArray = super.array;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        KrohnStringList krohnStringList = new KrohnStringList(stringArray);

        for (int i = 0; i < krohnStringList.length(); i++) {
            if (krohnStringList.occurrences(krohnStringList.get(i)) >= maxNumberOfDuplications) {
                krohnStringList.removeAll(krohnStringList.get(i));
                i=-1;
            }
        }
        return krohnStringList.toArray();
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        KrohnStringList krohnStringList = new KrohnStringList(stringArray);
        for (int i = 0; i < krohnStringList.length(); i++) {
            if (krohnStringList.occurrences(krohnStringList.get(i)) == exactNumberOfDuplications) {
                krohnStringList.removeAll(krohnStringList.get(i));
                i=0;
            }
        }
        return krohnStringList.toArray();
    }
}
