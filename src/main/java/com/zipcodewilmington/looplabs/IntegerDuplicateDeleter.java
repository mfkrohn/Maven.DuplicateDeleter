package com.zipcodewilmington.looplabs;



/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private Integer[] intArray;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intArray = super.array;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        KrohnIntList krohnIntList = new KrohnIntList(intArray);

            for (int i = 0; i < krohnIntList.length(); i++) {
                if (krohnIntList.occurrences(krohnIntList.get(i)) >= maxNumberOfDuplications) {
                    krohnIntList.removeAll(krohnIntList.get(i));
                    i=-1;
                }
            }
            return krohnIntList.toArray();
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        KrohnIntList krohnIntList = new KrohnIntList(intArray);
        for (int i = 0; i < krohnIntList.length(); i++) {
            if (krohnIntList.occurrences(krohnIntList.get(i)) == exactNumberOfDuplications) {
                krohnIntList.removeAll(krohnIntList.get(i));
                i=0;
            }
        }
        return krohnIntList.toArray();
    }
}
