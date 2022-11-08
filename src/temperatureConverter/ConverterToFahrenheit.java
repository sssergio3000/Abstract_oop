package temperatureConverter;

public class ConverterToFahrenheit extends ConverterTemperature{
    @Override
    double convert(double celcius) {
        return celcius*1.8+32;

    }
}
