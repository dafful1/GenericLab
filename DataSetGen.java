/**
 * Dan Afful
 * CMSC 204
 * 9/13/21
 * @param <T> Data value
 *
 */


public class DataSetGen<T> {

    private int count;
    private Measurable maximum;
    private double sum;


    /**
     * Constructor
     */


    public DataSetGen() {

        sum = 0;

        count = 0;

        maximum = null;

    }


    /**
     * Computes the average of the data
     *
     * @return the average of data set
     */


    public double getAverage() {

        if (count == 0) return 0;

        else return sum / count;

    }


    /**
     * Gets the max of data specified
     *
     * @return the maximum or 0 if no such data exists
     */

    public T getMaximum() {

        return (T) maximum;

    }

    /**
     * Adds to the value specified
     *
     * @param bankAccount The value to be added
     */

    public void add(Measurable bankAccount)
    {
        sum = sum + bankAccount.getMeasure();
        if (count == 0 || maximum.getMeasure() < bankAccount.getMeasure())
            maximum = bankAccount;
        count++;
    }


}