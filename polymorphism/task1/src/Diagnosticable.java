public interface Diagnosticable {
    double getTemperature();

    void setTemperature(double t);

    int getSystolic();

    int getDiastolic();

    void setSystolic(int s);

    void setDiastolic(int d);

    default boolean hasFever() {
        return this.getTemperature() > 100.4;
    }
}